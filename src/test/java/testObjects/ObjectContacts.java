package testObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectContacts {

	// Error of No contacts
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]")
	public WebElement noContactsorGroups;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[5]/div[1]/a[3]/div[1]")
	WebElement contactsTab;

	public void clickContactsTab() {
		contactsTab.click();
	}

	// Page Factory method
	public ObjectContacts(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	// First contact locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/a[1]/div[1]")
	WebElement firstContact;

	public void clickFirstContacts() {
		firstContact.click();
	}

	// Click 1:1 Inquiry locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")
	WebElement OnetoOneInquiryButton;

	public void click1to1InquiryButton() {
		OnetoOneInquiryButton.click();
	}

	// Click Create Inquiry locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]")
	WebElement NewInquiryButton;

	public void clickCreateInquiryButton() {
		NewInquiryButton.click();
	}

	// Click Create Inquiry for Group locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")
	WebElement NewGroupInquiryButton;

	public void clickCreateInquiryGroupButton() {
		NewGroupInquiryButton.click();
	}

	// List of Contact Tab
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
	WebElement contactGroupsTab;

	public void clickContactGroupTab() {
		contactGroupsTab.click();
	}

}
