package testObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class objectNeedHelp {

	// Need Help? link locator
	@FindBy(how = How.LINK_TEXT, using = "Need help?")
	public WebElement linkNeedHelp;

	public void clickNeedHelp() {
		linkNeedHelp.click();
	}

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[35]/div[2]/div[1]/div[1]/h4[1]/span[1]")
	public WebElement linkNeedHelpDescription;

	// Need Help popup close button
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[35]/div[2]/div[1]/div[1]/button[1]/span[1]")
	public WebElement needHelpPopupClose;

	public void clickNeedHelpPopupClose() {
		needHelpPopupClose.click();
	}

	// Submit a ticket button locator
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[35]/div[2]/div[1]/div[3]/button[1]")
	public WebElement submitTicketButton;

	public void clickSubmitTicket() {
		submitTicketButton.click();
	}

	// Network Test button locator
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[35]/div[2]/div[1]/div[3]/button[2]")
	public WebElement networkTestButton;

	public void clicknetworkTestButton() {
		networkTestButton.click();
	}

	// Terms & Conditions link
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/span[1]/a[1]")
	public WebElement linkTermsConditions;

	public void clicklinkTermsConditions() {
		linkTermsConditions.click();
	}

	// Privacy Policy link
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/span[2]/a[1]")
	public WebElement linkPrivacyPolicy;

	public void clicklinkPrivacyPolicy() {
		linkPrivacyPolicy.click();
	}

	// Contact Us link
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/span[3]/a[1]")
	public WebElement linkContactLink;

	public void clicklinkContactLink() {
		linkContactLink.click();
	}

	public objectNeedHelp(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

}
