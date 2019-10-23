package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.SignIn;
import logicalView.Signout;
import logicalView.VerifyDomain;

public class TC_LoginwithValidData extends ApplicationUtility {
	SignIn mSignIn;
	VerifyDomain mVerifyDomain;
	Signout mSignOut;

	@BeforeTest
	public void beforeTest() {

		openBrowser();
		mSignIn = new SignIn();
		mVerifyDomain = new VerifyDomain();
		mSignOut = new Signout();
	}

	@Test(priority = 1, enabled = true)
	public void TC_ValidDomainSubmission() {

		mVerifyDomain.VerifyValidDomain();
	}

	@Test(priority = 2, enabled = true, dependsOnMethods = "TC_ValidDomainSubmission")
	public void TC_SignIn() {

		mSignIn.validSignIn();
	}

	@Test(priority = 3, enabled = true, dependsOnMethods = "TC_SignIn")
	public void TC_SignOut() {

		mSignOut.SignOut();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
