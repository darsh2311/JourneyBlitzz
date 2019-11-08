package logicalView.InvalidSignInScripts;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectSignIn;

public class InvalidSignInRestriction extends ApplicationUtility {

	ObjectSignIn objSignIn = new ObjectSignIn(driver);

	public void signInwithInvalidPasswordRestriction() {
		refreshPage();
		waitTime(500);

		// Enter valid Email id or User Id to Sign in
		objSignIn.enterEmailId(BaseClass.getValueFromPropertyFile("Signin.properties", "restrictUser"));
		waitTime(1000);

		// Enter Password to Sign in
		objSignIn.enterPassword(BaseClass.getValueFromPropertyFile("Signin.properties", "restrictPassword"));
		waitTime(1000);

		for (int i = 1; i <= 5; i++) {
			// Submit the Sign In credentials to Sign In
			objSignIn.clickSignIn();
			waitTime(2000);
		}

		String invalidErrEmailPasswordMessage = objSignIn.invalidEmailPasswordMessage.getText();
		waitTime(2000);

		if (invalidErrEmailPasswordMessage
				.equalsIgnoreCase(BaseClass.getValueFromPropertyFile("Signin.properties", "invalidattempts"))) {
			logger.info("Valid Email and Invalid Password submission for more than 4 attempts not allowed: Passed");
		} else {
			logger.error("Valid Email and Invalid Password submission for more than 4 attempts not allowed: Failed");
		}
		waitTime(2000);
	}

}
