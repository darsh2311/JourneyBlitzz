package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.NeedHelp;

public class TC_NeedHelp extends ApplicationUtility {

	@BeforeTest
	public void beforeTest() {
		ApplicationUtility.openBrowser();
	}

	@Test(priority = 1)
	public void TC_Need_Help() {

		NeedHelp.VerifyNeedHelpPopup();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
