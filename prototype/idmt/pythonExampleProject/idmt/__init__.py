
from .idmt import getEClassifier, eClassifiers
from .idmt import name, nsURI, nsPrefix, eClass
from .idmt import ARequest, AResponse, ResponseType, ADryRunResponse, AModelConfiguration, AFeatureConfiguration, AnonymizationService, IDMTModel, IDMTFeature, RegularizerType, GradType, RegularizerGrad, ModelStrategyType, ComputeDistanceType, FeatureStrategyType, ResultPromise, AnonymizationServiceLifeCycleState, AnonymizationServiceDescription, ArxModel


from . import idmt

__all__ = ['ARequest', 'AResponse', 'ResponseType', 'ADryRunResponse', 'AModelConfiguration', 'AFeatureConfiguration', 'AnonymizationService', 'IDMTModel', 'IDMTFeature', 'RegularizerType',
           'GradType', 'RegularizerGrad', 'ModelStrategyType', 'ComputeDistanceType', 'FeatureStrategyType', 'ResultPromise', 'AnonymizationServiceLifeCycleState', 'AnonymizationServiceDescription', 'ArxModel']

eSubpackages = []
eSuperPackage = None
idmt.eSubpackages = eSubpackages
idmt.eSuperPackage = eSuperPackage

ARequest.config.eType = AModelConfiguration
AResponse.config.eType = AModelConfiguration
AModelConfiguration.features.eType = AFeatureConfiguration
IDMTModel.regGrad.eType = RegularizerGrad

otherClassifiers = [ResponseType, RegularizerType, GradType, ModelStrategyType,
                    ComputeDistanceType, FeatureStrategyType, ResultPromise, AnonymizationServiceLifeCycleState]

for classif in otherClassifiers:
    eClassifiers[classif.name] = classif
    classif.ePackage = eClass

for classif in eClassifiers.values():
    eClass.eClassifiers.append(classif.eClass)

for subpack in eSubpackages:
    eClass.eSubpackages.append(subpack.eClass)
