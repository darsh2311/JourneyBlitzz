package logicalView.InquiryInternalFunctionalityScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import commonFunctions.ApplicationUtility;
import testObjects.ObjectInquiryFunctionalities;

public class AttachMedia extends ApplicationUtility {
	ObjectInquiryFunctionalities mObjectInquiryFunctionalities = new ObjectInquiryFunctionalities(driver);

	public void attachMedia(String strMedia) {
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

		// Using the Robot class to upload the file
		try {
			setClipboardData(System.getProperty("user.dir") + "/src/test/resources/" + strMedia);
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
		waitTime(1500);
	}

	public void imageUpload() {
		ImplicitWait(10);

		// Attach media method
		attachMedia("inquiry.jpg");

		// Using Action class to draw on the uploaded image
		WebElement wbCanvas = mObjectInquiryFunctionalities.UploadedwbCanvas;
		System.out.println(wbCanvas.getLocation());

		Actions actionBuilder = new Actions(driver);
		Action drawOnCanvas = actionBuilder.moveToElement(wbCanvas, 220, 270).clickAndHold(wbCanvas)
				.moveToElement(wbCanvas, 175, 270).release(wbCanvas).moveToElement(wbCanvas, 175, 270).clickAndHold()
				.moveToElement(wbCanvas, 180, 155).release(wbCanvas).release(wbCanvas).release().build();
		drawOnCanvas.perform();
		waitTime(1500);

		// Click on Send to upload the image with drawing
		mObjectInquiryFunctionalities.sendImageToInquiry();

	}

	public void videoUpload() {
		ImplicitWait(10);

		// Attach media method
		attachMedia("inquiryVideo1mb.mp4");
		waitTime(1500);

		// Click on Send to upload the image with drawing
		mObjectInquiryFunctionalities.uploadSend();
		waitTime(500);

	}

	public void documentUpload() {
		ImplicitWait(10);

		// Attach media method
		attachMedia("inquiryDoc1MB.docx");
		waitTime(500);

		// Click on Send to upload the image with drawing
		mObjectInquiryFunctionalities.uploadSend();
		waitTime(5000);

	}

}
