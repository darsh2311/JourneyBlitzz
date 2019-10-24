package logicalView.InvalidForgotPasswordScripts;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.objectForgotPassword;

public class ForgotPasswordwithBlankEmail extends ApplicationUtility {

	objectForgotPassword objForgotPassword = new objectForgotPassword(driver);

	public void inValidForgotPasswordwithBlankEmail() {

		waitTime(500);
		// Click Forgot Password Button
		objForgotPassword.clickForgotPassword();
		waitTime(500);

		// Click send button of Forgot Password with blank email
		objForgotPassword.sendForgotPasswordButton();
		waitTime(1000);

		String forgotErrorMessageBlankEmail = objForgotPassword.invalidMessageforgotPassword.getText();
		if (forgotErrorMessageBlankEmail.equalsIgnoreCase(
				BaseClass.getValueFromPropertyFile("Signin.properties", "InvalidEmailSubmissionErrorMessage"))) {
			logger.info("Forgot Password blank Email Submission not allowed: Passed");
		} else {
			logger.error("Forgot Password blank Email Submission not allowed: Failed");
		}
		waitTime(1000);
		// Click on close button of Forgot Password
		objForgotPassword.closeButtonForgotPassword();
	}

}
