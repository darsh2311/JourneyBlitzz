package testObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import commonFunctions.ApplicationUtility;

public class ObjectSignOut extends ApplicationUtility {

	// Blitzz dropdown locator
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[4]/div[1]/div[3]/div[1]")
	public WebElement blitzzDropdown;

	public void blitzzDropdown() {
		blitzzDropdown.click();
	}

	// SignOut button locator
	@FindBy(how = How.XPATH, using = "//a[@class='logout_button']")
	public WebElement signoutOption;

	public void signOutOption() {
		signoutOption.click();
	}

	// Page Factory constructor
	public ObjectSignOut(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
}
