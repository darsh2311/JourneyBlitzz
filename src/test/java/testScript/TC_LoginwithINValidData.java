package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.SignIn;
import logicalView.VerifyDomain;

public class TC_LoginwithINValidData extends ApplicationUtility {
	SignIn mSignIn;
	VerifyDomain mVerifyDomain;

	@BeforeTest
	public void beforeTest() {

		openBrowser();
		mSignIn = new SignIn();
		mVerifyDomain = new VerifyDomain();
	}

	@Test(priority = 1, enabled = true)
	public void TC_ValidDomainSubmission() {

		mVerifyDomain.VerifyValidDomain();
	}

	@Test(priority = 2, enabled = true, dependsOnMethods = "TC_ValidDomainSubmission")
	public void TC_InvalidSignin() {

		mSignIn.inValidSignInwithBlankEmail();
		mSignIn.inValidSignInwithBlankEmailPassword();
		mSignIn.inValidSignInwithBlankPassword();
		mSignIn.signInwithInvalidEmailPassword();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
