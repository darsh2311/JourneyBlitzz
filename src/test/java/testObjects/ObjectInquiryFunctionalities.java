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

	// Page Factory constructor
	public ObjectInquiryFunctionalities(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
