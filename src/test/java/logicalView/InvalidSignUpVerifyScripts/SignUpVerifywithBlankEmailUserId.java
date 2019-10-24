package logicalView.InvalidSignUpVerifyScripts;

import org.openqa.selenium.support.PageFactory;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectSignUpCopy;

public class SignUpVerifywithBlankEmailUserId extends ApplicationUtility {

	ObjectSignUpCopy objSignUp = PageFactory.initElements(driver, ObjectSignUpCopy.class);

	// Verify Email/Userid Invite SignUp
	public void blankVerifyEmailUserid() {

		waitTime(300);
		// Click on SignUp link from the login page
		objSignUp.clickSignUpLink();
		waitTime(1200);

		// Keep the Email/userId textbox blank
		waitTime(500);

		// Click on Verify email button
		objSignUp.clickverifyEmail();
		waitTime(1000);

		String VerifyEmailErrorMessage = objSignUp.blankVerifyEmailErrorMessage.getText();

		if (VerifyEmailErrorMessage.equalsIgnoreCase(
				BaseClass.getValueFromPropertyFile("signUp.properties", "blankVerifyEmailErrorMessage"))) {
			logger.info("Blank Email/UserId Verification not allowed: Passed");
		} else {
			logger.error("Blank Email/UserId Verification not allowed: Failed");
		}
	}

}
