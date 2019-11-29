package logicalView.InquiryInternalFunctionalityScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commonFunctions.ApplicationUtility;
import testObjects.ObjectInquiryFunctionalities;

public class RemoveParticipant extends ApplicationUtility {

	ObjectInquiryFunctionalities mObjectInquiryFunctionalities = new ObjectInquiryFunctionalities(driver);

	public void removeParticipant() {
		waitTime(10000);

		ImplicitWait(10);

		// Click on Ellipsis menu for Inquiry Details
		mObjectInquiryFunctionalities.clickInquiryDetails();
		waitTime(3000);

		// Click on Members
		mObjectInquiryFunctionalities.clickAddedMemberList();
		waitTime(5000);

		// Check how many members are added in Inquiry
		List<WebElement> elements = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div/div[3]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/i[1]"));
		System.out.println(elements.size());

		// To check if there are members to delete, If Yes it will delete
		if (elements.size() != 0) {

			for (WebElement webElement : elements) {

				// Click on Remove icon of the first Member
				webElement.click();
				waitTime(1000);

				// Click on the Cancel button of the remove member popup
				mObjectInquiryFunctionalities.clickCancelRemovePopup();
				waitTime(1000);

				// Again click on Remove icon of the first Member
				webElement.click();
				waitTime(1000);

				// Click on Yes to confirm delete of the remove member popup
				mObjectInquiryFunctionalities.clickConfirmDelete();
				waitTime(10000);

				// Click on X to close the sidebar
				mObjectInquiryFunctionalities.clickCloseInquiryDetails();
				waitTime(1000);
				break;
			}
		}

		// If no it will exit the Inquiry Details Sidebar
		else {

			logger.info("No members available to Remove from the Inquiry");
			waitTime(1000);
			// Click on X to close the sidebar
			mObjectInquiryFunctionalities.clickCloseInquiryDetails();
		}
	}

}
