package registration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.UUID;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import cdot.ccsp.onem2mTester.utils.GeneralRetrieveTestCases;
import cdot.ccsp.onem2mTester.utils.TestingParams;
import cdot.ccsp.registration.AERegistration;
import cdot.ccsp.registration.RemoteCSERegistration;
import cdot.onem2m.common.dto.OneM2MRequest;
import cdot.onem2m.common.dto.OneM2MResponse;
import cdot.onem2m.common.enums.M2MOperation;
import cdot.onem2m.common.enums.M2MReleaseVersion;
import cdot.onem2m.common.enums.M2MStatus;
import cdot.onem2m.common.enums.MediaType;
import cdot.onem2m.platform.originatorActions.business.OriginatorActions;
import cdot.onem2m.platform.originatorActions.business.OriginatorActionsBean;
import cdot.onem2m.resource.xsd.AE;
import cdot.onem2m.resource.xsd.CSEBase;
import initializer.ConfigurationExtension;

@ExtendWith({ ConfigurationExtension.class })
@Tag("TP_oneM2M_CSE_REG_RET_008")
public class TP_oneM2M_CSE_REG_RET_008 {

	String aeId;
	String aeResourceID;
	String aeStructuredResourceID;
	AERegistration aeRegister = new AERegistration();
	RemoteCSERegistration remoteCSERemote = new RemoteCSERegistration();
	GeneralRetrieveTestCases retResource = new GeneralRetrieveTestCases();

	@BeforeAll
	static void beforeAllSetup() {
		System.out.println("##########################################################################################################");
	}

	@BeforeEach
	void beforeEachSetup() {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}

	@Nested
	public class NestedTestCases {
		@Test
		@Tag("TP_oneM2M_CSE_REG_RET_008")
		void TP_oneM2M_CSE_REG_RET_008() {

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
			// INITIAL STATE ENDS

			// TEST EVENT STARTS

			OneM2MResponse cseRetrieveResponse = retResource.retrieveResource(TestingParams.CSE_BASE_RESOURCE_NAME, aeId, TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
			CSEBase cseBase = (CSEBase) cseRetrieveResponse.getPrimitiveContent().getAny();
			assertEquals(M2MStatus.OK.getOnem2mStatusCode(), cseRetrieveResponse.getResponseStatusCode());
			assertNotNull(cseBase.getSupportedResourceType()); // assert supported resourceType
			assertNotNull(cseBase.getPointOfAccess()); // assert supported resourceType

			// TEST EVENT ENDS

			System.out.println(" AE-ID : " + aeId);
			System.out.println(" AE RESOURCE ID : " + aeResourceID);
			System.out.println(" AE STRUCTURED RESOURCE ID : " + aeStructuredResourceID);

		}
	}

	@AfterAll
	static void afterAllSetup() {
		System.out.println("############################################################################################################");
	}

	@AfterEach
	void afterEachSetup() {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		if (TestingParams.DELETE_ALL_RESOURCES) {

			UUID resourceID = UUID.randomUUID();
			Object idObject = resourceID;
			OneM2MRequest oneM2MRequest = new OneM2MRequest();
			oneM2MRequest.setRequestIdentifier(String.valueOf(idObject));
			oneM2MRequest.setContentType(MediaType.JSON_RESOURCE);
			oneM2MRequest.setAcceptType(MediaType.JSON_RESOURCE);
			oneM2MRequest.setReleaseVersionIndicator(M2MReleaseVersion.RELEASE_2A.getReleaseVersion());
			oneM2MRequest.setTo(aeResourceID);
			oneM2MRequest.setFrom(aeId);
			oneM2MRequest.setOperation(M2MOperation.DELETE.getOperationId());
			OriginatorActions originatorActions = new OriginatorActionsBean();
			OneM2MResponse oneM2MResponse = originatorActions.execute(oneM2MRequest, TestingParams.getCSEPoA(), TestingParams.getSecurityParams(TestingParams.GENERAL_ADN_AE_ID));
		}

		aeId = null;
		aeResourceID = null;
		aeStructuredResourceID = null;
	}

}
