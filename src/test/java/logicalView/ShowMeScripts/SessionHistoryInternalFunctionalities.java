package logicalView.ShowMeScripts;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectShowME;

public class SessionHistoryInternalFunctionalities extends ApplicationUtility {

	ObjectShowME mObjectShowME = new ObjectShowME(driver);
	CreateShowMeSessionwithEmail mCreateShowMeSessionwithEmail = new CreateShowMeSessionwithEmail();
	public String ReferenceId = "Test Session " + (int) (Math.random() * 999);

	public void copySessionCode() {

		waitTime(3000);

		ImplicitWait(10);

		// Enter the New Reference Id to create session
		mObjectShowME.enterReference(ReferenceId);
		waitTime(1000);

		// Clicking Invite Participant to Create session
		mObjectShowME.clickInviteParticipant();
		waitTime(4500);

		// Select Invite Option from Ellipsis menu
		mCreateShowMeSessionwithEmail
				.invtieEllipsisOption(BaseClass.getValueFromPropertyFile("Showme.properties", "copySessionCode"));
		waitTime(1000);

		// Click on Close button of Invite popup
		mObjectShowME.clickCloseInvitePopup();
		waitTime(1000);

		// Enter Copied string to Search Area to check it is copied.
		mObjectShowME.entersearchReferenceId(Keys.chord(Keys.CONTROL, "v"));
		waitTime(3000);

		// Clear the Pasted string
		mObjectShowME.clearSearchReferenceId();

	}

	public void copyGuestUrl() {

		waitTime(3000);

		// Enter the New Reference Id to create session
		mObjectShowME.enterReference(ReferenceId);
		waitTime(1000);

		// Clicking Invite Participant to Create session
		mObjectShowME.clickInviteParticipant();
		waitTime(4500);

		// Select Invite Option from Ellipsis menu
		mCreateShowMeSessionwithEmail
				.invtieEllipsisOption(BaseClass.getValueFromPropertyFile("Showme.properties", "copyGuestUrl"));
		waitTime(1000);

		// Click on Close button of Invite pop-up
		mObjectShowME.clickCloseInvitePopup();
		waitTime(1000);

		// Enter Copied string to Search Area to check it is copied.
		mObjectShowME.entersearchReferenceId(Keys.chord(Keys.CONTROL, "v"));
		waitTime(3000);

		// Clear the Pasted string
		mObjectShowME.clearSearchReferenceId();
		waitTime(3000);

	}

	public void clickJoinSessionCall() {

		refreshPage();
		waitTime(10000);
		// Click on Join button to start session call
		mObjectShowME.clickJoinCallButton();
		waitTime(10000);
		popupWindowHandle();
		waitTime(1000);

	}

	public void verifyInviteEllipsisOption() {

		// Click on Ellipsis menu of Particular session
		mObjectShowME.clickSessionEllipsisOption();
		waitTime(1000);

		// Select the invite option from the Ellipsis menu
		sessionEllipsisOptions(BaseClass.getValueFromPropertyFile("Showme.properties", "ellipsisOptionInvite"));
		waitTime(1000);

		// Storing the title of the Invite Pop up to verify it is working
		String InviteTitle = mObjectShowME.invitePopupTitle.getText();
		waitTime(1000);

		// Verify Invite pop up title is matched with the Pop up opened
		if (InviteTitle
				.equalsIgnoreCase(BaseClass.getValueFromPropertyFile("Showme.properties", "VerifyInvitePopup"))) {
			logger.info("Invite participant popup verification: Passed");
		} else {
			logger.error("Invite participant popup verification: Failed");
		}
		waitTime(1000);

		// Click on Close to close the Invite popup
		mObjectShowME.clickCloseInvitePopup();
		waitTime(1000);
	}

	public void CopySessionUrlEllipsisOption() {

		waitTime(1000);

		// Click on Ellipsis menu of Particular session
		mObjectShowME.clickSessionEllipsisOption();
		waitTime(1000);

		// Select the Copy Session URL option from the Ellipsis menu
		sessionEllipsisOptions(BaseClass.getValueFromPropertyFile("Showme.properties", "ellipsisOptionCopySessionUrl"));
		waitTime(1000);

		// Paste the Copied URL to Search Area
		mObjectShowME.entersearchReferenceId(Keys.chord(Keys.CONTROL, "v"));
		waitTime(3000);

		// Clear the Pasted URL
		mObjectShowME.clearSearchReferenceId();
		waitTime(1000);
	}

	public void EndSessionEllipsisOption() {

		waitTime(1000);

		// Click on Ellipsis menu of Particular session
		mObjectShowME.clickSessionEllipsisOption();
		waitTime(1000);

		// Select the End Session option from the Ellipsis menu
		sessionEllipsisOptions(BaseClass.getValueFromPropertyFile("Showme.properties", "ellipsisOptionEndSession"));
		waitTime(1000);
	}

	public void DeleteSessionEllipsisOption() {

		waitTime(2500);

		// Click on Ellipsis menu of Particular session
		mObjectShowME.clickSessionEllipsisOption();
		waitTime(1000);

		// Select the Delete Session option from the Ellipsis menu
		sessionEllipsisOptions(BaseClass.getValueFromPropertyFile("Showme.properties", "ellipsisOptionDeleteCode"));
		waitTime(1000);

		// Click on close button to close the Delete Session popup to close it
		mObjectShowME.clickCloseDeleteSession();
		waitTime(1000);

		// Click on Ellipsis menu of Particular session
		mObjectShowME.clickSessionEllipsisOption();
		waitTime(1000);

		// Select the Delete Session option from the Ellipsis menu
		sessionEllipsisOptions(BaseClass.getValueFromPropertyFile("Showme.properties", "ellipsisOptionDeleteCode"));
		waitTime(1000);

		// Click on OK button to close the Delete Session popup to close it
		mObjectShowME.clickOkDeleteSession();
		waitTime(12000);

	}

	public void sessionEllipsisOptions(String sessionEllipsis) {

		List<WebElement> listSessionOptions = mObjectShowME.listSessionEllipsisOptions;

		for (WebElement element : listSessionOptions) {

			if (element.getText().equalsIgnoreCase(sessionEllipsis)) {

				ImplicitWait(5);
				element.click();
			}
		}
	}
}
