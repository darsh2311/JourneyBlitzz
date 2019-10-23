package logicalView;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.objectVerifyDomain;

public class VerifyDomain extends ApplicationUtility {

	// Initialise the object domain page
	objectVerifyDomain objDomain = new objectVerifyDomain(driver);

	public void VerifyValidDomain() {

		waitTime(1200);
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

	public void VerifyInValidDomain() {

		waitTime(1000);
		// Submit the Domain Name field with Blank value
		objDomain.verifyDomainButton();
		waitTime(2000);
		String BlankDomainName = objDomain.BlankDomainName.getText();
		if (BlankDomainName.equalsIgnoreCase(
				BaseClass.getValueFromPropertyFile("Domain.properties", "blankDomainSubmitErrorMessage"))) {
			logger.info("Blank Domain submission is not allowed: Passed");
		} else {
			logger.error("Blank Domain submission is not allowed: Failed");
		}
		ImplicitWait(100);

		// Submit the Domain Name which is not registered
		objDomain.enterDomain(BaseClass.getValueFromPropertyFile("Domain.properties", "notRegisteredDomain"));
		objDomain.verifyDomainButton();
		waitTime(1000);
		String notRegisteredMessage = objDomain.InvalidDomainName.getText();
		if (notRegisteredMessage.equalsIgnoreCase(
				BaseClass.getValueFromPropertyFile("Domain.properties", "notRegisteredDomainErrorMessage"))) {
			logger.info("Not registered user is not allowed: Passed");
		} else {
			logger.error("Not registered user is not allowed: Failed");
		}
		objDomain.clickCompanyPopupDismiss();
		waitTime(1000);

	}
}
