package logicalView.InvalidSignUPScripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectSignUpCopy;

public class SignUpwithUserIdInvalidData extends ApplicationUtility {

	ObjectSignUpCopy objSignUp = new ObjectSignUpCopy(driver);

	public void invalidUserIDSubmit() {

		waitTime(300);
		ImplicitWait(6);
		// Click on Add user
		objSignUp.clickAddButton();
		ImplicitWait(100);

		// Select SignUp type
		objSignUp.clickByUserIdTab();

		// Enter invalid UserID
		waitTime(700);
		objSignUp.enterEmailID(BaseClass.getValueFromPropertyFile("signUp.properties", "invalidUserId"));
		waitTime(1700);

		waitTime(2000);
		ImplicitWait(100);

		// Set Password Toggle ON
		objSignUp.setPasswordToggle();
		waitTime(700);

		// Set the Password
		objSignUp.enterPassword(BaseClass.getValueFromPropertyFile("signUp.properties", "invalidPassword"));
		waitTime(150);

		// Enter the Confirm Password
		objSignUp.enterConfirmPassword(
				BaseClass.getValueFromPropertyFile("signUp.properties", "invalidConfirmPassword"));
		waitTime(150);

		// Enter Firstname for SignUp
		objSignUp.enterFirstName(BaseClass.getValueFromPropertyFile("signUp.properties", "invalidFirstname"));
		ImplicitWait(100);

		// Enter Lastname for SignUp
		objSignUp.enterLastName(BaseClass.getValueFromPropertyFile("signUp.properties", "invalidLastname"));
		waitTime(150);

		// Save the User by clicking on AddUser button
		try {
			WebDriverWait wait3 = new WebDriverWait(driver, 15);
			wait3.until(ExpectedConditions.elementToBeClickable(objSignUp.saveAddUser));
			logger.error("Add User(submit) button of UserID should not be Clickable with Invalid Value: Failed");
		} catch (Exception e) {
			logger.info("Add User(submit) button of UserID should not be Clickable with Invalid Value: Passed");
		}
		waitTime(200);
		// Close the Add user Side bar
		objSignUp.closeAddUserSidebar();
	}

}
