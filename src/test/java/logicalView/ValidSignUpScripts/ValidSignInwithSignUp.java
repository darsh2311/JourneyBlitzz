package logicalView.ValidSignUpScripts;

import java.util.List;

import org.openqa.selenium.WebElement;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectSignIn;

public class ValidSignInwithSignUp extends ApplicationUtility {
	ObjectSignIn objSignIn = new ObjectSignIn(driver);

	public void validSignInwithSignup(String inputValue) {

		// Enter valid Email id or User Id to Sign in
		objSignIn.enterEmailId(inputValue);

		// Enter Password to Sign in
		objSignIn.enterPassword(BaseClass.getValueFromPropertyFile("signUp.properties", "userPassword"));
		waitTime(5000);

		// Submit the Sign In credentials to Sign In
		objSignIn.clickSignIn();
		waitTime(20000);
		List<WebElement> verifySignIn = objSignIn.signInVerification;
		if (verifySignIn.size() != 0) {
			logger.info("SignIn for SignUp is successful: Passed");
		} else {
			logger.error("SignIn for SignUp is not successful: Failed");
		}

	}
}
