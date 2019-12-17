package logicalView.DocumentScripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import logicalView.NewDocument;
import testObjects.ObjectDocuments;
import testObjects.objectNewInquiry;

public class NewDocumentUploadwithInvalidValue extends ApplicationUtility {

	public String DocumentName = "Test Document" + (int) (Math.random() * 9999);
	objectNewInquiry mobjectNewInquiry = new objectNewInquiry(driver);
	ObjectDocuments mObjectDocuments = new ObjectDocuments(driver);
	NewDocument mNewDocument = new NewDocument();

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

		// Click on Upload Photo to upload image
		mObjectDocuments.clickuploadDocument();
		ImplicitWait(20);

		attachmedia("SampleAVI.avi");

		// Check the button is Clickable or not
		try {
			WebDriverWait wait = new WebDriverWait(driver, 6);
			wait.until(ExpectedConditions.elementToBeClickable(mObjectDocuments.submitUploadDocument));
			logger.error("Upload Document(submit) button should not be Clickable with Invalid Values: Failed");
		} catch (Exception e) {
			logger.info("Upload Document(submit) button should not be Clickable with Invalid Values: Passed");
		}
		waitTime(2500);

		mObjectDocuments.clickCancelCreateInquiry();
		waitTime(4000);

	}

}
