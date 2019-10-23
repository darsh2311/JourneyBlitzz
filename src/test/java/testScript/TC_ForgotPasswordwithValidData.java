package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.ForgotPassword;
import logicalView.VerifyDomain;

public class TC_ForgotPasswordwithValidData extends ApplicationUtility {

	VerifyDomain mVerifyDomain;
	ForgotPassword mForgotPassword;

	@BeforeTest
	public void beforeTest() {

		openBrowser();
		mVerifyDomain = new VerifyDomain();
		mForgotPassword = new ForgotPassword();
	}

	@Test(priority = 1, enabled = true)
	public void TC_ValidDomainSubmission() {

		mVerifyDomain.VerifyValidDomain();
	}

	@Test(priority = 2, enabled = true, dependsOnMethods = "TC_ValidDomainSubmission")
	public void TC_ForgotPassword() {

		mForgotPassword.validForgotPassword();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
