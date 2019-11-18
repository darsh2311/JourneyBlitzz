package logicalView;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectShowME;

public class CreateShowMeSessionwithWhatsApp extends ApplicationUtility {

	ObjectShowME mObjectShowME = new ObjectShowME(driver);
	public String ReferenceId = "Session Test" + (int) (Math.random() * 199999);
	CreateShowMeSessionwithSMS mCreateShowMeSessionwithSMS = new CreateShowMeSessionwithSMS();

	public void createSessionwithWhatsApp() {
		waitTime(3000);

		ImplicitWait(10);

		// Enter the New Reference Id to create session
		mObjectShowME.enterReference(ReferenceId);
		waitTime(1000);

		// Clicking Invite Participant to Create session
		mObjectShowME.clickInviteParticipant();

		// Select the Invite option through which Invitation will be sent.
		// and Also select Country Name
		mCreateShowMeSessionwithSMS.selectInviteOptionandCountryCode(
				BaseClass.getValueFromPropertyFile("Showme.properties", "inviteOptionWA"),
				BaseClass.getValueFromPropertyFile("Showme.properties", "countryName"));

		// Enter Phone Number to Invite
		mObjectShowME.enterPhoneNumber(BaseClass.getValueFromPropertyFile("Showme.properties", "phoneNumber"));
		waitTime(1000);

		// Clicking Invite and join Button to join the call
		mObjectShowME.clickInviteAndJoin();
		waitTime(12000);

		// Close the Newly Opened Join Call window
		popupWindowHandle();

		// Enter Reference Id to search Session from Session history list
		mObjectShowME.entersearchReferenceId(ReferenceId);

	}

}
