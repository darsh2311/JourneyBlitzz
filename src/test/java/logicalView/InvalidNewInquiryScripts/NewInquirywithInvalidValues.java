package logicalView.InvalidNewInquiryScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.objectNewInquiry;

public class NewInquirywithInvalidValues extends ApplicationUtility {
	objectNewInquiry mobjectNewInquiry = new objectNewInquiry(driver);

	public void createNewInquiry() {

		// Click on New Inquiry button of Header
		mobjectNewInquiry.clickNewInquiryButton();
		waitTime(500);

		// Enter Title of New Inquiry
		mobjectNewInquiry.enterNewInquiryName(
				BaseClass.getValueFromPropertyFile("NewInquiry.properties", "invalidInquirynname"));

		// Enter description for the new Inquiry
		mobjectNewInquiry.enterInquiryDescription(
				BaseClass.getValueFromPropertyFile("NewInquiry.properties", "invalidDescription"));

		waitTime(500);

		// Click on Upload Photo to upload image
		mobjectNewInquiry.clickUploadImage();

		ImplicitWait(10);

		attachmedia("invalidPhotoExt.gif");

		waitTime(3500);

		// Check the button is Clickable or not
		try {
			WebDriverWait wait = new WebDriverWait(driver, 6);
			wait.until(ExpectedConditions.elementToBeClickable(mobjectNewInquiry.clickCreateInquiry));
			logger.error("Create inquiry(submit) button should not be Clickable with Invalid Values: Failed");
		} catch (Exception e) {
			logger.info("Create inquiry(submit) button should not be Clickable with Invalid Values: Passed");
		}
		waitTime(300);

		mobjectNewInquiry.clickCancelCreateInquiry();
		waitTime(1000);
	}

	public void attachmedia(String strImage) {
		// Using the Robot class to upload the file
		try {
			waitTime(1000);

			setClipboardData(System.getProperty("user.dir") + "/src/test/resources/" + strImage);
			Robot robot = new Robot();
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
