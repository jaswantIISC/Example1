package data.management.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigInteger;
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
import cdot.ccsp.onem2mTester.utils.GeneralRetrieveTestCases;
import cdot.ccsp.onem2mTester.utils.TestingParams;
import cdot.ccsp.registration.AERegistration;
import cdot.onem2m.common.dto.OneM2MRequest;
import cdot.onem2m.common.dto.OneM2MResponse;
import cdot.onem2m.common.enums.M2MOperation;
import cdot.onem2m.common.enums.M2MReleaseVersion;
import cdot.onem2m.common.enums.M2MStatus;
import cdot.onem2m.common.enums.MediaType;
import cdot.onem2m.platform.originatorActions.business.OriginatorActions;
import cdot.onem2m.platform.originatorActions.business.OriginatorActionsBean;
import cdot.onem2m.resource.xsd.AE;
import cdot.onem2m.resource.xsd.Container;
import cdot.onem2m.resource.xsd.ContentInstance;
import cdot.onem2m.resource.xsd.TimeSeries;
import cdot.onem2m.resource.xsd.TimeSeriesInstance;
import initializer.ConfigurationExtension;

@ExtendWith({ ConfigurationExtension.class })
@Tag("TP_oneM2M_CSE_DMR_CRE_008")
public class TP_oneM2M_CSE_DMR_CRE_008 {

	String aeId;
	String aeResourceID;
	String aeStructuredResourceID;
	String container1ResourceId;
	String container1StructuredResourceId;

	AERegistration aeRegister = new AERegistration();

	GeneralRetrieveTestCases genRetrieve = new GeneralRetrieveTestCases();

	@BeforeAll
	static void beforeAllSetup() {
		System.out.println("##########################################################################################################");
	}

	@BeforeEach
	void beforeEachSetup() {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}

	@Test
	@Tag("TP_oneM2M_CSE_DMR_CRE_008_CNT_CIN")
	void TP_oneM2M_CSE_DMR_CRE_008_CNT_CNI() {
		ContainerCreateTestCases contCreate = new ContainerCreateTestCases();
		ContentInstanceCreateTestCases ciCreate = new ContentInstanceCreateTestCases();
		GeneralRetrieveTestCases genRet = new GeneralRetrieveTestCases();
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

		String ciContentValue = "CID-KAB-KHATAMGOGABHAGWAN";

		OneM2MResponse container1Response = contCreate.createWithMaxByteSize(BigInteger.valueOf(200), TestingParams.GENERAL_ADN_AE_ID, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), container1Response.getResponseStatusCode());
		// CONTAINER CREATE 1 ENDS
		Container cont = (Container) container1Response.getPrimitiveContent().getAny();
		container1ResourceId = cont.getResourceID();
		container1StructuredResourceId = aeStructuredResourceID + "/" + cont.getResourceName();
		assertEquals(BigInteger.valueOf(200), cont.getMaxByteSize());
		assertEquals(BigInteger.valueOf(0), cont.getCurrentNrOfInstances());

		container1Response = ciCreate.createWithContentValue(ciContentValue, container1StructuredResourceId, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), container1Response.getResponseStatusCode());
		ContentInstance ci = (ContentInstance) container1Response.getPrimitiveContent().getAny();
		String olderCIResourceID = ci.getResourceID();
		BigInteger ciContentValueByteSize = ci.getContentSize();
		System.out.println("@@@@@@@ CONTENT BYTE SIZE : " + ciContentValueByteSize.intValue());
		System.out.println("@@@@@@@ OLDEST CI RESOURCE ID : " + olderCIResourceID);
		BigInteger fixedValue = BigInteger.valueOf(200);
		String newerCIResourceId = null;
		while (true) {

			container1Response = genRet.retrieveResource(container1ResourceId, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
			assertEquals(M2MStatus.OK.getOnem2mStatusCode(), container1Response.getResponseStatusCode());
			cont = (Container) container1Response.getPrimitiveContent().getAny();

			System.out.println(" Current + Next ByteSize : " + cont.getCurrentByteSize().add(ciContentValueByteSize).intValue());
			BigInteger futureSize = cont.getCurrentByteSize().add(ciContentValueByteSize);
			if (futureSize.intValue() > fixedValue.intValue()) {
				System.out.println("################## BREAKING LOOP");
				break;
			} else {
				System.out.println("@@@@@@@ LOOPER");
				container1Response = ciCreate.createWithContentValue(ciContentValue, container1ResourceId, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
				assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), container1Response.getResponseStatusCode());
				ci = (ContentInstance) container1Response.getPrimitiveContent().getAny();
				newerCIResourceId = ci.getResourceID();
				System.out.println("@@@@@@@ NEWSEST CI RESOURCE ID : " + newerCIResourceId);
			}

		}

		container1Response = ciCreate.createWithContentValue(ciContentValue, container1ResourceId, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), container1Response.getResponseStatusCode());
		ci = (ContentInstance) container1Response.getPrimitiveContent().getAny();
		newerCIResourceId = ci.getResourceID();

		container1Response = genRet.retrieveResource(container1ResourceId, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.OK.getOnem2mStatusCode(), container1Response.getResponseStatusCode());
		cont = (Container) container1Response.getPrimitiveContent().getAny();
		System.out.println("##################  CONTAINER CURRENT SIZE :" + cont.getCurrentByteSize());
		System.out.println("##################  CONTAINER CURRENT SIZE :" + cont.getCurrentNrOfInstances());

		container1Response = genRet.retrieveResource(olderCIResourceID, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.NOT_FOUND.getOnem2mStatusCode(), container1Response.getResponseStatusCode());

		container1Response = genRet.retrieveResource(newerCIResourceId, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.OK.getOnem2mStatusCode(), container1Response.getResponseStatusCode());

		// INITIAL STATE ENDS
		// CONTAINER UPDATE ENDS

		// TEST EVENT ENDS
		System.out.println(" AE-ID : " + aeId);
		System.out.println(" AE RESOURCE ID : " + aeResourceID);
		System.out.println(" AE STRUCTURED RESOURCE ID : " + aeStructuredResourceID);
		System.out.println(" CONTAINER  RESOURCE ID : " + container1ResourceId);
		System.out.println(" CONTAINER  STRUCTURED RESOURCE ID : " + container1StructuredResourceId);

	}

	@Test
	@Tag("TP_oneM2M_CSE_DMR_CRE_008_TS_TSI")
	void TP_oneM2M_CSE_DMR_CRE_008_TS_MNI() {
		TimeSeriesCreateTestCases tsCreate = new TimeSeriesCreateTestCases();
		TimeSeriesInstanceCreateTestCases tsiCreate = new TimeSeriesInstanceCreateTestCases();
		GeneralRetrieveTestCases genRet = new GeneralRetrieveTestCases();
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

		String ciContentValue = "CID-KAB-KHATAMGOGABHAGWAN";
		OneM2MResponse container1Response = tsCreate.createWithMaxByteSize(BigInteger.valueOf(200), TestingParams.GENERAL_ADN_AE_ID, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), container1Response.getResponseStatusCode());
		// CONTAINER CREATE 1 ENDS
		TimeSeries cont = (TimeSeries) container1Response.getPrimitiveContent().getAny();
		container1ResourceId = cont.getResourceID();
		container1StructuredResourceId = aeStructuredResourceID + "/" + cont.getResourceName();
		assertEquals(BigInteger.valueOf(200), cont.getMaxByteSize());
		assertEquals(BigInteger.valueOf(0), cont.getCurrentNrOfInstances());

		container1Response = tsiCreate.createWithContentValue(ciContentValue, container1StructuredResourceId, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), container1Response.getResponseStatusCode());
		TimeSeriesInstance ci = (TimeSeriesInstance) container1Response.getPrimitiveContent().getAny();
		String olderCIResourceID = ci.getResourceID();
		BigInteger ciContentValueByteSize = ci.getContentSize();
		System.out.println("=========================================================== CONTENT BYTE SIZE : " + ciContentValueByteSize);
		assertNotNull(ci.getContentSize());
		String newerCIResourceId = null;
		while (true) {
			container1Response = genRet.retrieveResource(container1StructuredResourceId, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
			assertEquals(M2MStatus.OK.getOnem2mStatusCode(), container1Response.getResponseStatusCode());
			cont = (TimeSeries) container1Response.getPrimitiveContent().getAny();
			assertNotNull(cont.getCurrentByteSize());
			System.out.println();
			// System.out.println(" Current + Next ByteSize : " +
			// cont.getCurrentByteSize().add(ciContentValueByteSize).intValue());
			if (cont.getCurrentByteSize().add(ciContentValueByteSize).compareTo(BigInteger.valueOf(200)) <= 0) {
				// System.out.println("################## BREAKING LOOP");
				break;
			}

			// System.out.println("@@@@@@@ LOOPER");
			container1Response = tsiCreate.createWithContentValue(ciContentValue, container1StructuredResourceId, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
			assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), container1Response.getResponseStatusCode());
			ci = (TimeSeriesInstance) container1Response.getPrimitiveContent().getAny();
			newerCIResourceId = ci.getResourceID();

		}

		container1Response = tsiCreate.createWithContentValue(ciContentValue, container1StructuredResourceId, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.CREATED.getOnem2mStatusCode(), container1Response.getResponseStatusCode());
		ci = (TimeSeriesInstance) container1Response.getPrimitiveContent().getAny();
		newerCIResourceId = ci.getResourceID();

		container1Response = genRet.retrieveResource(olderCIResourceID, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.NOT_FOUND.getOnem2mStatusCode(), container1Response.getResponseStatusCode());

		container1Response = genRet.retrieveResource(newerCIResourceId, TestingParams.GENERAL_ADN_AE_ID, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		assertEquals(M2MStatus.OK.getOnem2mStatusCode(), container1Response.getResponseStatusCode());

		// INITIAL STATE ENDS
		// CONTAINER UPDATE ENDS

		// TEST EVENT ENDS
		System.out.println(" AE-ID : " + aeId);
		System.out.println(" AE RESOURCE ID : " + aeResourceID);
		System.out.println(" AE STRUCTURED RESOURCE ID : " + aeStructuredResourceID);
		System.out.println(" CONTAINER  RESOURCE ID : " + container1ResourceId);
		System.out.println(" CONTAINER  STRUCTURED RESOURCE ID : " + container1StructuredResourceId);

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
		}
		aeId = null;
		aeResourceID = null;
		aeStructuredResourceID = null;
		container1ResourceId = null;
		container1StructuredResourceId = null;
	}

}
