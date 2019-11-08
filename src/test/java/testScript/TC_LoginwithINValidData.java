package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.VerifyDomain;
import logicalView.InvalidSignInScripts.InvalidSignInRestriction;
import logicalView.InvalidSignInScripts.SignInwithBlankEmail;
import logicalView.InvalidSignInScripts.SignInwithBlankEmailPassword;
import logicalView.InvalidSignInScripts.SignInwithBlankPassword;
import logicalView.InvalidSignInScripts.SignInwithInvalidEmailPassword;

public class TC_LoginwithINValidData extends ApplicationUtility {

	VerifyDomain mVerifyDomain;
	SignInwithBlankEmail mSignInwithBlankEmail;
	SignInwithBlankEmailPassword mSignInwithBlankEmailPassword;
	SignInwithBlankPassword mSignInwithBlankPassword;
	SignInwithInvalidEmailPassword mSignInwithInvalidEmailPassword;
	InvalidSignInRestriction mInvalidSignInRestriction;

	@BeforeTest
	public void beforeTest() {

		openBrowser();
		mSignInwithBlankEmail = new SignInwithBlankEmail();
		mSignInwithBlankEmailPassword = new SignInwithBlankEmailPassword();
		mSignInwithBlankPassword = new SignInwithBlankPassword();
		mSignInwithInvalidEmailPassword = new SignInwithInvalidEmailPassword();
		mVerifyDomain = new VerifyDomain();
		mInvalidSignInRestriction = new InvalidSignInRestriction();

	}

	@Test(priority = 1, enabled = true)
	public void TC_ValidDomainSubmission() {

		mVerifyDomain.VerifyValidDomain();
	}

	@Test(priority = 2, enabled = true, dependsOnMethods = "TC_ValidDomainSubmission")
	public void TC_InValidSignInwithBlankEmailPassword() {

		mSignInwithBlankEmailPassword.inValidSignInwithBlankEmailPassword();

	}

	@Test(priority = 3, enabled = true, dependsOnMethods = "TC_InValidSignInwithBlankEmailPassword")
	public void TC_InValidSignInwithBlankEmail() {

		mSignInwithBlankEmail.inValidSignInwithBlankEmail();

	}

	@Test(priority = 4, enabled = true, dependsOnMethods = "TC_InValidSignInwithBlankEmail")
	public void TC_InValidSignInwithBlankPassword() {

		mSignInwithBlankPassword.inValidSignInwithBlankPassword();
	}

	@Test(priority = 5, enabled = true, dependsOnMethods = "TC_InValidSignInwithBlankPassword")
	public void TC_InvalidsignInwithInvalidEmailPassword() {

		mSignInwithInvalidEmailPassword.signInwithInvalidEmailPassword();
	}

	@Test(priority = 6, enabled = false, dependsOnMethods = "TC_InvalidsignInwithInvalidEmailPassword")
	public void TC_InValidSignInwithRestrictions() {
		mInvalidSignInRestriction.signInwithInvalidPasswordRestriction();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
