package logicalView.InquiryInternalFunctionalityScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectInquiryFunctionalities;

public class ArchiveUnarchiveInquiry extends ApplicationUtility {

	ObjectInquiryFunctionalities mObjectInquiryFunctionalities = new ObjectInquiryFunctionalities(driver);

	public void archiveInquiry() {

		ImplicitWait(20);

		// Click on the Archive Inquiry
		mObjectInquiryFunctionalities.clickArchiveInquiryIcon();
		waitTime(1000);

		// Click on Cancel button
		mObjectInquiryFunctionalities.cancelArchiveButton();
		waitTime(1000);

		// Click on the Archive Inquiry
		mObjectInquiryFunctionalities.clickArchiveInquiryIcon();
		waitTime(1000);

		// Click on Confirm Archive button
		mObjectInquiryFunctionalities.confirmArchiveButton();
		waitTime(5000);
		logger.info(BaseClass.getValueFromPropertyFile("InternalInquiry.properties", "archiveInquiry"));
	}

	public void UnarchiveInquiry() {

		ImplicitWait(20);

		// Click on the Inquiry List Dropdown
		mObjectInquiryFunctionalities.clickInquiryListDropdown();
		waitTime(1500);

		// Get the list of the Dropdown values
		List<WebElement> allElements = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li"));

		for (WebElement element : allElements) {
			// Click on the Option which equals Archived
			if (element.getText().equalsIgnoreCase("Archived")) {
				ImplicitWait(5);
				element.click();
			}
		}
		waitTime(3000);

		// Click on the Inquiry from the list
		mObjectInquiryFunctionalities.clickInquiry();
		waitTime(1500);

		// Click on Unarchive button
		mObjectInquiryFunctionalities.clickUnArchiveInquiryIcon();
		waitTime(1000);

		// Click on Cancel button of Unarchive Popup
		mObjectInquiryFunctionalities.cancelUnArchiveButton();
		waitTime(1000);

		// Again click on Unarchive button
		mObjectInquiryFunctionalities.clickUnArchiveInquiryIcon();
		waitTime(1000);

		// Click on confirm Unarchive Button
		mObjectInquiryFunctionalities.confirmUnArchiveButton();
		waitTime(3000);
		logger.info(BaseClass.getValueFromPropertyFile("InternalInquiry.properties", "unArchiveInquiry"));

	}
}
