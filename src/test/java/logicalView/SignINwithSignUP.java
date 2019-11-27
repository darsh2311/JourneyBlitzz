package logicalView;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectSignIn;
import testObjects.ObjectSignUp;
import testObjects.objectVerifyDomain;

public class SignINwithSignUP extends ApplicationUtility {

	ObjectSignIn objSignIn = new ObjectSignIn(driver);
	objectVerifyDomain objDomain = new objectVerifyDomain(driver);
	ObjectSignUp objSignUp = new ObjectSignUp(driver);

	public void validSignInwithSignup(String Email) {

		// Enter valid Email id or User Id to Sign in
		objSignIn.enterEmailId(Email);

		// Enter Password to Sign in
		objSignIn.enterPassword(BaseClass.getValueFromPropertyFile("signUp.properties", "userPassword"));
		waitTime(1000);

		// Submit the Sign In credentials to Sign In
		objSignIn.clickSignIn();
		waitTime(10000);
		List<WebElement> verifySignIn = objSignIn.signInVerification;
		if (verifySignIn.size() != 0) {
			logger.info("SignIn for SignUp is successful: Passed");
		} else {
			logger.error("SignIn for SignUp is not successful: Failed");
		}

	}

	public void VerifySignUpDomainwithEmail(String verifyEmail) {

		// Enter the Domain Name
		objDomain.enterDomain(BaseClass.getValueFromPropertyFile("Domain.properties", "nameOfDomain"));
		ImplicitWait(100);

		// Submit the Domain Name field with valid value
		objDomain.verifyDomainButton();
		ImplicitWait(100);
		waitTime(1500);

		// Click on SignUp link on SignIn page
		objSignUp.clickSignUpLink();
		ImplicitWait(100);
		waitTime(2300);

		// Enter already created User's Email to verify
		objSignUp.enterVerifyEmail(verifyEmail);
		ImplicitWait(100);

		// Click on Verify button
		objSignUp.clickverifyEmail();
		waitTime(100);

	}

	public void VerifySignUpDomainwithUserId(String verifyUserId) {

		// Enter the Domain Name
		objDomain.enterDomain(BaseClass.getValueFromPropertyFile("Domain.properties", "nameOfDomain"));
		ImplicitWait(100);

		// Submit the Domain Name field with valid value
		objDomain.verifyDomainButton();
		ImplicitWait(100);
		waitTime(1500);

		// Click on SignUp link on SignIn page
		objSignUp.clickSignUpLink();
		ImplicitWait(100);
		waitTime(2300);

		// Enter already created User's Email to verify
		objSignUp.enterVerifyEmail(verifyUserId);
		ImplicitWait(100);

		// Click on Verify button
		objSignUp.clickverifyEmail();
		waitTime(100);

		// Upload the profile Photo
		objSignUp.uploadPhoto();
		waitTime(100);
	}

	public void signUpDetails() {

		// Upload the profile Photo
		objSignUp.uploadPhoto();
		waitTime(100);

		// Enter FirstName
		objSignUp.enterVerifiedFirstname(BaseClass.getValueFromPropertyFile("signUp.properties", "VerifiedFirstname"));

		// Enter LastName
		objSignUp.enterverifylastname(BaseClass.getValueFromPropertyFile("signUp.properties", "verifylastname"));

		// Enter Jobrole
		objSignUp.enterJobRole(BaseClass.getValueFromPropertyFile("signUp.properties", "JobRole"));

		// Enter New Password
		objSignUp.addVerifyPassword(BaseClass.getValueFromPropertyFile("signUp.properties", "verifyPassword"));

		// Enter Confirm Password
		objSignUp.addVerifyConfirmPassword(
				BaseClass.getValueFromPropertyFile("signUp.properties", "verifyConfirmPassword"));

		// Enter Country Code
		objSignUp.addCountryCode(BaseClass.getValueFromPropertyFile("signUp.properties", "verifyCountryCode"));

		// Enter Mobile Number
		objSignUp.addmobileNumber(BaseClass.getValueFromPropertyFile("signUp.properties", "verifyMobileNumber"));

		// Check Terms and conditions
		objSignUp.checkTermsConditions();
		waitTime(2300);

		// Scroll to the SignUp button as it is not visible
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", objSignUp.clickSignUp);

		// Click on Signup button
		objSignUp.clickSignUp();
		waitFluent();
	}
}
