package logicalView.InvalidSignUPScripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonFunctions.ApplicationUtility;
import testObjects.ObjectSignUpCopy;

public class SignUpwithBlankEmailIdInvalidData extends ApplicationUtility {

	ObjectSignUpCopy objSignUp = new ObjectSignUpCopy(driver);

	// Add User through Admin after LogIn
	public void checkBlankEmailSubmit() {

		waitTime(150);
		// Click on Add user
		objSignUp.clickAddButton();
		ImplicitWait(100);

		// Keep all the value of form Blank and check Submit button is Clickable

		// Check the button is Clickable or not
		try {
			WebDriverWait wait = new WebDriverWait(driver, 6);
			wait.until(ExpectedConditions.elementToBeClickable(objSignUp.saveAddUser));
			logger.error("Add User(submit) button of Email should not be Clickable with Blank Values: Failed");
		} catch (Exception e) {
			logger.info("Add User(submit) button of Email should not be Clickable with Blank Values: Passed");
		}
		waitTime(200);

		// Close the Add user Side bar
		objSignUp.closeAddUserSidebar();

	}

}
