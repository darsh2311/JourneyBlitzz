package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.SignIn;
import logicalView.VerifyDomain;

public class TC_LoginwithINValidData extends ApplicationUtility {

	@BeforeTest
	public void beforeTest() {

		openBrowser();
	}

	@Test(priority = 1, enabled = true)
	public void TC_ValidDomainSubmission() {

		VerifyDomain.VerifyValidDomain();
	}

	@Test(priority = 2, enabled = true, dependsOnMethods = "TC_ValidDomainSubmission")
	public void TC_InvalidSignin() {

		SignIn.inValidSignInwithBlankEmail();
		SignIn.inValidSignInwithBlankEmailPassword();
		SignIn.inValidSignInwithBlankPassword();
		SignIn.signInwithInvalidEmailPassword();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
