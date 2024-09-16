import json

from flask import Flask
from flask_mqtt import Mqtt

import configparser


from pyecore.resources import ResourceSet, URI
from pyecore.resources.json import JsonResource


from uri_helper.JsonSerializer import JsonSerializer
from service import ServiceDescription
import logging
from idmt import idmt
from service import service
from serviceDescription.serviceDescription import serviceDescription


from uri_helper.inMemoryStream import InMemoryURI

logging.basicConfig(format='%(levelname)s:%(message)s', level=logging.DEBUG)

logger = logging.getLogger(__name__)
config = configparser.ConfigParser()
config.read("./cnf/config.ini")

logger.info("Service started")


app = Flask(__name__)
app.config['MQTT_BROKER_URL'] = str(config["MQTT"]["host"])  # use the free broker from HIVEMQ
app.config['MQTT_BROKER_PORT'] = int(config["MQTT"]["port"])  # default port for non-tls connection
app.config['MQTT_USERNAME'] = config["MQTT"]["username"]  # set the username here if you need authentication for the broker
app.config['MQTT_PASSWORD'] = config["MQTT"]["password"]  # set the password here if the broker demands authentication
app.config['MQTT_KEEPALIVE'] = 5  # set the time interval for sending a ping to the broker to 5 seconds
app.config['MQTT_TLS_ENABLED'] = False  # set TLS to disabled for testing purposes
mqtt_client = Mqtt(app)


@mqtt_client.on_connect()
def handle_connect(client, userdata, flags, rc):
    if rc == 0:
        logger.info('Connected successfully')
        mqtt_client.subscribe(f"""{config["SERVICE"]["prefix"]}/#""")

        #sd = ServiceDescription(providerId="test", rank=1, contentType="test",
        #                       serviceId="quark", sourceUri="www.quark.de")
        #mqtt_client.publish(f"""{config["SERVICE"]["prefix"]}/services""", payload=JsonSerializer.serialize(sd), retain=False)
        mqtt_client.publish(f"""{config["SERVICE"]["prefix"]}/services""", json.dumps(serviceDescription))
        logger.info("Service Annoncement send")
    else:
        logger.warn('Bad connection. Code:', rc)





@mqtt_client.on_topic(f"""{config["SERVICE"]["prefix"]}/annonymisation/dryrun/req/{config["SERVICE"]["providerId"]}""")
def dryrun(client, userdata, message):
    pass


@mqtt_client.on_topic(f"""{config["SERVICE"]["prefix"]}/annonymisation/sync/req/{config["SERVICE"]["providerId"]}""")
def sync(client, userdata, message):
   pass


@mqtt_client.on_topic(f"""{config["SERVICE"]["prefix"]}/annonymisation/async/req/{config["SERVICE"]["providerId"]}""")
def req_async(client, userdata, message):
   pass



@mqtt_client.on_topic(f"""{config["SERVICE"]["prefix"]}/annonymisation/intermediate/req/{config["SERVICE"]["providerId"]}""")
def intermediate(client, userdata, message):

    rset = ResourceSet()
    rset.metamodel_registry[service.nsURI] = service
    rset.metamodel_registry[idmt.nsURI] = idmt
    uri = InMemoryURI('myuri2.json', data=message.payload)
    ResourceSet.resource_factory['json'] = lambda uri: JsonResource(uri)
    resource2 = rset.create_resource(uri)
    resource2.load()

    sericeDescription:ServiceDescription = resource2.contents[0]
    print(sericeDescription.serviceId)


if __name__ == '__main__':
   app.run(host='127.0.0.1', port=5000)