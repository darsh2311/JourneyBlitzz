package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.SignIn;
import logicalView.Signout;
import logicalView.VerifyDomain;

public class TC_LoginwithValidData extends ApplicationUtility {

	@BeforeTest
	public void beforeTest() {

		openBrowser();
	}

	@Test(priority = 1, enabled = true)
	public void TC_ValidDomainSubmission() {

		VerifyDomain.VerifyValidDomain();
	}

	@Test(priority = 2, enabled = true, dependsOnMethods = "TC_ValidDomainSubmission")
	public void TC_SignIn() {

		SignIn.validSignIn();
	}

	@Test(priority = 3, enabled = true, dependsOnMethods = "TC_SignIn")
	public void TC_SignOut() {

		Signout.SignOut();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
