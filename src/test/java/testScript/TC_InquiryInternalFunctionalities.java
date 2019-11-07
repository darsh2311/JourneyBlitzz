package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.SignInwithValidData;
import logicalView.Signout;
import logicalView.VerifyDomain;
import logicalView.InquiryInternalFunctionalityScripts.AddNotes;
import logicalView.InquiryInternalFunctionalityScripts.AddParticipantInquiry;
import logicalView.InquiryInternalFunctionalityScripts.ArchiveUnarchiveInquiry;
import logicalView.InquiryInternalFunctionalityScripts.AttachMedia;
import logicalView.InquiryInternalFunctionalityScripts.InquiryDetails;
import logicalView.InquiryInternalFunctionalityScripts.InquiryList;
import logicalView.InquiryInternalFunctionalityScripts.RemoveParticipant;
import logicalView.InquiryInternalFunctionalityScripts.VideoCall;

public class TC_InquiryInternalFunctionalities extends ApplicationUtility {

	SignInwithValidData mSignIn;
	VerifyDomain mVerifyDomain;
	Signout mSignOut;
	AttachMedia mAttachMediaPhoto;
	AddParticipantInquiry mAddParticipant;
	AddNotes mAddNotes;
	RemoveParticipant mRemoveParticipant;
	ArchiveUnarchiveInquiry mArchiveInquiry;
	InquiryDetails mInquiryDetails;
	VideoCall mVideoCall;
	InquiryList mInquiryList;

	@BeforeTest
	public void beforeTest() {

		openBrowser();
		mSignIn = new SignInwithValidData();
		mVerifyDomain = new VerifyDomain();
		mSignOut = new Signout();
		mAttachMediaPhoto = new AttachMedia();
		mAddParticipant = new AddParticipantInquiry();
		mAddNotes = new AddNotes();
		mRemoveParticipant = new RemoveParticipant();
		mArchiveInquiry = new ArchiveUnarchiveInquiry();
		mInquiryDetails = new InquiryDetails();
		mVideoCall = new VideoCall();
		mInquiryList = new InquiryList();
	}

	@Test(priority = 1, enabled = true)
	public void TC_ValidDomainSubmission() {

		mVerifyDomain.VerifyValidDomain();
	}

	@Test(priority = 2, enabled = true)
	public void TC_SignIn() {

		mSignIn.validSignIn();
	}

	@Test(priority = 3, enabled = true)
	public void TC_InquiryList() {

		mInquiryList.getInquiryList();
	}

	@Test(priority = 4, enabled = true)
	public void TC_AttachMediaPhoto() {

		mAttachMediaPhoto.imageUpload();

	}

	@Test(priority = 5, enabled = true)
	public void TC_AttachMediaVideo() {

		mAttachMediaPhoto.videoUpload();
	}

	@Test(priority = 6, enabled = true)
	public void TC_AttachMediaDocument() {

		mAttachMediaPhoto.documentUpload();
	}

	@Test(priority = 7, enabled = true)
	public void TC_AddParticipantInInquiry() {

		mAddParticipant.addParticipantinInquiry();
	}

	@Test(priority = 8, enabled = true)
	public void TC_AddNotes() {
		mAddNotes.addNote();
	}

	@Test(priority = 9, enabled = true)
	public void TC_EditNotes() {
		mAddNotes.editNote();
	}

	@Test(priority = 10, enabled = true)
	public void TC_DeleteNotes() {
		mAddNotes.deleteNote();
	}

	@Test(priority = 11, enabled = true)
	public void TC_RemoveParticipant() {
		mRemoveParticipant.removeParticipant();
	}

	@Test(priority = 12, enabled = true)
	public void TC_ArchiveInquiry() {
		mArchiveInquiry.archiveInquiry();
	}

	@Test(priority = 13, enabled = true)
	public void TC_UnArchiveInquiry() {
		mArchiveInquiry.UnarchiveInquiry();
	}

	@Test(priority = 14, enabled = true)
	public void TC_VideoCall() {

		mVideoCall.startEndVideoCall();
	}

	@Test(priority = 15, enabled = true)
	public void TC_EditInquiryDetails() {
		mInquiryDetails.editInquiryDetails();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
