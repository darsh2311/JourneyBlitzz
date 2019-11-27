package logicalView.ValidSignUpScripts;

import commonFunctions.ApplicationUtility;
import testObjects.ObjectSignUp;

public class SignUpwithEmailIdwithOutPassword extends ApplicationUtility {

	public ObjectSignUp objSignUp = new ObjectSignUp(driver);
	public String email = "testingpurpose" + (int) (Math.random() * 199999) + "@gmail.com";

	public void emailSignUpwithoutPassword() {

		waitTime(150);
		// Click on Add user
		objSignUp.clickAddButton();
		waitTime(1300);

		// Select SignUp type
		objSignUp.clickByEmailTab();
		waitTime(1300);

		// Enter the email id
		objSignUp.enterEmailID(email);
		waitTime(1300);

		// Select the User Type
		objSignUp.clickUserType();
		objSignUp.selectUserInternal();
		waitTime(3500);

		// Save the User by clicking on AddUser button
		objSignUp.saveAddUser();
		waitTime(10000);

		// Close the Add user sidebar
		objSignUp.closeAddUserSidebar();
		waitTime(5000);
		refreshPage();

	}

}
