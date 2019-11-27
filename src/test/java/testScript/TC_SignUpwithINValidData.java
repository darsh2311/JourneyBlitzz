package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.SignInwithValidData;
import logicalView.Signout;
import logicalView.VerifyDomain;
import logicalView.InvalidSignUPScripts.AddUserSignUp;
import logicalView.InvalidSignUPScripts.SignUpwithBlankEmailIdInvalidData;
import logicalView.InvalidSignUPScripts.SignUpwithBlankUserIdInvalidData;
import logicalView.InvalidSignUPScripts.SignUpwithEmailIdInvalidData;
import logicalView.InvalidSignUPScripts.SignUpwithUserIdInvalidData;

public class TC_SignUpwithINValidData extends ApplicationUtility {

	VerifyDomain mVerifyDomain;
	SignUpwithBlankEmailIdInvalidData mSignUpwithBlankEmailIdInvalidData;
	SignUpwithBlankUserIdInvalidData mSignUpwithBlankUserIdInvalidData;
	SignUpwithEmailIdInvalidData mSignUpwithEmailIdInvalidData;
	SignUpwithUserIdInvalidData mSignUpwithUserIdInvalidData;
	AddUserSignUp maddUserSignUp;
	SignInwithValidData mSignIn;
	Signout mSignOut;

	@BeforeTest
	public void beforeTest() {

		openBrowser();
		mVerifyDomain = new VerifyDomain();
		mSignUpwithBlankEmailIdInvalidData = new SignUpwithBlankEmailIdInvalidData();
		mSignUpwithBlankUserIdInvalidData = new SignUpwithBlankUserIdInvalidData();
		mSignUpwithEmailIdInvalidData = new SignUpwithEmailIdInvalidData();
		mSignUpwithUserIdInvalidData = new SignUpwithUserIdInvalidData();
		maddUserSignUp = new AddUserSignUp();
		mSignIn = new SignInwithValidData();
		mSignOut = new Signout();
	}

	@Test(priority = 1, enabled = true)
	public void AddUserSignUp() {

		mVerifyDomain.VerifyValidDomain();
		mSignIn.validSignIn();
		maddUserSignUp.addUser();
	}

	@Test(priority = 2, enabled = true)
	public void TC_SignUpwithBlankEmailIdInvalidData() {
		mSignUpwithBlankEmailIdInvalidData.checkBlankEmailSubmit();
	}

	@Test(priority = 3, enabled = true)
	public void TC_SignUpwithBlankUserIdInvalidData() {
		mSignUpwithBlankUserIdInvalidData.checkBlankUserIdSubmit();
	}

	@Test(priority = 4, enabled = false)
	public void TC_SignUpwithEmailIdInvalidData() {
		mSignUpwithEmailIdInvalidData.invalidEmailSubmit();
	}

	@Test(priority = 5, enabled = true)
	public void TC_SignUpwithUserIdInvalidData() {
		mSignUpwithUserIdInvalidData.invalidUserIDSubmit();
	}

	@Test(priority = 6, enabled = true)
	public void TC_SignOut() {

		mSignOut.SignOut();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
