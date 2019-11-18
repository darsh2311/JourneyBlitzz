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
	WebElement inviteParticipant;

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

	// Enter Invite Message
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[4]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/label[1]/textarea[1]")
	WebElement inviteMessage;

	public void enterInviteMessage(String strInviteMessage) {
		inviteMessage.sendKeys(strInviteMessage);
	}

	// Invite and Join Button locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[4]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/button[2]")
	WebElement inviteAndJoin;

	public void clickInviteAndJoin() {
		inviteAndJoin.click();
	}

	// Search button for Reference Id locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[4]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/label[1]/textarea[1]")
	WebElement searchReferenceId;

	public void entersearchReferenceId(String strReferenceID) {
		searchReferenceId.sendKeys(strReferenceID);
	}

	// Page Factory method
	public ObjectShowME(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

}
