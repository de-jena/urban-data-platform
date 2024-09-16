"""Definition of meta model 'service'."""
from functools import partial
import pyecore.ecore as Ecore
from pyecore.ecore import *


name = 'service'
nsURI = 'http://jena.de/service/1.0'
nsPrefix = 'service'

eClass = EPackage(name=name, nsURI=nsURI, nsPrefix=nsPrefix)

eClassifiers = {}
getEClassifier = partial(Ecore.getEClassifier, searchspace=eClassifiers)
ServiceLifeCycleState = EEnum('ServiceLifeCycleState', literals=['ANNOUNCE', 'CHANGE', 'REMOVE'])


class ServiceDescription(EObject, metaclass=MetaEClass):
    """An abstract service description"""
    serviceId = EAttribute(eType=EString, unique=True, derived=False, changeable=True, iD=True)
    providerId = EAttribute(eType=EString, unique=True, derived=False, changeable=True)
    name = EAttribute(eType=EString, unique=True, derived=False, changeable=True)
    vendor = EAttribute(eType=EString, unique=True, derived=False,
                        changeable=True, default_value='application/csv')
    rank = EAttribute(eType=EInt, unique=True, derived=False, changeable=True)
    sourceUri = EAttribute(eType=EString, unique=True, derived=False, changeable=True)
    contentType = EAttribute(eType=EString, unique=True, derived=False, changeable=True)
    lifeCycleState = EAttribute(eType=ServiceLifeCycleState, unique=True,
                                derived=False, changeable=True)
    serviceType = EAttribute(eType=EString, unique=True, derived=False, changeable=True)
    serviceClass = EReference(ordered=True, unique=True, containment=False,
                              derived=False, transient=True)
    operation = EReference(ordered=True, unique=True, containment=True, derived=False, upper=-1)

    def __init__(self, *, serviceId=None, providerId=None, name=None, vendor=None, rank=None, sourceUri=None, contentType=None, lifeCycleState=None, serviceType=None, serviceClass=None, operation=None):
        # if kwargs:
        #    raise AttributeError('unexpected arguments: {}'.format(kwargs))

        super().__init__()

        if serviceId is not None:
            self.serviceId = serviceId

        if providerId is not None:
            self.providerId = providerId

        if name is not None:
            self.name = name

        if vendor is not None:
            self.vendor = vendor

        if rank is not None:
            self.rank = rank

        if sourceUri is not None:
            self.sourceUri = sourceUri

        if contentType is not None:
            self.contentType = contentType

        if lifeCycleState is not None:
            self.lifeCycleState = lifeCycleState

        if serviceType is not None:
            self.serviceType = serviceType

        if serviceClass is not None:
            self.serviceClass = serviceClass

        if operation:
            self.operation.extend(operation)


class ServiceOperationDescription(EObject, metaclass=MetaEClass):
    """A response object containing all information about a result and its meta data"""
    operationId = EAttribute(eType=EString, unique=True, derived=False, changeable=True, iD=True)
    name = EAttribute(eType=EString, unique=True, derived=False, changeable=True)
    operationRequestUri = EAttribute(eType=EString, unique=True, derived=False, changeable=True)
    operationResponseUri = EAttribute(eType=EString, unique=True, derived=False, changeable=True)
    operationType = EAttribute(eType=EString, unique=True, derived=False, changeable=True)
    operation = EReference(ordered=True, unique=True, containment=False,
                           derived=False, transient=True)

    def __init__(self, *, operationId=None, name=None, operationRequestUri=None, operationResponseUri=None, operation=None, operationType=None):
        # if kwargs:
        #    raise AttributeError('unexpected arguments: {}'.format(kwargs))

        super().__init__()

        if operationId is not None:
            self.operationId = operationId

        if name is not None:
            self.name = name

        if operationRequestUri is not None:
            self.operationRequestUri = operationRequestUri

        if operationResponseUri is not None:
            self.operationResponseUri = operationResponseUri

        if operationType is not None:
            self.operationType = operationType

        if operation is not None:
            self.operation = operation


class DiscoveryProviderService(EObject, metaclass=MetaEClass):
    """Method to announce a service providing a service description and a corresponding service lifecycle. This needs to implemented by a service provider.

New service description or their changes or removals should published to topic
<prefix>/services"""

    def __init__(self):
        # if kwargs:
        #    raise AttributeError('unexpected arguments: {}'.format(kwargs))

        super().__init__()

    def announce(self, description=None):

        raise NotImplementedError('operation announce(...) not yet implemented')


class DiscoveryConsumerService(EObject, metaclass=MetaEClass):
    """The consumer side to retrieve a service description. Service consumer implement this interface, to listen for service changes.

Consumers should listen to topic:
<prefix>/services
to get informed about service descriptions"""

    def __init__(self):
        # if kwargs:
        #    raise AttributeError('unexpected arguments: {}'.format(kwargs))

        super().__init__()

    def onServiceAnnounced(self, description=None):

        raise NotImplementedError('operation onServiceAnnounced(...) not yet implemented')
