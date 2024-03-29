package logicalView;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectSignOut;
import testObjects.objectNewInquiry;

public class NewInquiry extends ApplicationUtility {
	public String inquiryName = "Test Inquiry" + (int) (Math.random() * 9999);
	objectNewInquiry mobjectNewInquiry = new objectNewInquiry(driver);
	ObjectSignOut objSignOut = new ObjectSignOut(driver);

	public void clickNewInquiryHeaderButton() {

		ImplicitWait(5);

		// objSignOut.ClickhideChromeRecommend();

		// Click on New Inquiry button of Header
		mobjectNewInquiry.clickNewInquiryButton();
		waitTime(1000);

	}

	public void createNewInquiry() {
		ImplicitWait(5);
		// Enter Title of New Inquiry
		mobjectNewInquiry.enterNewInquiryName(inquiryName);
		waitTime(1000);

		// Enter description for the new Inquiry
		mobjectNewInquiry.enterInquiryDescription(
				BaseClass.getValueFromPropertyFile("NewInquiry.properties", "newInquiryDescription"));

		waitTime(1000);

		// Click on Add Participant
		mobjectNewInquiry.clickAddParticipantButton();
		waitTime(12000);
		int count = 0;
		// Check whether Participants are there to add or not
		String checkParticipantPresent = mobjectNewInquiry.errorNoContactParticipantToAdd.getText();
		if (checkParticipantPresent
				.equalsIgnoreCase(BaseClass.getValueFromPropertyFile("NewInquiry.properties", "errorNoContacttoAdd"))) {
			logger.info(BaseClass.getValueFromPropertyFile("NewInquiry.properties", "noParticipantMessage"));
			waitTime(1000);

			count = count + 1;
		} else {
			// Select the first Contact Participant
			mobjectNewInquiry.selectAddParticipant();
			waitTime(1000);
		}

		mobjectNewInquiry.clickAddGroupParticipant();
		waitTime(1500);

		// Check whether Group Participants are there to add or not
		String checkGroupParticipantPresent = mobjectNewInquiry.errorNoGroupParticipantToAdd.getText();
		if (checkGroupParticipantPresent.equalsIgnoreCase(
				BaseClass.getValueFromPropertyFile("NewInquiry.properties", "noGroupParticipantMessage"))) {
			logger.info(BaseClass.getValueFromPropertyFile("NewInquiry.properties", "noGroupParticipantMessages"));
			waitTime(1000);
			count = count + 1;

		} else {
			try {
				ImplicitWait(15);
				// Select the first Group Participant
				mobjectNewInquiry.selectAddGroupParticipant();
			} catch (Exception e) {
				mobjectNewInquiry.selectAddGroupParticipant2();
				waitTime(1000);
			}
		}
		if (count != 2) {
			waitTime(3000);
			// Click on Add member after selecting the participantS
			mobjectNewInquiry.clickAddMember();
			waitTime(5000);

			submitInquiry();

		} else {
			// Click on back button
			mobjectNewInquiry.clickbackButtonAddParticipant();
			waitTime(1000);

			// Click cancel to Cancel creating the New Inquiry
			mobjectNewInquiry.clickCancelCreateInquiry();
			logger.info(
					"New Inquiry not created due to No Contact/Group participant to add. Try to add new User before creating Inquiry.");
			waitTime(1000);
		}
	}

	public void submitInquiry() {
		ImplicitWait(5);

		// Click on Upload Photo to upload image
		mobjectNewInquiry.clickUploadImage();

		ImplicitWait(20);

		// Using the Robot class to upload the file
		attachmedia("inquiry.jpg");
		waitTime(5000); // Click on Save to Select the Image
		mobjectNewInquiry.clickSaveUploadImage();
		waitTime(1000);

		// If no label to select show the below message
		String nolabel = mobjectNewInquiry.noLabelMessage.getText();
		if (nolabel.equalsIgnoreCase(BaseClass.getValueFromPropertyFile("NewInquiry.properties", "noLabel"))) {
			logger.info(BaseClass.getValueFromPropertyFile("NewInquiry.properties", "noLabelMessage"));
		}
		waitTime(5000);

		// Submit the detail by clicking on Create Inquiry
		mobjectNewInquiry.clickCreateInquiry();
		ImplicitWait(50);
		// Verify the Success message that inquiry is created or not
		String successInquiry = mobjectNewInquiry.successInquiryMessage.getText();
		if (successInquiry
				.startsWith(BaseClass.getValueFromPropertyFile("NewInquiry.properties", "successInquiryMessage"))) {
			logger.info("Successfully created Inquiry: Passed");
		} else {
			logger.info("Successfully created Inquiry: Failed");
		}
		waitTime(3500);

	}

	public void simpleInquiryCreate() {
		ImplicitWait(5);

		mobjectNewInquiry.enterNewInquiryName(inquiryName);
		waitTime(1000);

		// Enter description for the new Inquiry
		mobjectNewInquiry.enterInquiryDescription(
				BaseClass.getValueFromPropertyFile("NewInquiry.properties", "newInquiryDescription"));
		waitTime(10000);

		// Submit the detail by clicking on Create Inquiry
		mobjectNewInquiry.clickCreateInquiry();

	}
}
