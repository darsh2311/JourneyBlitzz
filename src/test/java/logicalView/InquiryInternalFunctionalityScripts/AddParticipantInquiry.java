package logicalView.InquiryInternalFunctionalityScripts;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectInquiryFunctionalities;

public class AddParticipantInquiry extends ApplicationUtility {

	ObjectInquiryFunctionalities mObjectInquiryFunctionalities = new ObjectInquiryFunctionalities(driver);

	public void addParticipantinInquiry() {
		waitTime(20500);
		// Click on Add Participant Icon
		mObjectInquiryFunctionalities.clickAddParticipantIcon();
		waitTime(500);

		// click on Contact tab
		mObjectInquiryFunctionalities.clickContactTab();
		waitTime(1000);

		int count = 0;
		// Check whether Participants are there to add or not
		String checkParticipantPresent = mObjectInquiryFunctionalities.noParticipantMessage.getText();
		if (checkParticipantPresent
				.equalsIgnoreCase(BaseClass.getValueFromPropertyFile("InternalInquiry.properties", "NoContacts"))) {
			logger.info(BaseClass.getValueFromPropertyFile("InternalInquiry.properties", "noParticipantMessage"));
			waitTime(1000);
			count = count + 1;

		} else {
			mObjectInquiryFunctionalities.selectParticipant1();
			waitTime(1000);
		}

		waitTime(1000);
		mObjectInquiryFunctionalities.clickGroupTab();
		waitTime(1500);

		String checkGroupParticipantPresent = mObjectInquiryFunctionalities.noGroupParticipantMessage.getText();
		if (checkGroupParticipantPresent
				.equalsIgnoreCase(BaseClass.getValueFromPropertyFile("InternalInquiry.properties", "NoGroups"))) {
			logger.info(BaseClass.getValueFromPropertyFile("InternalInquiry.properties", "noGroupParticipantMessage"));
			waitTime(1000);
			count = count + 1;
		} else {
			mObjectInquiryFunctionalities.selectGroupParticipant1();
			waitTime(1000);

		}

		if (count != 2) {
			mObjectInquiryFunctionalities.addParticipantButton();
			waitTime(15000);
		} else {
			mObjectInquiryFunctionalities.closeAddParticipantSidebar();
			waitTime(5000);

		}
	}
}