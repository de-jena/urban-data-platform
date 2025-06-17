/**
 */
package de.jena.model.glt.impl;

import de.jena.model.glt.GltFactory;
import de.jena.model.glt.GltPackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GltPackageImpl extends EPackageImpl implements GltPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "glt.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alarmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alarmIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alarmRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alarmPojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkedIdStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionsPojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationPojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calenderEventRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calendarEventPojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentPojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusPojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceBuildingPojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass devicePojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceConnectionPojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass devicesCollectionPojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceAdapterPojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alarmLogPojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datalogContentPojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointValuePojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alarmLogTimelinePojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statisticEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeWindowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityMonitoringSettingsPojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass syncLogPojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusLogPojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateStateRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusLogRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeScheduleBlockPojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeScheduleStatePojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeScheduleRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressPojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemDescriptionPojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemDescriptionRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactPojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phonePojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractPojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass techFacilityPojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityPojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cylonNetworkPojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importStatisticPojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkedIdIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rolePojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suspectPojoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openApiClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gltOpenApiClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jResponseEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.jena.model.glt.GltPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GltPackageImpl() {
		super(eNS_URI, GltFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GltPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static GltPackage init() {
		if (isInited) return (GltPackage)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGltPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GltPackageImpl theGltPackage = registeredGltPackage instanceof GltPackageImpl ? (GltPackageImpl)registeredGltPackage : new GltPackageImpl();

		isInited = true;

		// Load packages
		theGltPackage.loadPackage();

		// Fix loaded packages
		theGltPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theGltPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GltPackage.eNS_URI, theGltPackage);
		return theGltPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlarm() {
		if (alarmEClass == null) {
			alarmEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(0);
		}
		return alarmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarm_Flags() {
        return (EAttribute)getAlarm().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlarm_Id() {
        return (EReference)getAlarm().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarm_Name() {
        return (EAttribute)getAlarm().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarm_Description() {
        return (EAttribute)getAlarm().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarm_Consequence() {
        return (EAttribute)getAlarm().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarm_Cause() {
        return (EAttribute)getAlarm().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarm_Sl24schedule() {
        return (EAttribute)getAlarm().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarm_PrioritySummer() {
        return (EAttribute)getAlarm().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarm_PriorityWinter() {
        return (EAttribute)getAlarm().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarm_SystemId() {
        return (EAttribute)getAlarm().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarm_Flag() {
        return (EAttribute)getAlarm().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlarmId() {
		if (alarmIdEClass == null) {
			alarmIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(1);
		}
		return alarmIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmId_SystemId() {
        return (EAttribute)getAlarmId().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmId_BuildingId() {
        return (EAttribute)getAlarmId().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmId_AlarmId() {
        return (EAttribute)getAlarmId().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlarmRequest() {
		if (alarmRequestEClass == null) {
			alarmRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(2);
		}
		return alarmRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmRequest_Name() {
        return (EAttribute)getAlarmRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmRequest_PrioritySummer() {
        return (EAttribute)getAlarmRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmRequest_PriorityWinter() {
        return (EAttribute)getAlarmRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmRequest_Flags() {
        return (EAttribute)getAlarmRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmRequest_Description() {
        return (EAttribute)getAlarmRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmRequest_Consequence() {
        return (EAttribute)getAlarmRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmRequest_Cause() {
        return (EAttribute)getAlarmRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmRequest_Sl24Schedule() {
        return (EAttribute)getAlarmRequest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlarmPojo() {
		if (alarmPojoEClass == null) {
			alarmPojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(3);
		}
		return alarmPojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlarmPojo_Id() {
        return (EReference)getAlarmPojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmPojo_Name() {
        return (EAttribute)getAlarmPojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmPojo_Description() {
        return (EAttribute)getAlarmPojo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmPojo_Flags() {
        return (EAttribute)getAlarmPojo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmPojo_Consequence() {
        return (EAttribute)getAlarmPojo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmPojo_Cause() {
        return (EAttribute)getAlarmPojo().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmPojo_Sl24schedule() {
        return (EAttribute)getAlarmPojo().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmPojo_PrioritySummer() {
        return (EAttribute)getAlarmPojo().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmPojo_PriorityWinter() {
        return (EAttribute)getAlarmPojo().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinkedIdString() {
		if (linkedIdStringEClass == null) {
			linkedIdStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(4);
		}
		return linkedIdStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinkedIdString_Id() {
        return (EAttribute)getLinkedIdString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinkedIdString_Links() {
        return (EAttribute)getLinkedIdString().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstructionsPojo() {
		if (instructionsPojoEClass == null) {
			instructionsPojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(5);
		}
		return instructionsPojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstructionsPojo_AlarmId() {
        return (EAttribute)getInstructionsPojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstructionsPojo_Relations() {
        return (EReference)getInstructionsPojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationPojo() {
		if (relationPojoEClass == null) {
			relationPojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(6);
		}
		return relationPojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationPojo_Condition() {
        return (EAttribute)getRelationPojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationPojo_Instructions() {
        return (EAttribute)getRelationPojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCalenderEventRequest() {
		if (calenderEventRequestEClass == null) {
			calenderEventRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(8);
		}
		return calenderEventRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalenderEventRequest_From() {
        return (EAttribute)getCalenderEventRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalenderEventRequest_To() {
        return (EAttribute)getCalenderEventRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalenderEventRequest_Note() {
        return (EAttribute)getCalenderEventRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalenderEventRequest_Type() {
        return (EAttribute)getCalenderEventRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCalendarEventPojo() {
		if (calendarEventPojoEClass == null) {
			calendarEventPojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(7);
		}
		return calendarEventPojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalendarEventPojo_Id() {
        return (EAttribute)getCalendarEventPojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalendarEventPojo_From() {
        return (EAttribute)getCalendarEventPojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalendarEventPojo_To() {
        return (EAttribute)getCalendarEventPojo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalendarEventPojo_Note() {
        return (EAttribute)getCalendarEventPojo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalendarEventPojo_Type() {
        return (EAttribute)getCalendarEventPojo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalendarEventPojo_Author() {
        return (EAttribute)getCalendarEventPojo().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalendarEventPojo_AlarmId() {
        return (EAttribute)getCalendarEventPojo().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalendarEventPojo_SystemId() {
        return (EAttribute)getCalendarEventPojo().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommentPojo() {
		if (commentPojoEClass == null) {
			commentPojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(9);
		}
		return commentPojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommentPojo_Id() {
        return (EAttribute)getCommentPojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommentPojo_Author() {
        return (EAttribute)getCommentPojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommentPojo_Timestamp() {
        return (EAttribute)getCommentPojo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommentPojo_Content() {
        return (EAttribute)getCommentPojo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommentPojo_Type() {
        return (EAttribute)getCommentPojo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommentPojo_OwnerId() {
        return (EAttribute)getCommentPojo().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommentPojo_OwnerType() {
        return (EAttribute)getCommentPojo().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommentPojo_Status() {
        return (EReference)getCommentPojo().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatusPojo() {
		if (statusPojoEClass == null) {
			statusPojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(10);
		}
		return statusPojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusPojo_Timestamp() {
        return (EAttribute)getStatusPojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusPojo_Name() {
        return (EAttribute)getStatusPojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusPojo_Author() {
        return (EAttribute)getStatusPojo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommentRequest() {
		if (commentRequestEClass == null) {
			commentRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(11);
		}
		return commentRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommentRequest_Content() {
        return (EAttribute)getCommentRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommentRequest_Type() {
        return (EAttribute)getCommentRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceBuildingPojo() {
		if (deviceBuildingPojoEClass == null) {
			deviceBuildingPojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(12);
		}
		return deviceBuildingPojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceBuildingPojo_Id() {
        return (EAttribute)getDeviceBuildingPojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceBuildingPojo_SystemId() {
        return (EAttribute)getDeviceBuildingPojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceBuildingPojo_Devices() {
        return (EReference)getDeviceBuildingPojo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDevicePojo() {
		if (devicePojoEClass == null) {
			devicePojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(13);
		}
		return devicePojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevicePojo_Id() {
        return (EAttribute)getDevicePojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevicePojo_Type() {
        return (EAttribute)getDevicePojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDevicePojo_Connections() {
        return (EReference)getDevicePojo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceConnectionPojo() {
		if (deviceConnectionPojoEClass == null) {
			deviceConnectionPojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(14);
		}
		return deviceConnectionPojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceConnectionPojo_Timestamp() {
        return (EAttribute)getDeviceConnectionPojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceConnectionPojo_Ip() {
        return (EAttribute)getDeviceConnectionPojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceConnectionPojo_Reachable() {
        return (EAttribute)getDeviceConnectionPojo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceConnectionPojo_Since() {
        return (EAttribute)getDeviceConnectionPojo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDevicesCollectionPojo() {
		if (devicesCollectionPojoEClass == null) {
			devicesCollectionPojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(15);
		}
		return devicesCollectionPojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDevicesCollectionPojo_Buildings() {
        return (EReference)getDevicesCollectionPojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceAdapterPojo() {
		if (deviceAdapterPojoEClass == null) {
			deviceAdapterPojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(16);
		}
		return deviceAdapterPojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceAdapterPojo_BuildingId() {
        return (EAttribute)getDeviceAdapterPojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceAdapterPojo_DeviceId() {
        return (EAttribute)getDeviceAdapterPojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceAdapterPojo_Type() {
        return (EAttribute)getDeviceAdapterPojo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceAdapterPojo_Timestamp() {
        return (EAttribute)getDeviceAdapterPojo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceAdapterPojo_Ip() {
        return (EAttribute)getDeviceAdapterPojo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceAdapterPojo_Reachable() {
        return (EAttribute)getDeviceAdapterPojo().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceAdapterPojo_Since() {
        return (EAttribute)getDeviceAdapterPojo().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlarmLogPojo() {
		if (alarmLogPojoEClass == null) {
			alarmLogPojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(17);
		}
		return alarmLogPojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmLogPojo_SystemId() {
        return (EAttribute)getAlarmLogPojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmLogPojo_AlarmId() {
        return (EAttribute)getAlarmLogPojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmLogPojo_State() {
        return (EAttribute)getAlarmLogPojo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmLogPojo_Timestamp() {
        return (EAttribute)getAlarmLogPojo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChangeItem() {
		if (changeItemEClass == null) {
			changeItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(18);
		}
		return changeItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeItem_Id() {
        return (EAttribute)getChangeItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeItem_Timestamp() {
        return (EAttribute)getChangeItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeItem_Source() {
        return (EAttribute)getChangeItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeItem_Operation() {
        return (EAttribute)getChangeItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeItem_Target() {
        return (EAttribute)getChangeItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeItem_Change() {
        return (EAttribute)getChangeItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeItem_Author() {
        return (EAttribute)getChangeItem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatalogContentPojo() {
		if (datalogContentPojoEClass == null) {
			datalogContentPojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(19);
		}
		return datalogContentPojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatalogContentPojo_SystemId() {
        return (EAttribute)getDatalogContentPojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatalogContentPojo_Id() {
        return (EAttribute)getDatalogContentPojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatalogContentPojo_Name() {
        return (EAttribute)getDatalogContentPojo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatalogContentPojo_ValueType() {
        return (EAttribute)getDatalogContentPojo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatalogContentPojo_DatalogType() {
        return (EAttribute)getDatalogContentPojo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatalogContentPojo_PointNumber() {
        return (EAttribute)getDatalogContentPojo().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatalogContentPojo_PointName() {
        return (EAttribute)getDatalogContentPojo().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatalogContentPojo_PointId() {
        return (EAttribute)getDatalogContentPojo().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatalogContentPojo_EntriesT() {
        return (EAttribute)getDatalogContentPojo().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatalogContentPojo_EntriesV() {
        return (EAttribute)getDatalogContentPojo().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatalogContentPojo_Time() {
        return (EAttribute)getDatalogContentPojo().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatalogContentPojo_TimeController() {
        return (EAttribute)getDatalogContentPojo().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatalogContentPojo_Counter() {
        return (EAttribute)getDatalogContentPojo().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatalogContentPojo_Value() {
        return (EAttribute)getDatalogContentPojo().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatalogContentPojo_IsUnknown() {
        return (EAttribute)getDatalogContentPojo().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatalogContentPojo_IsError() {
        return (EAttribute)getDatalogContentPojo().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatalogContentPojo_Comments() {
        return (EReference)getDatalogContentPojo().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointValuePojo() {
		if (pointValuePojoEClass == null) {
			pointValuePojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(20);
		}
		return pointValuePojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointValuePojo_SystemId() {
        return (EAttribute)getPointValuePojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointValuePojo_Id() {
        return (EAttribute)getPointValuePojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointValuePojo_Name() {
        return (EAttribute)getPointValuePojo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointValuePojo_Value() {
        return (EAttribute)getPointValuePojo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointValuePojo_ValuePrev() {
        return (EAttribute)getPointValuePojo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointValuePojo_Time() {
        return (EAttribute)getPointValuePojo().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointValuePojo_OverrideState() {
        return (EAttribute)getPointValuePojo().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointValuePojo_IsUnknown() {
        return (EAttribute)getPointValuePojo().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointValuePojo_Comments() {
        return (EReference)getPointValuePojo().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlarmLogTimelinePojo() {
		if (alarmLogTimelinePojoEClass == null) {
			alarmLogTimelinePojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(21);
		}
		return alarmLogTimelinePojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlarmLogTimelinePojo_AlarmLogs() {
        return (EReference)getAlarmLogTimelinePojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmLogTimelinePojo_Total() {
        return (EAttribute)getAlarmLogTimelinePojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatisticEntry() {
		if (statisticEntryEClass == null) {
			statisticEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(22);
		}
		return statisticEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatisticEntry_TimeWindow() {
        return (EReference)getStatisticEntry().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatisticEntry_Values() {
        return (EAttribute)getStatisticEntry().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeWindow() {
		if (timeWindowEClass == null) {
			timeWindowEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(23);
		}
		return timeWindowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeWindow_Timestamp() {
        return (EAttribute)getTimeWindow().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeWindow_Identifier() {
        return (EAttribute)getTimeWindow().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeWindow_Unit() {
        return (EAttribute)getTimeWindow().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeWindow_ZoneId() {
        return (EAttribute)getTimeWindow().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntityMonitoringSettingsPojo() {
		if (entityMonitoringSettingsPojoEClass == null) {
			entityMonitoringSettingsPojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(24);
		}
		return entityMonitoringSettingsPojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntityMonitoringSettingsPojo_SystemId() {
        return (EAttribute)getEntityMonitoringSettingsPojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntityMonitoringSettingsPojo_Identifier() {
        return (EAttribute)getEntityMonitoringSettingsPojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntityMonitoringSettingsPojo_Name() {
        return (EAttribute)getEntityMonitoringSettingsPojo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntityMonitoringSettingsPojo_Included() {
        return (EAttribute)getEntityMonitoringSettingsPojo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntityMonitoringSettingsPojo_Type() {
        return (EAttribute)getEntityMonitoringSettingsPojo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSyncLogPojo() {
		if (syncLogPojoEClass == null) {
			syncLogPojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(25);
		}
		return syncLogPojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSyncLogPojo_SystemId() {
        return (EAttribute)getSyncLogPojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSyncLogPojo_State() {
        return (EAttribute)getSyncLogPojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSyncLogPojo_LatestRingbufferTimestamp() {
        return (EAttribute)getSyncLogPojo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSyncLogPojo_LastAccessTimeMs() {
        return (EAttribute)getSyncLogPojo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSyncLogPojo_AverageAccessTimeMs() {
        return (EAttribute)getSyncLogPojo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSyncLogPojo_Timestamp() {
        return (EAttribute)getSyncLogPojo().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSyncLogPojo_StateSince() {
        return (EAttribute)getSyncLogPojo().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatusLogPojo() {
		if (statusLogPojoEClass == null) {
			statusLogPojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(26);
		}
		return statusLogPojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusLogPojo_Id() {
        return (EAttribute)getStatusLogPojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusLogPojo_SystemId() {
        return (EAttribute)getStatusLogPojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusLogPojo_Type() {
        return (EAttribute)getStatusLogPojo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusLogPojo_Severity() {
        return (EAttribute)getStatusLogPojo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusLogPojo_Message() {
        return (EAttribute)getStatusLogPojo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusLogPojo_Timestamp() {
        return (EAttribute)getStatusLogPojo().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUpdateStateRequest() {
		if (updateStateRequestEClass == null) {
			updateStateRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(27);
		}
		return updateStateRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpdateStateRequest_SystemId() {
        return (EAttribute)getUpdateStateRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpdateStateRequest_AlarmId() {
        return (EAttribute)getUpdateStateRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpdateStateRequest_State() {
        return (EAttribute)getUpdateStateRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpdateStateRequest_Severity() {
        return (EAttribute)getUpdateStateRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpdateStateRequest_Timestamp() {
        return (EAttribute)getUpdateStateRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatusLogRequest() {
		if (statusLogRequestEClass == null) {
			statusLogRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(28);
		}
		return statusLogRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusLogRequest_Id() {
        return (EAttribute)getStatusLogRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusLogRequest_SystemId() {
        return (EAttribute)getStatusLogRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusLogRequest_Type() {
        return (EAttribute)getStatusLogRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusLogRequest_Severity() {
        return (EAttribute)getStatusLogRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusLogRequest_Message() {
        return (EAttribute)getStatusLogRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusLogRequest_Timestamp() {
        return (EAttribute)getStatusLogRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeScheduleBlockPojo() {
		if (timeScheduleBlockPojoEClass == null) {
			timeScheduleBlockPojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(29);
		}
		return timeScheduleBlockPojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeScheduleBlockPojo_SystemId() {
        return (EAttribute)getTimeScheduleBlockPojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeScheduleBlockPojo_Id() {
        return (EAttribute)getTimeScheduleBlockPojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeScheduleBlockPojo_Block() {
        return (EAttribute)getTimeScheduleBlockPojo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeScheduleBlockPojo_ExceptionStartDay() {
        return (EAttribute)getTimeScheduleBlockPojo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeScheduleBlockPojo_ExceptionStartMonth() {
        return (EAttribute)getTimeScheduleBlockPojo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeScheduleBlockPojo_ExceptionEndDay() {
        return (EAttribute)getTimeScheduleBlockPojo().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeScheduleBlockPojo_ExceptionEndMonth() {
        return (EAttribute)getTimeScheduleBlockPojo().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeScheduleBlockPojo_Year() {
        return (EAttribute)getTimeScheduleBlockPojo().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeScheduleBlockPojo_Times() {
        return (EAttribute)getTimeScheduleBlockPojo().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeScheduleBlockPojo_Time() {
        return (EAttribute)getTimeScheduleBlockPojo().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeScheduleBlockPojo_IsUnknown() {
        return (EAttribute)getTimeScheduleBlockPojo().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeScheduleBlockPojo_Comments() {
        return (EReference)getTimeScheduleBlockPojo().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeScheduleStatePojo() {
		if (timeScheduleStatePojoEClass == null) {
			timeScheduleStatePojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(30);
		}
		return timeScheduleStatePojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeScheduleStatePojo_SystemId() {
        return (EAttribute)getTimeScheduleStatePojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeScheduleStatePojo_Id() {
        return (EAttribute)getTimeScheduleStatePojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeScheduleStatePojo_Name() {
        return (EAttribute)getTimeScheduleStatePojo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeScheduleStatePojo_Value() {
        return (EAttribute)getTimeScheduleStatePojo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeScheduleStatePojo_Time() {
        return (EAttribute)getTimeScheduleStatePojo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeScheduleStatePojo_IsUnknown() {
        return (EAttribute)getTimeScheduleStatePojo().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeScheduleStatePojo_Comments() {
        return (EReference)getTimeScheduleStatePojo().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVersionInfo() {
		if (versionInfoEClass == null) {
			versionInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(31);
		}
		return versionInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionInfo_Id() {
        return (EAttribute)getVersionInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionInfo_Coordinates() {
        return (EAttribute)getVersionInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionInfo_Name() {
        return (EAttribute)getVersionInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionInfo_Type() {
        return (EAttribute)getVersionInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionInfo_Version() {
        return (EAttribute)getVersionInfo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionInfo_Serial() {
        return (EAttribute)getVersionInfo().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointRecord() {
		if (pointRecordEClass == null) {
			pointRecordEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(32);
		}
		return pointRecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointRecord_SystemId() {
        return (EAttribute)getPointRecord().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointRecord_Id() {
        return (EAttribute)getPointRecord().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointRecord_Address() {
        return (EAttribute)getPointRecord().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointRecord_NewValue() {
        return (EAttribute)getPointRecord().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointRecord_OldValue() {
        return (EAttribute)getPointRecord().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointRecord_OverrideStatus() {
        return (EAttribute)getPointRecord().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointRecord_Note() {
        return (EAttribute)getPointRecord().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointRecord_Author() {
        return (EAttribute)getPointRecord().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeScheduleRecord() {
		if (timeScheduleRecordEClass == null) {
			timeScheduleRecordEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(33);
		}
		return timeScheduleRecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeScheduleRecord_SystemId() {
        return (EAttribute)getTimeScheduleRecord().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeScheduleRecord_Id() {
        return (EAttribute)getTimeScheduleRecord().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeScheduleRecord_Address() {
        return (EAttribute)getTimeScheduleRecord().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeScheduleRecord_OldValue() {
        return (EAttribute)getTimeScheduleRecord().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeScheduleRecord_NewValue() {
        return (EAttribute)getTimeScheduleRecord().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeScheduleRecord_Note() {
        return (EAttribute)getTimeScheduleRecord().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeScheduleRecord_Author() {
        return (EAttribute)getTimeScheduleRecord().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJsonNode() {
		if (jsonNodeEClass == null) {
			jsonNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(34);
		}
		return jsonNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddressPojo() {
		if (addressPojoEClass == null) {
			addressPojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(35);
		}
		return addressPojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressPojo_Address() {
        return (EAttribute)getAddressPojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressPojo_Community() {
        return (EAttribute)getAddressPojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressPojo_County() {
        return (EAttribute)getAddressPojo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressPojo_Country() {
        return (EAttribute)getAddressPojo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressPojo_Description() {
        return (EAttribute)getAddressPojo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressPojo_District() {
        return (EAttribute)getAddressPojo().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressPojo_Extended() {
        return (EAttribute)getAddressPojo().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressPojo_FederalState() {
        return (EAttribute)getAddressPojo().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressPojo_Location() {
        return (EAttribute)getAddressPojo().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressPojo_Number() {
        return (EAttribute)getAddressPojo().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressPojo_PostBox() {
        return (EAttribute)getAddressPojo().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressPojo_PostCode() {
        return (EAttribute)getAddressPojo().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressPojo_Street() {
        return (EAttribute)getAddressPojo().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressPojo_Representation() {
        return (EAttribute)getAddressPojo().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemDescriptionPojo() {
		if (systemDescriptionPojoEClass == null) {
			systemDescriptionPojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(36);
		}
		return systemDescriptionPojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemDescriptionPojo_Id() {
        return (EAttribute)getSystemDescriptionPojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemDescriptionPojo_Name() {
        return (EAttribute)getSystemDescriptionPojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemDescriptionPojo_Prefix() {
        return (EAttribute)getSystemDescriptionPojo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemDescriptionPojo_Ip() {
        return (EAttribute)getSystemDescriptionPojo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemDescriptionPojo_Directory() {
        return (EAttribute)getSystemDescriptionPojo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemDescriptionPojo_Port() {
        return (EAttribute)getSystemDescriptionPojo().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemDescriptionPojo_Lon() {
        return (EAttribute)getSystemDescriptionPojo().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemDescriptionPojo_Lat() {
        return (EAttribute)getSystemDescriptionPojo().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemDescriptionPojo_Shallow() {
        return (EAttribute)getSystemDescriptionPojo().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemDescriptionPojo_Excluded() {
        return (EAttribute)getSystemDescriptionPojo().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemDescriptionPojo_ExternalId() {
        return (EAttribute)getSystemDescriptionPojo().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemDescriptionPojo_Address() {
        return (EReference)getSystemDescriptionPojo().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemDescriptionPojo_Source() {
        return (EAttribute)getSystemDescriptionPojo().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemDescriptionPojo_Children() {
        return (EReference)getSystemDescriptionPojo().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemDescriptionPojo_Flags() {
        return (EAttribute)getSystemDescriptionPojo().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemDescriptionPojo_CylonNetwork() {
        return (EAttribute)getSystemDescriptionPojo().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemDescriptionRequest() {
		if (systemDescriptionRequestEClass == null) {
			systemDescriptionRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(37);
		}
		return systemDescriptionRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemDescriptionRequest_Id() {
        return (EAttribute)getSystemDescriptionRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemDescriptionRequest_Name() {
        return (EAttribute)getSystemDescriptionRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemDescriptionRequest_Directory() {
        return (EAttribute)getSystemDescriptionRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemDescriptionRequest_Port() {
        return (EAttribute)getSystemDescriptionRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemDescriptionRequest_ExternalId() {
        return (EAttribute)getSystemDescriptionRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemDescriptionRequest_Ip() {
        return (EAttribute)getSystemDescriptionRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemDescriptionRequest_Lon() {
        return (EAttribute)getSystemDescriptionRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemDescriptionRequest_Lat() {
        return (EAttribute)getSystemDescriptionRequest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemDescriptionRequest_Excluded() {
        return (EAttribute)getSystemDescriptionRequest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemDescriptionRequest_Flags() {
        return (EAttribute)getSystemDescriptionRequest().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContactPojo() {
		if (contactPojoEClass == null) {
			contactPojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(38);
		}
		return contactPojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactPojo_Name() {
        return (EAttribute)getContactPojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactPojo_Task() {
        return (EAttribute)getContactPojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactPojo_Additional() {
        return (EAttribute)getContactPojo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactPojo_FirstName() {
        return (EAttribute)getContactPojo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactPojo_LastName() {
        return (EAttribute)getContactPojo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactPojo_Salutation() {
        return (EAttribute)getContactPojo().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactPojo_ShortName() {
        return (EAttribute)getContactPojo().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactPojo_Title() {
        return (EAttribute)getContactPojo().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactPojo_Address() {
        return (EReference)getContactPojo().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactPojo_Phones() {
        return (EReference)getContactPojo().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactPojo_Emails() {
        return (EAttribute)getContactPojo().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactPojo_Comments() {
        return (EAttribute)getContactPojo().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhonePojo() {
		if (phonePojoEClass == null) {
			phonePojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(39);
		}
		return phonePojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhonePojo_Type() {
        return (EAttribute)getPhonePojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhonePojo_Number() {
        return (EAttribute)getPhonePojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContractPojo() {
		if (contractPojoEClass == null) {
			contractPojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(40);
		}
		return contractPojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContractPojo_Art() {
        return (EAttribute)getContractPojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContractPojo_Name() {
        return (EAttribute)getContractPojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContractPojo_Displayname() {
        return (EAttribute)getContractPojo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContractPojo_ConclusionDate() {
        return (EAttribute)getContractPojo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContractPojo_Comment() {
        return (EAttribute)getContractPojo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContractPojo_Contacts() {
        return (EReference)getContractPojo().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContractPojo_CustomerId() {
        return (EAttribute)getContractPojo().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContractPojo_End() {
        return (EAttribute)getContractPojo().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContractPojo_Number() {
        return (EAttribute)getContractPojo().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContractPojo_Partner() {
        return (EReference)getContractPojo().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContractPojo_Referee() {
        return (EReference)getContractPojo().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContractPojo_Start() {
        return (EAttribute)getContractPojo().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContractPojo_State() {
        return (EAttribute)getContractPojo().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContractPojo_Subject() {
        return (EAttribute)getContractPojo().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContractPojo_Termination() {
        return (EAttribute)getContractPojo().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContractPojo_Type() {
        return (EAttribute)getContractPojo().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTechFacilityPojo() {
		if (techFacilityPojoEClass == null) {
			techFacilityPojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(41);
		}
		return techFacilityPojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTechFacilityPojo_Name() {
        return (EAttribute)getTechFacilityPojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTechFacilityPojo_FacilityClass() {
        return (EAttribute)getTechFacilityPojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTechFacilityPojo_FacilityClassName() {
        return (EAttribute)getTechFacilityPojo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTechFacilityPojo_Room() {
        return (EAttribute)getTechFacilityPojo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTechFacilityPojo_ConstructionYear() {
        return (EAttribute)getTechFacilityPojo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTechFacilityPojo_LaunchDate() {
        return (EAttribute)getTechFacilityPojo().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTechFacilityPojo_Contracts() {
        return (EReference)getTechFacilityPojo().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntityPojo() {
		if (entityPojoEClass == null) {
			entityPojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(42);
		}
		return entityPojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntityPojo_Entity() {
        return (EAttribute)getEntityPojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntityRequest() {
		if (entityRequestEClass == null) {
			entityRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(43);
		}
		return entityRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntityRequest_SystemId() {
        return (EAttribute)getEntityRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntityRequest_Type() {
        return (EAttribute)getEntityRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntityRequest_Identifier() {
        return (EAttribute)getEntityRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCylonNetworkPojo() {
		if (cylonNetworkPojoEClass == null) {
			cylonNetworkPojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(44);
		}
		return cylonNetworkPojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCylonNetworkPojo_Entity() {
        return (EAttribute)getCylonNetworkPojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCylonNetworkPojo_Id() {
        return (EAttribute)getCylonNetworkPojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCylonNetworkPojo_Name() {
        return (EAttribute)getCylonNetworkPojo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCylonNetworkPojo_SystemId() {
        return (EAttribute)getCylonNetworkPojo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCylonNetworkPojo_Directory() {
        return (EAttribute)getCylonNetworkPojo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCylonNetworkPojo_Ip() {
        return (EAttribute)getCylonNetworkPojo().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCylonNetworkPojo_Port() {
        return (EAttribute)getCylonNetworkPojo().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCylonNetworkPojo_Count() {
        return (EAttribute)getCylonNetworkPojo().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCylonNetworkPojo_Children() {
        return (EReference)getCylonNetworkPojo().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCylonNetworkPojo_Summary() {
        return (EAttribute)getCylonNetworkPojo().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImportStatisticPojo() {
		if (importStatisticPojoEClass == null) {
			importStatisticPojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(45);
		}
		return importStatisticPojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImportStatisticPojo_Add() {
        return (EReference)getImportStatisticPojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImportStatisticPojo_Remove() {
        return (EReference)getImportStatisticPojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImportStatisticPojo_Update() {
        return (EReference)getImportStatisticPojo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getText() {
		if (textEClass == null) {
			textEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(46);
		}
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getText_Type() {
        return (EAttribute)getText().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getText_Content() {
        return (EAttribute)getText().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getText_Id() {
        return (EAttribute)getText().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextRequest() {
		if (textRequestEClass == null) {
			textRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(47);
		}
		return textRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextRequest_Id() {
        return (EAttribute)getTextRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextRequest_Content() {
        return (EAttribute)getTextRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextRequest_Type() {
        return (EAttribute)getTextRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinkedIdInteger() {
		if (linkedIdIntegerEClass == null) {
			linkedIdIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(48);
		}
		return linkedIdIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinkedIdInteger_Id() {
        return (EAttribute)getLinkedIdInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinkedIdInteger_Links() {
        return (EAttribute)getLinkedIdInteger().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRolePojo() {
		if (rolePojoEClass == null) {
			rolePojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(49);
		}
		return rolePojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRolePojo_Name() {
        return (EAttribute)getRolePojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRolePojo_Type() {
        return (EAttribute)getRolePojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRolePojo_Groups() {
        return (EAttribute)getRolePojo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRolePojo_Roles() {
        return (EAttribute)getRolePojo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRolePojo_Members() {
        return (EAttribute)getRolePojo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRolePojo_Properties() {
        return (EAttribute)getRolePojo().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuspectPojo() {
		if (suspectPojoEClass == null) {
			suspectPojoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(50);
		}
		return suspectPojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSuspectPojo_SystemId() {
        return (EAttribute)getSuspectPojo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSuspectPojo_AlarmId() {
        return (EAttribute)getSuspectPojo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSuspectPojo_State() {
        return (EAttribute)getSuspectPojo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSuspectPojo_Timestamp() {
        return (EAttribute)getSuspectPojo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSuspectPojo_Severity() {
        return (EAttribute)getSuspectPojo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSuspectPojo_Recognized() {
        return (EAttribute)getSuspectPojo().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSuspectPojo_By() {
        return (EAttribute)getSuspectPojo().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponse() {
		if (responseEClass == null) {
			responseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(51);
		}
		return responseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponse_Code() {
        return (EAttribute)getResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponse_Description() {
        return (EAttribute)getResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponse_Response() {
        return (EAttribute)getResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponse_Result() {
        return (EReference)getResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOpenApiClient() {
		if (openApiClientEClass == null) {
			openApiClientEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(53);
		}
		return openApiClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOpenApiClient__ToQueryString__String_Object() {
        return getOpenApiClient().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOpenApiClient___get__String_EClass_EMap_EMap() {
        return getOpenApiClient().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOpenApiClient___delete__String_EClass_EMap_EMap() {
        return getOpenApiClient().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGltOpenApiClient() {
		if (gltOpenApiClientEClass == null) {
			gltOpenApiClientEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(54);
		}
		return gltOpenApiClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__BulkTextUpdate__String_Integer_EList() {
        return getGltOpenApiClient().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetAlarm__String_Boolean() {
        return getGltOpenApiClient().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__UpdateAlarm__String_AlarmRequest() {
        return getGltOpenApiClient().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__CreateAlarm__String_AlarmRequest() {
        return getGltOpenApiClient().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetAlarmIds__String() {
        return getGltOpenApiClient().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetAlarmInstructions__String() {
        return getGltOpenApiClient().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__UpdateInstructions__String_InstructionsPojo() {
        return getGltOpenApiClient().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetAlarms__EList_String() {
        return getGltOpenApiClient().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__Usage__Integer() {
        return getGltOpenApiClient().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__UsageIds__Integer() {
        return getGltOpenApiClient().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetEventsForAlarm__String_String_String_String() {
        return getGltOpenApiClient().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__CreateEventForAlarm__String_CalenderEventRequest() {
        return getGltOpenApiClient().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetEventsForSystem__String_String_Boolean_String_String() {
        return getGltOpenApiClient().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__CreateEventForSystem__String_CalenderEventRequest() {
        return getGltOpenApiClient().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__UpdateEvent__Integer_CalenderEventRequest() {
        return getGltOpenApiClient().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__DeleteEvent__Integer() {
        return getGltOpenApiClient().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetEvents__EList_String_String_String() {
        return getGltOpenApiClient().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetEventsAtTime__EList_String_String_BigInteger() {
        return getGltOpenApiClient().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetEventsForAlarm_1__String_String_String_BigInteger() {
        return getGltOpenApiClient().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetEventsForSystem_1__String_String_String_BigInteger_Boolean() {
        return getGltOpenApiClient().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetForAlarm__String_BigInteger_String() {
        return getGltOpenApiClient().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__CreateCommentForOwner__String_BigInteger_CommentRequest() {
        return getGltOpenApiClient().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__UpdateComment__Integer_CommentRequest() {
        return getGltOpenApiClient().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__DeleteComment__Integer() {
        return getGltOpenApiClient().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetCommentedOn__String_String_String_String() {
        return getGltOpenApiClient().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetFiltered__Integer_Integer_EList_EList_Boolean_EList_EList_EList_String_String() {
        return getGltOpenApiClient().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetFilteredAuthors__EList_EList_Boolean_EList_EList_String_String() {
        return getGltOpenApiClient().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetFilteredCount__EList_EList_Boolean_EList_EList_EList_String_String() {
        return getGltOpenApiClient().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__UpdateStatus__Integer_String() {
        return getGltOpenApiClient().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetBuildingNames__EList() {
        return getGltOpenApiClient().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetDeviceName__EList() {
        return getGltOpenApiClient().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetDevices() {
        return getGltOpenApiClient().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetDevicesCount() {
        return getGltOpenApiClient().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetDevicesFlat() {
        return getGltOpenApiClient().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetAlarmsWithMismatchedSystems() {
        return getGltOpenApiClient().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetAuditLog__Integer_Integer() {
        return getGltOpenApiClient().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetAuditLogCount() {
        return getGltOpenApiClient().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetDuplicateTexts() {
        return getGltOpenApiClient().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetFields__Boolean() {
        return getGltOpenApiClient().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetUndocumentedAlarms() {
        return getGltOpenApiClient().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetUnusedTexts() {
        return getGltOpenApiClient().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__ImportFromCsv__EList_String_Boolean_String() {
        return getGltOpenApiClient().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetDatalogContent__Integer_EList_String_String() {
        return getGltOpenApiClient().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetDatalogInfo__Integer_EList() {
        return getGltOpenApiClient().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__UpdateDatalogContent__Integer_EList() {
        return getGltOpenApiClient().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetChangelog__Integer_Integer_EList_Boolean_EList_String_String() {
        return getGltOpenApiClient().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetChangelogCount__EList_Boolean_EList_String_String() {
        return getGltOpenApiClient().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetPointValueHistory__Integer_EList_Boolean_Boolean() {
        return getGltOpenApiClient().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetPointValues__Integer_String_String_EList() {
        return getGltOpenApiClient().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__UpdatePointValues__Integer_EList() {
        return getGltOpenApiClient().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetAlarmCount__EList_BigInteger_BigInteger() {
        return getGltOpenApiClient().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetAlarmCountPost__BigInteger_BigInteger_EList() {
        return getGltOpenApiClient().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetAlarmCount_1__String_String_EList_EList() {
        return getGltOpenApiClient().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetAlarmCountByState__String_EList_EList() {
        return getGltOpenApiClient().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetAlarmCountByState_1__EList_EList_EList() {
        return getGltOpenApiClient().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetAlarmCountByStateAndSystem__EList_EList_EList() {
        return getGltOpenApiClient().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetAlarmCountForSystem__String_EList_EList() {
        return getGltOpenApiClient().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetAlarmForStateCount__String_EList_EList() {
        return getGltOpenApiClient().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetAlarmLogTimeline__String_BigInteger_BigInteger_Integer_Integer() {
        return getGltOpenApiClient().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetAlarmLogTimelineStatistics__String_BigInteger_BigInteger_String_String() {
        return getGltOpenApiClient().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetAlarmLogs__EList_EList() {
        return getGltOpenApiClient().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetAlarmLogs_1__String_EList_EList() {
        return getGltOpenApiClient().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetAlarmLogsForState__String_EList_EList() {
        return getGltOpenApiClient().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetAlarmLogsForStates__EList_EList_EList() {
        return getGltOpenApiClient().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetAlarmLogsTimeline__String_BigInteger_BigInteger() {
        return getGltOpenApiClient().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetAlarmsForState__String_String_EList_EList() {
        return getGltOpenApiClient().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetAlarmsForStates__String_EList_EList_EList() {
        return getGltOpenApiClient().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetEntityMonitoring__Integer() {
        return getGltOpenApiClient().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetEntityMonitoring_1__Integer_String() {
        return getGltOpenApiClient().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__UpdateEntityMonitoring__Integer_String_Integer_String_Boolean() {
        return getGltOpenApiClient().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetLog__String() {
        return getGltOpenApiClient().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetLogs() {
        return getGltOpenApiClient().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetLogsForState__String() {
        return getGltOpenApiClient().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetStatistics__String() {
        return getGltOpenApiClient().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetStatusLogs() {
        return getGltOpenApiClient().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__UpsertStatusLog__StatusLogRequest() {
        return getGltOpenApiClient().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetStatusLogs_1__String() {
        return getGltOpenApiClient().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetStatusLogsTimeline__String_BigInteger_BigInteger() {
        return getGltOpenApiClient().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetTracked__String() {
        return getGltOpenApiClient().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__IsFlaky__String_String_BigInteger_BigInteger_Integer() {
        return getGltOpenApiClient().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__LogsForStates__EList() {
        return getGltOpenApiClient().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__RefreshSystem__String() {
        return getGltOpenApiClient().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__UpdateAlarmState__String_UpdateStateRequest() {
        return getGltOpenApiClient().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetChangelog_1__Integer_Integer_EList_Boolean_EList_String_String() {
        return getGltOpenApiClient().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetChangelogCount_1__EList_Boolean_EList_String_String() {
        return getGltOpenApiClient().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetTimeScheduleBlockHistory__Integer_EList_Boolean() {
        return getGltOpenApiClient().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetTimeScheduleBlocks__Integer_EList() {
        return getGltOpenApiClient().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__UpdateTimeScheduleBlocks__Integer_EList() {
        return getGltOpenApiClient().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetTimeScheduleStateHistory__Integer_EList_Boolean() {
        return getGltOpenApiClient().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetTimeScheduleStates__Integer_EList() {
        return getGltOpenApiClient().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__UpdateTimeScheduleStates__Integer_EList() {
        return getGltOpenApiClient().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetVersion__Integer_EList() {
        return getGltOpenApiClient().getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__Point__PointRecord() {
        return getGltOpenApiClient().getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__Timeschedule__TimeScheduleRecord() {
        return getGltOpenApiClient().getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__Get__String() {
        return getGltOpenApiClient().getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__CreateOrUpdate__String_String() {
        return getGltOpenApiClient().getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__Create__String_String() {
        return getGltOpenApiClient().getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__Delete__String() {
        return getGltOpenApiClient().getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetAllSettings() {
        return getGltOpenApiClient().getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetAuthStatus() {
        return getGltOpenApiClient().getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetStatus() {
        return getGltOpenApiClient().getEOperations().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetSystem__String_Boolean() {
        return getGltOpenApiClient().getEOperations().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__UpdateSystem__String_SystemDescriptionRequest() {
        return getGltOpenApiClient().getEOperations().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__CreateSystemDescription__String_SystemDescriptionRequest() {
        return getGltOpenApiClient().getEOperations().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__DeleteSystem__String() {
        return getGltOpenApiClient().getEOperations().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetContacts__String() {
        return getGltOpenApiClient().getEOperations().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetContracts__String_String_Boolean() {
        return getGltOpenApiClient().getEOperations().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetSystemIds__Boolean() {
        return getGltOpenApiClient().getEOperations().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetSystems__Boolean() {
        return getGltOpenApiClient().getEOperations().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetTechFacilities__String_String_Boolean() {
        return getGltOpenApiClient().getEOperations().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetEntities__EList() {
        return getGltOpenApiClient().getEOperations().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetEntitiesByType__Integer_String_EList() {
        return getGltOpenApiClient().getEOperations().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetEntitiesByTypes__Integer_EList_EList() {
        return getGltOpenApiClient().getEOperations().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetSystemEntities__Integer_Integer() {
        return getGltOpenApiClient().getEOperations().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetSystemEntity__Integer_String_Integer() {
        return getGltOpenApiClient().getEOperations().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__ImportSystems__Boolean_Boolean_Boolean_Boolean() {
        return getGltOpenApiClient().getEOperations().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__CleanupTexts() {
        return getGltOpenApiClient().getEOperations().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__CreateText__TextRequest() {
        return getGltOpenApiClient().getEOperations().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetText__Integer() {
        return getGltOpenApiClient().getEOperations().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__UpdateText__Integer_TextRequest() {
        return getGltOpenApiClient().getEOperations().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__DeleteText__Integer() {
        return getGltOpenApiClient().getEOperations().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetTextIds() {
        return getGltOpenApiClient().getEOperations().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetTextIds_1__String() {
        return getGltOpenApiClient().getEOperations().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetTexts() {
        return getGltOpenApiClient().getEOperations().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetTexts_1__String() {
        return getGltOpenApiClient().getEOperations().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetGroups() {
        return getGltOpenApiClient().getEOperations().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__AddGroup__String() {
        return getGltOpenApiClient().getEOperations().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__AddMemberToGroup__String_String() {
        return getGltOpenApiClient().getEOperations().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__AddPropertyToRole__String_String_String() {
        return getGltOpenApiClient().getEOperations().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__RemovePropertyFromRole__String_String() {
        return getGltOpenApiClient().getEOperations().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetUsers() {
        return getGltOpenApiClient().getEOperations().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__AddUser__String() {
        return getGltOpenApiClient().getEOperations().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__CurrentRole() {
        return getGltOpenApiClient().getEOperations().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetRole__String_Boolean_Boolean() {
        return getGltOpenApiClient().getEOperations().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__RemoveMemberFromGroup__String_String() {
        return getGltOpenApiClient().getEOperations().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__RemoveRole__String() {
        return getGltOpenApiClient().getEOperations().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__UpdateSuspect__String_String() {
        return getGltOpenApiClient().getEOperations().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__DeleteSuspect__String_String() {
        return getGltOpenApiClient().getEOperations().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetSuspects__EList_EList_Boolean() {
        return getGltOpenApiClient().getEOperations().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGltOpenApiClient__GetSuspects_1__String_EList_EList_Boolean() {
        return getGltOpenApiClient().getEOperations().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getJResponse() {
		if (jResponseEDataType == null) {
			jResponseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GltPackage.eNS_URI).getEClassifiers().get(52);
		}
		return jResponseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GltFactory getGltFactory() {
		return (GltFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Loads the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("de.jena.model.glt." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //GltPackageImpl
