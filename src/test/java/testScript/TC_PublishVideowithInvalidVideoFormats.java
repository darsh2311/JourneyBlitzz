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
import logicalView.VideosScripts.PublishNewVideo;
import logicalView.VideosScripts.PublishNewVideowithBlankValues;
import logicalView.VideosScripts.PublishNewVideowithInvalidFormatAVI;
import logicalView.VideosScripts.PublishNewVideowithInvalidFormatOGG;
import logicalView.VideosScripts.PublishNewVideowithInvalidFormatWMV;
import logicalView.VideosScripts.PublishNewVideowithInvalidFormatWebm;

public class TC_PublishVideowithInvalidVideoFormats extends ApplicationUtility {

	SignInwithValidData mSignIn;
	VerifyDomain mVerifyDomain;
	Signout mSignOut;
	Contacts mContacts;
	ModuleTabs mModuleTabs;
	PublishNewVideo mPublishNewVideo;
	PublishNewVideowithBlankValues mPublishNewVideowithBlankValues;
	PublishNewVideowithInvalidFormatAVI mPublishNewVideowithInvalidFormatAVI;
	PublishNewVideowithInvalidFormatOGG mPublishNewVideowithInvalidFormatOGG;
	PublishNewVideowithInvalidFormatWebm mPublishNewVideowithInvalidFormatWebm;
	PublishNewVideowithInvalidFormatWMV mPublishNewVideowithInvalidFormatWMV;

	@BeforeTest
	public void beforeTest() {
		openBrowser();
		mSignIn = new SignInwithValidData();
		mVerifyDomain = new VerifyDomain();
		mSignOut = new Signout();
		mModuleTabs = new ModuleTabs();
		mPublishNewVideo = new PublishNewVideo();
		mPublishNewVideowithBlankValues = new PublishNewVideowithBlankValues();
		mPublishNewVideowithInvalidFormatAVI = new PublishNewVideowithInvalidFormatAVI();
		mPublishNewVideowithInvalidFormatWebm = new PublishNewVideowithInvalidFormatWebm();
		mPublishNewVideowithInvalidFormatWMV = new PublishNewVideowithInvalidFormatWMV();
		mPublishNewVideowithInvalidFormatOGG = new PublishNewVideowithInvalidFormatOGG();
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
		mPublishNewVideowithInvalidFormatAVI.publishNewVideo();
	}

	@Test(priority = 6)
	public void TC_PublishNewVideowithInvalidFormatWebm() {
		mPublishNewVideowithInvalidFormatWebm.publishNewVideo();
	}

	@Test(priority = 7)
	public void TC_PublishNewVideowithInvalidFormatWMV() {
		mPublishNewVideowithInvalidFormatWMV.publishNewVideo();
	}

	@Test(priority = 8)
	public void TC_PublishNewVideowithInvalidFormatOGG() {
		mPublishNewVideowithInvalidFormatOGG.publishNewVideo();
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
