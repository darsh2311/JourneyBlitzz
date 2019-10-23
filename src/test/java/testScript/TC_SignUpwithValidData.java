package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.SignINwithSignUP;
import logicalView.SignIn;
import logicalView.SignUp;
import logicalView.Signout;
import logicalView.VerifyDomain;

public class TC_SignUpwithValidData extends ApplicationUtility {
	SignIn mSignIn;
	VerifyDomain mVerifyDomain;
	Signout mSignOut;
	SignUp mSignUp;
	SignINwithSignUP mSignINwithSignUP;

	@BeforeTest
	public void beforeTest() {

		openBrowser();
		mSignIn = new SignIn();
		mVerifyDomain = new VerifyDomain();
		mSignOut = new Signout();
		mSignUp = new SignUp();
		mSignINwithSignUP = new SignINwithSignUP();

	}

	@Test(priority = 1, enabled = true)
	public void TC_SignUpwithEmailandPassword() {

		mVerifyDomain.VerifyValidDomain();
		mSignIn.validSignIn();
		mSignUp.addUser();
		mSignUp.signUpAdminwithEmail();
		mSignOut.SignOut();
		mVerifyDomain.VerifyValidDomain();
		mSignINwithSignUP.validSignInwithSignup(mSignUp.email);
		mSignOut.SignOut();
	}

	@Test(priority = 2, enabled = true)
	public void TC_SignUpwithUserIdandPassword() {

		mVerifyDomain.VerifyValidDomain();
		mSignIn.validSignIn();
		mSignUp.addUser();
		mSignUp.signUpAdminwithUserId();
		mSignOut.SignOut();
		mVerifyDomain.VerifyValidDomain();
		mSignINwithSignUP.validSignInwithSignup(mSignUp.userId);
		mSignOut.SignOut();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
