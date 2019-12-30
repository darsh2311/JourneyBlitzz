package logicalView.ShowMeScripts;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectShowME;

public class CreateShowMeSessionwithSMS extends ApplicationUtility {

	ObjectShowME mObjectShowME = new ObjectShowME(driver);
	public String ReferenceId = "Test SMS Session " + (int) (Math.random() * 999);
	int count = 0;

	public void createSessionwithSMS() {

		ImplicitWait(5);
		// Enter the New Reference Id to create session
		mObjectShowME.enterReference(ReferenceId);
		waitTime(1000);

		// Clicking Invite Participant to Create session
		mObjectShowME.clickInviteParticipant();

		waitTime(5000);

		// Select the Invite option through which Invitation will be sent.
		// and Also select Country Name
		selectInviteOption(BaseClass.getValueFromPropertyFile("Showme.properties", "inviteOptionSMS"));
		selectCountryCode(BaseClass.getValueFromPropertyFile("Showme.properties", "countryName"), "SMS");

		waitTime(3000);

	}

	public void selectInviteOption(String InviteOption) {
		ImplicitWait(10);

		// List of the Invite Options like Whatsapp,SMS or Smartglass
		List<WebElement> listInviteOptions = mObjectShowME.listInviteOptions;

		for (WebElement selectInviteOptions : listInviteOptions) {

			// Match the list with the desired Invite Options
			if (selectInviteOptions.getText().equalsIgnoreCase(InviteOption)) {
				ImplicitWait(5);
				// Click on the Invite Option after it is matched
				selectInviteOptions.click();
				count = count + 1;
			}
		}
		waitTime(3000);
	}

	public void selectCountryCode(String CountryName, String InviteOptions) {
		ImplicitWait(10);

		if (count == 1) {
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
			waitTime(3000);

			// Enter Phone Number to Invite
			mObjectShowME.enterPhoneNumber(BaseClass.getValueFromPropertyFile("Showme.properties", "phoneNumber"));
			waitTime(1000);

			// Clicking Invite and join Button to join the call
			try {
				WebDriverWait wait1 = new WebDriverWait(driver, 3);
				wait1.until(ExpectedConditions.elementToBeClickable(mObjectShowME.inviteAndJoin));
				mObjectShowME.clickInviteAndJoin();
				waitTime(12000);
				// Close the Newly Opened Join Call window
				popupWindowHandle();
				waitTime(5000);
				logger.info(InviteOptions + " Invitation test-case Passed");
			} catch (Exception e) {
				logger.error(InviteOptions + " Invitation test-case failed.");
				mObjectShowME.clickCloseInvitePopup();
				waitTime(1000);
				throw (e);
			}

		} else {
			logger.error(InviteOptions + " option not found, So skipping this Testcase.");
			// Click on Close to close the Invite popup
			mObjectShowME.clickCloseInvitePopup();
			waitTime(1000);
			throw new NoSuchElementException(InviteOptions);
		}

	}
}
