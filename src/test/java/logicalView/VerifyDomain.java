package logicalView;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.objectVerifyDomain;

public class VerifyDomain extends ApplicationUtility {

	// Initialise the object domain page
	objectVerifyDomain objDomain = new objectVerifyDomain(driver);

	public void VerifyValidDomain() {

		waitTime(1000);
		// Enter the Domain Name
		ImplicitWait(100);
		objDomain.enterDomain(BaseClass.getValueFromPropertyFile("Domain.properties", "nameOfDomain"));
		// Submit the Domain Name field with valid value
		objDomain.verifyDomainButton();
		waitTime(1200);
		String verifyLoginTitle = driver.getTitle();
		if (verifyLoginTitle.equalsIgnoreCase(
				BaseClass.getValueFromPropertyFile("Domain.properties", "verifyDomainSubmissionSuccess"))) {
			logger.info("Domain submission: Passed");
		} else {
			logger.error("Domain submission: Failed");
		}
		waitTime(700);
	}

}
