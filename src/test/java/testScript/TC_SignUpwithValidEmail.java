package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.SignInwithValidData;
import logicalView.Signout;
import logicalView.VerifyDomain;
import logicalView.ValidSignUpScripts.SignUpwithEmailId;
import logicalView.ValidSignUpScripts.ValidSignInwithSignUp;

public class TC_SignUpwithValidEmail extends ApplicationUtility {

	SignUpwithEmailId mSignUpwithEmailId;
	VerifyDomain mVerifyDomain;
	SignInwithValidData mSignIn;
	ValidSignInwithSignUp mValidSignInwithSignUp;
	Signout mSignOut;

	@BeforeTest
	public void beforeTest() {

		openBrowser();
		mSignUpwithEmailId = new SignUpwithEmailId();
		mVerifyDomain = new VerifyDomain();
		mSignIn = new SignInwithValidData();
		mValidSignInwithSignUp = new ValidSignInwithSignUp();
		mSignOut = new Signout();

	}

	@Test(priority = 1, enabled = true)
	public void SignInforSignUp() {

		mVerifyDomain.VerifyValidDomain();
		mSignIn.validSignIn();
	}

	@Test(priority = 2, enabled = true)
	public void TC_SignUpwithEmailandPassword() {
		mSignUpwithEmailId.signUpAdminwithEmail();
	}

	@Test(priority = 3, enabled = true)
	public void TC_SignInafterRegister() {

		mSignOut.SignOut();
		mVerifyDomain.VerifyValidDomain();
		mValidSignInwithSignUp.validSignInwithSignup(mSignUpwithEmailId.email);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
