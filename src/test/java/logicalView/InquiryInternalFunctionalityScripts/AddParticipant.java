package logicalView.InquiryInternalFunctionalityScripts;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectInquiryFunctionalities;

public class AddParticipant extends ApplicationUtility {

	ObjectInquiryFunctionalities mObjectInquiryFunctionalities = new ObjectInquiryFunctionalities(driver);

	public void addParticipantinInquiry() {

		// Click on Add Participant Icon
		mObjectInquiryFunctionalities.clickAddParticipantIcon();
		waitTime(500);

		// click on Contact tab
		mObjectInquiryFunctionalities.clickContactTab();
		waitTime(1000);

		// Check whether Participants are there to add or not
		String checkParticipantPresent = mObjectInquiryFunctionalities.noParticipantMessage.getText();
		if (checkParticipantPresent
				.equalsIgnoreCase(BaseClass.getValueFromPropertyFile("InternalInquiry.properties", "NoContacts"))) {
			logger.info(BaseClass.getValueFromPropertyFile("InternalInquiry.properties", "noParticipantMessage"));
			waitTime(1000);

		} else {
			mObjectInquiryFunctionalities.selectParticipant1();
			waitTime(1000);

		}

		waitTime(1000);
		mObjectInquiryFunctionalities.clickGroupTab();
		waitTime(500);

		String checkGroupParticipantPresent = mObjectInquiryFunctionalities.noGroupParticipantMessage.getText();
		if (checkGroupParticipantPresent != (BaseClass.getValueFromPropertyFile("InternalInquiry.properties",
				"NoGroups"))) {
			logger.info(BaseClass.getValueFromPropertyFile("InternalInquiry.properties", "noParticipantMessage"));
			waitTime(1000);
		} else {
			mObjectInquiryFunctionalities.selectGroupParticipant1();
			waitTime(1000);
		}

		mObjectInquiryFunctionalities.addParticipantButton();
	}
}