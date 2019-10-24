package logicalView.InvalidSignUPScripts;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonFunctions.ApplicationUtility;
import testObjects.ObjectSignUpCopy;

public class SignUpwithBlankUserIdInvalidData extends ApplicationUtility {

	ObjectSignUpCopy objSignUp = PageFactory.initElements(driver, ObjectSignUpCopy.class);

	public void checkBlankUserIdSubmit() {

		waitTime(300);
		// Click on Add user
		objSignUp.clickAddButton();
		waitTime(150);

		// Select SignUp type
		objSignUp.clickByUserIdTab();
		waitTime(700);
		// Keep all the value of form Blank and check Submit button is Clickable

		// Check the button is Clickable or not
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 6);
			wait2.until(ExpectedConditions.elementToBeClickable(objSignUp.saveAddUser));
			logger.error("Add User(submit) button of UserID should not be Clickable with Blank Values: Failed");
		} catch (Exception e) {
			logger.info("Add User(submit) button of UserID should not be Clickable with Blank Values: Passed");
		}
		waitTime(200);

		// Close the Add user Side bar
		objSignUp.closeAddUserSidebar();
		refreshPage();

	}

}
