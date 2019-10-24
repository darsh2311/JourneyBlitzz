package logicalView.InvalidForgotPasswordScripts;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.objectForgotPassword;

public class ForgotPasswordwithInvalidEmail extends ApplicationUtility {

	objectForgotPassword objForgotPassword = new objectForgotPassword(driver);

	public void inValidForgotPasswordwithInvalidEmail() {

		waitTime(500);
		// Click Forgot Password Button
		objForgotPassword.clickForgotPassword();
		waitTime(1000);

		// Enter Forgot Password email
		objForgotPassword.enterForgotPassword(
				BaseClass.getValueFromPropertyFile("Signin.properties", "InvalidForgotPasswordEmail"));

		// Click send button of Forgot Password
		objForgotPassword.sendForgotPasswordButton();
		waitTime(1000);

		String forgotErrorMessageInvalidEmail = objForgotPassword.invalidEmailMessageforgotPassword.getText();
		if (forgotErrorMessageInvalidEmail.equalsIgnoreCase(
				BaseClass.getValueFromPropertyFile("Signin.properties", "InvalidEmailSubmissionErrorMessage"))) {
			logger.info("Forgot Password Invalid Email Submission not allowed: Passed");
		} else {
			logger.error("Forgot Password Invalid Email Submission not allowed: Failed");
		}
		waitTime(1000);
		// Click on close button of Forgot Password
		objForgotPassword.closeButtonForgotPassword();
	}

}
