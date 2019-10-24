package logicalView.InvalidSignInScripts;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectSignIn;

public class SignInwithBlankEmailPassword extends ApplicationUtility {

	ObjectSignIn objSignIn = new ObjectSignIn(driver);

	public void inValidSignInwithBlankEmailPassword() {

		// Submit blank value for SignIn
		waitTime(500);
		objSignIn.clickSignIn();
		waitTime(1000);
		String invalidErrEmailMessage = objSignIn.invalidEmailMessage.getText();
		String invalidErrPasswordMessage = objSignIn.invalidPasswordMessage.getText();

		if (invalidErrEmailMessage
				.equalsIgnoreCase(BaseClass.getValueFromPropertyFile("Signin.properties", "InvalidEmailMessage"))
				&& invalidErrPasswordMessage.equalsIgnoreCase(
						BaseClass.getValueFromPropertyFile("Signin.properties", "InvalidPasswordMessage"))) {

			logger.info("Blank Email and Password submission is not allowed: Passed");
		} else {
			logger.error("Blank Email and Password submission is not allowed: Failed");
		}
	}

}
