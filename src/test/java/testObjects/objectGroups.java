package testObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class objectGroups {

	// Page factory
	public objectGroups(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Groups tab
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[5]/div[1]/a[7]/div[1]/div[2]")
	WebElement groupTab;

	public void clickGroupTab() {
		groupTab.click();
	}

	// Create New Group button locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/button[1]")
	WebElement createNewGroup;

	public void clickCreateNewGroup() {
		createNewGroup.click();
	}

	// Enter Group Subject
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	WebElement groupSubject;

	public void enterGroupSubject(String strGroupSubject) {
		groupSubject.sendKeys(strGroupSubject);
	}

	// Add Group Description
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/textarea[1]")
	WebElement groupDescription;

	public void enterGroupDescription(String strGroupDescription) {
		groupDescription.sendKeys(strGroupDescription);
	}

	// Set as Default Group
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/label[1]/span[1]")
	WebElement defaultGroup;

	public void setDefaultGroup() {
		defaultGroup.click();
	}

	// Click to select participant(s)
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[2]/div[1]/button[1]")
	WebElement selectParticipant;

	public void clickSelectParticipant() {
		selectParticipant.click();
	}

	// List Contacts
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div[1]/label[1]/span[1]")
	public List<WebElement> contactList;

	// Add Participant
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[3]/button[1]")
	WebElement addParticipant;

	public void addParticipantButton() {
		addParticipant.click();
	}

	// Close Participant SideBar
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[3]/button[2]")
	WebElement closeParticipantSideBar;

	public void CloseParticipantSideBarButton() {
		closeParticipantSideBar.click();
	}

	// Upload Profile photo
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[1]/span[1]")
	WebElement uploadProfilePhoto;

	public void clickUploadPhoto() {
		uploadProfilePhoto.click();
	}

	// Create Group Submit Button
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]")
	public WebElement createGroupButton;

	public void submitCreateGroup() {
		createGroupButton.click();
	}

	// Create Group Cancel Button
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[2]")
	WebElement createGroupCancelButton;

	public void cancelCreateGroup() {
		createGroupCancelButton.click();
	}

	// errorSelectParticipant
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[36]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]")
	public WebElement errorSelectParticipant;
}
