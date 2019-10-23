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

public class TC_SignUpInvitewithUserIdwithoutPassword extends ApplicationUtility {
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

	public void TC_SignUpwithUserIdwithoutPassword() {

		mVerifyDomain.VerifyValidDomain();
		mSignIn.validSignIn();
		mSignUp.addUser();
		mSignUp.userIdSignUpwithoutPassword();
		mSignOut.SignOut();
		mSignINwithSignUP.VerifySignUpDomainwithUserId(mSignUp.userId);
		mSignINwithSignUP.signUpDetails();
		mSignOut.SignOut();

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}