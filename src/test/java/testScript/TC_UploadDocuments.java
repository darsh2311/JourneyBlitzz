package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.ModuleTabs;
import logicalView.NewDocument;
import logicalView.SignInwithValidData;
import logicalView.Signout;
import logicalView.VerifyDomain;

public class TC_UploadDocuments extends ApplicationUtility {

	SignInwithValidData mSignIn;
	VerifyDomain mVerifyDomain;
	Signout mSignOut;
	NewDocument mNewDocument;
	ModuleTabs mModuleTabs;

	@BeforeTest
	public void beforeTest() {

		openBrowser();
		mSignIn = new SignInwithValidData();
		mVerifyDomain = new VerifyDomain();
		mSignOut = new Signout();
		mNewDocument = new NewDocument();
		mModuleTabs = new ModuleTabs();
	}

	@Test(priority = 1, enabled = true)
	public void TC_ValidDomainSubmission() {

		mVerifyDomain.VerifyValidDomain();
	}

	@Test(priority = 2, enabled = true)
	public void TC_SignIn() {

		mSignIn.validSignIn();
	}

	@Test(priority = 3, enabled = true)
	public void TC_UploadDocument() {
		mModuleTabs.clickModuleTab("Documents");
		mNewDocument.uploadNewDocument();
	}

	@Test(priority = 4, enabled = true)
	public void TC_SignOut() {

		mSignOut.SignOut();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
