package logicalView.ValidSignUpScripts;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectSignUp;

public class SignUpwithUserId extends ApplicationUtility {

	public ObjectSignUp objSignUp = new ObjectSignUp(driver);
	public int name = (int) (Math.random() * 1000);
	public String userId = "User" + (int) (Math.random() * 199999);

	public void signUpAdminwithUserId() {

		// Click on Setting Button
		objSignUp.clickSettings();
		waitTime(10000);

		// Click on User Management
		objSignUp.clickUserManagement();
		waitTime(10000);

		// Click on Add user
		objSignUp.clickAddButton();
		waitTime(1200);

		// Select SignUp type
		objSignUp.clickByUserIdTab();
		waitTime(1200);

		// Enter the email id
		objSignUp.enterUserID(userId);
		waitTime(1200);

		// Select the User Type
		objSignUp.clickUserType();
		objSignUp.selectUserAdmin();
		waitTime(1200);

		// Set Password Toggle ON
		objSignUp.setPasswordToggle();
		waitTime(1200);

		// Set the Password
		objSignUp.enterPassword(BaseClass.getValueFromPropertyFile("signUp.properties", "userPassword"));
		waitTime(1200);

		// Enter the Confirm Password
		objSignUp.enterConfirmPassword(BaseClass.getValueFromPropertyFile("signUp.properties", "confirmPassword"));
		waitTime(1200);

		// Enter Firstname for SignUp
		objSignUp.enterFirstName(BaseClass.getValueFromPropertyFile("signUp.properties", "firstName"));
		waitTime(1200);

		// Enter Lastname for SignUp
		objSignUp.enterLastName(BaseClass.getValueFromPropertyFile("signUp.properties", "lastName") + name);
		waitTime(4500);

		// Save the User by clicking on AddUser button
		objSignUp.saveAddUser();
		waitTime(25000);
		refreshPage();

	}

}
