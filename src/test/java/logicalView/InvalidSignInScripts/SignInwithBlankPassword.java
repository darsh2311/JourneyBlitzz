package logicalView.InvalidSignInScripts;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectSignIn;

public class SignInwithBlankPassword extends ApplicationUtility {

	ObjectSignIn objSignIn = new ObjectSignIn(driver);

	public void inValidSignInwithBlankPassword() {

		refreshPage();
		waitTime(500);

		// Enter valid Email id or User Id to Sign in
		objSignIn.enterEmailId(BaseClass.getValueFromPropertyFile("Signin.properties", "validEmail"));
		waitTime(1000);

		// Keep blank value for Password

		// Submit the Sign In credentials to Sign In
		objSignIn.clickSignIn();
		String invalidErrPasswordMessage = objSignIn.invalidPasswordMessage.getText();
		waitTime(2000);

		if (invalidErrPasswordMessage
				.equalsIgnoreCase(BaseClass.getValueFromPropertyFile("Signin.properties", "InvalidPasswordMessage"))) {
			logger.info("Blank Password submission is not allowed: Passed");
		} else {
			logger.error("Blank Password submission is not allowed: Failed");
		}
	}

}
