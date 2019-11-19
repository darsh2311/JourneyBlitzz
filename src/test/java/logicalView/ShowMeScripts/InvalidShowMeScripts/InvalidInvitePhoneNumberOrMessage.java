package logicalView.ShowMeScripts.InvalidShowMeScripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectShowME;

public class InvalidInvitePhoneNumberOrMessage extends ApplicationUtility {

	ObjectShowME mObjectShowME = new ObjectShowME(driver);
	public String ReferenceId = "Test Session " + (int) (Math.random() * 999);

	public void invalidInvitePhoneNumberOrMessage1() {

		// Enter the New Reference Id to create session
		mObjectShowME.enterReference(ReferenceId);
		waitTime(1000);

		// Clicking Invite Participant to Create session
		mObjectShowME.clickInviteParticipant();

		// Save the User by clicking on AddUser button
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 6);
			wait1.until(ExpectedConditions.elementToBeClickable(mObjectShowME.inviteAndJoin));
			logger.error(
					"Invite and Join button of Invite Guest Pop up should not be Clickable with Blank Phone Number Value: Failed");
		} catch (Exception e) {
			logger.info(
					"Invite and Join button of Invite Guest Pop up should not be Clickable with Blank Phone Number Value: Passed");
		}
		waitTime(200);
	}

	public void invalidInvitePhoneNumberOrMessage2() {

		// Enter the New Reference Id to create session
		mObjectShowME.enterReference(ReferenceId);
		waitTime(1000);

		// Clicking Invite Participant to Create session
		mObjectShowME.clickInviteParticipant();

		// Enter Phone Number to Invite
		mObjectShowME.clearPhoneNumber();
		mObjectShowME.enterPhoneNumber(
				BaseClass.getValueFromPropertyFile("Showme.properties", "invalidLessAllowedDigitNumber"));
		waitTime(1000);

		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 6);
			wait1.until(ExpectedConditions.elementToBeClickable(mObjectShowME.inviteAndJoin));
			logger.error(
					"Invite and Join button of Invite Guest Pop up should not be Clickable with Less digit Phone Number Value: Failed");
		} catch (Exception e) {
			logger.info(
					"Invite and Join button of Invite Guest Pop up should not be Clickable with Less digit Phone Number Value: Passed");
		}
		waitTime(200);

	}

	public void invalidInvitePhoneNumberOrMessage3() {

		// Enter the New Reference Id to create session
		mObjectShowME.enterReference(ReferenceId);
		waitTime(1000);

		// Clicking Invite Participant to Create session
		mObjectShowME.clickInviteParticipant();

		// Enter Phone Number to Invite
		mObjectShowME.clearPhoneNumber();
		mObjectShowME.enterPhoneNumber(
				BaseClass.getValueFromPropertyFile("Showme.properties", "invalidMoreThanAllowedDigitNumber"));
		waitTime(1000);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 6);
			wait1.until(ExpectedConditions.elementToBeClickable(mObjectShowME.inviteAndJoin));
			logger.error(
					"Invite and Join button of Invite Guest Pop up should not be Clickable with More digit Phone Number Value: Failed");
		} catch (Exception e) {
			logger.info(
					"Invite and Join button of Invite Guest Pop up should not be Clickable with More digit Phone Number Value: Passed");
		}
		waitTime(200);

	}

	public void invalidInvitePhoneNumberOrMessage4() {

		// Enter the New Reference Id to create session
		mObjectShowME.enterReference(ReferenceId);
		waitTime(1000);

		// Clicking Invite Participant to Create session
		mObjectShowME.clickInviteParticipant();

		// Enter Phone Number to Invite
		mObjectShowME.clearPhoneNumber();
		mObjectShowME.enterPhoneNumber(BaseClass.getValueFromPropertyFile("Showme.properties", "invalidPhoneNumber"));
		waitTime(1000);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 6);
			wait1.until(ExpectedConditions.elementToBeClickable(mObjectShowME.inviteAndJoin));
			logger.error(
					"Invite and Join button of Invite Guest Pop up should not be Clickable with Invalid Phone Number Value: Failed");
		} catch (Exception e) {
			logger.info(
					"Invite and Join button of Invite Guest Pop up should not be Clickable with Invalid Phone Number Value: Passed");
		}
		waitTime(200);

	}

	public void invalidInviteMessage() {

		// Enter the New Reference Id to create session
		mObjectShowME.enterReference(ReferenceId);
		waitTime(1000);

		// Clicking Invite Participant to Create session
		mObjectShowME.clickInviteParticipant();

		// Enter Phone Number to Invite
		mObjectShowME.clearPhoneNumber();
		mObjectShowME.enterPhoneNumber(BaseClass.getValueFromPropertyFile("Showme.properties", "phoneNumber"));
		waitTime(1000);

		// Clear the Message field value
		mObjectShowME.clearInviteMessage();
		waitTime(1000);

		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 6);
			wait1.until(ExpectedConditions.elementToBeClickable(mObjectShowME.inviteAndJoin));
			logger.error(
					"Invite and Join button of Invite Guest Pop up should not be Clickable with Blank Message Value: Failed");
		} catch (Exception e) {
			logger.info(
					"Invite and Join button of Invite Guest Pop up should not be Clickable with Blank Message Value: Passed");
		}
		waitTime(200);

	}
}
