package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.SignIn;
import logicalView.SignUpwithInvalidData;
import logicalView.VerifyDomain;

public class TC_SignUpwithINValidData extends ApplicationUtility {

	@BeforeTest
	public void beforeTest() {

		ApplicationUtility.openBrowser();
	}

	@Test(priority = 1, enabled = true)
	public void TC_VerifyInviteSignUpInvalidData() {

		VerifyDomain.VerifyValidDomain();
		SignUpwithInvalidData.blankVerifyEmailUserid();
		SignUpwithInvalidData.invalidVerifyEmail();
		SignUpwithInvalidData.notRegisteredVerifyEmail();
		SignUpwithInvalidData.invalidVerifyUserId();
		SignUpwithInvalidData.notRegisteredVerifyUserId();

	}

	@Test(priority = 2, enabled = true)
	public void TC_SignUpwithInvalidData() {

		SignIn.validSignIn();
		SignUpwithInvalidData.addUser();
		SignUpwithInvalidData.checkBlankEmailSubmit();
		SignUpwithInvalidData.invalidEmailSubmit();
		SignUpwithInvalidData.checkBlankUserIdSubmit();
		SignUpwithInvalidData.invalidUserIDSubmit();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
