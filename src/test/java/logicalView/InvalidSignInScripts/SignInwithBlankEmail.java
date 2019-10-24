package logicalView.InvalidSignInScripts;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectSignIn;

public class SignInwithBlankEmail extends ApplicationUtility {

	ObjectSignIn objSignIn = new ObjectSignIn(driver);

	public void inValidSignInwithBlankEmail() {

		// Keep blank value for Email
		waitTime(1000);

		// Enter Password to Sign in
		objSignIn.enterPassword(BaseClass.getValueFromPropertyFile("Signin.properties", "validPassword"));
		waitTime(1000);

		// Submit the Sign In credentials to Sign In
		objSignIn.clickSignIn();
		String invalidErrEmailMessage = objSignIn.invalidEmailMessage.getText();
		waitTime(2000);

		if (invalidErrEmailMessage
				.equalsIgnoreCase(BaseClass.getValueFromPropertyFile("Signin.properties", "InvalidEmailMessage"))) {
			logger.info("Blank Email submission is not allowed: Passed");
		} else {
			logger.error("Blank Email submission is not allowed: Failed");
		}
	}

}
