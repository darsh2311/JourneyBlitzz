package logicalView.InvalidSignUpVerifyScripts;

import org.openqa.selenium.support.PageFactory;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectSignUpCopy;

public class SignUpVerifywithNotRegisteredUserId extends ApplicationUtility {

	ObjectSignUpCopy objSignUp = PageFactory.initElements(driver, ObjectSignUpCopy.class);

	public void notRegisteredVerifyUserId() {

		waitTime(3000);
		// Enter Not registered or added UserId
		objSignUp
				.enterVerifyEmail(BaseClass.getValueFromPropertyFile("signUp.properties", "notRegisteredUserIdVerify"));
		ImplicitWait(10);

		// Click on Verify UserID button
		objSignUp.clickverifyEmail();
		waitTime(1200);

		String VerifyInvalidEmailErrorMessage = objSignUp.invalidVerifyEmailErrorMessage.getText();

		if (VerifyInvalidEmailErrorMessage.equalsIgnoreCase(
				BaseClass.getValueFromPropertyFile("signUp.properties", "invalidVerifyEmailErrorMessage"))) {
			logger.info("Not Registered UserID Verification not allowed: Passed");
		} else {
			logger.error("Not Registered UserID Verification not allowed: Failed");
		}

		// To Close the Error Message
		objSignUp.errorMessageCloseButton();
		waitTime(1900);

		objSignUp.backToLoginIcon();
	}

}
