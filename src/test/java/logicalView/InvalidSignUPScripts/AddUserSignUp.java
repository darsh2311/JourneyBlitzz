package logicalView.InvalidSignUPScripts;

import org.openqa.selenium.support.PageFactory;

import commonFunctions.ApplicationUtility;
import testObjects.ObjectSignUpCopy;

public class AddUserSignUp extends ApplicationUtility {

	ObjectSignUpCopy objSignUp = PageFactory.initElements(driver, ObjectSignUpCopy.class);

	public void addUser() {

		// Click on Setting Button
		objSignUp.clickSettings();
		ImplicitWait(100);

		// Click on User Management
		objSignUp.clickUserManagement();
		ImplicitWait(100);

	}

}
