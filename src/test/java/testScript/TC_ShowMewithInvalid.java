package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.ModuleTabs;
import logicalView.SignInwithValidData;
import logicalView.Signout;
import logicalView.VerifyDomain;
import logicalView.ShowMeScripts.InvalidShowMeScripts.InvalidCreateSessionReference;
import logicalView.ShowMeScripts.InvalidShowMeScripts.InvalidInviteEmail;
import logicalView.ShowMeScripts.InvalidShowMeScripts.InvalidInvitePhoneNumberOrMessage;

public class TC_ShowMewithInvalid extends ApplicationUtility {

	SignInwithValidData mSignIn;
	VerifyDomain mVerifyDomain;
	InvalidCreateSessionReference mInvalidCreateSessionReference;
	InvalidInviteEmail mInvalidInviteEmail;
	InvalidInvitePhoneNumberOrMessage mInvalidInvitePhoneNumberOrMessage;
	ModuleTabs mModuleTabs;
	Signout mSignOut;

	@BeforeTest
	public void beforeTest() {
		openBrowser();
		mSignIn = new SignInwithValidData();
		mVerifyDomain = new VerifyDomain();
		mInvalidCreateSessionReference = new InvalidCreateSessionReference();
		mInvalidInviteEmail = new InvalidInviteEmail();
		mInvalidInvitePhoneNumberOrMessage = new InvalidInvitePhoneNumberOrMessage();
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

	@Test(priority = 3, enabled = true)
	public void TC_InvalidCreateSessionReference() {
		mInvalidCreateSessionReference.invalidSessionReference();
	}

	@Test(priority = 4, enabled = true)
	public void TC_InvalidInvitewithBlankEmail() {
		mInvalidInviteEmail.createSessionwithInvalidBlankEmail();
	}

	@Test(priority = 5, enabled = true)
	public void TC_InvalidInvitewithEmailasOnlyAlphabet() {
		mInvalidInviteEmail.createSessionwithInvalidEmailwithOnlyAlphabet();
	}

	@Test(priority = 6, enabled = true)
	public void TC_InvalidInvitewithEmailasOnlyNumeric() {
		mInvalidInviteEmail.createSessionwithInvalidEmailwithOnlyNumeric();
	}

	@Test(priority = 7, enabled = true)
	public void TC_InvalidInvitewithEmailasOnlyAlphaNumeric() {
		mInvalidInviteEmail.createSessionwithInvalidEmailwithOnlyAlphaNumeric();
	}

	@Test(priority = 8, enabled = true)
	public void TC_InvalidInvitewithInvalidEmail() {
		mInvalidInviteEmail.createSessionwithInvalidEmail();
	}

	@Test(priority = 9, enabled = true)
	public void TC_InvalidInvitewithBlankPhoneNumber() {
		mInvalidInvitePhoneNumberOrMessage.InvalidInviteBlankPhoneNumber();
	}

	@Test(priority = 10, enabled = true)
	public void TC_InvalidInvitewithLessDigitPhoneNumber() {
		mInvalidInvitePhoneNumberOrMessage.invalidInvitewithLessDigitPhoneNumber();
	}

	@Test(priority = 11, enabled = true)
	public void TC_InvalidInvitewithMoreDigitPhoneNumber() {
		mInvalidInvitePhoneNumberOrMessage.invalidInvitewithMoreDigitPhoneNumber();
	}

	@Test(priority = 12, enabled = true)
	public void TC_InvalidInvitewithInvalidPhoneNumber() {
		mInvalidInvitePhoneNumberOrMessage.invalidInvitewithMoreDigitPhoneNumber();
	}

	@Test(priority = 13, enabled = true)
	public void TC_InvalidInvitewithBlankMessage() {
		mInvalidInvitePhoneNumberOrMessage.invalidInvitewithBlankMessage();
	}

	@Test(priority = 14, enabled = true)
	public void TC_InvalidInvitewithInvalidMessageandNumber() {
		mInvalidInvitePhoneNumberOrMessage.invalidInvitewithInvalidNumberandMessage();
	}

	@Test(priority = 15)
	public void TC_SignOut() {

		mSignOut.SignOut();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
