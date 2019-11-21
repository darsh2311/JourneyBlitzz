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

	// Search Group
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement searchGroup;

	public void enterSearchGroup(String strSearchEntry) {
		searchGroup.clear();
		searchGroup.sendKeys(strSearchEntry);
	}

	public void clearSearchGroup() {
		searchGroup.clear();
	}

	// Group Ellipsis menu
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/div[1]/a[1]/i[1]")
	public WebElement groupEllipsis;

	public void clickGroupEllipsis() {
		groupEllipsis.click();
	}

	// List Group Ellipsis
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/div[1]/ul[1]/li")
	public List<WebElement> listEllipsisValue;

	// Default Group Locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]")
	public WebElement defaultGroupLocator;

	// Cancel Set Group Default Popup
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/button[1]")
	public WebElement cancelDefaultPopup;

	public void clickCancelDefaultPopup() {
		cancelDefaultPopup.click();
	}

	// Yes Set Group Default Popup
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/button[2]")
	public WebElement yesSetDefaultPopup;

	public void clickYesSetDefaultPopup() {
		yesSetDefaultPopup.click();
	}

	// Close Set Group Default Popup
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[3]/div[2]/div[1]/div[3]/button[1]")
	public WebElement closeRemoveDefaultPopup;

	public void clickCloseRemoveDefaultPopup() {
		closeRemoveDefaultPopup.click();
	}

	// Yes Set Group Default Popup
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[3]/div[2]/div[1]/div[3]/button[2]")
	public WebElement yesRemoveDefaultPopup;

	public void clickYesRemoveDefaultPopup() {
		yesRemoveDefaultPopup.click();
	}

	// Edit Group Image
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[6]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]")
	WebElement editGroupImage;

	public void clickEditGroupImage() {
		editGroupImage.click();
	}

	// Edit Group Name
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[6]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")
	public WebElement editGroupSubject;

	public void enterEditedGroupSubject(String strGroupSubject) {
		editGroupSubject.clear();
		editGroupSubject.sendKeys(strGroupSubject);
	}

	// Edit Group Description
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[6]/form[1]/div[1]/div[1]/div[2]/div[2]/textarea[1]")
	public WebElement editGroupDescription;

	public void enterEditedGroupDescription(String strGroupDescription) {
		editGroupDescription.clear();
		editGroupDescription.sendKeys(strGroupDescription);
	}

	// Close Edit Group
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[6]/form[1]/div[1]/div[1]/div[3]/button[1]")
	WebElement closeEditGroupPopup;

	public void clickCloseEditGroup() {
		closeEditGroupPopup.click();
	}

	// Update Edit Group
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[6]/form[1]/div[1]/div[1]/div[3]/button[2]")
	WebElement closeUpdateGroupPopup;

	public void clickUpdateEditGroup() {
		closeUpdateGroupPopup.click();
	}

	// No Groups Available error message
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]")
	public static WebElement noGroupAvailable;

	// Remove particular Member
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/a[1]/i[1]")
	WebElement removeGroupMember;

	public void clickRemoveMember() {
		removeGroupMember.click();
	}

	// Group Role
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]")
	WebElement groupRole;

	public void clickGroupRole() {
		groupRole.click();
	}

	// List Group
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/ul[1]/li/a[1]")
	public List<WebElement> listGroupRole;

	// Update Group Roles
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div[3]/button[2]")
	WebElement updateGroupRoles;

	public void clickUpdateRoles() {
		updateGroupRoles.click();
	}

	// Close Group Roles Popup
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div[3]/button[1]")
	WebElement closeGroupRolePopup;

	public void clickCloseGroupRole() {
		closeGroupRolePopup.click();
	}

	// No participant in view members
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]")
	public WebElement noParticipantMessage;

	// Close Add Member Popup
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[5]/div[2]/div[1]/div[3]/button[1]")
	WebElement closeAddMemberPopup;

	public void clickCloseMemberPopup() {
		closeAddMemberPopup.click();
	}

	// Accept Add Member Popup
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[5]/div[2]/div[1]/div[3]/button[2]")
	WebElement acceptAddMemberPopup;

	public void clickAddMemberPopup() {
		acceptAddMemberPopup.click();
	}

	// No participant in Add members
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[5]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]")
	public WebElement noAddParticipantMessage;

	// Close Delete Member Popup
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[2]/div[2]/div[1]/div[3]/button[1]")
	WebElement closeDeleteMemberPopup;

	public void clickCloseDeleteMemberPopup() {
		closeDeleteMemberPopup.click();
	}

	// Delete Member Popup
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[2]/div[2]/div[1]/div[3]/button[2]")
	WebElement acceptDeleteMemberPopup;

	public void clickDeleteMemberPopup() {
		acceptDeleteMemberPopup.click();
	}
}
