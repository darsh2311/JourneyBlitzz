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
import logicalView.VideosScripts.PublishNewVideowithValidFormat;
import logicalView.VideosScripts.PublishNewVideowithValidFormatMP4;

public class TC_PublishVideowithValidFormats extends ApplicationUtility {

	SignInwithValidData mSignIn;
	VerifyDomain mVerifyDomain;
	Signout mSignOut;
	Contacts mContacts;
	ModuleTabs mModuleTabs;
	PublishNewVideowithValidFormatMP4 mPublishNewVideowithValidFormatMP4;
	PublishNewVideowithValidFormat mPublishNewVideowithValidFormat;

	@BeforeTest
	public void beforeTest() {
		openBrowser();
		mSignIn = new SignInwithValidData();
		mVerifyDomain = new VerifyDomain();
		mSignOut = new Signout();
		mModuleTabs = new ModuleTabs();
		mPublishNewVideowithValidFormatMP4 = new PublishNewVideowithValidFormatMP4();
		mPublishNewVideowithValidFormat = new PublishNewVideowithValidFormat();

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
	public void TC_PublishNewVideowithValidFormatMP4() {
		mPublishNewVideowithValidFormatMP4.publishNewVideo();
	}

	@Test(priority = 5)
	public void TC_PublishNewVideowithValidFormatM4V() {
		mPublishNewVideowithValidFormat.publishNewVideo("SampleM4V.m4v");
	}

	@Test(priority = 6)
	public void TC_PublishNewVideowithValidFormatMOV() {
		mPublishNewVideowithValidFormat.publishNewVideo("SampleMOV.mov");
	}

	@Test(priority = 7)
	public void TC_SignOut() {

		mSignOut.SignOut();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
