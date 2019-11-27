package testScript;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.ForgotPassword;
import logicalView.NeedHelp;
import logicalView.NewInquiry;
import logicalView.SignInwithValidData;
import logicalView.Signout;
import logicalView.VerifyDomain;
import logicalView.VerifyDomainwithInvalidData;
import logicalView.InquiryInternalFunctionalityScripts.AddNotes;
import logicalView.InquiryInternalFunctionalityScripts.AddParticipantInquiry;
import logicalView.InquiryInternalFunctionalityScripts.ArchiveUnarchiveInquiry;
import logicalView.InquiryInternalFunctionalityScripts.AttachMedia;
import logicalView.InquiryInternalFunctionalityScripts.InquiryDetails;
import logicalView.InquiryInternalFunctionalityScripts.InquiryList;
import logicalView.InquiryInternalFunctionalityScripts.RemoveParticipant;
import logicalView.InquiryInternalFunctionalityScripts.SendChatMessage;
import logicalView.InquiryInternalFunctionalityScripts.VideoCall;
import logicalView.InvalidForgotPasswordScripts.ForgotPasswordwithBlankEmail;
import logicalView.InvalidForgotPasswordScripts.ForgotPasswordwithInvalidEmail;
import logicalView.InvalidForgotPasswordScripts.ForgotPasswordwithNotRegisteredEmail;
import logicalView.InvalidNewInquiryScripts.NewInquirywithBlankValues;
import logicalView.InvalidNewInquiryScripts.NewInquirywithInvalidValues;
import logicalView.InvalidSignInScripts.InvalidSignInRestriction;
import logicalView.InvalidSignInScripts.SignInwithBlankEmail;
import logicalView.InvalidSignInScripts.SignInwithBlankEmailPassword;
import logicalView.InvalidSignInScripts.SignInwithBlankPassword;
import logicalView.InvalidSignInScripts.SignInwithInvalidEmailPassword;
import logicalView.InvalidSignUPScripts.AddUserSignUp;
import logicalView.InvalidSignUPScripts.SignUpwithBlankEmailIdInvalidData;
import logicalView.InvalidSignUPScripts.SignUpwithBlankUserIdInvalidData;
import logicalView.InvalidSignUPScripts.SignUpwithEmailIdInvalidData;
import logicalView.InvalidSignUPScripts.SignUpwithUserIdInvalidData;
import logicalView.InvalidSignUpVerifyScripts.SignUpVerifywithBlankEmailUserId;
import logicalView.InvalidSignUpVerifyScripts.SignUpVerifywithInvalidEmail;
import logicalView.InvalidSignUpVerifyScripts.SignUpVerifywithInvalidUserId;
import logicalView.InvalidSignUpVerifyScripts.SignUpVerifywithNotRegisteredEmail;
import logicalView.InvalidSignUpVerifyScripts.SignUpVerifywithNotRegisteredUserId;
import logicalView.ValidSignUpScripts.SignUPVerifyEmail;
import logicalView.ValidSignUpScripts.SignUpwithEmailId;
import logicalView.ValidSignUpScripts.SignUpwithEmailIdwithOutPassword;
import logicalView.ValidSignUpScripts.SignUpwithUserId;
import logicalView.ValidSignUpScripts.SignUpwithUserIdwithOutPassword;
import logicalView.ValidSignUpScripts.ValidSignInwithSignUp;

public class JourneyScripts {
	public class TC_All extends ApplicationUtility {
		NeedHelp mNeedHelp;
		VerifyDomainwithInvalidData mVerifyDomainwithInvalidData;
		VerifyDomain mVerifyDomain;
		ForgotPasswordwithBlankEmail mForgotPasswordwithBlankEmail;
		ForgotPasswordwithInvalidEmail mForgotPasswordwithInvalidEmail;
		ForgotPasswordwithNotRegisteredEmail mForgotPasswordwithNotRegisteredEmail;
		ForgotPassword mForgotPassword;
		SignInwithBlankEmail mSignInwithBlankEmail;
		SignInwithBlankEmailPassword mSignInwithBlankEmailPassword;
		SignInwithBlankPassword mSignInwithBlankPassword;
		SignInwithInvalidEmailPassword mSignInwithInvalidEmailPassword;
		InvalidSignInRestriction mInvalidSignInRestriction;
		SignInwithValidData mSignIn;
		Signout mSignOut;
		SignUpwithBlankEmailIdInvalidData mSignUpwithBlankEmailIdInvalidData;
		SignUpwithBlankUserIdInvalidData mSignUpwithBlankUserIdInvalidData;
		SignUpwithEmailIdInvalidData mSignUpwithEmailIdInvalidData;
		SignUpwithUserIdInvalidData mSignUpwithUserIdInvalidData;
		AddUserSignUp maddUserSignUp;
		SignUpVerifywithBlankEmailUserId mSignUpVerifywithBlankEmailUserId;
		SignUpVerifywithInvalidEmail mSignUpVerifywithInvalidEmail;
		SignUpVerifywithNotRegisteredEmail mSignUpVerifywithNotRegisteredEmail;
		SignUpVerifywithInvalidUserId mSignUpVerifywithInvalidUserId;
		SignUpVerifywithNotRegisteredUserId mSignUpVerifywithNotRegisteredUserId;
		SignUpwithEmailId mSignUpwithEmailId;
		ValidSignInwithSignUp mValidSignInwithSignUp;
		SignUpwithUserId mSignUpwithUserId;
		SignUpwithEmailIdwithOutPassword mSignUpwithEmailIdwithOutPassword;
		AddUserSignUp mAddUserSignUp;
		SignUPVerifyEmail mSignUPVerifyEmail;
		SignUpwithUserIdwithOutPassword mSignUpwithUserIdwithOutPassword;
		NewInquiry mNewInquiry;
		NewInquirywithBlankValues mNewInquirywithBlankData;
		NewInquirywithInvalidValues mNewInquirywithInvalidValues;
		AttachMedia mAttachMediaPhoto;
		AddParticipantInquiry mAddParticipant;
		AddNotes mAddNotes;
		RemoveParticipant mRemoveParticipant;
		ArchiveUnarchiveInquiry mArchiveInquiry;
		InquiryDetails mInquiryDetails;
		VideoCall mVideoCall;
		InquiryList mInquiryList;
		SendChatMessage mSendChatMessage;

		@BeforeTest
		public void beforeTest() {
			openBrowser();
			mNeedHelp = new NeedHelp();
			mVerifyDomainwithInvalidData = new VerifyDomainwithInvalidData();
			mVerifyDomain = new VerifyDomain();
			mForgotPasswordwithBlankEmail = new ForgotPasswordwithBlankEmail();
			mForgotPasswordwithInvalidEmail = new ForgotPasswordwithInvalidEmail();
			mForgotPasswordwithNotRegisteredEmail = new ForgotPasswordwithNotRegisteredEmail();
			mForgotPassword = new ForgotPassword();
			mSignInwithBlankEmail = new SignInwithBlankEmail();
			mSignInwithBlankEmailPassword = new SignInwithBlankEmailPassword();
			mSignInwithBlankPassword = new SignInwithBlankPassword();
			mSignInwithInvalidEmailPassword = new SignInwithInvalidEmailPassword();
			mInvalidSignInRestriction = new InvalidSignInRestriction();
			mSignIn = new SignInwithValidData();
			mSignOut = new Signout();
			mSignUpwithBlankEmailIdInvalidData = new SignUpwithBlankEmailIdInvalidData();
			mSignUpwithBlankUserIdInvalidData = new SignUpwithBlankUserIdInvalidData();
			mSignUpwithEmailIdInvalidData = new SignUpwithEmailIdInvalidData();
			mSignUpwithUserIdInvalidData = new SignUpwithUserIdInvalidData();
			maddUserSignUp = new AddUserSignUp();
			mSignUpVerifywithBlankEmailUserId = new SignUpVerifywithBlankEmailUserId();
			mSignUpVerifywithInvalidEmail = new SignUpVerifywithInvalidEmail();
			mSignUpVerifywithNotRegisteredEmail = new SignUpVerifywithNotRegisteredEmail();
			mSignUpVerifywithInvalidUserId = new SignUpVerifywithInvalidUserId();
			mSignUpVerifywithNotRegisteredUserId = new SignUpVerifywithNotRegisteredUserId();
			mSignUpwithEmailId = new SignUpwithEmailId();
			mValidSignInwithSignUp = new ValidSignInwithSignUp();
			mSignUpwithUserId = new SignUpwithUserId();
			mSignUpwithEmailIdwithOutPassword = new SignUpwithEmailIdwithOutPassword();
			mAddUserSignUp = new AddUserSignUp();
			mSignUPVerifyEmail = new SignUPVerifyEmail();
			mSignUpwithUserIdwithOutPassword = new SignUpwithUserIdwithOutPassword();
			mNewInquiry = new NewInquiry();
			mNewInquirywithBlankData = new NewInquirywithBlankValues();
			mNewInquirywithInvalidValues = new NewInquirywithInvalidValues();
			mAttachMediaPhoto = new AttachMedia();
			mAddParticipant = new AddParticipantInquiry();
			mAddNotes = new AddNotes();
			mRemoveParticipant = new RemoveParticipant();
			mArchiveInquiry = new ArchiveUnarchiveInquiry();
			mInquiryDetails = new InquiryDetails();
			mVideoCall = new VideoCall();
			mInquiryList = new InquiryList();
			mSendChatMessage = new SendChatMessage();
		}

		@Test(priority = 1)
		public void TC_Need_Help() {

			mNeedHelp.VerifyNeedHelpPopup();
		}

		@Test(priority = 2)
		public void TC_InvalidDomainSubmission() {

			mVerifyDomainwithInvalidData.VerifyInValidDomain();
		}

		@Test(priority = 3)
		public void TC_ValidDomainSubmission() {

			mVerifyDomain.VerifyValidDomain();
		}

		@Test(priority = 4, enabled = true, dependsOnMethods = "TC_ValidDomainSubmission")
		public void TC_InValidForgotPasswordwithBlankEmail() {

			mForgotPasswordwithBlankEmail.inValidForgotPasswordwithBlankEmail();

		}

		@Test(priority = 5, enabled = true, dependsOnMethods = "TC_InValidForgotPasswordwithBlankEmail")
		public void TC_InValidForgotPasswordwithInvalidEmail() {

			mForgotPasswordwithInvalidEmail.inValidForgotPasswordwithInvalidEmail();
		}

		@Test(priority = 6, enabled = true, dependsOnMethods = "TC_InValidForgotPasswordwithInvalidEmail")
		public void TC_InValidForgotPasswordwithNotRegisteredEmail() {

			mForgotPasswordwithNotRegisteredEmail.inValidForgotPasswordwithNotRegisteredEmail();
		}

		@Test(priority = 7, enabled = true, dependsOnMethods = "TC_InValidForgotPasswordwithNotRegisteredEmail")
		public void TC_ValidForgotPassword() {

			mForgotPassword.validForgotPassword();
		}

		@Test(priority = 8, enabled = true, dependsOnMethods = "TC_ValidForgotPassword")
		public void TC_InValidSignInwithBlankEmailPassword() {

			mSignInwithBlankEmailPassword.inValidSignInwithBlankEmailPassword();

		}

		@Test(priority = 9, enabled = true, dependsOnMethods = "TC_InValidSignInwithBlankEmailPassword")
		public void TC_InValidSignInwithBlankEmail() {

			mSignInwithBlankEmail.inValidSignInwithBlankEmail();

		}

		@Test(priority = 10, enabled = true, dependsOnMethods = "TC_InValidSignInwithBlankEmail")
		public void TC_InValidSignInwithBlankPassword() {

			mSignInwithBlankPassword.inValidSignInwithBlankPassword();
		}

		@Test(priority = 11, enabled = true, dependsOnMethods = "TC_InValidSignInwithBlankPassword")
		public void TC_InvalidsignInwithInvalidEmailPassword() {

			mSignInwithInvalidEmailPassword.signInwithInvalidEmailPassword();
		}

		@Test(priority = 12, enabled = true, dependsOnMethods = "TC_InvalidsignInwithInvalidEmailPassword")
		public void TC_SignIn() {
			refreshPage();
			mSignIn.validSignIn();
			maddUserSignUp.addUser();
		}

		@Test(priority = 13, enabled = true, dependsOnMethods = "TC_SignIn")
		public void TC_SignUpwithBlankEmailIdInvalidData() {
			mSignUpwithBlankEmailIdInvalidData.checkBlankEmailSubmit();
		}

		@Test(priority = 14, enabled = true, dependsOnMethods = "TC_SignUpwithBlankEmailIdInvalidData")
		public void TC_SignUpwithBlankUserIdInvalidData() {
			mSignUpwithBlankUserIdInvalidData.checkBlankUserIdSubmit();
		}

		@Test(priority = 15, enabled = true, dependsOnMethods = "TC_SignUpwithBlankUserIdInvalidData")
		public void TC_SignUpwithUserIdInvalidData() {
			mSignUpwithUserIdInvalidData.invalidUserIDSubmit();
			mSignOut.SignOut();
		}

		@Test(priority = 16, enabled = true, dependsOnMethods = "TC_SignUpwithUserIdInvalidData")
		public void TC_VerifyBlankVerifyEmailUserid() {

			mVerifyDomain.VerifyValidDomain();
			mSignUpVerifywithBlankEmailUserId.blankVerifyEmailUserid();

		}

		@Test(priority = 17, enabled = true, dependsOnMethods = "TC_VerifyBlankVerifyEmailUserid")
		public void TC_VerifyInvalidVerifyEmail() {

			mSignUpVerifywithInvalidEmail.invalidVerifyEmail();

		}

		@Test(priority = 18, enabled = true, dependsOnMethods = "TC_VerifyInvalidVerifyEmail")
		public void TC_VerifyNotRegisteredVerifyEmail() {

			mSignUpVerifywithNotRegisteredEmail.notRegisteredVerifyEmail();

		}

		@Test(priority = 19, enabled = true, dependsOnMethods = "TC_VerifyNotRegisteredVerifyEmail")
		public void TC_VerifyInvalidVerifyUserId() {

			mSignUpVerifywithInvalidUserId.invalidVerifyUserId();

		}

		@Test(priority = 20, enabled = true, dependsOnMethods = "TC_VerifyInvalidVerifyUserId")
		public void TC_VerifyNotRegisteredVerifyUserId() {

			mSignUpVerifywithNotRegisteredUserId.notRegisteredVerifyUserId();

		}

		@Test(priority = 21, enabled = true, dependsOnMethods = "TC_VerifyNotRegisteredVerifyUserId")
		public void SignInforSignUp() {

			mSignIn.validSignIn();
		}

		@Test(priority = 22, enabled = true, dependsOnMethods = "SignInforSignUp")
		public void TC_SignUpwithEmailandPassword() {
			mSignUpwithEmailId.signUpAdminwithEmail();
		}

		@Test(priority = 23, enabled = true, dependsOnMethods = "TC_SignUpwithEmailandPassword")
		public void TC_SignInafterRegister() {

			mSignOut.SignOut();
			mVerifyDomain.VerifyValidDomain();
			mValidSignInwithSignUp.validSignInwithSignup(mSignUpwithEmailId.email);
			mSignOut.SignOut();

		}

		@Test(priority = 24, enabled = true, dependsOnMethods = "TC_SignInafterRegister")
		public void SignInforSignUpUserId() {

			mVerifyDomain.VerifyValidDomain();
			mSignIn.validSignIn();
		}

		@Test(priority = 25, enabled = true, dependsOnMethods = "SignInforSignUpUserId")
		public void TC_SignUpwithEmailandPasswordUserId() {
			mSignUpwithUserId.signUpAdminwithUserId();
		}

		@Test(priority = 26, enabled = true, dependsOnMethods = "TC_SignUpwithEmailandPasswordUserId")
		public void TC_SignInafterRegisterUserId() {

			mSignOut.SignOut();
			mVerifyDomain.VerifyValidDomain();
			mValidSignInwithSignUp.validSignInwithSignup(mSignUpwithUserId.userId);
			mSignOut.SignOut();
		}

		@Test(priority = 27, enabled = true, dependsOnMethods = "TC_SignInafterRegisterUserId")
		public void SignInforSignUpwithOutPassword() {

			mVerifyDomain.VerifyValidDomain();
			mSignIn.validSignIn();
			mAddUserSignUp.addUser();
		}

		@Test(priority = 28, enabled = true, dependsOnMethods = "SignInforSignUpwithOutPassword")
		public void TC_SignUpwithEmailwithoutPassword() {

			mSignUpwithEmailIdwithOutPassword.emailSignUpwithoutPassword();
		}

		@Test(priority = 29, enabled = true, dependsOnMethods = "TC_SignUpwithEmailwithoutPassword")
		public void TC_SignInafterRegisterEmailwithOutPassword() {
			mSignOut.SignOut();
			mVerifyDomain.VerifyValidDomain();
			mSignUPVerifyEmail.VerifySignUpDomainwithEmail(mSignUpwithEmailIdwithOutPassword.email);
			mSignOut.SignOut();

		}

		@Test(priority = 30, enabled = true, dependsOnMethods = "TC_SignInafterRegisterEmailwithOutPassword")
		public void SignInforSignUpUserIdwithoutPassword() {

			mVerifyDomain.VerifyValidDomain();
			mSignIn.validSignIn();
			mAddUserSignUp.addUser();
		}

		@Test(priority = 31, enabled = true, dependsOnMethods = "SignInforSignUpUserIdwithoutPassword")
		public void TC_SignUpwithUserIdwithoutPassword() {

			mSignUpwithUserIdwithOutPassword.userIdSignUpwithoutPassword();
		}

		@Test(priority = 32, enabled = true, dependsOnMethods = "TC_SignUpwithUserIdwithoutPassword")
		public void TC_SignInafterRegisterUserIdwithOutPassword() {
			mSignOut.SignOut();
			mVerifyDomain.VerifyValidDomain();
			mSignUPVerifyEmail.VerifySignUpDomainwithEmail(mSignUpwithUserIdwithOutPassword.userId);
			mSignOut.SignOut();

		}

		@Test(priority = 33, enabled = true, dependsOnMethods = "TC_SignInafterRegisterUserIdwithOutPassword")
		public void TC_CreateNewInquiry() {
			mVerifyDomain.VerifyValidDomain();
			mSignIn.validSignIn();
			mNewInquiry.clickNewInquiryHeaderButton();
			mNewInquiry.createNewInquiry();
			mSignOut.SignOut();

		}

		@Test(priority = 34, enabled = true, dependsOnMethods = "TC_CreateNewInquiry")
		public void TC_CreateNewInquirywithInvalidValues() {
			mVerifyDomain.VerifyValidDomain();
			mSignIn.validSignIn();
			mNewInquirywithInvalidValues.createNewInquiry();

		}

		@Test(priority = 35, enabled = true, dependsOnMethods = "TC_CreateNewInquirywithInvalidValues")
		public void TC_CreateNewInquirywithBlankValues() {

			mNewInquirywithBlankData.createNewInquiry();
			mSignOut.SignOut();

		}

		@Test(priority = 36, enabled = true, dependsOnMethods = "TC_CreateNewInquirywithBlankValues")
		public void TC_InquiryList() {

			mVerifyDomain.VerifyValidDomain();
			mSignIn.validSignIn();
			mInquiryList.getInquiryList();
		}

		@Test(priority = 37, enabled = true, dependsOnMethods = "TC_InquiryList")
		public void TC_ViewImage() {

			mInquiryDetails.viewImage();
		}

		@Test(priority = 38, enabled = true, dependsOnMethods = "TC_ViewImage")
		public void TC_SendMessageToChat() {

			mSendChatMessage.sendChatMessageToInquiry();
		}

		@Test(priority = 39, enabled = true, dependsOnMethods = "TC_SendMessageToChat")
		public void TC_AttachMediaPhoto() {

			mAttachMediaPhoto.imageUpload();

		}

		@Test(priority = 40, enabled = true, dependsOnMethods = "TC_AttachMediaPhoto")
		public void TC_AttachMediaVideo() {

			mAttachMediaPhoto.videoUpload();
		}

		@Test(priority = 41, enabled = true, dependsOnMethods = "TC_AttachMediaVideo")
		public void TC_AttachMediaDocument() {

			mAttachMediaPhoto.documentUpload();
		}

		@Test(priority = 42, enabled = true, dependsOnMethods = "TC_AttachMediaDocument")
		public void TC_AddParticipantInInquiry() {

			mAddParticipant.addParticipantinInquiry();
		}

		@Test(priority = 43, enabled = true, dependsOnMethods = "TC_AddParticipantInInquiry")
		public void TC_AddNotes() {
			mAddNotes.addNote();
		}

		@Test(priority = 44, enabled = true, dependsOnMethods = "TC_AddNotes")
		public void TC_EditNotes() {
			mAddNotes.editNote();
		}

		@Test(priority = 45, enabled = true, dependsOnMethods = "TC_EditNotes")
		public void TC_DeleteNotes() {
			mAddNotes.deleteNote();
		}

		@Test(priority = 46, enabled = true, dependsOnMethods = "TC_DeleteNotes")
		public void TC_RemoveParticipant() {
			mRemoveParticipant.removeParticipant();
		}

		@Test(priority = 47, enabled = true, dependsOnMethods = "TC_RemoveParticipant")
		public void TC_ArchiveInquiry() {
			mArchiveInquiry.archiveInquiry();
		}

		@Test(priority = 48, enabled = true, dependsOnMethods = "TC_ArchiveInquiry")
		public void TC_UnArchiveInquiry() {
			mArchiveInquiry.UnarchiveInquiry();
		}

		@Test(priority = 49, enabled = true, dependsOnMethods = "TC_UnArchiveInquiry")
		public void TC_VideoCall() {

			mVideoCall.startEndVideoCall();
		}

		@Test(priority = 50, enabled = true, dependsOnMethods = "TC_VideoCall")
		public void TC_EditInquiryDetails() {
			mInquiryDetails.editInquiryDetails();
			mSignOut.SignOut();

		}

//		@AfterTest
//		public void afterTest() {
//			driver.quit();
//		}
	}

}
