package logicalView;

import java.util.ArrayList;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.objectNeedHelp;

public class NeedHelp extends ApplicationUtility {

	public void VerifyNeedHelpPopup() {

		waitTime(1000);
		// Initialise the object domain page
		objectNeedHelp objNeedHelp = new objectNeedHelp(driver);

		// Verify the Need help functionality
		objNeedHelp.clickNeedHelp();
		waitTime(2000);
		String needHelpText = objNeedHelp.linkNeedHelpDescription.getText();

		// Verify the Need help functionality title
		if (needHelpText.equalsIgnoreCase(BaseClass.getValueFromPropertyFile("Domain.properties", "verifyNeedHelp"))) {
			logger.info("Need help valid popup opened: Passed");
		} else {
			logger.error("Need help valid popup opened: Failed");
		}

		// To close the Need help popup
		objNeedHelp.clickNeedHelpPopupClose();
		waitTime(1000);
		// Click on Need help
		objNeedHelp.clickNeedHelp();
		waitTime(1000);

		// Click on Submit a Ticket page
		objNeedHelp.clickSubmitTicket();
		ImplicitWait(10);
		waitTime(1000);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		waitTime(1500);
		String titleSubmitTicket = driver.getTitle();
		if (titleSubmitTicket
				.equalsIgnoreCase(BaseClass.getValueFromPropertyFile("Domain.properties", "verifySubmitTicketTitle"))) {
			logger.info("Need help valid Submit Ticket Page opened: Passed");
		} else {
			logger.error("Need help valid Submit Ticket Page opened: Failed");
		}
		waitTime(1500);
		driver.close();
		driver.switchTo().window(tabs2.get(0));
		waitTime(1000);

		// Click on Need help
		objNeedHelp.clickNeedHelp();
		waitTime(1000);

		// Click on Submit a Ticket page
		objNeedHelp.clicknetworkTestButton();
		waitTime(1000);
		ArrayList<String> tabs23 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs23.get(1));
		String titleNetworkTest = driver.getTitle();
		if (titleNetworkTest
				.equalsIgnoreCase(BaseClass.getValueFromPropertyFile("Domain.properties", "verifyNetworkTitle"))) {
			logger.info("Need help valid Network Test Page opened: Passed");
		} else {
			logger.error("Need help valid Network Test Page opened: Failed");
		}
		waitTime(1500);
		driver.close();

		driver.switchTo().window(tabs23.get(0));
		waitTime(1000);
	}
}
