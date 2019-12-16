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
import logicalView.VideosScripts.PublishNewVideowithBlankValues;
import logicalView.VideosScripts.PublishNewVideowithInvalidFormat;

public class TC_PublishVideowithInvalidVideoFormats extends ApplicationUtility {

	SignInwithValidData mSignIn;
	VerifyDomain mVerifyDomain;
	Signout mSignOut;
	Contacts mContacts;
	ModuleTabs mModuleTabs;
	PublishNewVideowithBlankValues mPublishNewVideowithBlankValues;
	PublishNewVideowithInvalidFormat mPublishNewVideowithInvalidFormat;

	@BeforeTest
	public void beforeTest() {
		openBrowser();
		mSignIn = new SignInwithValidData();
		mVerifyDomain = new VerifyDomain();
		mSignOut = new Signout();
		mModuleTabs = new ModuleTabs();
		mPublishNewVideowithBlankValues = new PublishNewVideowithBlankValues();
		mPublishNewVideowithInvalidFormat = new PublishNewVideowithInvalidFormat();

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
	public void TC_OpenVideoTab() {
		mModuleTabs.clickVideosTab();
	}

	@Test(priority = 4)
	public void TC_PublishNewVideowithBlankValues() {
		mPublishNewVideowithBlankValues.publishNewVideo();
	}

	@Test(priority = 5)
	public void TC_PublishNewVideowithInvalidFormatAVI() {
		mPublishNewVideowithInvalidFormat.publishNewVideo("SampleAVI.avi");
	}

	@Test(priority = 6)
	public void TC_PublishNewVideowithInvalidFormatWebm() {
		mPublishNewVideowithInvalidFormat.publishNewVideo("SampleWEBM.webm");
	}

	@Test(priority = 7)
	public void TC_PublishNewVideowithInvalidFormatWMV() {
		mPublishNewVideowithInvalidFormat.publishNewVideo("SampleWMV.wmv");
	}

	@Test(priority = 8)
	public void TC_PublishNewVideowithInvalidFormatOGG() {
		mPublishNewVideowithInvalidFormat.publishNewVideo("SampleOGG.ogg");
	}

	@Test(priority = 9)
	public void TC_SignOut() {

		mSignOut.SignOut();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
