package logicalView.InvalidSignUPScripts;

import commonFunctions.ApplicationUtility;
import testObjects.ObjectSignUpCopy;

public class AddUserSignUp extends ApplicationUtility {

	ObjectSignUpCopy objSignUp = new ObjectSignUpCopy(driver);

	public void addUser() {

		// Click on Setting Button
		objSignUp.clickSettings();
		ImplicitWait(100);

		// Click on User Management
		objSignUp.clickUserManagement();
		ImplicitWait(100);

	}

}
