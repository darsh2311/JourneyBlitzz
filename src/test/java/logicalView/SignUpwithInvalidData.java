package logicalView;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectSignUp;

public class SignUpwithInvalidData extends ApplicationUtility {

	ObjectSignUp objSignUp = new ObjectSignUp(driver);

	public void addUser() {

		// Click on Setting Button
		objSignUp.clickSettings();
		ImplicitWait(100);

		// Click on User Management
		objSignUp.clickUserManagement();
		ImplicitWait(100);

	}

	// Verify Email/Userid Invite SignUp
	public void blankVerifyEmailUserid() {

		waitTime(300);
		// Click on SignUp link from the login page
		objSignUp.clickSignUpLink();
		waitTime(1200);

		// Keep the Email/userId textbox blank
		waitTime(500);

		// Click on Verify email button
		objSignUp.clickverifyEmail();
		waitTime(1000);

		String VerifyEmailErrorMessage = objSignUp.blankVerifyEmailErrorMessage.getText();

		if (VerifyEmailErrorMessage.equalsIgnoreCase(
				BaseClass.getValueFromPropertyFile("signUp.properties", "blankVerifyEmailErrorMessage"))) {
			logger.info("Blank Email/UserId Verification not allowed: Passed");
		} else {
			logger.error("Blank Email/UserId Verification not allowed: Failed");
		}
	}

	public void invalidVerifyEmail() {

		waitTime(300);
		// Enter invalid Email Id
		objSignUp.enterVerifyEmail(BaseClass.getValueFromPropertyFile("signUp.properties", "invalidEmailVerify"));
		ImplicitWait(100);
		waitTime(700);

		// Click on Verify email button
		objSignUp.clickverifyEmail();
		waitTime(1200);

		String VerifyInvalidEmailErrorMessage = objSignUp.invalidVerifyEmailErrorMessage.getText();

		if (VerifyInvalidEmailErrorMessage.equalsIgnoreCase(
				BaseClass.getValueFromPropertyFile("signUp.properties", "invalidVerifyEmailErrorMessage"))) {
			logger.info("Invalid Email Verification not allowed: Passed");
		} else {
			logger.error("Invalid Email Verification not allowed: Failed");
		}

		// To Close the Error Message
		objSignUp.errorMessageDismissButton();
	}

	public void notRegisteredVerifyEmail() {

		waitTime(300);
		// Enter Not registered or added Email Id
		objSignUp.enterVerifyEmail(BaseClass.getValueFromPropertyFile("signUp.properties", "notRegisteredEmailVerify"));
		ImplicitWait(100);
		waitTime(700);

		// Click on Verify email button
		objSignUp.clickverifyEmail();
		waitTime(1200);

		String VerifyInvalidEmailErrorMessage = objSignUp.invalidVerifyEmailErrorMessage.getText();

		if (VerifyInvalidEmailErrorMessage.equalsIgnoreCase(
				BaseClass.getValueFromPropertyFile("signUp.properties", "invalidVerifyEmailErrorMessage"))) {
			logger.info("Not Registered Email Verification not allowed: Passed");
		} else {
			logger.error("Not Registered Email Verification not allowed: Failed");
		}

		// To Close the Error Message
		objSignUp.errorMessageDismissButton();
	}

	public void invalidVerifyUserId() {

		waitTime(300);
		// Enter invalid UserId
		objSignUp.enterVerifyEmail(BaseClass.getValueFromPropertyFile("signUp.properties", "invalidUserIdVerify"));
		ImplicitWait(100);
		waitTime(700);

		// Click on Verify email button
		objSignUp.clickverifyEmail();
		waitTime(1200);

		String VerifyInvalidEmailErrorMessage = objSignUp.invalidVerifyEmailErrorMessage.getText();

		if (VerifyInvalidEmailErrorMessage.equalsIgnoreCase(
				BaseClass.getValueFromPropertyFile("signUp.properties", "invalidVerifyEmailErrorMessage"))) {
			logger.info("Invalid UserID Verification not allowed: Passed");
		} else {
			logger.error("Invalid UserID Verification not allowed: Failed");
		}

		// To Close the Error Message
		objSignUp.errorMessageCloseButton();
	}

	public void notRegisteredVerifyUserId() {

		waitTime(300);
		// Enter Not registered or added UserId
		objSignUp
				.enterVerifyEmail(BaseClass.getValueFromPropertyFile("signUp.properties", "notRegisteredUserIdVerify"));
		ImplicitWait(100);
		waitTime(700);

		// Click on Verify UserID button
		objSignUp.clickverifyEmail();
		waitTime(1200);

		String VerifyInvalidEmailErrorMessage = objSignUp.invalidVerifyEmailErrorMessage.getText();

		if (VerifyInvalidEmailErrorMessage.equalsIgnoreCase(
				BaseClass.getValueFromPropertyFile("signUp.properties", "invalidVerifyEmailErrorMessage"))) {
			logger.info("Not Registered UserID Verification not allowed: Passed");
		} else {
			logger.error("Not Registered UserID Verification not allowed: Failed");
		}

		// To Close the Error Message
		objSignUp.errorMessageCloseButton();
		waitTime(700);

		objSignUp.backToLoginIcon();
	}

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

	public void invalidEmailSubmit() {

		waitTime(150);
		// Click on Add user
		objSignUp.clickAddButton();
		ImplicitWait(100);
		waitTime(150);

		// Enter invalid Email
		objSignUp.enterEmailID(BaseClass.getValueFromPropertyFile("signUp.properties", "invalidEmailVerify"));
		waitTime(150);

		// Set Password Toggle ON
		objSignUp.setPasswordToggle();
		waitTime(150);

		// Set the Password
		objSignUp.enterPassword(BaseClass.getValueFromPropertyFile("signUp.properties", "invalidPassword"));
		waitTime(150);

		// Enter the Confirm Password
		objSignUp.enterConfirmPassword(
				BaseClass.getValueFromPropertyFile("signUp.properties", "invalidConfirmPassword"));
		waitTime(150);

		// Enter Firstname for SignUp
		objSignUp.enterFirstName(BaseClass.getValueFromPropertyFile("signUp.properties", "invalidFirstname"));
		waitTime(150);

		// Enter Lastname for SignUp
		objSignUp.enterLastName(BaseClass.getValueFromPropertyFile("signUp.properties", "invalidLastname"));
		waitTime(150);

		// Save the User by clicking on AddUser button
		try {
			WebDriverWait wait = new WebDriverWait(driver, 6);
			wait.until(ExpectedConditions.elementToBeClickable(objSignUp.saveAddUser));
			logger.error("Add User(submit) button of Email should not be Clickable with Invalid Value: Failed");
		} catch (Exception e) {
			logger.info("Add User(submit) button of Email should not be Clickable with Invalid Value: Passed");
		}
		waitTime(200);

		// Close the Add user Side bar
		objSignUp.closeAddUserSidebar();
	}

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
			WebDriverWait wait = new WebDriverWait(driver, 6);
			wait.until(ExpectedConditions.elementToBeClickable(objSignUp.saveAddUser));
			logger.error("Add User(submit) button of UserID should not be Clickable with Blank Values: Failed");
		} catch (Exception e) {
			logger.info("Add User(submit) button of UserID should not be Clickable with Blank Values: Passed");
		}
		waitTime(200);

		// Close the Add user Side bar
		objSignUp.closeAddUserSidebar();
	}

	public void invalidUserIDSubmit() {

		waitTime(300);
		// Click on Add user
		objSignUp.clickAddButton();
		ImplicitWait(100);

		// Select SignUp type
		objSignUp.clickByUserIdTab();

		// Enter invalid UserID
		waitTime(700);
		objSignUp.enterEmailID(BaseClass.getValueFromPropertyFile("signUp.properties", "invalidUserId"));

		// Set Password Toggle ON
		objSignUp.setPasswordToggle();
		waitTime(150);

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
			WebDriverWait wait = new WebDriverWait(driver, 6);
			wait.until(ExpectedConditions.elementToBeClickable(objSignUp.saveAddUser));
			logger.error("Add User(submit) button of UserID should not be Clickable with Invalid Value: Failed");
		} catch (Exception e) {
			logger.info("Add User(submit) button of UserID should not be Clickable with Invalid Value: Passed");
		}
		waitTime(200);
		// Close the Add user Side bar
		objSignUp.closeAddUserSidebar();
	}

}
