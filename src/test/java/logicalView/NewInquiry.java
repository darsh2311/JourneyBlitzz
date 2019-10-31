package logicalView;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.objectNewInquiry;

public class NewInquiry extends ApplicationUtility {
	public String inquiryName = "Test Inquiry" + (int) (Math.random() * 9999);
	objectNewInquiry mobjectNewInquiry = new objectNewInquiry(driver);

	public void createNewInquiry() {

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
						"New Inquiry not created due to No Contact/Group participant to add. Try to add new User before creating Inquiry.");
				waitTime(1000);
			} else {

				// Select the first Group Participant
				mobjectNewInquiry.selectAddGroupParticipant();
				waitTime(1000);

				// Click on Add member after selecting the participantS
				mobjectNewInquiry.clickAddMember();
				waitTime(1000);

				submitInquiry();
			}
		} else {

			// Select the first Contact Participant
			mobjectNewInquiry.selectAddParticipant();
			waitTime(1000);

			// Click on Add member after selecting the participantS
			mobjectNewInquiry.clickAddMember();
			waitTime(1000);

			submitInquiry();

		}
	}

	public void submitInquiry() {

		// Click on Upload Photo to upload image
		mobjectNewInquiry.clickUploadImage();
		waitTime(1500);

		// Using the Robot class to upload the file
		try {
			setClipboardData(System.getProperty("user.dir") + "/src/test/resources/inquiry.jpg");
			Robot robot = new Robot();
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			waitTime(2000);

		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		waitTime(3500);
		// Click on Save to Select the Image
		mobjectNewInquiry.clickSaveUploadImage();
		waitTime(1000);

		// If no label to select show the below message
		String nolabel = mobjectNewInquiry.noLabelMessage.getText();
		if (nolabel.equalsIgnoreCase(BaseClass.getValueFromPropertyFile("NewInquiry.properties", "noLabel"))) {
			logger.info(BaseClass.getValueFromPropertyFile("NewInquiry.properties", "noLabelMessage"));
		}

		// Submit the detail by clicking on Create Inquiry
		mobjectNewInquiry.clickCreateInquiry();

		// Verify the Success message that inquiry is created or not
		String successInquiry = mobjectNewInquiry.successInquiryMessage.getText();
		if (successInquiry
				.startsWith(BaseClass.getValueFromPropertyFile("NewInquiry.properties", "successInquiryMessage"))) {
			logger.info("Successfully created Inquiry: Passed");
		} else {
			logger.info("Successfully created Inquiry: Failed");
		}
	}
}
