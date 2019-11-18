package testScript;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.CreateShowMeSessionwithSMS;
import logicalView.CreateShowMeSessionwithWhatsApp;
import logicalView.SignInwithValidData;
import logicalView.VerifyDomain;

public class TC_Showme extends ApplicationUtility {
	CreateShowMeSessionwithSMS mCreateShowMeSessionwithSMS;
	CreateShowMeSessionwithWhatsApp mCreateShowMeSessionwithWhatsApp;
	SignInwithValidData mSignIn;
	VerifyDomain mVerifyDomain;

	@BeforeTest
	public void beforeTest() {
		openBrowser();
		mCreateShowMeSessionwithSMS = new CreateShowMeSessionwithSMS();
		mCreateShowMeSessionwithWhatsApp = new CreateShowMeSessionwithWhatsApp();
		mSignIn = new SignInwithValidData();
		mVerifyDomain = new VerifyDomain();
	}

	@Test(priority = 1, enabled = true)
	public void TC_ValidDomainSubmission() {

		mVerifyDomain.VerifyValidDomain();
	}

	@Test(priority = 2, enabled = true)
	public void TC_SignIn() {

		mSignIn.validSignIn();
	}

	@Test(priority = 3)
	public void TC_CreateSessionwithSMS() {

		mCreateShowMeSessionwithSMS.createSessionwithSMS();
	}

	@Test(priority = 4)
	public void TC_CreateSessionwithWhatsApp() {

		mCreateShowMeSessionwithWhatsApp.createSessionwithWhatsApp();
	}

}
