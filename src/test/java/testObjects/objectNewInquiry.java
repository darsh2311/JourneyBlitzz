package testObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class objectNewInquiry {

	public objectNewInquiry(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);

	}

	// New Inquiry button of Header
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[4]/div[1]/div[2]/a[1]/div[1]")
	public WebElement newInquiryButton;

	public void clickNewInquiryButton() {
		newInquiryButton.click();
	}

	// New Inquiry Name
	@FindBy(xpath = "//input[@id='title']")
	public WebElement newInquiryName;

	public void enterNewInquiryName(String strInquiryName) {
		newInquiryName.sendKeys(strInquiryName);
	}

	// New Inquiry Description
	@FindBy(xpath = "//textarea[@id='style-3']")
	public WebElement newInquiryDescription;

	public void enterInquiryDescription(String strInquiryDescription) {
		newInquiryDescription.sendKeys(strInquiryDescription);
	}

	// No label message locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[3]/div[2]/div[1]/button[1]/span[1]")
	public WebElement noLabelMessage;

	// Add Label button of Header
	@FindBy(xpath = "//div[@class='col-md-12']//button[@class='btn btn-default dropdown-toggle b139']")
	public WebElement addLabel;

	public void clickAddLabel() {
		addLabel.click();
	}

	// List label
	@FindBy(xpath = "//ul[@id='style-3']")
	public WebElement listLabel;

	// Add participant locator
	@FindBy(xpath = "//*[@id=\"style-3\"]/div[4]/div[2]/div/button")
	public WebElement addParticipant;

	public void clickAddParticipantButton() {
		addParticipant.click();
	}

	// Select participant locator
	@FindBy(xpath = "//div[@id='contacts']//div[2]//div[1]//div[1]//div[1]//label[1]//span[1]")
	public WebElement selectParticipant;

	public void selectAddParticipant() {
		selectParticipant.click();
	}

	// Select Group participant locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[7]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement selectGroupParticipant;

	public void selectAddGroupParticipant() {
		selectGroupParticipant.click();
	}

	// Add member locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[7]/div[3]/button[1]")
	public WebElement addMemberButton;

	public void clickAddMember() {
		addMemberButton.click();
	}

	// Create inquiry locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]")
	public WebElement clickCreateInquiry;

	public void clickCreateInquiry() {
		clickCreateInquiry.click();
	}

	// Create Inquiry success message
	@FindBy(xpath = "//span[@class='font400 ng-binding']")
	public WebElement successInquiryMessage;

	// Upload Image locator
	@FindBy(xpath = "//div[@class='col-sm-12']//div[@name='file']")
	public WebElement uploadImage;

	public void clickUploadImage() {
		uploadImage.click();
	}

	// Save Upload Image locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]")
	public WebElement saveUploadImage;

	public void clickSaveUploadImage() {
		saveUploadImage.click();
	}

	// No Participant Message
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[7]/div[2]/div[2]/div[1]/div[1]/div[2]")
	public WebElement errorNoContactParticipantToAdd;

	// No Group Participant Message
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[7]/div[2]/div[2]/div[2]/div[1]/div[1]")
	public WebElement errorNoGroupParticipantToAdd;

	// Back button to Close add Participant sidebar locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[7]/div[3]/button[2]")
	public WebElement backButtonAddParticipant;

	public void clickbackButtonAddParticipant() {
		backButtonAddParticipant.click();
	}

	// Cancel button to Cancel creating New Inquiry
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[2]")
	public WebElement cancelCreateInquiry;

	public void clickCancelCreateInquiry() {
		cancelCreateInquiry.click();
	}

	// Group tab to add group in New inquiry
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[7]/div[2]/div[2]/ul[1]/li[2]/a[1]")
	public WebElement addGroupParticipant;

	public void clickAddGroupParticipant() {
		addGroupParticipant.click();
	}
}
