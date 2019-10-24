package logicalView.InvalidSignUpVerifyScripts;

import org.openqa.selenium.support.PageFactory;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectSignUpCopy;

public class SignUpVerifywithInvalidEmail extends ApplicationUtility {

	ObjectSignUpCopy objSignUp = PageFactory.initElements(driver, ObjectSignUpCopy.class);

	public void invalidVerifyEmail() {

		waitTime(300);
		// Enter invalid Email Id
		objSignUp.enterVerifyEmail(BaseClass.getValueFromPropertyFile("signUp.properties", "invalidEmailVerify"));
		ImplicitWait(100);
		waitTime(700);

		// Click on Verify email button
		objSignUp.clickverifyEmail();
		waitTime(1200);

		String VerifyInvalidEmailErrorMessage = objSignUp.invalidVerifyEmailErrorMessage.getText();

		if (VerifyInvalidEmailErrorMessage.equalsIgnoreCase(
				BaseClass.getValueFromPropertyFile("signUp.properties", "invalidVerifyEmailErrorMessage"))) {
			logger.info("Invalid Email Verification not allowed: Passed");
		} else {
			logger.error("Invalid Email Verification not allowed: Failed");
		}

		// To Close the Error Message
		objSignUp.errorMessageDismissButton();
	}

}
