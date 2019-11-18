package logicalView;

import java.util.List;

import org.openqa.selenium.WebElement;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectShowME;

public class CreateShowMeSessionwithSMS extends ApplicationUtility {

	ObjectShowME mObjectShowME = new ObjectShowME(driver);
	public String ReferenceId = "Session Test" + (int) (Math.random() * 199999);

	public void createSessionwithSMS() {

		ImplicitWait(15);
		// Click on ShowMe Tab
		mObjectShowME.clickShowmeTab();
		waitTime(10000);

		// Enter the New Reference Id to create session
		mObjectShowME.enterReference(ReferenceId);
		waitTime(1000);

		// Clicking Invite Participant to Create session
		mObjectShowME.clickInviteParticipant();

		// Select the Invite option through which Invitation will be sent.
		// and Also select Country Name
		selectInviteOptionandCountryCode(BaseClass.getValueFromPropertyFile("Showme.properties", "inviteOptionSMS"),
				BaseClass.getValueFromPropertyFile("Showme.properties", "countryName"));

		// Enter Phone Number to Invite
		mObjectShowME.enterPhoneNumber(BaseClass.getValueFromPropertyFile("Showme.properties", "phoneNumber"));
		waitTime(1000);

		// Enter Message for Invitation
		mObjectShowME.enterInviteMessage(BaseClass.getValueFromPropertyFile("Showme.properties", "inviteMessage"));
		waitTime(1000);

		// Clicking Invite and join Button to join the call
		mObjectShowME.clickInviteAndJoin();
		waitTime(12000);

		// Close the Newly Opened Join Call window
		popupWindowHandle();

		// Enter Reference Id to search Session from Session history list
		// mObjectShowME.entersearchReferenceId(ReferenceId);

	}

	public void selectInviteOptionandCountryCode(String InviteOption, String CountryName) {
		ImplicitWait(10);
		// List of the Invite Options like Whatsapp,SMS or Smartglass
		List<WebElement> listInviteOptions = mObjectShowME.listInviteOptions;

		for (WebElement selectInviteOptions : listInviteOptions) {
			// Match the list with the desired Invite Options
			if (selectInviteOptions.getText().equalsIgnoreCase(InviteOption)) {
				ImplicitWait(5);
				// Click on the Invite Option after it is matched
				selectInviteOptions.click();
			}
		}

		waitTime(3000);

		// Click on drop down list of Country Codes
		mObjectShowME.clickListCountries();
		waitTime(1000);

		// List of the Country Codes
		List<WebElement> listCountryCode = mObjectShowME.listCountryCodes;

		for (WebElement element : listCountryCode) {
			// Match the list with the desired Country Code Option
			if (element.getText().equalsIgnoreCase(CountryName)) {
				ImplicitWait(5);
				// Click on the Country Code after it is matched
				element.click();
			}
		}
		waitTime(1500);
	}

}
