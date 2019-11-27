package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.ModuleTabs;
import logicalView.SignInwithValidData;
import logicalView.Signout;
import logicalView.VerifyDomain;
import logicalView.CreateGroupScripts.CreateInquiryThroughGroup;
import logicalView.CreateGroupScripts.CreateNewGroup;

public class TC_CreateGroupwithValidData extends ApplicationUtility {

	SignInwithValidData mSignIn;
	VerifyDomain mVerifyDomain;
	Signout mSignOut;
	CreateNewGroup mCreateNewGroup;
	ModuleTabs mModuleTabs;
	CreateInquiryThroughGroup mCreateInquiryThroughGroup;

	@BeforeTest
	public void beforeTest() {

		openBrowser();
		mSignIn = new SignInwithValidData();
		mVerifyDomain = new VerifyDomain();
		mSignOut = new Signout();
		mCreateNewGroup = new CreateNewGroup();
		mModuleTabs = new ModuleTabs();
		mCreateInquiryThroughGroup = new CreateInquiryThroughGroup();

	}

	@Test(priority = 1)
	public void TC_SignIN() {

		mVerifyDomain.VerifyValidDomain();
		mSignIn.validSignIn();
	}

	@Test(priority = 2)
	public void TC_CreateGroupwithValidValues() {
		mModuleTabs.clickGroupTab();
		mCreateNewGroup.CreateNewGroupwithValidData();
	}

	@Test(priority = 3)
	public void TC_SignOut() {

		mSignOut.SignOut();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
