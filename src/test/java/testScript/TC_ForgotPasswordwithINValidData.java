package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.VerifyDomain;
import logicalView.InvalidForgotPasswordScripts.ForgotPasswordwithBlankEmail;
import logicalView.InvalidForgotPasswordScripts.ForgotPasswordwithInvalidEmail;
import logicalView.InvalidForgotPasswordScripts.ForgotPasswordwithNotRegisteredEmail;

public class TC_ForgotPasswordwithINValidData extends ApplicationUtility {

	VerifyDomain mVerifyDomain;
	ForgotPasswordwithBlankEmail mForgotPasswordwithBlankEmail;
	ForgotPasswordwithInvalidEmail mForgotPasswordwithInvalidEmail;
	ForgotPasswordwithNotRegisteredEmail mForgotPasswordwithNotRegisteredEmail;

	@BeforeTest
	public void beforeTest() {

		openBrowser();
		mVerifyDomain = new VerifyDomain();
		mForgotPasswordwithBlankEmail = new ForgotPasswordwithBlankEmail();
		mForgotPasswordwithInvalidEmail = new ForgotPasswordwithInvalidEmail();
		mForgotPasswordwithNotRegisteredEmail = new ForgotPasswordwithNotRegisteredEmail();

	}

	@Test(priority = 1, enabled = true)
	public void TC_ValidDomainSubmission() {

		mVerifyDomain.VerifyValidDomain();
	}

	@Test(priority = 2, enabled = true, dependsOnMethods = "TC_ValidDomainSubmission")
	public void TC_InValidForgotPasswordwithBlankEmail() {

		mForgotPasswordwithBlankEmail.inValidForgotPasswordwithBlankEmail();
		mForgotPasswordwithInvalidEmail.inValidForgotPasswordwithInvalidEmail();
		mForgotPasswordwithNotRegisteredEmail.inValidForgotPasswordwithNotRegisteredEmail();
	}

	@Test(priority = 3, enabled = true, dependsOnMethods = "TC_InValidForgotPasswordwithBlankEmail")
	public void TC_InValidForgotPasswordwithInvalidEmail() {

		mForgotPasswordwithInvalidEmail.inValidForgotPasswordwithInvalidEmail();
	}

	@Test(priority = 4, enabled = true, dependsOnMethods = "TC_InValidForgotPasswordwithInvalidEmail")
	public void TC_InValidForgotPasswordwithNotRegisteredEmail() {

		mForgotPasswordwithNotRegisteredEmail.inValidForgotPasswordwithNotRegisteredEmail();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
