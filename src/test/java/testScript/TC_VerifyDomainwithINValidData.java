package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.VerifyDomainwithInvalidData;

public class TC_VerifyDomainwithINValidData extends ApplicationUtility {

	VerifyDomainwithInvalidData mVerifyDomainwithInvalidData;

	@BeforeTest
	public void beforeTest() {
		openBrowser();
		mVerifyDomainwithInvalidData = new VerifyDomainwithInvalidData();
	}

	@Test
	public void TC_InvalidDomainSubmission() {

		mVerifyDomainwithInvalidData.VerifyInValidDomain();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
