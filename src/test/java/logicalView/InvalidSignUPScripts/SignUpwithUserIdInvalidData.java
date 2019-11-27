package logicalView.InvalidSignUPScripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectSignUpCopy;

public class SignUpwithUserIdInvalidData extends ApplicationUtility {

	ObjectSignUpCopy objSignUp = new ObjectSignUpCopy(driver);

	public void invalidUserIDSubmit() {

		waitTime(3000);
		ImplicitWait(6);
		// Click on Add user
		objSignUp.clickAddButton();
		ImplicitWait(10);

		// Select SignUp type
		objSignUp.clickByUserIdTab();

		// Enter invalid UserID
		waitTime(1200);
		objSignUp.enterEmailID(BaseClass.getValueFromPropertyFile("signUp.properties", "invalidUserId"));
		waitTime(1700);

		waitTime(2000);
		ImplicitWait(10);

		// Set Password Toggle ON
		objSignUp.setPasswordToggle();
		waitTime(1500);

		// Set the Password
		objSignUp.enterPassword(BaseClass.getValueFromPropertyFile("signUp.properties", "invalidPassword"));
		waitTime(1200);

		// Enter the Confirm Password
		objSignUp.enterConfirmPassword(
				BaseClass.getValueFromPropertyFile("signUp.properties", "invalidConfirmPassword"));
		waitTime(1000);

		// Enter Firstname for SignUp
		objSignUp.enterFirstName(BaseClass.getValueFromPropertyFile("signUp.properties", "invalidFirstname"));
		ImplicitWait(100);

		// Enter Lastname for SignUp
		objSignUp.enterLastName(BaseClass.getValueFromPropertyFile("signUp.properties", "invalidLastname"));
		waitTime(1000);

		// Save the User by clicking on AddUser button
		try {
			WebDriverWait wait3 = new WebDriverWait(driver, 15);
			wait3.until(ExpectedConditions.elementToBeClickable(objSignUp.saveAddUser));
			logger.error("Add User(submit) button of UserID should not be Clickable with Invalid Value: Failed");
		} catch (Exception e) {
			logger.info("Add User(submit) button of UserID should not be Clickable with Invalid Value: Passed");
		}
		waitTime(5000);
		// Close the Add user Side bar
		objSignUp.closeAddUserSidebar();
	}

}
