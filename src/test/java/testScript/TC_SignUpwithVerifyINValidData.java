package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.SignInwithValidData;
import logicalView.VerifyDomain;
import logicalView.InvalidSignUpVerifyScripts.SignUpVerifywithBlankEmailUserId;
import logicalView.InvalidSignUpVerifyScripts.SignUpVerifywithInvalidEmail;
import logicalView.InvalidSignUpVerifyScripts.SignUpVerifywithInvalidUserId;
import logicalView.InvalidSignUpVerifyScripts.SignUpVerifywithNotRegisteredEmail;
import logicalView.InvalidSignUpVerifyScripts.SignUpVerifywithNotRegisteredUserId;

public class TC_SignUpwithVerifyINValidData extends ApplicationUtility {
	VerifyDomain mVerifyDomain;
	SignInwithValidData mSignIn;
	SignUpVerifywithBlankEmailUserId mSignUpVerifywithBlankEmailUserId;
	SignUpVerifywithInvalidEmail mSignUpVerifywithInvalidEmail;
	SignUpVerifywithNotRegisteredEmail mSignUpVerifywithNotRegisteredEmail;
	SignUpVerifywithInvalidUserId mSignUpVerifywithInvalidUserId;
	SignUpVerifywithNotRegisteredUserId mSignUpVerifywithNotRegisteredUserId;

	@BeforeTest
	public void beforeTest() {

		openBrowser();
		mVerifyDomain = new VerifyDomain();
		mSignIn = new SignInwithValidData();
		mSignUpVerifywithBlankEmailUserId = new SignUpVerifywithBlankEmailUserId();
		mSignUpVerifywithInvalidEmail = new SignUpVerifywithInvalidEmail();
		mSignUpVerifywithNotRegisteredEmail = new SignUpVerifywithNotRegisteredEmail();
		mSignUpVerifywithInvalidUserId = new SignUpVerifywithInvalidUserId();
		mSignUpVerifywithNotRegisteredUserId = new SignUpVerifywithNotRegisteredUserId();
	}

	@Test(priority = 1, enabled = true)
	public void TC_VerifyBlankVerifyEmailUserid() {

		mVerifyDomain.VerifyValidDomain();
		mSignUpVerifywithBlankEmailUserId.blankVerifyEmailUserid();

	}

	@Test(priority = 2, enabled = true)
	public void TC_VerifyInvalidVerifyEmail() {

		mSignUpVerifywithInvalidEmail.invalidVerifyEmail();

	}

	@Test(priority = 3, enabled = true)
	public void TC_VerifyNotRegisteredVerifyEmail() {

		mSignUpVerifywithNotRegisteredEmail.notRegisteredVerifyEmail();

	}

	@Test(priority = 4, enabled = true)
	public void TC_VerifyInvalidVerifyUserId() {

		mSignUpVerifywithInvalidUserId.invalidVerifyUserId();

	}

	@Test(priority = 5, enabled = true)
	public void TC_VerifyNotRegisteredVerifyUserId() {

		mSignUpVerifywithNotRegisteredUserId.notRegisteredVerifyUserId();

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
