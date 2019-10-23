package logicalView;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectSignUp;

public class SignUp extends ApplicationUtility {

	public ObjectSignUp objSignUp = new ObjectSignUp(driver);
	public String email = "testingpurpose" + (int) (Math.random() * 199999) + "@gmail.com";
	public int name = (int) (Math.random() * 1000);
	public String userId = "User" + (int) (Math.random() * 199999);

	public void addUser() {

		// Click on Setting Button
		objSignUp.clickSettings();
		ImplicitWait(100);

		// Click on User Management
		objSignUp.clickUserManagement();
		ImplicitWait(100);

		// Click on Add user
		objSignUp.clickAddButton();
		ImplicitWait(100);
	}

	public void signUpAdminwithEmail() {

		// Select SignUp type
		objSignUp.clickByEmailTab();
		ImplicitWait(100);

		// Enter the email id
		objSignUp.enterEmailID(email);
		ImplicitWait(100);

		// Select the User Type
		objSignUp.clickUserType();
		objSignUp.selectUserAdmin();
		ImplicitWait(100);

		// Set Password Toggle ON
		objSignUp.setPasswordToggle();
		ImplicitWait(100);

		// Set the Password
		objSignUp.enterPassword(BaseClass.getValueFromPropertyFile("signUp.properties", "userPassword"));
		ImplicitWait(100);

		// Enter the Confirm Password
		objSignUp.enterConfirmPassword(BaseClass.getValueFromPropertyFile("signUp.properties", "confirmPassword"));
		ImplicitWait(100);

		// Enter Firstname for SignUp
		objSignUp.enterFirstName(BaseClass.getValueFromPropertyFile("signUp.properties", "firstName"));
		ImplicitWait(100);

		// Enter Lastname for SignUp
		objSignUp.enterLastName(BaseClass.getValueFromPropertyFile("signUp.properties", "lastName") + name);
		ImplicitWait(100);

		// Save the User by clicking on AddUser button
		objSignUp.saveAddUser();
		ImplicitWait(100);
		waitTime(15000);
		refreshPage();

	}

	public void signUpAdminwithUserId() {

		// Select SignUp type
		objSignUp.clickByUserIdTab();
		ImplicitWait(100);

		// Enter the email id
		objSignUp.enterUserID(userId);
		ImplicitWait(100);

		// Select the User Type
		objSignUp.clickUserType();
		objSignUp.selectUserAdmin();
		ImplicitWait(100);

		// Set Password Toggle ON
		objSignUp.setPasswordToggle();
		ImplicitWait(100);

		// Set the Password
		objSignUp.enterPassword(BaseClass.getValueFromPropertyFile("signUp.properties", "userPassword"));
		ImplicitWait(100);

		// Enter the Confirm Password
		objSignUp.enterConfirmPassword(BaseClass.getValueFromPropertyFile("signUp.properties", "confirmPassword"));
		ImplicitWait(100);

		// Enter Firstname for SignUp
		objSignUp.enterFirstName(BaseClass.getValueFromPropertyFile("signUp.properties", "firstName"));
		ImplicitWait(100);

		// Enter Lastname for SignUp
		objSignUp.enterLastName(BaseClass.getValueFromPropertyFile("signUp.properties", "lastName") + name);
		ImplicitWait(100);

		// Save the User by clicking on AddUser button
		objSignUp.saveAddUser();
		ImplicitWait(100);
		waitTime(15000);
		refreshPage();

	}

	public void emailSignUpwithoutPassword() {

		// Select SignUp type
		objSignUp.clickByEmailTab();
		ImplicitWait(100);
		waitTime(1300);

		// Enter the email id
		objSignUp.enterEmailID(email);
		ImplicitWait(100);
		waitTime(1300);

		// Select the User Type
		objSignUp.clickUserType();
		objSignUp.selectUserInternal();
		ImplicitWait(100);
		waitTime(2300);

		// Save the User by clicking on AddUser button
		objSignUp.saveAddUser();
		ImplicitWait(100);
		waitTime(2300);

		// Close the Add user sidebar
		objSignUp.closeAddUserSidebar();
		ImplicitWait(100);
		waitTime(5000);
		refreshPage();

	}

	public void userIdSignUpwithoutPassword() {

		// Select SignUp type
		objSignUp.clickByUserIdTab();
		ImplicitWait(100);
		waitTime(1300);

		// Enter the email id
		objSignUp.enterUserID(userId);
		ImplicitWait(100);
		waitTime(1300);

		// Select the User Type
		objSignUp.clickUserType();
		objSignUp.selectUserInternal();
		ImplicitWait(100);
		waitTime(1300);

		// Save the User by clicking on AddUser button
		objSignUp.saveAddUser();
		ImplicitWait(100);
		waitTime(1300);

		// Close the Add user sidebar
		objSignUp.closeAddUserSidebar();
		ImplicitWait(100);
		waitTime(5000);
		refreshPage();

	}
}
