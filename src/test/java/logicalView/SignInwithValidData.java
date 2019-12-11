package logicalView;

import java.util.List;

import org.openqa.selenium.WebElement;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectSignIn;

public class SignInwithValidData extends ApplicationUtility {

	ObjectSignIn objSignIn = new ObjectSignIn(driver);

	public void validSignIn() {
		ImplicitWait(3);

		// Enter valid Email id or User Id to Sign in
		objSignIn.enterEmailId(BaseClass.getValueFromPropertyFile("Signin.properties", "validEmail"));

		// Enter Password to Sign in
		objSignIn.enterPassword(BaseClass.getValueFromPropertyFile("Signin.properties", "validPassword"));
		waitTime(4000);

		// Submit the Sign In credentials to Sign In
		objSignIn.clickSignIn();
		waitTime(10000);
		List<WebElement> verifySignIn = objSignIn.signInVerification;
		if (verifySignIn.size() != 0) {
			logger.info("SignIn is successful: Passed");
			logger.info(driver.getTitle());
			logger.info(driver.getCurrentUrl());
		} else {
			logger.error("SignIn is not successful: Failed");
			logger.info(driver.getTitle());
		}

	}

}
