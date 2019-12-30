package testObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectShowME {

	// ShowME Tab locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[5]/div[1]/a[2]/div[1]/div[1]")
	WebElement showmeTab;

	public void clickShowmeTab() {
		showmeTab.click();
	}

	// Enter Reference Id locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/label[1]/input[1]")
	WebElement referenceId;

	public void enterReference(String strReference) {
		referenceId.sendKeys(strReference);
	}

	// Invite Participant Button
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement inviteParticipant;

	public void clickInviteParticipant() {
		inviteParticipant.click();
	}

	// List Of Invite Options locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[4]/form[1]/div[1]/div[2]/ul[1]/li/a[1]")
	public List<WebElement> listInviteOptions;

	// Select from the List of the Countru
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[4]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")
	WebElement listCountries;

	public void clickListCountries() {
		listCountries.click();
	}

	// List Of Country Code Options locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[4]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li/a[1]/span[1]")
	public List<WebElement> listCountryCodes;

	// Enter Phone Number locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[4]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement phoneNumber;

	public void enterPhoneNumber(String strInviteNumber) {
		phoneNumber.sendKeys(strInviteNumber);
	}

	public void clearPhoneNumber() {
		phoneNumber.clear();
	}

	// Enter Invite Message
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[4]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/label[1]/textarea[1]")
	WebElement inviteMessage;

	public void enterInviteMessage(String strInviteMessage) {
		inviteMessage.clear();
		inviteMessage.sendKeys(strInviteMessage);
	}

	public void clearInviteMessage() {
		inviteMessage.clear();
	}

	// Invite and Join Button locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[4]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/button[2]")
	public WebElement inviteAndJoin;

	public void clickInviteAndJoin() {
		inviteAndJoin.click();
	}

	// Search button for Reference Id locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
	WebElement searchReferenceId;

	public void entersearchReferenceId(String strReferenceID) {
		searchReferenceId.sendKeys(strReferenceID);
	}

	public void clearSearchReferenceId() {
		searchReferenceId.clear();
	}

	// Ellipsis Menu for Invite Popup
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[4]/form[1]/div[1]/div[2]/div[1]/button[1]")
	WebElement inviteEllipsis;

	public void clickInviteEllipsis() {
		inviteEllipsis.click();
	}

	// Enter Invite Email
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[4]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/label[1]/input[1]")
	WebElement inviteEmail;

	public void enterInviteEmail(String strInviteEmail) {
		inviteEmail.sendKeys(strInviteEmail);
	}

	public void clearInviteEmail() {
		inviteEmail.clear();
	}

	// List Of Ellipsis Options locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[4]/form[1]/div[1]/div[2]/div[1]/ul[1]/li/a[1]")
	public List<WebElement> listEllipsisOptions;

	// Close button of Invite Popup
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[4]/form[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
	WebElement closeInvitePopup;

	public void clickCloseInvitePopup() {
		closeInvitePopup.click();
	}

	// Ellipsis button of Session
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/div[1]/a[1]/i[1]")
	WebElement ellipsisOptionSession;

	public void clickSessionEllipsisOption() {
		ellipsisOptionSession.click();
	}

	// List Of Ellipsis Options of Session History table locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/div[1]/ul[1]/li/a[1]")
	public List<WebElement> listSessionEllipsisOptions;

	// Invite Pop up title verification
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[4]/form[1]/div[1]/div[1]/div[1]/h4[1]/span[1]")
	public WebElement invitePopupTitle;

	// Close button of Delete Session Popup
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[5]/div[2]/div[1]/div[3]/button[1]")
	WebElement closeDeletePopup;

	public void clickCloseDeleteSession() {
		closeDeletePopup.click();
	}

	// Yes button of Delete Session Popup
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[5]/div[2]/div[1]/div[3]/button[2]")
	WebElement okDeletePopup;

	public void clickOkDeleteSession() {
		okDeletePopup.click();
	}

	// Join Call button
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/button[1]")
	public WebElement joinCallButton;

	public void clickJoinCallButton() {
		joinCallButton.click();
	}

	// Session Status filter locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
	WebElement statusFilter;

	public void clickStatusFilter() {
		statusFilter.click();
	}

	// List Of Session Status filter
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li/a[1]")
	public List<WebElement> listSessionStatusFilter;

	// Page Factory method
	public ObjectShowME(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

}
