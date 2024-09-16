import configparser

config = configparser.ConfigParser()
config.read("./cnf/config.ini")

serviceDescription = {
  "_type" : "http://jena.de/service/1.0#//ServiceDescription",
  "serviceId" : "3e685b60-4629-4a6b-b198-eef1cfe60ce3",
  "providerId" : "FH-IDMT-node01",
  "name" : "AnonymizationService",
  "vendor" : "Fraunhofer IDMT",
  "sourceUri" : "mqtt://mqtt.jena.de:8883/jena",
  "contentType" : "application/json",
  "serviceType" : "http://jena.de/idmt/1.0#//AnonymizationService",
  "operation" : [ {
    "operationId" : "85b9c9bd-219e-4eb9-a090-39a7ce50f6cb",
    "name" : "doAnonymizationDryRun",
    "operationRequestUri" : f"""{config["SERVICE"]["prefix"]}/anonymization/dryRun/req/${config["SERVICE"]["providerId"]}""",
    "operationResponseUri" : f"""{config["SERVICE"]["prefix"]}/anonymization/dryRun/resp/{config["SERVICE"]["consumerId"]}/{config["SERVICE"]["providerId"]}""",
    "operationType" : "http://jena.de/idmt/1.0#//AnonymizationService/doAnonymizationDryRun"
  }, {
    "operationId" : "40314c8e-6717-4236-aa27-01f7283c0c43",
    "name" : "doAnonymization",
    "operationRequestUri" : f"""{config["SERVICE"]["prefix"]}/anonymization/sync/req/{config["SERVICE"]["providerId"]}""",
    "operationResponseUri" : f"""{config["SERVICE"]["prefix"]}/anonymization/sync/rep/{config["SERVICE"]["consumerId"]}/{config["SERVICE"]["requestId"]}""",
    "operationType" : "http://jena.de/idmt/1.0#//AnonymizationService/doAnonymization"
  }, {
    "operationId" : "19549c06-1a05-4c34-94cf-e0cc35d99328",
    "name" : "doAnonymizationAsync",
    "operationRequestUri" : f"""{config["SERVICE"]["prefix"]}/anonymization/async/req/{config["SERVICE"]["providerId"]}""",
    "operationResponseUri" : f"""{config["SERVICE"]["prefix"]}/anonymization/async/resp/{config["SERVICE"]["consumerId"]}/{config["SERVICE"]["requestId"]}""",
    "operationType" : "http://jena.de/idmt/1.0#//AnonymizationService/doAnonymizationAsync"
  }, {
    "operationId" : "61cc7661-853f-4c78-be31-1d695c6d70db",
    "name" : "doAnonymizationImmediateAsync",
    "operationRequestUri" : f"""{config["SERVICE"]["prefix"]}/anonymization/immediate/req/{config["SERVICE"]["providerId"]}""",
    "operationResponseUri" : f"""{config["SERVICE"]["prefix"]}/anonymization/immediate/resp/{config["SERVICE"]["consumerId"]}/{config["SERVICE"]["requestId"]}""",
    "operationType" : "http://jena.de/idmt/1.0#//AnonymizationService/doAnonymizationImmediateAsync"
  }, {
    "operationId" : "45a87187-1634-432d-81be-f75b7d52ccd2",
    "name" : "cancelRequest",
    "operationRequestUri" : f"""{config["SERVICE"]["prefix"]}/anonymization/cancel/{config["SERVICE"]["consumerId"]}/{config["SERVICE"]["requestId"]}""",
    "operationType" : "http://jena.de/idmt/1.0#//AnonymizationService/cancelRequest"
  }, {
    "operationId" : "a726678c-a17b-4f86-84f4-2e825cee4dc5",
    "name" : "getRequestStatus",
    "operationResponseUri" : f"""{config["SERVICE"]["prefix"]}/anonymization/status/{config["SERVICE"]["consumerId"]}/{config["SERVICE"]["requestId"]}""",
    "operationType" : "http://jena.de/idmt/1.0#//AnonymizationService/getRequestStatus"
  } ]
}