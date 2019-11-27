package logicalView.InquiryInternalFunctionalityScripts;

import commonFunctions.ApplicationUtility;
import testObjects.ObjectInquiryFunctionalities;

public class AttachMedia extends ApplicationUtility {
	ObjectInquiryFunctionalities mObjectInquiryFunctionalities = new ObjectInquiryFunctionalities(driver);

	public void allAttachMedia(String strMedia) {
		ImplicitWait(10);

		// Click on the attachment icon in the chat
		mObjectInquiryFunctionalities.clickAttachMedia();
		waitTime(1000);

		// Click on the Photo, video link
		mObjectInquiryFunctionalities.uploadAttachment();
		waitTime(1000);

		// Click on choose a file to upload button
		mObjectInquiryFunctionalities.clickFileToUpload();
		waitTime(1000);

		attachmedia(strMedia);
		waitTime(1500);
	}

	public void imageUpload() {
		waitTime(10000);

		ImplicitWait(10);

		// Attach media method
		allAttachMedia("inquiry.jpg");
		waitTime(5000);

		// Using Action class to draw on the uploaded image

		/*
		 * WebElement wbCanvas = mObjectInquiryFunctionalities.UploadedwbCanvas;
		 *
		 * JavascriptExecutor js = (JavascriptExecutor) driver; Actions actionBuilder =
		 * new Actions(driver); Action drawOnCanvas =
		 * actionBuilder.moveToElement(wbCanvas, 220, 270).clickAndHold(wbCanvas)
		 * .moveToElement(wbCanvas, 175, 270).release(wbCanvas).release().build();
		 * drawOnCanvas.perform(); waitTime(5000);
		 * js.executeScript("arguments[0].scrollIntoView();",
		 * mObjectInquiryFunctionalities.sendImageToInquiry);
		 */

		// Click on Send to upload the image with drawing
		mObjectInquiryFunctionalities.sendImageToInquiry();
		waitTime(1500);

	}

	public void videoUpload() {
		waitTime(10000);

		ImplicitWait(10);

		// Attach media method
		allAttachMedia("inquiryVideo1mb.mp4");
		waitTime(1500);

		// Click on Send to upload the image with drawing
		mObjectInquiryFunctionalities.uploadSend();
		waitTime(1500);

	}

	public void documentUpload() {
		waitTime(10000);

		ImplicitWait(10);

		// Attach media method
		allAttachMedia("inquiryDoc1MB.docx");
		waitTime(500);

		// Click on Send to upload the image with drawing
		mObjectInquiryFunctionalities.uploadSend();
		waitTime(1500);

	}

}
