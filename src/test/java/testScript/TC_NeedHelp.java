package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.NeedHelp;

public class TC_NeedHelp extends ApplicationUtility {
	NeedHelp mNeedHelp;

	@BeforeTest
	public void beforeTest() {
		openBrowser();
		mNeedHelp = new NeedHelp();
	}

	@Test(priority = 1)
	public void TC_Need_Help() {

		mNeedHelp.VerifyNeedHelpPopup();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
