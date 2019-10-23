package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.SignIn;
import logicalView.SignUpwithInvalidData;
import logicalView.VerifyDomain;

public class TC_SignUpwithINValidData extends ApplicationUtility {
	VerifyDomain mVerifyDomain;
	SignIn mSignIn;
	SignUpwithInvalidData mSignUpwithInvalidData;

	@BeforeTest
	public void beforeTest() {

		openBrowser();
		mVerifyDomain = new VerifyDomain();
		mSignIn = new SignIn();
		mSignUpwithInvalidData = new SignUpwithInvalidData();

	}

	@Test(priority = 1, enabled = true)

	public void TC_SignUpwithInvalidData() {
		mVerifyDomain.VerifyValidDomain();
		mSignIn.validSignIn();
		mSignUpwithInvalidData.addUser();
		mSignUpwithInvalidData.invalidEmailSubmit();
		mSignUpwithInvalidData.checkBlankEmailSubmit();
		mSignUpwithInvalidData.invalidUserIDSubmit();
		mSignUpwithInvalidData.checkBlankUserIdSubmit();

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
