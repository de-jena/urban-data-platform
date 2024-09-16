"""Definition of meta model 'idmt'."""
from functools import partial
import pyecore.ecore as Ecore
from pyecore.ecore import *
from service import ServiceDescription


name = 'idmt'
nsURI = 'http://jena.de/idmt/1.0'
nsPrefix = 'idmt'

eClass = EPackage(name=name, nsURI=nsURI, nsPrefix=nsPrefix)

eClassifiers = {}
getEClassifier = partial(Ecore.getEClassifier, searchspace=eClassifiers)
ResponseType = EEnum('ResponseType', literals=[
                     'DEFAULT', 'DRY_RESPONSE', 'ASYNC_RESPONSE', 'ASYNC_RUNNING', 'ASYNC_CANCELLED', 'ERROR'])

RegularizerType = EEnum('RegularizerType', literals=['DEFAULT', 'REGULARIZOR', 'ANTI', 'MINUS'])

GradType = EEnum('GradType', literals=['F', 'REG', 'ANTI', 'MINUS'])

ModelStrategyType = EEnum('ModelStrategyType', literals=[
                          'PER_DATASET', 'PER_COLUMN_IGNORE', 'PER_COLUMN_AS_IS'])

ComputeDistanceType = EEnum('ComputeDistanceType', literals=[
                            'DISTANCE_SQUARED', 'DISTANCE_DIFFERENCE', 'DISTANCE_CATEGORICAL_50', 'DISTANCE_CATEGORICAL_100', 'DISTANCE_CATEGORICAL_200'])

FeatureStrategyType = EEnum('FeatureStrategyType', literals=[
                            'ANONYMIZE', 'IGNORE', 'DO_NOT_ANONYMIZE'])

AnonymizationServiceLifeCycleState = EEnum('AnonymizationServiceLifeCycleState', literals=[
                                           'ANNOUNCE', 'CHANGE', 'REMOVE'])


ResultPromise = EDataType('ResultPromise', instanceClassName='org.osgi.util.promise.Promise')


class ARequest(EObject, metaclass=MetaEClass):
    """A request object containing all information about request paramters that are needed."""
    requestId = EAttribute(eType=EString, unique=True, derived=False, changeable=True, iD=True)
    consumerId = EAttribute(eType=EString, unique=True, derived=False, changeable=True)
    srcUri = EAttribute(eType=EString, unique=True, derived=False, changeable=True)
    contentType = EAttribute(eType=EString, unique=True, derived=False,
                             changeable=True, default_value='application/csv')
    config = EReference(ordered=True, unique=True, containment=True, derived=False)

    def __init__(self, *, requestId=None, consumerId=None, config=None, srcUri=None, contentType=None):
        # if kwargs:
        #    raise AttributeError('unexpected arguments: {}'.format(kwargs))

        super().__init__()

        if requestId is not None:
            self.requestId = requestId

        if consumerId is not None:
            self.consumerId = consumerId

        if srcUri is not None:
            self.srcUri = srcUri

        if contentType is not None:
            self.contentType = contentType

        if config is not None:
            self.config = config


class AResponse(EObject, metaclass=MetaEClass):
    """A response object containing all information about a result and its meta data"""
    requestId = EAttribute(eType=EString, unique=True, derived=False, changeable=True, iD=True)
    type = EAttribute(eType=ResponseType, unique=True, derived=False, changeable=True)
    statusMessage = EAttribute(eType=EString, unique=True, derived=False, changeable=True)
    resultUri = EAttribute(eType=EString, unique=True, derived=False, changeable=True)
    resultContentType = EAttribute(eType=EString, unique=True,
                                   derived=False, changeable=True, default_value='application/csv')
    elapsedTime = EAttribute(eType=ELong, unique=True, derived=False, changeable=True)
    remainingTime = EAttribute(eType=ELong, unique=True, derived=False, changeable=True)
    config = EReference(ordered=True, unique=True, containment=True, derived=False)

    def __init__(self, *, requestId=None, config=None, type=None, statusMessage=None, resultUri=None, resultContentType=None, elapsedTime=None, remainingTime=None):
        # if kwargs:
        #    raise AttributeError('unexpected arguments: {}'.format(kwargs))

        super().__init__()

        if requestId is not None:
            self.requestId = requestId

        if type is not None:
            self.type = type

        if statusMessage is not None:
            self.statusMessage = statusMessage

        if resultUri is not None:
            self.resultUri = resultUri

        if resultContentType is not None:
            self.resultContentType = resultContentType

        if elapsedTime is not None:
            self.elapsedTime = elapsedTime

        if remainingTime is not None:
            self.remainingTime = remainingTime

        if config is not None:
            self.config = config


class AModelConfiguration(EObject, metaclass=MetaEClass):
    """A configuration object for an anonymization model. """
    strategy = EAttribute(eType=ModelStrategyType, unique=True, derived=False, changeable=True)
    features = EReference(ordered=True, unique=True, containment=True, derived=False, upper=-1)

    def __init__(self, *, strategy=None, features=None):
        # if kwargs:
        #    raise AttributeError('unexpected arguments: {}'.format(kwargs))

        super().__init__()

        if strategy is not None:
            self.strategy = strategy

        if features:
            self.features.extend(features)


class AFeatureConfiguration(EObject, metaclass=MetaEClass):
    """A column / field specific configuration object for an anonymization model. """
    name = EAttribute(eType=EString, unique=True, derived=False, changeable=True)
    type = EAttribute(eType=EString, unique=True, derived=False, changeable=True)
    strategy = EAttribute(eType=FeatureStrategyType, unique=True, derived=False, changeable=True)

    def __init__(self, *, name=None, type=None, strategy=None):
        # if kwargs:
        #    raise AttributeError('unexpected arguments: {}'.format(kwargs))

        super().__init__()

        if name is not None:
            self.name = name

        if type is not None:
            self.type = type

        if strategy is not None:
            self.strategy = strategy


@abstract
class AnonymizationService(EObject, metaclass=MetaEClass):

    def __init__(self):
        # if kwargs:
        #    raise AttributeError('unexpected arguments: {}'.format(kwargs))

        super().__init__()

    def doAnonymizationDryRun(self, request=None):
        """Return a best guessing for the runtime of this anonymization process. This method returns immediatly.

Request Topic:
<prefix>/anonymization/dryRun/req
Response Topic:
<prefix>/anonymization/dryRun/resp"""
        raise NotImplementedError('operation doAnonymizationDryRun(...) not yet implemented')

    def doAnonymization(self, request=None):
        """Executes an anonymization process synchronously. This call is blocking and only returns once the execution finished. Even on error this method returns a result, that contains the corresponding error information.

Request Topic:
<prefix>/anonymization/sync/req
Response Topic:
<prefix>/anonymization/sync/resp"""
        raise NotImplementedError('operation doAnonymization(...) not yet implemented')

    def doAnonymizationAsync(self, request=None):
        """Executes an anonymization process asynchronously. This call is non-blocking and returns immediately with a promise. Once the execution is finished, the promise resolves with the result. If an error occurs this method also resolves with  a result, that contains the corresponding error information.

Request Topic:
<prefix>/anonymization/async/req
Response Topic:
<prefix>/anonymization/async/resp"""
        raise NotImplementedError('operation doAnonymizationAsync(...) not yet implemented')

    def doAnonymizationImmediateAsync(self, request=None):
        """Executes an anonymization process asynchronously. This call is non-blocking and returns immediately with a result object. The response object contains intermediate information. These information can be used to get the current request status, using the corresponding operation.

Request Topic:
<prefix>/anonymization/immediate/req
Response Topic:
<prefix>/anonymization/immediate/resp"""
        raise NotImplementedError(
            'operation doAnonymizationImmediateAsync(...) not yet implemented')

    def cancelRequest(self, providerId=None, requestId=None):
        """Cancels a current request. The response is returned as soon as cancellation was executed either successfully or not.

Topic:
<prefix>/anonymization/immediate/cancel"""
        raise NotImplementedError('operation cancelRequest(...) not yet implemented')

    def getRequestStatus(self, request=None):
        """When a immediate asynchronous call was executed a result is returned immediately even if the operation is still in progress. The get information about the running operation, this method can be called.

Topic:
<prefix>/anonymization/immediate/status"""
        raise NotImplementedError('operation getRequestStatus(...) not yet implemented')


class RegularizerGrad(EObject, metaclass=MetaEClass):

    reg = EAttribute(eType=RegularizerType, unique=True, derived=False, changeable=True)
    grad = EAttribute(eType=GradType, unique=True, derived=False, changeable=True)

    def __init__(self, *, reg=None, grad=None):
        # if kwargs:
        #    raise AttributeError('unexpected arguments: {}'.format(kwargs))

        super().__init__()

        if reg is not None:
            self.reg = reg

        if grad is not None:
            self.grad = grad


class ADryRunResponse(AResponse):
    """A response object containing all information about a dry run execution. It onlöy contains meta data and not result data."""
    estCalcTime = EAttribute(eType=ELong, unique=True, derived=False, changeable=True)

    def __init__(self, *, estCalcTime=None, **kwargs):

        super().__init__(**kwargs)

        if estCalcTime is not None:
            self.estCalcTime = estCalcTime


class IDMTModel(AModelConfiguration):
    """Example of a concrete implementation specific anonymization model configuration for the IDMT algorythm"""
    k = EAttribute(eType=EInt, unique=True, derived=False,
                   changeable=True, upper=-1, default_value=3)
    noisy = EAttribute(eType=EBoolean, unique=True, derived=False, changeable=True, upper=-1)
    regGrad = EReference(ordered=True, unique=True, containment=True, derived=False, upper=-1)

    def __init__(self, *, k=None, regGrad=None, noisy=None, **kwargs):

        super().__init__(**kwargs)

        if k:
            self.k.extend(k)

        if noisy:
            self.noisy.extend(noisy)

        if regGrad:
            self.regGrad.extend(regGrad)


class IDMTFeature(AFeatureConfiguration):

    age = EAttribute(eType=ComputeDistanceType, unique=True,
                     derived=False, changeable=True, upper=-1)

    def __init__(self, *, age=None, **kwargs):

        super().__init__(**kwargs)

        if age:
            self.age.extend(age)


class AnonymizationServiceDescription(ServiceDescription):
    """Example of a custom implementation of an anonymization service description."""

    def __init__(self, **kwargs):

        super().__init__(**kwargs)


class ArxModel(AModelConfiguration):
    """Example configurtion for the ARX Library"""

    def __init__(self, **kwargs):

        super().__init__(**kwargs)
