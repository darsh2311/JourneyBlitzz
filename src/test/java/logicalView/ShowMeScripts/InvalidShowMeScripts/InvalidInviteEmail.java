package logicalView.ShowMeScripts.InvalidShowMeScripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import logicalView.ShowMeScripts.CreateShowMeSessionwithEmail;
import testObjects.ObjectShowME;

public class InvalidInviteEmail extends ApplicationUtility {

	ObjectShowME mObjectShowME = new ObjectShowME(driver);
	CreateShowMeSessionwithEmail mCreateShowMeSessionwithEmail = new CreateShowMeSessionwithEmail();
	public String ReferenceId = "Test Session " + (int) (Math.random() * 999);

	public void createSessionwithInvalidBlankEmail() {
		waitTime(1000);
		// Enter the New Reference Id to create session
		mObjectShowME.enterReference(ReferenceId);
		waitTime(1000);

		// Clicking Invite Participant to Create session
		mObjectShowME.clickInviteParticipant();
		waitTime(1000);

		// Select Invite Option from Ellipsis menu
		mCreateShowMeSessionwithEmail
				.invtieEllipsisOption(BaseClass.getValueFromPropertyFile("Showme.properties", "inviteOptionEmail"));

		// Clicking Invite and join Button to join the call
		mObjectShowME.clickInviteAndJoin();
		waitTime(12000);

		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 3);
			wait1.until(ExpectedConditions.elementToBeClickable(mObjectShowME.inviteAndJoin));
			logger.error(
					"Invite and Join button of Invite Guest Pop up should not be Clickable with Blank Email Value: Failed");
		} catch (Exception e) {
			logger.info(
					"Invite and Join button of Invite Guest Pop up should not be Clickable with Blank Email Value: Passed");
		}
		waitTime(200);

	}

	public void createSessionwithInvalidEmailwithOnlyAlphabet() {
		waitTime(1000);

		// Enter Email to Invite
		mObjectShowME.enterInviteEmail(BaseClass.getValueFromPropertyFile("Showme.properties", "invalidEmailAlpha"));
		waitTime(1000);

		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 3);
			wait1.until(ExpectedConditions.elementToBeClickable(mObjectShowME.inviteAndJoin));
			logger.error(
					"Invite and Join button of Invite Guest Pop up should not be Clickable with invalidEmailAlpha Value: Failed");
		} catch (Exception e) {
			logger.info(
					"Invite and Join button of Invite Guest Pop up should not be Clickable with invalidEmailAlpha Value: Passed");
		}
		waitTime(200);

	}

	public void createSessionwithInvalidEmailwithOnlyNumeric() {
		waitTime(1000);

		// Enter Email to Invite
		mObjectShowME.clearInviteEmail();
		mObjectShowME.enterInviteEmail(BaseClass.getValueFromPropertyFile("Showme.properties", "invalidEmailNum"));
		waitTime(1000);

		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 3);
			wait1.until(ExpectedConditions.elementToBeClickable(mObjectShowME.inviteAndJoin));
			logger.error(
					"Invite and Join button of Invite Guest Pop up should not be Clickable with invalidEmailNum Value: Failed");
		} catch (Exception e) {
			logger.info(
					"Invite and Join button of Invite Guest Pop up should not be Clickable with invalidEmailNum Value: Passed");
		}
		waitTime(200);

	}

	public void createSessionwithInvalidEmailwithOnlyAlphaNumeric() {
		waitTime(1000);

		// Enter Email to Invite
		mObjectShowME.clearInviteEmail();
		mObjectShowME.enterInviteEmail(BaseClass.getValueFromPropertyFile("Showme.properties", "invalidEmailAlphaNum"));
		waitTime(1000);

		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 3);
			wait1.until(ExpectedConditions.elementToBeClickable(mObjectShowME.inviteAndJoin));
			logger.error(
					"Invite and Join button of Invite Guest Pop up should not be Clickable with invalidEmailAlphaNum Value: Failed");
		} catch (Exception e) {
			logger.info(
					"Invite and Join button of Invite Guest Pop up should not be Clickable with invalidEmailAlphaNum Value: Passed");
		}
		waitTime(200);
	}

	public void createSessionwithInvalidEmail() {
		waitTime(1000);

		// Enter Email to Invite
		mObjectShowME.clearInviteEmail();
		mObjectShowME.enterInviteEmail(BaseClass.getValueFromPropertyFile("Showme.properties", "invalidEmailSC"));
		waitTime(1000);

		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 3);
			wait1.until(ExpectedConditions.elementToBeClickable(mObjectShowME.inviteAndJoin));
			logger.error(
					"Invite and Join button of Invite Guest Pop up should not be Clickable with invalidEmailSC Value: Failed");
		} catch (Exception e) {
			logger.info(
					"Invite and Join button of Invite Guest Pop up should not be Clickable with invalidEmailSC Value: Passed");
		}
		waitTime(200);
	}

}
