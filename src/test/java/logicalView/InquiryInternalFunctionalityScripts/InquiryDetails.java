package logicalView.InquiryInternalFunctionalityScripts;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectInquiryFunctionalities;

public class InquiryDetails extends ApplicationUtility {
	ObjectInquiryFunctionalities mObjectInquiryFunctionalities = new ObjectInquiryFunctionalities(driver);
	public String editedInquiry = "Edited Inquiry" + (int) (Math.random() * 9999);

	public void viewImage() {

		waitTime(15000);

		// Click on Inquiry Details Ellipsis menu
		mObjectInquiryFunctionalities.clickInquiryDetails();
		waitTime(3000);

		// Click on Inquiry Image
		mObjectInquiryFunctionalities.clickInquiryImage();
		waitTime(5000);

		try {
			ImplicitWait(10);
			// Close the Inquiry Image
			mObjectInquiryFunctionalities.clickCloseInquiryImage();
			waitTime(1000);
			logger.info(BaseClass.getValueFromPropertyFile("InternalInquiry.properties", "InquiryImage"));
		} catch (Exception e) {
			logger.error("Inquiry Image returned error: " + e);
		}

		// Close the Inquiry Details SideBar
		mObjectInquiryFunctionalities.clickCloseInquiryDetails();
		waitTime(1000);
	}

	public void editInquiryDetails() {
		ImplicitWait(20);

		// Click on Inquiry Details Ellipsis menu
		mObjectInquiryFunctionalities.clickInquiryDetails();
		waitTime(3000);

		// Click on Edit icon for Inquiry Title
		mObjectInquiryFunctionalities.clickEditInquiryTitleButton();
		waitTime(1000);

		// Click on Cancel edit Inquiry Title Icon
		mObjectInquiryFunctionalities.clickEditInquiryCancel();
		waitTime(1000);

		// Click on Edit icon for Inquiry Title
		mObjectInquiryFunctionalities.clickEditInquiryTitleButton();
		waitTime(1000);

		// Edit the Inquiry title
		mObjectInquiryFunctionalities.enterEditInquiryTitle(editedInquiry);
		waitTime(1000);

		try {
			// Confirm the Edit Inquiry title change
			mObjectInquiryFunctionalities.clickEditInquirySubmit();
			waitTime(3000);
			logger.info(BaseClass.getValueFromPropertyFile("InternalInquiry.properties", "editInquiryTitle"));
		} catch (Exception e) {
			logger.error(BaseClass.getValueFromPropertyFile("InternalInquiry.properties", "editInquiryTitleError" + e));
		}

		// Close the Inquiry Details SideBar
		mObjectInquiryFunctionalities.clickCloseInquiryDetails();
		waitTime(1000);

	}

}
