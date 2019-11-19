package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.ModuleTabs;
import logicalView.SignInwithValidData;
import logicalView.Signout;
import logicalView.VerifyDomain;
import logicalView.ShowMeScripts.CreateShowMeSessionwithEmail;
import logicalView.ShowMeScripts.CreateShowMeSessionwithSMS;
import logicalView.ShowMeScripts.CreateShowMeSessionwithWhatsApp;
import logicalView.ShowMeScripts.SessionHistoryInternalFunctionalities;

public class TC_Showme extends ApplicationUtility {
	CreateShowMeSessionwithSMS mCreateShowMeSessionwithSMS;
	CreateShowMeSessionwithWhatsApp mCreateShowMeSessionwithWhatsApp;
	CreateShowMeSessionwithEmail mCreateShowMeSessionwithEmail;
	SessionHistoryInternalFunctionalities mSessionHistoryInternalFunctionalities;
	SignInwithValidData mSignIn;
	VerifyDomain mVerifyDomain;
	ModuleTabs mModuleTabs;
	Signout mSignOut;

	@BeforeTest
	public void beforeTest() {
		openBrowser();
		mCreateShowMeSessionwithSMS = new CreateShowMeSessionwithSMS();
		mCreateShowMeSessionwithWhatsApp = new CreateShowMeSessionwithWhatsApp();
		mCreateShowMeSessionwithEmail = new CreateShowMeSessionwithEmail();
		mSessionHistoryInternalFunctionalities = new SessionHistoryInternalFunctionalities();
		mSignIn = new SignInwithValidData();
		mVerifyDomain = new VerifyDomain();
		mModuleTabs = new ModuleTabs();
		mSignOut = new Signout();

	}

	@Test(priority = 1, enabled = true)
	public void TC_ValidDomainSubmission() {

		mVerifyDomain.VerifyValidDomain();
	}

	@Test(priority = 2, enabled = true)
	public void TC_SignIn() {

		mSignIn.validSignIn();
		mModuleTabs.clickShowMETab();
	}

	@Test(priority = 3)
	public void TC_CreateSessionwithSMS() {

		mCreateShowMeSessionwithSMS.createSessionwithSMS();
	}

	@Test(priority = 4)
	public void TC_CreateSessionwithWhatsApp() {

		mCreateShowMeSessionwithWhatsApp.createSessionwithWhatsApp();
	}

	@Test(priority = 5)
	public void TC_CreateSessionwithEmail() {

		mCreateShowMeSessionwithEmail.createSessionwithEmail();
	}

	@Test(priority = 6)
	public void TC_CopySessionCode() {

		mSessionHistoryInternalFunctionalities.copySessionCode();
	}

	@Test(priority = 7)
	public void TC_CopyGuestURL() {

		mSessionHistoryInternalFunctionalities.copyGuestUrl();
	}

	@Test(priority = 8)
	public void TC_JoinCall() {
		mSessionHistoryInternalFunctionalities.clickJoinSessionCall();
	}

	@Test(priority = 9)
	public void TC_InviteEllipsisOption() {

		mSessionHistoryInternalFunctionalities.verifyInviteEllipsisOption();
	}

	@Test(priority = 10)
	public void TC_CopySessionUrlEllipsisOptio() {

		mSessionHistoryInternalFunctionalities.CopySessionUrlEllipsisOption();
	}

	@Test(priority = 11)
	public void TC_EndSessionEllipsisOption() {

		mSessionHistoryInternalFunctionalities.EndSessionEllipsisOption();
	}

	@Test(priority = 12)
	public void TC_DeleteSessionEllipsisOptio() {

		mSessionHistoryInternalFunctionalities.DeleteSessionEllipsisOption();
	}

	@Test(priority = 13)
	public void TC_SignOut() {

		mSignOut.SignOut();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
