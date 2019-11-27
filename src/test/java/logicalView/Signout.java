package logicalView;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectSignOut;

public class Signout extends ApplicationUtility {

	ObjectSignOut objSignOut = new ObjectSignOut(driver);

	public void SignOut() {
		ImplicitWait(5);

		// Click on Blitzz Dropdown
		objSignOut.blitzzDropdown();

		waitTime(1000);
		// Click on Signout option
		objSignOut.signOutOption();
		waitTime(5000);
		String verifySignOut = driver.getTitle();
		if (verifySignOut.equalsIgnoreCase(
				BaseClass.getValueFromPropertyFile("Domain.properties", "verifySignOutSubmissionSuccess"))) {
			logger.info("SignOut submission: Passed");
		} else {
			logger.error("SignOut submission: Failed");
		}
	}
}
