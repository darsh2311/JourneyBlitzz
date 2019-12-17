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
import logicalView.DocumentScripts.NewDocumentUploadwithBlankValues;
import logicalView.DocumentScripts.NewDocumentUploadwithInvalidValue;

public class TC_UploadDocumentswithInvalidData extends ApplicationUtility {

	SignInwithValidData mSignIn;
	VerifyDomain mVerifyDomain;
	Signout mSignOut;
	NewDocument mNewDocument;
	ModuleTabs mModuleTabs;
	NewDocumentUploadwithInvalidValue mNewDocumentUploadwithInvalidValue;
	NewDocumentUploadwithBlankValues mNewDocumentUploadwithBlankValues;

	@BeforeTest
	public void beforeTest() {

		openBrowser();
		mSignIn = new SignInwithValidData();
		mVerifyDomain = new VerifyDomain();
		mSignOut = new Signout();
		mNewDocument = new NewDocument();
		mModuleTabs = new ModuleTabs();
		mNewDocumentUploadwithInvalidValue = new NewDocumentUploadwithInvalidValue();
		mNewDocumentUploadwithBlankValues = new NewDocumentUploadwithBlankValues();
	}

	@Test(priority = 1, enabled = true)
	public void TC_ValidDomainSubmission() {

		mVerifyDomain.VerifyValidDomain();
	}

	@Test(priority = 2, enabled = true)
	public void TC_SignIn() {

		mSignIn.validSignIn();
	}

	@Test(priority = 4, enabled = true)
	public void TC_UploadDocumentwithBlankValue() {
		mModuleTabs.clickModuleTab("Documents");
		mNewDocumentUploadwithBlankValues.uploadNewDocument();
	}

	@Test(priority = 5, enabled = true)
	public void TC_UploadDocumentwithInvalidValue() {
		mNewDocumentUploadwithInvalidValue.uploadNewDocument();
	}

	@Test(priority = 6, enabled = true)
	public void TC_SignOut() {

		mSignOut.SignOut();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
