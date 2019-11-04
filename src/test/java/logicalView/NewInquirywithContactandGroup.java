package logicalView;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.objectNewInquiry;

public class NewInquirywithContactandGroup extends ApplicationUtility {

	String inquiryName = "Test Inquiry" + (int) (Math.random() * 9999);
	objectNewInquiry mobjectNewInquiry = new objectNewInquiry(driver);
	NewInquiry mNewInquiry = new NewInquiry();

	public void createNewInquiryboth() {

		// Click on New Inquiry button of Header
		mobjectNewInquiry.clickNewInquiryButton();

		// Enter Title of New Inquiry
		mobjectNewInquiry.enterNewInquiryName(inquiryName);

		// Enter description for the new Inquiry
		mobjectNewInquiry.enterInquiryDescription(
				BaseClass.getValueFromPropertyFile("NewInquiry.properties", "newInquiryDescription"));

		waitTime(1500);
		ImplicitWait(100);

		// Click on Add Participant
		mobjectNewInquiry.clickAddParticipantButton();
		waitTime(1000);

		// Check whether Participants are there to add or not
		String checkParticipantPresent = mobjectNewInquiry.errorNoContactParticipantToAdd.getText();
		if (checkParticipantPresent
				.equalsIgnoreCase(BaseClass.getValueFromPropertyFile("NewInquiry.properties", "errorNoContacttoAdd"))) {
			logger.info(BaseClass.getValueFromPropertyFile("NewInquiry.properties", "noParticipantMessage"));
			waitTime(1000);

			// Click on back button
			mobjectNewInquiry.clickbackButtonAddParticipant();
			waitTime(1000);

			// Click cancel to Cancel creating the New Inquiry
			mobjectNewInquiry.clickCancelCreateInquiry();
			logger.info(
					"New Inquiry not created due to No Contact/Group participant to add. Try to add new User before creating Inquiry.");
			waitTime(1000);
		} else {

			// Select the first Contact Participant
			mobjectNewInquiry.selectAddParticipant();
			waitTime(1000);

			// Click on Group tab
			mobjectNewInquiry.clickAddGroupParticipant();
			waitTime(1500);

			// Check whether Group Participants are there to add or not
			String checkGroupParticipantPresent = mobjectNewInquiry.errorNoGroupParticipantToAdd.getText();
			if (checkGroupParticipantPresent.equalsIgnoreCase(
					BaseClass.getValueFromPropertyFile("NewInquiry.properties", "noGroupParticipantMessage"))) {
				logger.info(BaseClass.getValueFromPropertyFile("NewInquiry.properties", "noParticipantMessage"));
				waitTime(1000);

				// Click on back button
				mobjectNewInquiry.clickbackButtonAddParticipant();
				waitTime(1000);

				// Click cancel to Cancel creating the New Inquiry
				mobjectNewInquiry.clickCancelCreateInquiry();
				logger.info(
						"New Inquiry not created due to Group participant to add. Try to add new User before creating Inquiry.");
				waitTime(1000);
			}

			else {
				// Select the first Group Participant
				mobjectNewInquiry.selectAddGroupParticipant();
				waitTime(1000);

				// Click on Add member after selecting the participantS
				mobjectNewInquiry.clickAddMember();
				waitTime(1000);

				mNewInquiry.submitInquiry();
			}

		}
	}

}
