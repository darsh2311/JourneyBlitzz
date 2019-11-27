package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.ModuleTabs;
import logicalView.SignInwithValidData;
import logicalView.Signout;
import logicalView.VerifyDomain;
import logicalView.CreateGroupScripts.InvalidGroupScripts.CreateNewGroupwithBlankValues;
import logicalView.CreateGroupScripts.InvalidGroupScripts.CreateNewGroupwithInvalidValues;
import logicalView.CreateGroupScripts.InvalidGroupScripts.CreateNewGroupwithoutAddingParticipant;

public class TC_CreateGroupwithInValidData extends ApplicationUtility {

	SignInwithValidData mSignIn;
	VerifyDomain mVerifyDomain;
	Signout mSignOut;
	ModuleTabs mModuleTabs;
	CreateNewGroupwithBlankValues mCreateNewGroupwithBlankValues;
	CreateNewGroupwithInvalidValues mCreateNewGroupwithInvalidValues;
	CreateNewGroupwithoutAddingParticipant mCreateNewGroupwithoutAddingParticipant;

	@BeforeTest
	public void beforeTest() {

		openBrowser();
		mSignIn = new SignInwithValidData();
		mVerifyDomain = new VerifyDomain();
		mSignOut = new Signout();
		mModuleTabs = new ModuleTabs();
		mCreateNewGroupwithBlankValues = new CreateNewGroupwithBlankValues();
		mCreateNewGroupwithInvalidValues = new CreateNewGroupwithInvalidValues();
		mCreateNewGroupwithoutAddingParticipant = new CreateNewGroupwithoutAddingParticipant();
	}

	@Test(priority = 1)
	public void TC_SignIN() {

		mVerifyDomain.VerifyValidDomain();
		mSignIn.validSignIn();
	}

	@Test(priority = 2)
	public void TC_CreateGroupwithBlankData() {
		mModuleTabs.clickGroupTab();

		mCreateNewGroupwithBlankValues.NewGroupwithBlankValues();

	}

	@Test(priority = 3)
	public void TC_CreateGroupwithInValidValues() {

		mCreateNewGroupwithInvalidValues.CreateNewGroupwithInValidData();
	}

	@Test(priority = 4)
	public void TC_CreateGroupwithoutAddingParticipants() {

		mCreateNewGroupwithoutAddingParticipant.CreateNewGroupwithoutParticipant();

	}

	@Test(priority = 5)
	public void TC_SignOut() {

		mSignOut.SignOut();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
