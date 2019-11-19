package logicalView.ShowMeScripts;

import java.util.List;

import org.openqa.selenium.WebElement;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectShowME;

public class CreateShowMeSessionwithEmail extends ApplicationUtility {

	ObjectShowME mObjectShowME = new ObjectShowME(driver);
	public String ReferenceId = "Test Email Session " + (int) (Math.random() * 999);
	CreateShowMeSessionwithSMS mCreateShowMeSessionwithSMS = new CreateShowMeSessionwithSMS();

	public void createSessionwithEmail() {
		refreshPage();
		waitTime(10000);
		ImplicitWait(10);

		// Enter the New Reference Id to create session
		mObjectShowME.enterReference(ReferenceId);
		waitTime(1000);

		// Clicking Invite Participant to Create session
		mObjectShowME.clickInviteParticipant();
		waitTime(4500);

		// Select Invite Option from Ellipsis menu
		invtieEllipsisOption(BaseClass.getValueFromPropertyFile("Showme.properties", "inviteOptionEmail"));

		// Enter Email to Invite
		mObjectShowME.enterInviteEmail(BaseClass.getValueFromPropertyFile("Showme.properties", "Email"));
		waitTime(1000);

		// Clicking Invite and join Button to join the call
		mObjectShowME.clickInviteAndJoin();
		waitTime(12000);

		// Close the Newly Opened Join Call window
		popupWindowHandle();

	}

	public void invtieEllipsisOption(String strInviteOption) {
		// Click on the Invite Ellipsis Dropdown button
		mObjectShowME.clickInviteEllipsis();
		waitTime(1000);

		// Select the Invite option through which Invitation will be sent.
		// and Also select Country Name
		List<WebElement> listEllipsisOptions = mObjectShowME.listEllipsisOptions;
		for (WebElement element : listEllipsisOptions) {

			if (element.getText().equalsIgnoreCase(strInviteOption)) {
				ImplicitWait(5);
				element.click();
			}
		}
	}

}
