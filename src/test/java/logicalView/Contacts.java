package logicalView;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectContacts;
import testObjects.objectNewInquiry;

public class Contacts extends ApplicationUtility {

	ObjectContacts mObjectContacts = new ObjectContacts(driver);
	ModuleTabs mModuleTabs = new ModuleTabs();
	NewInquiry mNewInquiry2 = new NewInquiry();
	objectNewInquiry mobjectNewInquiry = new objectNewInquiry(driver);

	public void checkContactswith1to1Inquiry() {

		ImplicitWait(5);

		// Check the Contacts are available to create inquiry or not
		String errorNoContacts = mObjectContacts.noContactsorGroups.getText();

		// If the contacts are available try to create a new 1:1 Inquiry and New Inquiry
		if (errorNoContacts.equalsIgnoreCase(
				BaseClass.getValueFromPropertyFile("contacts.properties", "checkContactsAvailabity"))) {
			logger.info(BaseClass.getValueFromPropertyFile("contacts.properties", "success1to1ContactAvailable"));

			// Click on the first contact to create an Inquiry
			mObjectContacts.clickFirstContacts();
			waitTime(6000);

			// Click on 1:1 Inquiry to create Inquiry
			mObjectContacts.click1to1InquiryButton();
			waitTime(29000);

			// Verify the Success message that inquiry is created or not
			String successInquiry1 = mobjectNewInquiry.successInquiryMessage.getText();
			// Verify if the Inquiry is create successfully or not
			if (successInquiry1.startsWith(
					BaseClass.getValueFromPropertyFile("NewInquiry.properties", "success11InquiryMessage"))) {
				logger.info(BaseClass.getValueFromPropertyFile("contacts.properties", "success1to1InquiryCreated"));
			} else {
				logger.error(BaseClass.getValueFromPropertyFile("contacts.properties", "failed1to1InquiryCreated"));
			}
			waitTime(2500);

		} else {
			logger.error(BaseClass.getValueFromPropertyFile("contacts.properties", "failed1to1ContactAvailable"));
		}
	}

	public void checkContactswithNewInquiry() {
		ImplicitWait(5);

		// Click on Contact tab to navigate to Contacts page
		mModuleTabs.clickContactsTab();
		waitTime(10000);

		// Check the Contacts are available to create inquiry or not
		String errorNoContacts = mObjectContacts.noContactsorGroups.getText();
		// If the contacts are available try to create a new 1:1 Inquiry and New Inquiry
		if (errorNoContacts.equalsIgnoreCase(
				BaseClass.getValueFromPropertyFile("contacts.properties", "checkContactsAvailabity"))) {
			logger.info(BaseClass.getValueFromPropertyFile("contacts.properties", "successContactAvailable"));

			// Click on the first contact to create Inquiry
			mObjectContacts.clickFirstContacts();
			waitTime(1000);

			// Click on Create Inquiry button to start creating new Inquiry
			mObjectContacts.clickCreateInquiryButton();
			waitTime(1000);

			// Enter the details of the Inquiry to create Inquiry
			mNewInquiry2.simpleInquiryCreate();
			waitTime(20000);

			// Verify the Success message that inquiry is created or not
			String successInquiry = mobjectNewInquiry.successInquiryMessage.getText();

			// Verify if the Inquiry is create successfully or not
			if (successInquiry
					.startsWith(BaseClass.getValueFromPropertyFile("NewInquiry.properties", "successInquiryMessage"))) {
				logger.info(BaseClass.getValueFromPropertyFile("contacts.properties", "successInquiryCreated"));
			} else {
				logger.error(BaseClass.getValueFromPropertyFile("contacts.properties", "failedInquiryCreated"));
			}
			waitTime(5000);

		} else {
			logger.error(BaseClass.getValueFromPropertyFile("contacts.properties", "failedContactAvailable"));
		}
	}

	public void checkGroupswithNewInquiry() {

		// Check the Groups are available to create inquiry or not
		String errorNoContacts = mObjectContacts.noContactsorGroups.getText();

		// If the Groups are available try to create a New Inquiry
		if (errorNoContacts.equalsIgnoreCase(
				BaseClass.getValueFromPropertyFile("contacts.properties", "checkContactsAvailabity"))) {
			logger.info(BaseClass.getValueFromPropertyFile("contacts.properties", "successGroupAvailable"));

			// Click on the Group tab
			mObjectContacts.clickContactGroupTab();
			waitTime(1000);

			// Click on the first Group to create Inquiry
			mObjectContacts.clickFirstContacts();
			waitTime(6000);

			// Click on Create Inquiry button to start creating new Inquiry
			mObjectContacts.clickCreateInquiryGroupButton();
			waitTime(1000);

			// Enter the details of the Inquiry to create Inquiry
			mNewInquiry2.simpleInquiryCreate();
			waitTime(20000);

			// Verify the Success message that inquiry is created or not
			String successInquiry2 = mobjectNewInquiry.successInquiryMessage.getText();
			if (successInquiry2
					.startsWith(BaseClass.getValueFromPropertyFile("NewInquiry.properties", "successInquiryMessage"))) {
				logger.info(BaseClass.getValueFromPropertyFile("contacts.properties", "successInquiryCreated"));
			} else {
				logger.error(BaseClass.getValueFromPropertyFile("contacts.properties", "failedInquiryCreated"));
			}
			waitTime(5000);

		} else {
			logger.error(BaseClass.getValueFromPropertyFile("contacts.properties", "failedGroupAvailable"));
		}
	}
}
