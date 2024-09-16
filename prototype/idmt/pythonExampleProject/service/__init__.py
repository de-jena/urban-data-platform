
from .service import getEClassifier, eClassifiers
from .service import name, nsURI, nsPrefix, eClass
from .service import ServiceDescription, ServiceLifeCycleState, ServiceOperationDescription, DiscoveryProviderService, DiscoveryConsumerService

from pyecore.ecore import EOperation, EClassifier

from . import service

__all__ = ['ServiceDescription', 'ServiceLifeCycleState', 'ServiceOperationDescription',
           'DiscoveryProviderService', 'DiscoveryConsumerService']

eSubpackages = []
eSuperPackage = None
service.eSubpackages = eSubpackages
service.eSuperPackage = eSuperPackage

ServiceDescription.serviceClass.eType = EClassifier
ServiceDescription.operation.eType = ServiceOperationDescription
ServiceOperationDescription.operation.eType = EOperation

otherClassifiers = [ServiceLifeCycleState]

for classif in otherClassifiers:
    eClassifiers[classif.name] = classif
    classif.ePackage = eClass

for classif in eClassifiers.values():
    eClass.eClassifiers.append(classif.eClass)

for subpack in eSubpackages:
    eClass.eSubpackages.append(subpack.eClass)
