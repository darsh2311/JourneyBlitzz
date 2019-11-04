package testScript;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.NewInquirywithContactandGroup;
import logicalView.SignInwithValidData;
import logicalView.Signout;
import logicalView.VerifyDomain;

public class TC_NewInquirywithBothContactsGroups extends ApplicationUtility {

	SignInwithValidData mSignIn;
	VerifyDomain mVerifyDomain;
	Signout mSignOut;
	NewInquirywithContactandGroup mNewInquirywithBothContactsGroup;

	@BeforeTest
	public void beforeTest() {

		openBrowser();
		mSignIn = new SignInwithValidData();
		mVerifyDomain = new VerifyDomain();
		mSignOut = new Signout();
		mNewInquirywithBothContactsGroup = new NewInquirywithContactandGroup();
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
	public void TC_NI() {

		mNewInquirywithBothContactsGroup.createNewInquiryboth();
	}

	/*
	 * @AfterTest public void afterTest() { driver.quit(); }
	 */

}
