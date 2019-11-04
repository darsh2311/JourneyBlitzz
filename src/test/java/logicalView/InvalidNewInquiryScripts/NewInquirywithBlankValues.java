package logicalView.InvalidNewInquiryScripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonFunctions.ApplicationUtility;
import testObjects.objectNewInquiry;

public class NewInquirywithBlankValues extends ApplicationUtility {
	objectNewInquiry mobjectNewInquiry = new objectNewInquiry(driver);

	public void createNewInquiry() {

		// Click on New Inquiry button of Header
		mobjectNewInquiry.clickNewInquiryButton();
		waitTime(500);

		// Check the button is Clickable or not
		try {
			WebDriverWait wait = new WebDriverWait(driver, 6);
			wait.until(ExpectedConditions.elementToBeClickable(mobjectNewInquiry.clickCreateInquiry));
			logger.error("Create inquiry(submit) button should not be Clickable with Blank Values: Failed");
		} catch (Exception e) {
			logger.info("Create inquiry(submit) button should not be Clickable with Blank Values: Passed");
		}
		waitTime(300);

		mobjectNewInquiry.clickCancelCreateInquiry();
		waitTime(1000);

	}
}
