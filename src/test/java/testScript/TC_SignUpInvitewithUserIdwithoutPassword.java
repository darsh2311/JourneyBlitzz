package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.SignInwithValidData;
import logicalView.Signout;
import logicalView.VerifyDomain;
import logicalView.InvalidSignUPScripts.AddUserSignUp;
import logicalView.ValidSignUpScripts.SignUPVerifyEmail;
import logicalView.ValidSignUpScripts.SignUpwithUserIdwithOutPassword;

public class TC_SignUpInvitewithUserIdwithoutPassword extends ApplicationUtility {

	SignUpwithUserIdwithOutPassword mSignUpwithUserIdwithOutPassword;
	VerifyDomain mVerifyDomain;
	SignInwithValidData mSignIn;
	Signout mSignOut;
	Signout mSignOut1;
	AddUserSignUp mAddUserSignUp;
	SignUPVerifyEmail mSignUPVerifyEmail;

	@BeforeTest
	public void beforeTest() {

		openBrowser();
		mSignUpwithUserIdwithOutPassword = new SignUpwithUserIdwithOutPassword();
		mVerifyDomain = new VerifyDomain();
		mSignIn = new SignInwithValidData();
		mSignOut = new Signout();
		mSignOut1 = new Signout();
		mAddUserSignUp = new AddUserSignUp();
		mSignUPVerifyEmail = new SignUPVerifyEmail();

	}

	@Test(priority = 1, enabled = true)
	public void SignInforSignUp() {

		mVerifyDomain.VerifyValidDomain();
		mSignIn.validSignIn();
		mAddUserSignUp.addUser();
	}

	@Test(priority = 2, enabled = true)
	public void TC_SignUpwithUserIdwithoutPassword() {

		mSignUpwithUserIdwithOutPassword.userIdSignUpwithoutPassword();
	}

	@Test(priority = 3, enabled = true)
	public void TC_SignInafterRegister() {
		mSignOut.SignOut();
		mVerifyDomain.VerifyValidDomain();
		mSignUPVerifyEmail.VerifySignUpDomainwithEmail(mSignUpwithUserIdwithOutPassword.userId);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
