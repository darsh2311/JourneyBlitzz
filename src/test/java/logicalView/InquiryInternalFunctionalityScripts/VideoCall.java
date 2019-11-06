package logicalView.InquiryInternalFunctionalityScripts;

import org.openqa.selenium.NoSuchElementException;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectInquiryFunctionalities;

public class VideoCall extends ApplicationUtility {
	ObjectInquiryFunctionalities mObjectInquiryFunctionalities = new ObjectInquiryFunctionalities(driver);

	public void startEndVideoCall() {

		// click on Video Call Icon
		mObjectInquiryFunctionalities.clickVideoCall();
		waitTime(1500);
		ImplicitWait(6);

		try {

			mObjectInquiryFunctionalities.clickStartVideoCall();
			waitTime(9000);

			mObjectInquiryFunctionalities.clickDisconnectCallButton();
			waitTime(1000);

			mObjectInquiryFunctionalities.closeVideoCallSideBar();
			waitTime(1000);

		} catch (NoSuchElementException e) {
			logger.error(BaseClass.getValueFromPropertyFile("InternalInquiry.properties", "noParticipantError") + e);
			mObjectInquiryFunctionalities.closeVideoCallSideBar();
			waitTime(1000);
		}

	}
}
