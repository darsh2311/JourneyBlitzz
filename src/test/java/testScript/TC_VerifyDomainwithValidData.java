package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.VerifyDomain;

public class TC_VerifyDomainwithValidData extends ApplicationUtility {

	VerifyDomain mVerifyDomain;

	@BeforeTest
	public void beforeTest() {
		openBrowser();
		mVerifyDomain = new VerifyDomain();
	}

	@Test
	public void TC_ValidDomainSubmission() {

		mVerifyDomain.VerifyValidDomain();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();

	}

}
