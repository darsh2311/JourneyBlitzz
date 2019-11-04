package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.SignInwithValidData;
import logicalView.Signout;
import logicalView.VerifyDomain;
import logicalView.InvalidNewInquiryScripts.NewInquirywithBlankValues;
import logicalView.InvalidNewInquiryScripts.NewInquirywithInvalidValues;

public class TC_NewInquirywithInvalidData extends ApplicationUtility {

	SignInwithValidData mSignIn;
	VerifyDomain mVerifyDomain;
	Signout mSignOut;
	NewInquirywithBlankValues mNewInquirywithInvalidData;
	NewInquirywithInvalidValues mNewInquirywithInvalidValues;

	@BeforeTest
	public void beforeTest() {

		openBrowser();
		mSignIn = new SignInwithValidData();
		mVerifyDomain = new VerifyDomain();
		mSignOut = new Signout();
		mNewInquirywithInvalidData = new NewInquirywithBlankValues();
		mNewInquirywithInvalidValues = new NewInquirywithInvalidValues();
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
	public void TC_CreateNewInquirywithBlankValues() {

		mNewInquirywithInvalidData.createNewInquiry();

	}

	@Test(priority = 4, enabled = true, dependsOnMethods = "TC_SignIn")
	public void TC_CreateNewInquirywithInvalidValues() {

		mNewInquirywithInvalidValues.createNewInquiry();

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
