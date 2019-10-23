package logicalView;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.objectForgotPassword;

public class ForgotPassword extends ApplicationUtility {

	objectForgotPassword objForgotPassword = new objectForgotPassword(driver);

	public void validForgotPassword() {

		// Click Forgot Password Button
		objForgotPassword.clickForgotPassword();
		waitTime(1000);

		// Enter Forgot Password email
		objForgotPassword.enterForgotPassword(
				BaseClass.getValueFromPropertyFile("Signin.properties", "validForgotPasswordEmail"));

		// Click on send to submit for Reset password
		objForgotPassword.sendForgotPasswordButton();
		waitTime(1000);

		String forgotSuccessMessage = objForgotPassword.successMessageforgotPassword.getText();
		if (forgotSuccessMessage.equalsIgnoreCase(
				BaseClass.getValueFromPropertyFile("Signin.properties", "validForgotPasswordSuccessMessage"))) {
			logger.info("Forgot Password's reset link sent: Passed");
		} else {
			logger.error("Forgot Password's reset link sent: Failed");
		}

		// Click on done button to close popup
		objForgotPassword.donePasswordButton();
		waitTime(1000);

	}

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

	public void inValidForgotPasswordwithNotRegisteredEmail() {

		waitTime(500);
		// Click Forgot Password Button
		objForgotPassword.clickForgotPassword();
		waitTime(1000);

		// Enter Forgot Password email
		objForgotPassword
				.enterForgotPassword(BaseClass.getValueFromPropertyFile("Signin.properties", "NotregisteredEmail"));

		// Click send button of Forgot Password
		objForgotPassword.sendForgotPasswordButton();
		waitTime(1000);

		String forgotErrorMessageInvalidEmail = objForgotPassword.notRegisteredforgotPassword.getText();
		if (forgotErrorMessageInvalidEmail.equalsIgnoreCase(
				BaseClass.getValueFromPropertyFile("Signin.properties", "NotregisteredEmailSubmissionErrorMessage"))) {
			logger.info("Forgot Password blank Email Submission not allowed: Passed");
		} else {
			logger.error("Forgot Password blank Email Submission not allowed: Failed");
		}
		waitTime(1000);
		// Click on close button of Forgot Password
		objForgotPassword.closeButtonForgotPassword();
		waitTime(500);

	}

}
