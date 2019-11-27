package logicalView.InvalidSignUPScripts;

import commonFunctions.ApplicationUtility;
import testObjects.ObjectSignUpCopy;

public class AddUserSignUp extends ApplicationUtility {

	ObjectSignUpCopy objSignUp = new ObjectSignUpCopy(driver);

	public void addUser() {

		// Click on Setting Button
		objSignUp.clickSettings();
		waitTime(10000);

		// Click on User Management
		objSignUp.clickUserManagement();
		waitTime(5000);

	}

}
