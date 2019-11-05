package logicalView.InquiryInternalFunctionalityScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commonFunctions.ApplicationUtility;
import testObjects.ObjectInquiryFunctionalities;

public class ArchiveInquiry extends ApplicationUtility {

	ObjectInquiryFunctionalities mObjectInquiryFunctionalities = new ObjectInquiryFunctionalities(driver);

	public void archiveInquiry() {

		// Click on the Archive Inquiry
		mObjectInquiryFunctionalities.clickArchiveInquiryIcon();
		waitTime(500);

		// Click on Cancel button
		mObjectInquiryFunctionalities.cancelArchiveButton();
		waitTime(500);

		// Click on the Archive Inquiry
		mObjectInquiryFunctionalities.clickArchiveInquiryIcon();
		waitTime(500);

		// Click on Confirm Archive button
		mObjectInquiryFunctionalities.confirmArchiveButton();
		waitTime(3000);

		refreshPage();

		// Click on the Inquiry List Dropdown
		mObjectInquiryFunctionalities.clickInquiryListDropdown();

		// Get the list of the Dropdown values
		List<WebElement> allElements = driver.findElements(By
				.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]"));

		for (WebElement element : allElements) {
			// Click on the Option which equals Archived
			if (element.getText() == "Archived") {
				element.click();
			}
		}

		/*
		 * driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"
		 * )) .sendKeys();
		 */
		waitTime(3000);

		// Click on the Inquiry from the list
		mObjectInquiryFunctionalities.clickInquiry();
		waitTime(1500);

		// Click on Unarchive button
		mObjectInquiryFunctionalities.clickUnArchiveInquiryIcon();
		waitTime(500);

		// Click on Cancel button of Unarchive Popup
		mObjectInquiryFunctionalities.cancelUnArchiveButton();
		waitTime(500);

		// Again click on Unarchive button
		mObjectInquiryFunctionalities.clickUnArchiveInquiryIcon();
		waitTime(500);

		// Click on confirm Unarchive Button
		mObjectInquiryFunctionalities.confirmUnArchiveButton();
		waitTime(3000);

	}
}
