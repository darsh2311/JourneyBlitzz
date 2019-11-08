package testObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectInquiryFunctionalities {

	// Click on the Inquiry from the list
	@FindBy(xpath = "//*[@id=\"style-3\"]/div/ul/li/div/a[1]")
	public WebElement selectInquiry;

	public void clickInquiry() {
		selectInquiry.click();
	}

	// Enter Chat message
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/textarea[1]")
	public WebElement chatMessage;

	public void enterChatMessage(String strChatMessage) {
		chatMessage.sendKeys(strChatMessage);
	}

	// Send Chat message
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/span[1]")
	public WebElement sendChatMessage;

	public void sendChatMessage() {
		sendChatMessage.click();
	}

	// Click on the attachment icon in the chat
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/li[4]/a[1]")
	public WebElement attachMedia;

	public void clickAttachMedia() {
		attachMedia.click();
	}

	// Click on the Photo, video or document link
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/li[4]/ul[1]/li[1]/a[1]")
	public WebElement uploadAttachmentOption;

	public void uploadAttachment() {
		uploadAttachmentOption.click();
	}

	// Click on choose a file to upload button
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[4]/span[1]")
	public WebElement FileToUpload;

	public void clickFileToUpload() {
		FileToUpload.click();
	}

	// Canvas of Uploaded Image
	@FindBy(xpath = "//canvas[contains(@class,'upper-canvas')]")
	public WebElement UploadedwbCanvas;

	// Click on Send to upload the image with drawing
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[8]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement sendImageToInquiry;

	public void sendImageToInquiry() {
		sendImageToInquiry.click();
	}

	// Send button to send the media to inquiry
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/button[1]")
	public WebElement sendButton;

	public void uploadSend() {
		sendButton.click();
	}

	///////////////////////////////////////// Add
	///////////////////////////////////////// Participants/////////////////////////////////////////////

	// Add Participant icon
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/li[2]/a[1]")
	public WebElement addParticipantIcon;

	public void clickAddParticipantIcon() {
		addParticipantIcon.click();
	}

	// Select Participant for Contacts
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement selectContactParticipant1;

	public void selectParticipant1() {
		selectContactParticipant1.click();
	}

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement selectContactParticipant2;

	public void selectParticipant2() {
		selectContactParticipant2.click();
	}

	// Contact Tab
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[3]/div[2]/ul[1]/li[1]/a[1]")
	public WebElement contactTab;

	public void clickContactTab() {
		contactTab.click();
	}

	// Group Tab
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[3]/div[2]/ul[1]/li[2]/a[1]")
	public WebElement groupTab;

	public void clickGroupTab() {
		groupTab.click();
	}

	// Select Group Participant
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement selectGroupParticipant1;

	public void selectGroupParticipant1() {
		selectGroupParticipant1.click();
	}

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[3]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement selectGroupParticipant2;

	public void selectGroupParticipant2() {
		selectGroupParticipant2.click();
	}

	// Add Participant submit button
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[3]/div[3]/button[1]")
	public WebElement addParticipantButton;

	public void addParticipantButton() {
		addParticipantButton.click();
	}

	// No Participant error message
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]")
	public WebElement noParticipantMessage;

	// No Group participant error message
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]")
	public WebElement noGroupParticipantMessage;

	// Close Add Participant
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[1]/div[2]/div[2]/span[1]")
	public WebElement closeAddParticipantSidebar;

	public void closeAddParticipantSidebar() {
		closeAddParticipantSidebar.click();
	}

/////////////////////////////////////////  Add
///////////////////////////////////////// Notes /////////////////////////////////////////////

	// Add Notes Icon
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/li[3]/a[1]")
	public WebElement addNotesIcon;

	public void clickAddNotes() {
		addNotesIcon.click();
	}

	// Enter Notes Textbox
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[2]/div[1]/div[2]/textarea[1]")
	public WebElement enterNotes;

	public void enterNote(String strNote) {
		enterNotes.sendKeys(strNote);
	}

	// Submit Notes Textbox
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[2]/div[1]/div[2]/a[1]/li[1]")
	public WebElement submitNotes;

	public void submitNote() {
		submitNotes.click();
	}

	// Refresh Notes Textbox
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
	public WebElement refreshNotes;

	public void clickRefreshNote() {
		refreshNotes.click();
	}

	// Close Notes Textbox
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[1]/div[2]/div[2]/span[1]")
	public WebElement closeNotes;

	public void clickCloseNote() {
		closeNotes.click();
	}

	// Ellipsis Notes Textbox
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/i[1]")
	public WebElement ellipsisNote;

	public void clickEllipsisNote() {
		ellipsisNote.click();
	}

	// Edit Notes Textbox
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/a[1]/div[1]")
	public WebElement editNote;

	public void clickEditNote() {
		editNote.click();
	}

	// Edit Notes Description Textbox
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[5]/textarea[1]")
	public WebElement entereditNote;

	public void enterEditNote(String strEditNote) {
		entereditNote.clear();
		entereditNote.sendKeys(strEditNote);
	}

	// Cancel Notes Description Textbox
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[6]/input[1]")
	public WebElement cancelEditNote;

	public void cancelEditNote() {
		cancelEditNote.click();
	}

	// Done Notes Description Textbox
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[6]/input[2]")
	public WebElement doneEditNote;

	public void doneEditNote() {
		doneEditNote.click();
	}

	// Delete Notes
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/a[2]/div[1]")
	public WebElement deleteNote;

	public void clickDeleteNote() {
		deleteNote.click();
	}

	// Cancel Delete Notes Popup
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/button[1]")
	public WebElement cancelDeleteNote;

	public void cancelDeleteNote() {
		cancelDeleteNote.click();
	}

	// Close Delete Notes Popup
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/button[1]")
	public WebElement closeDeleteNote;

	public void closeDeleteNote() {
		closeDeleteNote.click();
	}

	// Delete Confirm button
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/button[2]")
	public WebElement confirmDeleteNote;

	public void confirmDeleteNote() {
		confirmDeleteNote.click();
	}

/////////////////////////////////////////  Remove
///////////////////////////////////////// Members /////////////////////////////////////////////

	// Click on Ellipsis menu for Inquiry Details
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/li[6]/a[1]")
	public WebElement ellipsisInquiryDetails;

	public void clickInquiryDetails() {
		ellipsisInquiryDetails.click();
	}

	// Click on Members
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/h5[1]")
	public WebElement addedMemberList;

	public void clickAddedMemberList() {
		addedMemberList.click();
	}

	// Click on Remove icon of the first Member
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[3]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/i[1]")
	public WebElement removeIcon;

	public void clickRemoveIcon() {
		removeIcon.click();
	}

	// Click on the Cancel button of the remove member popup
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[5]/div[2]/div[1]/div[3]/button[1]")
	public WebElement cancelRemovePopup;

	public void clickCancelRemovePopup() {
		cancelRemovePopup.click();
	}

	// Click on Yes to confirm delete of the remove member popup
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[5]/div[2]/div[1]/div[3]/button[2]")
	public WebElement confirmDelete;

	public void clickConfirmDelete() {
		confirmDelete.click();
	}

	// Click on X to close the sidebar
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[1]/div[2]/div[2]/span[1]")
	public WebElement closeInquiryDetails;

	public void clickCloseInquiryDetails() {
		closeInquiryDetails.click();
	}

/////////////////////////////////////////  Archive
///////////////////////////////////////// Inquiries /////////////////////////////////////////////

	// Archive Inquiry Icon
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/li[5]/a[1]")
	public WebElement archiveInquiry;

	public void clickArchiveInquiryIcon() {
		archiveInquiry.click();
	}

	// Cancel for the Archive Popup
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[3]/button[1]")
	public WebElement cancelArchiveButton;

	public void cancelArchiveButton() {
		cancelArchiveButton.click();
	}

	// Archive Inquiry Icon
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[3]/button[2]")
	public WebElement confirmArchiveButton;

	public void confirmArchiveButton() {

		confirmArchiveButton.click();
	}

	// Unarchive Inquiry Icon
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]")
	public WebElement unarchiveInquiry;

	public void clickUnArchiveInquiryIcon() {
		unarchiveInquiry.click();
	}

	// Cancel for the UnArchive Popup
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[15]/div[2]/div[1]/div[1]/div[2]/div[2]/button[1]")
	public WebElement cancelUnArchiveButton;

	public void cancelUnArchiveButton() {
		cancelUnArchiveButton.click();
	}

	// Archive Inquiry Icon
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[15]/div[2]/div[1]/div[1]/div[2]/div[2]/button[2]")
	public WebElement confirmUnArchiveButton;

	public void confirmUnArchiveButton() {

		confirmUnArchiveButton.click();
	}

	// Inquiry List Dropdown
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")
	public WebElement inquiryListDropdown;

	public void clickInquiryListDropdown() {
		inquiryListDropdown.click();
	}

///////////////////////////////////////// Inquiry
///////////////////////////////////////// Details /////////////////////////////////////////////

	// Inquiry Image
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]")
	public WebElement inquiryImage;

	public void clickInquiryImage() {
		inquiryImage.click();
	}

	// Close Inquiry Image
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[5]")
	public WebElement closeInquiryImage;

	public void clickCloseInquiryImage() {
		closeInquiryImage.click();
	}

	// Edit Inquiry button
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h5[1]/a[2]")
	public WebElement editInquiryButton;

	public void clickEditInquiryTitleButton() {
		editInquiryButton.click();
	}

	// Edit Inquiry Title
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h5[1]/input[1]")
	public WebElement editInquiryTitle;

	public void enterEditInquiryTitle(String strEditTitle) {
		editInquiryTitle.clear();
		editInquiryTitle.sendKeys(strEditTitle);
	}

	// Edit Inquiry Submit
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h5[1]/a[1]")
	public WebElement editInquirySubmit;

	public void clickEditInquirySubmit() {
		editInquirySubmit.click();
	}

	// Edit Inquiry Cancel
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h5[1]/a[2]")
	public WebElement editInquiryCancel;

	public void clickEditInquiryCancel() {
		editInquiryCancel.click();
	}

///////////////////////////////////////// Video
///////////////////////////////////////// Call /////////////////////////////////////////////

	// Video Call icon locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/li[1]/a[1]")
	public WebElement clickVideoCall;

	public void clickVideoCall() {
		clickVideoCall.click();
	}

	// start Video Call icon locator
	@FindBy(xpath = "//*[@id=\"style-3\"]/div[1]/div/div[3]/div/div/div/a/div/div/i")
	public WebElement clickStartVideoCall;

	public void clickStartVideoCall() {
		clickStartVideoCall.click();
	}

	// Close Video Call Side bar locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[1]/div[2]/div[2]/span[1]")
	public WebElement closeVideoCallSidebar;

	public void closeVideoCallSideBar() {
		closeVideoCallSidebar.click();
	}

	// Disconnect button for Video call
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[10]/div[2]/div[1]/div[3]/div[1]/button[3]")
	public WebElement disconnectCallButton;

	public void clickDisconnectCallButton() {
		disconnectCallButton.click();
	}

	// Page Factory constructor
	public ObjectInquiryFunctionalities(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
