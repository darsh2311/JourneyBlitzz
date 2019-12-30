package logicalView.ShowMeScripts.InvalidShowMeScripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonFunctions.ApplicationUtility;
import testObjects.ObjectShowME;

public class InvalidCreateSessionReference extends ApplicationUtility {

	ObjectShowME mObjectShowME = new ObjectShowME(driver);

	public void invalidSessionReference() {

		ImplicitWait(3);

		// Save the User by clicking on AddUser button
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 6);
			wait1.until(ExpectedConditions.elementToBeClickable(mObjectShowME.inviteParticipant));
			logger.error(
					"Invite Participant button of Create Session should not be Clickable with Blank Reference Value: Failed");
		} catch (Exception e) {
			logger.info(
					"Invite Participant button of Create Session should not be Clickable with Blank Reference Value: Passed");
		}
		waitTime(200);

	}
}
