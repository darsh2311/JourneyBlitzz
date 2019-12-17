package testObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectDocuments {
	public ObjectDocuments(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	// Upload file document
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]/button[1]")
	WebElement uploadFileButton;

	public void clickUploadFile() {
		uploadFileButton.click();
	}

	// Click to select participant(s)
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/button[1]")
	WebElement selectParticipant;

	public void clickSelectParticipant() {
		selectParticipant.click();
	}

	// Select participant locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement selectParticipantfromList;

	public void selectAddParticipant() {
		selectParticipantfromList.click();
	}

	// Group tab to add group in New inquiry
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[2]/div[2]/ul[1]/li[2]/a[1]")
	public WebElement addGroupParticipant;

	public void clickAddGroupParticipant() {
		addGroupParticipant.click();
	}

	// Add Participant
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[3]/button[1]")
	WebElement addParticipant;

	public void addParticipantButton() {
		addParticipant.click();
	}

	// Upload Document locator
	@FindBy(xpath = "//div[@class='col-sm-12 mt-15']//div[@name='file']")
	public WebElement uploadDocument;

	public void clickuploadDocument() {
		uploadDocument.click();
	}

	// Document name success message
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/a[1]")
	public WebElement successDocumentMessage;

	// Close Participant SideBar
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[3]/button[2]")
	WebElement closeParticipantSideBar;

	public void CloseParticipantSideBarButton() {
		closeParticipantSideBar.click();
	}

	// No Participant Message
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[2]/div[2]/div[1]/div[1]/div[1]")
	public WebElement errorNoContactParticipantToAdd;

	// No Group Participant Message
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[2]/div[2]/div[2]/div[1]/div[1]")
	public WebElement errorNoGroupParticipantToAdd;

	// Select Group participant locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement selectGroupParticipant;

	public void selectAddGroupParticipant() {
		selectGroupParticipant.click();
	}

	// Select Group participant2 locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement selectGroupParticipant2;

	public void selectAddGroupParticipant2() {
		selectGroupParticipant2.click();
	}

	// Add member locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[3]/button[1]")
	public WebElement addMemberButton;

	public void clickAddMember() {
		addMemberButton.click();
	}

	// Back button to Close add Participant sidebar locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[3]/button[2]")
	public WebElement backButtonAddParticipant;

	public void clickbackButtonAddParticipant() {
		backButtonAddParticipant.click();
	}

	// Cancel button to Cancel creating New Inquiry
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[2]")
	public WebElement cancelCreateInquiry;

	public void clickCancelCreateInquiry() {
		cancelCreateInquiry.click();
	}

	// Submit upload locator
	@FindBy(xpath = "//*[@id=\"documentform\"]/div[2]/button[1]")
	public WebElement submitUploadDocument;

	public void clicksubmitUploadDocument() {
		submitUploadDocument.click();
	}
}
