from pyecore.ecore import EObject
from pyecore.resources import ResourceSet
from pyecore.resources.json import JsonOptions

from uri_helper.inMemoryStream import InMemoryURI


class JsonSerializer:
    @staticmethod
    def serialize(eob: EObject):
        rset = ResourceSet()
        uri = InMemoryURI('myuri.json')
        resource = rset.create_resource(uri)
        resource.append(eob)
        resource.save(output=uri, options={JsonOptions.SERIALIZE_DEFAULT_VALUES: True})
        return uri.getvalue()