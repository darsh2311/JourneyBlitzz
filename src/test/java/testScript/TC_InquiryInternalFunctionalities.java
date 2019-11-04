package testScript;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.SignInwithValidData;
import logicalView.Signout;
import logicalView.VerifyDomain;
import logicalView.InquiryInternalFunctionalityScripts.AddParticipant;
import logicalView.InquiryInternalFunctionalityScripts.AttachMedia;

public class TC_InquiryInternalFunctionalities extends ApplicationUtility {

	SignInwithValidData mSignIn;
	VerifyDomain mVerifyDomain;
	Signout mSignOut;
	AttachMedia mAttachMediaPhoto;
	AddParticipant mAddParticipant;

	@BeforeTest
	public void beforeTest() {

		openBrowser();
		mSignIn = new SignInwithValidData();
		mVerifyDomain = new VerifyDomain();
		mSignOut = new Signout();
		mAttachMediaPhoto = new AttachMedia();
		mAddParticipant = new AddParticipant();
	}

	@Test(priority = 1, enabled = true)
	public void TC_ValidDomainSubmission() {

		mVerifyDomain.VerifyValidDomain();
	}

	@Test(priority = 2, enabled = true, dependsOnMethods = "TC_ValidDomainSubmission")
	public void TC_SignIn() {

		mSignIn.validSignIn();
	}

	@Test(priority = 3, enabled = true)
	public void TC_AttachMediaPhoto() {

		mAttachMediaPhoto.openInquiry();
		mAttachMediaPhoto.imageUpload();

	}

	@Test(priority = 4, enabled = true)
	public void TC_AttachMediaVideo() {

		mAttachMediaPhoto.videoUpload();
	}

	@Test(priority = 5, enabled = true)
	public void TC_AttachMediaDocument() {

		mAttachMediaPhoto.documentUpload();
	}

	@Test(priority = 6, enabled = true)
	public void TC_AddParticipantInInquiry() {

		mAddParticipant.addParticipantinInquiry();
	}

	/*
	 * @Test(priority = 7, enabled = true) public void TC_SignOut() {
	 * 
	 * mSignOut.SignOut(); }
	 * 
	 * @AfterTest public void afterTest() { driver.quit(); }
	 */
}
