package logicalView;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectDocuments;
import testObjects.objectNewInquiry;

public class NewDocument extends ApplicationUtility {

	public String DocumentName = "Test Document" + (int) (Math.random() * 9999);
	objectNewInquiry mobjectNewInquiry = new objectNewInquiry(driver);
	ObjectDocuments mObjectDocuments = new ObjectDocuments(driver);

	public void uploadNewDocument() {

		ImplicitWait(5);
		mObjectDocuments.clickUploadFile();
		waitTime(1000);

		// Enter Title of New Document
		mobjectNewInquiry.enterNewInquiryName(DocumentName);
		waitTime(1000);

		// Enter description for the new Document
		mobjectNewInquiry.enterInquiryDescription(
				BaseClass.getValueFromPropertyFile("NewInquiry.properties", "newInquiryDescription"));

		waitTime(1000);

		mObjectDocuments.clickSelectParticipant();
		waitTime(12000);

		int count = 0;
		// Check whether Participants are there to add or not
		String checkParticipantPresent = mObjectDocuments.errorNoContactParticipantToAdd.getText();
		if (checkParticipantPresent.equalsIgnoreCase(
				BaseClass.getValueFromPropertyFile("Document.properties", "noContactParticipantError"))) {
			logger.info(BaseClass.getValueFromPropertyFile("Document.properties", "noParticipantMessage"));
			waitTime(1000);

			count = count + 1;
		} else {
			// Select the first Contact Participant
			mObjectDocuments.selectAddParticipant();
			waitTime(1000);
		}

		mObjectDocuments.clickAddGroupParticipant();
		waitTime(1500);

		// Check whether Group Participants are there to add or not
		String checkGroupParticipantPresent = mObjectDocuments.errorNoGroupParticipantToAdd.getText();
		if (checkGroupParticipantPresent.equalsIgnoreCase(
				BaseClass.getValueFromPropertyFile("Document.properties", "noGroupParticipantError"))) {
			logger.info(BaseClass.getValueFromPropertyFile("Document.properties", "noGroupParticipantMessages"));
			waitTime(1000);
			count = count + 1;

		} else {
			try {
				ImplicitWait(15);
				// Select the first Group Participant
				mObjectDocuments.selectAddGroupParticipant();
			} catch (Exception e) {
				mObjectDocuments.selectAddGroupParticipant2();
				waitTime(1000);
			}
		}
		if (count != 2) {
			waitTime(3000);
			// Click on Add member after selecting the participantS
			mObjectDocuments.clickAddMember();
			waitTime(5000);

		} else {
			// Click on back button
			mObjectDocuments.clickbackButtonAddParticipant();
			waitTime(1000);

			/*
			 * // Click cancel to Cancel creating the New Inquiry
			 * mObjectDocuments.clickCancelCreateInquiry(); logger.info(
			 * "New Document not created due to No Contact/Group participant to add. Try to add new User before creating Inquiry."
			 * ); waitTime(1000);
			 */
		}

		uploadDocument("inquiryDoc1MB.docx");

	}

	public void uploadDocument(String strDocument) {
		ImplicitWait(5);

		// Click on Upload Photo to upload image
		mObjectDocuments.clickuploadDocument();
		ImplicitWait(20);

		// Using the Robot class to upload the file
		attachmedia(strDocument);
		waitTime(3000);

		mObjectDocuments.clicksubmitUploadDocument();
		waitTime(15000);

		// Verify the Success message that inquiry is created or not
		String successDocument = mObjectDocuments.successDocumentMessage.getText();
		if (successDocument.equalsIgnoreCase(DocumentName)) {
			logger.info(driver.getCurrentUrl());

			logger.info("Successfully uploaded Document: Passed");
		} else {
			logger.error("Successfully uploaded Document: Failed");
		}
		waitTime(3500);
	}
}
