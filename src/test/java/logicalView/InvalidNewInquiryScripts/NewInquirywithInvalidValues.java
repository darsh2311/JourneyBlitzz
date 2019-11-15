package logicalView.InvalidNewInquiryScripts;

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

}
