package logicalView;

import org.testng.Assert;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.objectVerifyDomain;

public class VerifyDomain extends ApplicationUtility {

	// Initialize the object domain page
	objectVerifyDomain objDomain = new objectVerifyDomain(driver);

	public void VerifyValidDomain() {

		waitTime(1500);

		// Enter the Domain Name
		objDomain.enterDomain(BaseClass.getValueFromPropertyFile("Domain.properties", "nameOfDomain"));
		waitTime(3500);

		// Submit the Domain Name field with valid value
		objDomain.verifyDomainButton();
		waitTime(6000);

		// ImplicitWait(10);
		String verifyLoginTitle = driver.getTitle();
		String expectedLoginTitle = BaseClass.getValueFromPropertyFile("Domain.properties",
				"verifyDomainSubmissionSuccess");
		try {
			Assert.assertEquals(verifyLoginTitle, expectedLoginTitle);
			logger.info("Domain submission: Passed");
		} catch (Throwable e) {
			logger.error("Domain submission: Failed" + e);
			this.takeScreenShot(
					System.getProperty("user.dir") + "/src/test/resources/ErrorScreenshots/DomainSubmissionError1.jpg");
		}
	}

}
