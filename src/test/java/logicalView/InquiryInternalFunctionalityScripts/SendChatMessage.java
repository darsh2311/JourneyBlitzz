package logicalView.InquiryInternalFunctionalityScripts;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectInquiryFunctionalities;

public class SendChatMessage extends ApplicationUtility {
	ObjectInquiryFunctionalities mObjectInquiryFunctionalities = new ObjectInquiryFunctionalities(driver);

	public void sendChatMessageToInquiry() {

		waitTime(1000);
		// enter message to Send
		mObjectInquiryFunctionalities
				.enterChatMessage(BaseClass.getValueFromPropertyFile("NewInquiry.properties", "chatMessage"));
		waitTime(1000);

		try {
			mObjectInquiryFunctionalities.sendChatMessage();
			waitTime(1000);
			logger.info("Chat Message sent Successfully: Passed");

		} catch (Exception e) {
			logger.error("Chat Message sent Successfully: Failed" + e);
		}
	}
}
