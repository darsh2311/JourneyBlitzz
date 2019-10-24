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
		ImplicitWait(100);

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

}
