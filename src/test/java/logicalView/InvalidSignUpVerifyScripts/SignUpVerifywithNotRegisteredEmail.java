package logicalView.InvalidSignUpVerifyScripts;

import org.openqa.selenium.support.PageFactory;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectSignUpCopy;

public class SignUpVerifywithNotRegisteredEmail extends ApplicationUtility {

	ObjectSignUpCopy objSignUp = PageFactory.initElements(driver, ObjectSignUpCopy.class);

	public void notRegisteredVerifyEmail() {

		waitTime(300);
		// Enter Not registered or added Email Id
		objSignUp.enterVerifyEmail(BaseClass.getValueFromPropertyFile("signUp.properties", "notRegisteredEmailVerify"));
		ImplicitWait(10);
		waitTime(700);

		// Click on Verify email button
		objSignUp.clickverifyEmail();
		waitTime(1200);

		String VerifyInvalidEmailErrorMessage = objSignUp.invalidVerifyEmailErrorMessage.getText();

		if (VerifyInvalidEmailErrorMessage.equalsIgnoreCase(
				BaseClass.getValueFromPropertyFile("signUp.properties", "invalidVerifyEmailErrorMessage"))) {
			logger.info("Not Registered Email Verification not allowed: Passed");
		} else {
			logger.error("Not Registered Email Verification not allowed: Failed");
		}

		// To Close the Error Message
		objSignUp.errorMessageDismissButton();
	}

}
