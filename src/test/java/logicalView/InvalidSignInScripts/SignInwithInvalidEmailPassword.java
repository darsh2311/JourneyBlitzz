package logicalView.InvalidSignInScripts;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectSignIn;

public class SignInwithInvalidEmailPassword extends ApplicationUtility {

	ObjectSignIn objSignIn = new ObjectSignIn(driver);

	public void signInwithInvalidEmailPassword() {

		refreshPage();
		waitTime(500);

		// Enter valid Email id or User Id to Sign in
		objSignIn.enterEmailId(BaseClass.getValueFromPropertyFile("Signin.properties", "InvalidEmail"));
		waitTime(1000);

		// Enter Password to Sign in
		objSignIn.enterPassword(BaseClass.getValueFromPropertyFile("Signin.properties", "InvalidPassword"));
		waitTime(1000);

		// Submit the Sign In credentials to Sign In
		objSignIn.clickSignIn();
		String invalidErrEmailPasswordMessage = objSignIn.invalidEmailPasswordMessage.getText();
		waitTime(2000);

		if (invalidErrEmailPasswordMessage.equalsIgnoreCase(
				BaseClass.getValueFromPropertyFile("Signin.properties", "InvalidEmailandPasswordMessage"))) {
			logger.info("Invalid Email and Password submission is not allowed: Passed");
		} else {
			logger.error("Invalid Email and Password submission is not allowed: Failed");
		}
		waitTime(2000);
	}

}
