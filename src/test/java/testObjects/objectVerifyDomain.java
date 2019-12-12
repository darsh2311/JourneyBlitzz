package testObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class objectVerifyDomain {

	// Enter Domain textbox locator
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	public WebElement enterDomain;

	public void enterDomain(String strenterDomain) {
		enterDomain.clear();
		enterDomain.sendKeys(strenterDomain);
	}

	// Verify Domain button locator
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/button[1]")
	public WebElement verifyDomainButton;

	public void verifyDomainButton() {
		verifyDomainButton.submit();
	}

	// Invalid Domain Name TC
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/h6[1]")
	public WebElement InvalidDomainName;

	// Blank Domain Name TC
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/span[1]")
	public WebElement BlankDomainName;

	// Dismiss Enter Domain Error Popup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[2]/div[1]/div[3]/button[1]")
	public WebElement InvalidCompanyPopupDismiss;

	public void clickCompanyPopupDismiss() {
		InvalidCompanyPopupDismiss.click();
	}

	// Invalid Company popup close button
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[2]/div[1]/div[1]/button[1]/span[1]")
	public WebElement InvalidCompanyPopupClose;

	public void clickCompanyPopupClose() {
		InvalidCompanyPopupClose.click();
	}

	// Page Factory constructor
	public objectVerifyDomain(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

}
