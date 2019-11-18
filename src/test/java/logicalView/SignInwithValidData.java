package logicalView;

import java.util.List;

import org.openqa.selenium.WebElement;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectSignIn;

public class SignInwithValidData extends ApplicationUtility {

	ObjectSignIn objSignIn = new ObjectSignIn(driver);

	public void validSignIn() {

		// Enter valid Email id or User Id to Sign in
		objSignIn.enterEmailId(BaseClass.getValueFromPropertyFile("Signin.properties", "validEmail"));

		// Enter Password to Sign in
		objSignIn.enterPassword(BaseClass.getValueFromPropertyFile("Signin.properties", "validPassword"));
		waitTime(1000);

		// Submit the Sign In credentials to Sign In
		objSignIn.clickSignIn();
		waitTime(2000);
		List<WebElement> verifySignIn = objSignIn.signInVerification;
		if (verifySignIn.size() != 0) {
			logger.info("SignIn is successful: Passed");
		} else {
			logger.error("SignIn is not successful: Failed");
		}
		waitTime(1000);

	}

}
