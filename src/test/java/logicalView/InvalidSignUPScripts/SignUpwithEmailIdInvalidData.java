package logicalView.InvalidSignUPScripts;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectSignUpCopy;

public class SignUpwithEmailIdInvalidData extends ApplicationUtility {

	ObjectSignUpCopy objSignUp = PageFactory.initElements(driver, ObjectSignUpCopy.class);

	public void invalidEmailSubmit() {

		waitTime(150);
		// Click on Add user
		objSignUp.clickAddButton();
		ImplicitWait(10);

		// Enter invalid Email
		objSignUp.enterEmailID(BaseClass.getValueFromPropertyFile("signUp.properties", "invalidEmailVerify"));

		// Set Password Toggle ON
		objSignUp.setPasswordToggle();
		waitTime(1500);

		// Set the Password
		objSignUp.enterPassword(BaseClass.getValueFromPropertyFile("signUp.properties", "invalidPassword"));
		waitTime(1500);

		// Enter the Confirm Password
		objSignUp.enterConfirmPassword(
				BaseClass.getValueFromPropertyFile("signUp.properties", "invalidConfirmPassword"));
		waitTime(1500);

		// Enter Firstname for SignUp
		objSignUp.enterFirstName(BaseClass.getValueFromPropertyFile("signUp.properties", "invalidFirstname"));
		waitTime(1500);

		// Enter Lastname for SignUp
		objSignUp.enterLastName(BaseClass.getValueFromPropertyFile("signUp.properties", "invalidLastname"));
		waitTime(1500);

		// Save the User by clicking on AddUser button
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 6);
			wait1.until(ExpectedConditions.elementToBeClickable(objSignUp.saveAddUser));
			logger.error("Add User(submit) button of Email should not be Clickable with Invalid Value: Failed");
		} catch (Exception e) {
			logger.info("Add User(submit) button of Email should not be Clickable with Invalid Value: Passed");
		}
		waitTime(5000);

		// Close the Add user Side bar
		objSignUp.closeAddUserSidebar();
		refreshPage();

	}
}
