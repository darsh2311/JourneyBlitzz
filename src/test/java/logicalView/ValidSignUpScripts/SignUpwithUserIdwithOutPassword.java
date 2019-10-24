package logicalView.ValidSignUpScripts;

import commonFunctions.ApplicationUtility;
import testObjects.ObjectSignUp;

public class SignUpwithUserIdwithOutPassword extends ApplicationUtility {

	public ObjectSignUp objSignUp = new ObjectSignUp(driver);
	public String userId = "User" + (int) (Math.random() * 199999);

	public void userIdSignUpwithoutPassword() {

		waitTime(150);
		// Click on Add user
		objSignUp.clickAddButton();
		ImplicitWait(100);

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
