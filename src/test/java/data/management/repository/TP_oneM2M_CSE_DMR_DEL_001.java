package data.management.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import cdot.ccsp.dmr.ContainerCreateTestCases;
import cdot.ccsp.dmr.ContentInstanceCreateTestCases;
import cdot.ccsp.dmr.TimeSeriesCreateTestCases;
import cdot.ccsp.dmr.TimeSeriesInstanceCreateTestCases;
import cdot.ccsp.groupMgmt.GroupCreate;
import cdot.ccsp.onem2mTester.utils.GeneralDeleteTestCases;
import cdot.ccsp.onem2mTester.utils.GeneralRetrieveTestCases;
import cdot.ccsp.onem2mTester.utils.TestingParams;
import cdot.ccsp.pollingchannel.PollingChannelCreateTestCases;
import cdot.ccsp.registration.AERegistration;
import cdot.ccsp.sca.StatsConfigCreateTestCases;
import cdot.ccsp.security.acp.AccessControlPolicyCreateTestCases;
import cdot.ccsp.subscription.SubscriptionCreate;
import cdot.onem2m.common.dto.OneM2MRequest;
import cdot.onem2m.common.dto.OneM2MResponse;
import cdot.onem2m.common.enums.M2MOperation;
import cdot.onem2m.common.enums.M2MReleaseVersion;
import cdot.onem2m.common.enums.M2MStatus;
import cdot.onem2m.common.enums.MediaType;
import cdot.onem2m.platform.originatorActions.business.OriginatorActions;
import cdot.onem2m.platform.originatorActions.business.OriginatorActionsBean;
import cdot.onem2m.resource.xsd.AE;
import cdot.onem2m.resource.xsd.AccessControlPolicy;
import cdot.onem2m.resource.xsd.Container;
import cdot.onem2m.resource.xsd.ContentInstance;
import cdot.onem2m.resource.xsd.Group;
import cdot.onem2m.resource.xsd.PollingChannel;
import cdot.onem2m.resource.xsd.StatsConfig;
import cdot.onem2m.resource.xsd.Subscription;
import cdot.onem2m.resource.xsd.TimeSeries;
import cdot.onem2m.resource.xsd.TimeSeriesInstance;
import initializer.ConfigurationExtension;

@ExtendWith({ ConfigurationExtension.class })
@Tag("TP_oneM2M_CSE_DMR_DEL_001")
public class TP_oneM2M_CSE_DMR_DEL_001 {

	String aeId;
	String aeResourceID;
	String aeStructuredResourceID;
	String container1ResourceId;
	String container1StructuredResourceId;

	AERegistration aeRegister = new AERegistration();

	GeneralRetrieveTestCases genRetrieve = new GeneralRetrieveTestCases();
	GeneralDeleteTestCases genDelete = new GeneralDeleteTestCases();

	@BeforeAll
	static void beforeAllSetup() {
		System.out.println("##########################################################################################################");
	}

	@BeforeEach
	void beforeEachSetup() {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}

	@Test
	@Tag("TP_oneM2M_CSE_DMR_DEL_001_CNT")
	void TP_oneM2M_CSE_DMR_DEL_001_CNT() {
		ContainerCreateTestCases contCreate = new ContainerCreateTestCases();
		aeStructuredResourceID = TestingParams.CSE_BASE_RESOURCE_NAME;

		// INITIAL STATE STARTS
		// AE-REGISTRATION
		OneM2MResponse aeMResponse = aeRegister.AERegisterWithEmptyFrom(TestingParams.CSE_BASE_RESOURCE_ID, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		AE ae = (AE) aeMResponse.getPrimitiveContent().getAny();
		assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), aeMResponse.getResponseStatusCode());
		// AE-REGISTRATION DONE
		aeId = ae.getAEID();
		aeResourceID = ae.getResourceID();
		aeStructuredResourceID = aeStructuredResourceID + "/" + ae.getResourceName();
		// CONTAINER CREATE 1

		OneM2MResponse container1Response = contCreate.createWithResultContent(BigInteger.valueOf(9), TestingParams.GENERAL_ADN_AE_ID, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), container1Response.getResponseStatusCode());
		// CONTAINER CREATE 1 ENDS
		assertTrue(container1Response.getPrimitiveContent().getAny() instanceof Container);
		Container cont = (Container) container1Response.getPrimitiveContent().getAny();
		assertNull(cont.getLabels());
		
		
		OneM2MResponse delResponse = genDelete.deleteResource(cont.getResourceID(), TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.DELETED.getOnem2mStatusCode(), delResponse.getResponseStatusCode());


		// INITIAL STATE ENDS
		// CONTAINER UPDATE ENDS
		// TEST EVENT ENDS
		System.out.println(" AE-ID : " + aeId);
		System.out.println(" AE RESOURCE ID : " + aeResourceID);
		System.out.println(" AE STRUCTURED RESOURCE ID : " + aeStructuredResourceID);

	}

	@Test
	@Tag("TP_oneM2M_CSE_DMR_DEL_001_ACP")
	void TP_oneM2M_CSE_DMR_DEL_001_ACP() {
		aeStructuredResourceID = TestingParams.CSE_BASE_RESOURCE_NAME;

		// INITIAL STATE STARTS
		// AE-REGISTRATION
		OneM2MResponse aeMResponse = aeRegister.AERegisterWithEmptyFrom(TestingParams.CSE_BASE_RESOURCE_ID, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		AE ae = (AE) aeMResponse.getPrimitiveContent().getAny();
		assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), aeMResponse.getResponseStatusCode());
		// AE-REGISTRATION DONE
		aeId = ae.getAEID();
		aeResourceID = ae.getResourceID();
		aeStructuredResourceID = aeStructuredResourceID + "/" + ae.getResourceName();
		// CONTAINER CREATE 1

		AccessControlPolicyCreateTestCases acpCreate = new AccessControlPolicyCreateTestCases();
		OneM2MResponse acpResponse = acpCreate.createWithAllPrivilegeAndResultContent(BigInteger.valueOf(9), TestingParams.GENERAL_ADN_AE_ID, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), acpResponse.getResponseStatusCode());

		assertTrue(acpResponse.getPrimitiveContent().getAny() instanceof AccessControlPolicy);
		AccessControlPolicy acp = (AccessControlPolicy) acpResponse.getPrimitiveContent().getAny();
		assertNull(acp.getPrivileges());
		assertNull(acp.getSelfPrivileges());

		OneM2MResponse delResponse = genDelete.deleteResource(acp.getResourceID(), TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.DELETED.getOnem2mStatusCode(), delResponse.getResponseStatusCode());
		// INITIAL STATE ENDS
		// CONTAINER UPDATE ENDS
		// TEST EVENT ENDS
		System.out.println(" AE-ID : " + aeId);
		System.out.println(" AE RESOURCE ID : " + aeResourceID);
		System.out.println(" AE STRUCTURED RESOURCE ID : " + aeStructuredResourceID);

	}

	@Test
	@Tag("TP_oneM2M_CSE_DMR_DEL_001_SUB")
	void TP_oneM2M_CSE_DMR_DEL_001_SUB() {
		aeStructuredResourceID = TestingParams.CSE_BASE_RESOURCE_NAME;

		// INITIAL STATE STARTS
		// AE-REGISTRATION
		OneM2MResponse aeMResponse = aeRegister.AERegisterWithEmptyFrom(TestingParams.CSE_BASE_RESOURCE_ID, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		AE ae = (AE) aeMResponse.getPrimitiveContent().getAny();
		assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), aeMResponse.getResponseStatusCode());
		// AE-REGISTRATION DONE
		aeId = ae.getAEID();
		aeResourceID = ae.getResourceID();
		aeStructuredResourceID = aeStructuredResourceID + "/" + ae.getResourceName();
		// CONTAINER CREATE 1

		SubscriptionCreate subCreate = new SubscriptionCreate();
		OneM2MResponse subResponse = subCreate.createWithResultContent(BigInteger.valueOf(9), TestingParams.GENERAL_ADN_AE_ID, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), subResponse.getResponseStatusCode());

		assertTrue(subResponse.getPrimitiveContent().getAny() instanceof Subscription);
		Subscription sub = (Subscription) subResponse.getPrimitiveContent().getAny();
		assertNull(sub.getNotificationURI());

		OneM2MResponse delResponse = genDelete.deleteResource(sub.getResourceID(), TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.DELETED.getOnem2mStatusCode(), delResponse.getResponseStatusCode());
		// INITIAL STATE ENDS
		// CONTAINER UPDATE ENDS
		// TEST EVENT ENDS
		System.out.println(" AE-ID : " + aeId);
		System.out.println(" AE RESOURCE ID : " + aeResourceID);
		System.out.println(" AE STRUCTURED RESOURCE ID : " + aeStructuredResourceID);

	}

	@Test
	@Tag("TP_oneM2M_CSE_DMR_DEL_001_CIN")
	void TP_oneM2M_CSE_DMR_DEL_001_CIN() {
		ContainerCreateTestCases contCreate = new ContainerCreateTestCases();
		ContentInstanceCreateTestCases ciCreate = new ContentInstanceCreateTestCases();
		aeStructuredResourceID = TestingParams.CSE_BASE_RESOURCE_NAME;

		// INITIAL STATE STARTS
		// AE-REGISTRATION
		OneM2MResponse aeMResponse = aeRegister.AERegisterWithEmptyFrom(TestingParams.CSE_BASE_RESOURCE_ID, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		AE ae = (AE) aeMResponse.getPrimitiveContent().getAny();
		assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), aeMResponse.getResponseStatusCode());
		// AE-REGISTRATION DONE
		aeId = ae.getAEID();
		aeResourceID = ae.getResourceID();
		aeStructuredResourceID = aeStructuredResourceID + "/" + ae.getResourceName();
		// CONTAINER CREATE 1

		OneM2MResponse container1Response = contCreate.createWithResultContent(BigInteger.valueOf(9), TestingParams.GENERAL_ADN_AE_ID, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), container1Response.getResponseStatusCode());
		// CONTAINER CREATE 1 ENDS
		assertTrue(container1Response.getPrimitiveContent().getAny() instanceof Container);
		Container cont = (Container) container1Response.getPrimitiveContent().getAny();
		assertNull(cont.getLabels());

		OneM2MResponse ciResponse = ciCreate.createWithAnyAttribute(cont.getResourceID(), TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), ciResponse.getResponseStatusCode());
		// CONTAINER CREATE 1 ENDS
		ContentInstance ci = (ContentInstance) ciResponse.getPrimitiveContent().getAny();

		OneM2MResponse delResponse = genDelete.deleteResource(ci.getResourceID(), TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.DELETED.getOnem2mStatusCode(), delResponse.getResponseStatusCode());

		// INITIAL STATE ENDS
		// CONTAINER UPDATE ENDS
		// TEST EVENT ENDS
		System.out.println(" AE-ID : " + aeId);
		System.out.println(" AE RESOURCE ID : " + aeResourceID);
		System.out.println(" AE STRUCTURED RESOURCE ID : " + aeStructuredResourceID);

	}

	@Test
	@Tag("TP_oneM2M_CSE_DMR_DEL_001_GRP")
	void TP_oneM2M_CSE_DMR_DEL_001_GRP() {
		ContainerCreateTestCases contCreate = new ContainerCreateTestCases();
		aeStructuredResourceID = TestingParams.CSE_BASE_RESOURCE_NAME;

		// INITIAL STATE STARTS
		// AE-REGISTRATION
		OneM2MResponse aeMResponse = aeRegister.AERegisterWithEmptyFrom(TestingParams.CSE_BASE_RESOURCE_ID, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		AE ae = (AE) aeMResponse.getPrimitiveContent().getAny();
		assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), aeMResponse.getResponseStatusCode());
		// AE-REGISTRATION DONE
		aeId = ae.getAEID();
		aeResourceID = ae.getResourceID();
		aeStructuredResourceID = aeStructuredResourceID + "/" + ae.getResourceName();
		// CONTAINER CREATE 1

		OneM2MResponse container1Response = contCreate.createWithAnyAttribute(TestingParams.GENERAL_ADN_AE_ID, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), container1Response.getResponseStatusCode());
		// CONTAINER CREATE 1 ENDS
		Container cont = (Container) container1Response.getPrimitiveContent().getAny();
		List<String> memberIds = new ArrayList<String>();
		memberIds.add(cont.getResourceID());
		GroupCreate grpCreate = new GroupCreate();
		OneM2MResponse grpResponse = grpCreate.createWithResultContent(BigInteger.valueOf(9), memberIds, TestingParams.GENERAL_ADN_AE_ID, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), grpResponse.getResponseStatusCode());
		assertTrue(grpResponse.getPrimitiveContent().getAny() instanceof Group);
		Group grp = (Group) grpResponse.getPrimitiveContent().getAny();
		assertNull(grp.getMemberIDs());
		assertNull(grp.getMaxNrOfMembers());

		OneM2MResponse delResponse = genDelete.deleteResource(grp.getResourceID(), TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.DELETED.getOnem2mStatusCode(), delResponse.getResponseStatusCode());

		// INITIAL STATE ENDS
		// CONTAINER UPDATE ENDS
		// TEST EVENT ENDS
		System.out.println(" AE-ID : " + aeId);
		System.out.println(" AE RESOURCE ID : " + aeResourceID);
		System.out.println(" AE STRUCTURED RESOURCE ID : " + aeStructuredResourceID);

	}





	@Test
	@Tag("TP_oneM2M_CSE_DMR_DEL_001_PCH")
	void TP_oneM2M_CSE_DMR_DEL_001_PCH() {
		aeStructuredResourceID = TestingParams.CSE_BASE_RESOURCE_NAME;

		// INITIAL STATE STARTS
		// AE-REGISTRATION
		OneM2MResponse aeMResponse = aeRegister.AERegisterWithEmptyFrom(TestingParams.CSE_BASE_RESOURCE_ID, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		AE ae = (AE) aeMResponse.getPrimitiveContent().getAny();
		assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), aeMResponse.getResponseStatusCode());
		// AE-REGISTRATION DONE
		aeId = ae.getAEID();
		aeResourceID = ae.getResourceID();
		aeStructuredResourceID = aeStructuredResourceID + "/" + ae.getResourceName();
		// CONTAINER CREATE 1

		PollingChannelCreateTestCases pchCreate = new PollingChannelCreateTestCases();
		OneM2MResponse pchResponse = pchCreate.createWithResultContentAndLable(BigInteger.valueOf(9), Arrays.asList("NewLabel"), TestingParams.GENERAL_ADN_AE_ID, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), pchResponse.getResponseStatusCode());

		assertTrue(pchResponse.getPrimitiveContent().getAny() instanceof PollingChannel);
		PollingChannel pch = (PollingChannel) pchResponse.getPrimitiveContent().getAny();
		assertNull(pch.getLabels());

		OneM2MResponse delResponse = genDelete.deleteResource(pch.getResourceID(), TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.DELETED.getOnem2mStatusCode(), delResponse.getResponseStatusCode());
		// INITIAL STATE ENDS
		// CONTAINER UPDATE ENDS
		// TEST EVENT ENDS
		System.out.println(" AE-ID : " + aeId);
		System.out.println(" AE RESOURCE ID : " + aeResourceID);
		System.out.println(" AE STRUCTURED RESOURCE ID : " + aeStructuredResourceID);

	}

	@Test
	@Tag("TP_oneM2M_CSE_DMR_DEL_001_STCG")
	void TP_oneM2M_CSE_DMR_DEL_001_STCG() {
		aeStructuredResourceID = TestingParams.CSE_BASE_RESOURCE_NAME;

		// INITIAL STATE STARTS
		// ADMIN-AE-REG
		AERegistration aeReg = new AERegistration();
		OneM2MResponse aeRegRes = aeReg.AERegisterWithAppName(TestingParams.CSE_BASE_RESOURCE_NAME, TestingParams.ADMIN_AE_ID, TestingParams.getSecurityParams(TestingParams.ADMIN_AE_ID));
		assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), aeRegRes.getResponseStatusCode());
		// ADMIN-AE-REG

		StatsConfigCreateTestCases scCreate = new StatsConfigCreateTestCases();
		OneM2MResponse scResponse = scCreate.createWithAnyAttribute(TestingParams.CSE_BASE_RESOURCE_ID, TestingParams.ADMIN_AE_ID, TestingParams.getSecurityParams(TestingParams.ADMIN_AE_ID));
		assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), scResponse.getResponseStatusCode());
		StatsConfig sc = (StatsConfig) scResponse.getPrimitiveContent().getAny();

		OneM2MResponse delResponse = genDelete.deleteResource(sc.getResourceID(), TestingParams.ADMIN_AE_ID, TestingParams.getSecurityParams(TestingParams.ADMIN_AE_ID));
		assertEquals(M2MStatus.DELETED.getOnem2mStatusCode(), delResponse.getResponseStatusCode());


	}

	@Test
	@Tag("TP_oneM2M_CSE_DMR_DEL_001_TS")
	void TP_oneM2M_CSE_DMR_DEL_001_TS() {
		TimeSeriesCreateTestCases tsCreate = new TimeSeriesCreateTestCases();
		aeStructuredResourceID = TestingParams.CSE_BASE_RESOURCE_NAME;

		// INITIAL STATE STARTS
		// AE-REGISTRATION
		OneM2MResponse aeMResponse = aeRegister.AERegisterWithEmptyFrom(TestingParams.CSE_BASE_RESOURCE_ID, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		AE ae = (AE) aeMResponse.getPrimitiveContent().getAny();
		assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), aeMResponse.getResponseStatusCode());
		// AE-REGISTRATION DONE
		aeId = ae.getAEID();
		aeResourceID = ae.getResourceID();
		aeStructuredResourceID = aeStructuredResourceID + "/" + ae.getResourceName();
		// CONTAINER CREATE 1

		OneM2MResponse tsResponse = tsCreate.createWithResultContentAndLabel(BigInteger.valueOf(9), Arrays.asList("NewLabel"), TestingParams.GENERAL_ADN_AE_ID, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), tsResponse.getResponseStatusCode());
		// CONTAINER CREATE 1 ENDS

		assertTrue(tsResponse.getPrimitiveContent().getAny() instanceof TimeSeries);
		TimeSeries ts = (TimeSeries) tsResponse.getPrimitiveContent().getAny();
		assertNull(ts.getLabels());

		OneM2MResponse delResponse = genDelete.deleteResource(ts.getResourceID(), TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.DELETED.getOnem2mStatusCode(), delResponse.getResponseStatusCode());


		// INITIAL STATE ENDS
		// CONTAINER UPDATE ENDS
		// TEST EVENT ENDS
		System.out.println(" AE-ID : " + aeId);
		System.out.println(" AE RESOURCE ID : " + aeResourceID);
		System.out.println(" AE STRUCTURED RESOURCE ID : " + aeStructuredResourceID);

	}

	@Test
	@Tag("TP_oneM2M_CSE_DMR_DEL_001_TSI")
	void TP_oneM2M_CSE_DMR_DEL_001_TSI() {
		TimeSeriesCreateTestCases tsCreate = new TimeSeriesCreateTestCases();
		TimeSeriesInstanceCreateTestCases tsiCreate = new TimeSeriesInstanceCreateTestCases();
		aeStructuredResourceID = TestingParams.CSE_BASE_RESOURCE_NAME;

		// INITIAL STATE STARTS
		// AE-REGISTRATION
		OneM2MResponse aeMResponse = aeRegister.AERegisterWithEmptyFrom(TestingParams.CSE_BASE_RESOURCE_ID, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		AE ae = (AE) aeMResponse.getPrimitiveContent().getAny();
		assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), aeMResponse.getResponseStatusCode());
		// AE-REGISTRATION DONE
		aeId = ae.getAEID();
		aeResourceID = ae.getResourceID();
		aeStructuredResourceID = aeStructuredResourceID + "/" + ae.getResourceName();
		// CONTAINER CREATE 1

		OneM2MResponse tsResponse = tsCreate.createWithResultContentAndLabel(BigInteger.valueOf(9), Arrays.asList("NewLabel"), TestingParams.GENERAL_ADN_AE_ID, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), tsResponse.getResponseStatusCode());
		// CONTAINER CREATE 1 ENDS

		assertTrue(tsResponse.getPrimitiveContent().getAny() instanceof TimeSeries);
		TimeSeries ts = (TimeSeries) tsResponse.getPrimitiveContent().getAny();
		assertNull(ts.getLabels());

		OneM2MResponse tsiResponse = tsiCreate.createWithAnyAttribute(ts.getResourceID(), TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), tsiResponse.getResponseStatusCode());
		TimeSeriesInstance tsi = (TimeSeriesInstance) tsiResponse.getPrimitiveContent().getAny();

		OneM2MResponse delResponse = genDelete.deleteResource(tsi.getResourceID(), TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.DELETED.getOnem2mStatusCode(), delResponse.getResponseStatusCode());

		// INITIAL STATE ENDS
		// CONTAINER UPDATE ENDS
		// TEST EVENT ENDS
		System.out.println(" AE-ID : " + aeId);
		System.out.println(" AE RESOURCE ID : " + aeResourceID);
		System.out.println(" AE STRUCTURED RESOURCE ID : " + aeStructuredResourceID);

	}

	@AfterAll
	static void afterAllSetup() {
		System.out.println("############################################################################################################");
	}

	@AfterEach
	void afterEachSetup() {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		if (TestingParams.DELETE_ALL_RESOURCES) {
//			AEReRegistration aeDelete = new AEReRegistration();
//			OneM2MResponse aeDeleteResponse = aeDelete.aeDeregister(aeResourceID, aeId, TestingParams.ADN_AE_PSK_ID, TestingParams.ADN_AE_PSK);
//			assertEquals(M2MStatus.DELETED.getOnem2mStatusCode(), aeDeleteResponse.getResponseStatusCode());

			UUID resourceID = UUID.randomUUID();
			Object idObject = resourceID;
			OneM2MRequest oneM2MRequest = new OneM2MRequest();
			oneM2MRequest.setRequestIdentifier(String.valueOf(idObject));
			oneM2MRequest.setContentType(MediaType.JSON_RESOURCE);
			oneM2MRequest.setAcceptType(MediaType.JSON_RESOURCE);
			oneM2MRequest.setReleaseVersionIndicator(M2MReleaseVersion.RELEASE_2A.getReleaseVersion());
			oneM2MRequest.setTo(TestingParams.GENERAL_ADN_AE_ID);
			oneM2MRequest.setFrom(TestingParams.GENERAL_ADN_AE_ID);
			oneM2MRequest.setOperation(M2MOperation.DELETE.getOperationId());
			OriginatorActions originatorActions = new OriginatorActionsBean();
			OneM2MResponse oneM2MResponse = originatorActions.execute(oneM2MRequest, TestingParams.getCSEPoA(), TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));

			oneM2MRequest.setRequestIdentifier(String.valueOf(idObject));
			oneM2MRequest.setContentType(MediaType.JSON_RESOURCE);
			oneM2MRequest.setAcceptType(MediaType.JSON_RESOURCE);
			oneM2MRequest.setReleaseVersionIndicator(M2MReleaseVersion.RELEASE_2A.getReleaseVersion());
			oneM2MRequest.setTo(TestingParams.ADMIN_AE_ID);
			oneM2MRequest.setFrom(TestingParams.ADMIN_AE_ID);
			oneM2MRequest.setOperation(M2MOperation.DELETE.getOperationId());
			originatorActions = new OriginatorActionsBean();
			oneM2MResponse = originatorActions.execute(oneM2MRequest, TestingParams.getCSEPoA(), TestingParams.getSecurityParams(TestingParams.ADMIN_AE_ID));
		}
		aeId = null;
		aeResourceID = null;
		aeStructuredResourceID = null;
		container1ResourceId = null;
		container1StructuredResourceId = null;
	}

}
