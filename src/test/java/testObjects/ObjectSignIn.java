package testObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ObjectSignIn {

	// Enter Email ID locator
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	public WebElement enterEmail;

	public void enterEmailId(String strEmail) {
		enterEmail.sendKeys(strEmail);
	}

	// Enter Password locator
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	public WebElement enterPassword;

	public void enterPassword(String strPassword) {
		enterPassword.sendKeys(strPassword);
	}

	// Keep Me Signed In button locator
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/label[1]/span[1]")
	public WebElement keepSignedIn;

	public void clickKeepSignedIN() {
		keepSignedIn.click();
	}

	// Signed In button locator
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/button[1]")
	public WebElement clickSignInButton;

	public void clickSignIn() {
		clickSignInButton.click();
	}

	// invalid Email text >> Enter valid email address or username.
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/span[1]")
	public WebElement invalidEmailMessage;

	// invalid Password text >> Password Required.
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/span[1]")
	public WebElement invalidPasswordMessage;

	// invalid Email and Password text >> Invalid email/user ID or password
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement invalidEmailPasswordMessage;

	// After SignIn verification
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[4]/div[1]/div[2]/a[1]")
	public List<WebElement> signInVerification;

	// Page Factory constructor
	public ObjectSignIn(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}
}
