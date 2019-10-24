package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.SignInwithValidData;
import logicalView.Signout;
import logicalView.VerifyDomain;
import logicalView.ValidSignUpScripts.SignUpwithUserId;
import logicalView.ValidSignUpScripts.ValidSignInwithSignUp;

public class TC_SignUpwithValidUserId extends ApplicationUtility {

	SignUpwithUserId mSignUpwithUserId;
	VerifyDomain mVerifyDomain;
	SignInwithValidData mSignIn;
	ValidSignInwithSignUp mValidSignInwithSignUp;
	Signout mSignOut;

	@BeforeTest
	public void beforeTest() {

		openBrowser();
		mSignUpwithUserId = new SignUpwithUserId();
		mVerifyDomain = new VerifyDomain();
		mValidSignInwithSignUp = new ValidSignInwithSignUp();
		mSignIn = new SignInwithValidData();
		mSignOut = new Signout();

	}

	@Test(priority = 1, enabled = true)
	public void SignInforSignUp() {

		mVerifyDomain.VerifyValidDomain();
		mSignIn.validSignIn();
	}

	@Test(priority = 2, enabled = true)
	public void TC_SignUpwithEmailandPassword() {
		mSignUpwithUserId.signUpAdminwithUserId();
	}

	@Test(priority = 3, enabled = true)
	public void TC_SignInafterRegister() {

		mSignOut.SignOut();
		mVerifyDomain.VerifyValidDomain();
		mValidSignInwithSignUp.validSignInwithSignup(mSignUpwithUserId.userId);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
