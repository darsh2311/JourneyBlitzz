package logicalView;

import java.util.List;

import org.openqa.selenium.WebElement;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectSignIn;

public class SignIn extends ApplicationUtility {

	ObjectSignIn objSignIn = new ObjectSignIn(driver);

	public void validSignIn() {

		// Enter valid Email id or User Id to Sign in
		objSignIn.enterEmailId(BaseClass.getValueFromPropertyFile("Signin.properties", "validEmail"));

		// Enter Password to Sign in
		objSignIn.enterPassword(BaseClass.getValueFromPropertyFile("Signin.properties", "validPassword"));
		waitTime(1000);

		// Submit the Sign In credentials to Sign In
		objSignIn.clickSignIn();
		waitTime(10000);
		List<WebElement> verifySignIn = objSignIn.signInVerification;
		if (verifySignIn.size() != 0) {
			logger.info("SignIn is successful: Passed");
		} else {
			logger.error("SignIn is not successful: Failed");
		}

	}

	public void inValidSignInwithBlankEmailPassword() {

		driver.navigate().refresh();
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

	public void inValidSignInwithBlankEmail() {

		driver.navigate().refresh();
		// Keep blank value for Email
		waitTime(500);

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

	public void inValidSignInwithBlankPassword() {

		driver.navigate().refresh();
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

	public void signInwithInvalidEmailPassword() {

		driver.navigate().refresh();
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
		driver.navigate().refresh();
	}

}
