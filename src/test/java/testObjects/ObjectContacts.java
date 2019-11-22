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

}
