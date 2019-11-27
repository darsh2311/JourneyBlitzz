package logicalView.InvalidSignUpVerifyScripts;

import org.openqa.selenium.support.PageFactory;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectSignUpCopy;

public class SignUpVerifywithInvalidUserId extends ApplicationUtility {

	ObjectSignUpCopy objSignUp = PageFactory.initElements(driver, ObjectSignUpCopy.class);

	public void invalidVerifyUserId() {

		waitTime(300);
		// Enter invalid UserId
		objSignUp.enterVerifyEmail(BaseClass.getValueFromPropertyFile("signUp.properties", "invalidUserIdVerify"));
		ImplicitWait(10);

		// Click on Verify email button
		objSignUp.clickverifyEmail();
		waitTime(1200);

		String VerifyInvalidEmailErrorMessage = objSignUp.invalidVerifyEmailErrorMessage.getText();

		if (VerifyInvalidEmailErrorMessage.equalsIgnoreCase(
				BaseClass.getValueFromPropertyFile("signUp.properties", "invalidVerifyEmailErrorMessage"))) {
			logger.info("Invalid UserID Verification not allowed: Passed");
		} else {
			logger.error("Invalid UserID Verification not allowed: Failed");
		}

		// To Close the Error Message
		objSignUp.errorMessageCloseButton();
	}

}
