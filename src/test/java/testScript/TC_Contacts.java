package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.Contacts;
import logicalView.ModuleTabs;
import logicalView.SignInwithValidData;
import logicalView.Signout;
import logicalView.VerifyDomain;

public class TC_Contacts extends ApplicationUtility {

	SignInwithValidData mSignIn;
	VerifyDomain mVerifyDomain;
	Signout mSignOut;
	Contacts mContacts;
	ModuleTabs mModuleTabs;

	@BeforeTest
	public void beforeTest() {
		openBrowser();
		mSignIn = new SignInwithValidData();
		mVerifyDomain = new VerifyDomain();
		mSignOut = new Signout();
		mContacts = new Contacts();
		mModuleTabs = new ModuleTabs();
	}

	@Test(priority = 1)
	public void TC_ValidDomainSubmission() {

		mVerifyDomain.VerifyValidDomain();
	}

	@Test(priority = 2)
	public void TC_SignIn() {

		mSignIn.validSignIn();
	}

	@Test(priority = 3)
	public void TC_Contactswith1to1Inquiry() {
		mModuleTabs.clickContactsTab();
		mContacts.checkContactswith1to1Inquiry();
	}

	@Test(priority = 4)
	public void TC_ContactswithCreateInquiry() {
		mContacts.checkContactswithNewInquiry();
	}

	@Test(priority = 5)
	public void TC_ContactsINGroupswithCreateInquiry() {
		mModuleTabs.clickContactsTab();
		mContacts.checkGroupswithNewInquiry();
	}

	@Test(priority = 6)
	public void TC_SignOut() {

		mSignOut.SignOut();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
