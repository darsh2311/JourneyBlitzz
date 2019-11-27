package logicalView.ValidSignUpScripts;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectSignUp;

public class SignUpwithEmailId extends ApplicationUtility {

	public ObjectSignUp objSignUp = new ObjectSignUp(driver);
	public String email = "testingpurpose" + (int) (Math.random() * 199999) + "@gmail.com";
	public int name = (int) (Math.random() * 1000);

	public void signUpAdminwithEmail() {

		ImplicitWait(10);
		// Click on Setting Button
		objSignUp.clickSettings();
		waitTime(10000);

		// Click on User Management
		objSignUp.clickUserManagement();
		waitTime(10000);

		// Click on Add user
		objSignUp.clickAddButton();
		waitTime(1000);

		// Select SignUp type
		objSignUp.clickByEmailTab();
		waitTime(1000);

		// Enter the email id
		objSignUp.enterEmailID(email);
		waitTime(1000);

		// Select the User Type
		objSignUp.clickUserType();
		objSignUp.selectUserAdmin();
		waitTime(1000);

		// Set Password Toggle ON
		objSignUp.setPasswordToggle();
		waitTime(1000);

		// Set the Password
		objSignUp.enterPassword(BaseClass.getValueFromPropertyFile("signUp.properties", "userPassword"));
		waitTime(1000);

		// Enter the Confirm Password
		objSignUp.enterConfirmPassword(BaseClass.getValueFromPropertyFile("signUp.properties", "confirmPassword"));
		waitTime(1000);

		// Enter Firstname for SignUp
		objSignUp.enterFirstName(BaseClass.getValueFromPropertyFile("signUp.properties", "firstName"));
		waitTime(1000);

		// Enter Lastname for SignUp
		objSignUp.enterLastName(BaseClass.getValueFromPropertyFile("signUp.properties", "lastName") + name);
		waitTime(4500);

		// Save the User by clicking on AddUser button
		objSignUp.saveAddUser();
		waitTime(40000);
		refreshPage();
		waitTime(10000);

	}
}