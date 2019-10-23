package testObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class objectForgotPassword {

	// Forgot Password link locator
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/a[1]")
	public WebElement linkForgotPassword;

	public void clickForgotPassword() {
		linkForgotPassword.click();
	}

	// Reset Password title text locator
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[2]/div[1]/form[1]/div[1]/h4[1]/span[1]")
	public WebElement resetPasswordTitle;

	// Enter Forgot password text locator
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]")
	public WebElement forgotPasswordEmail;

	public void enterForgotPassword(String strForgotPassword) {
		forgotPasswordEmail.sendKeys(strForgotPassword);
	}

	// Close Forgot password popup locator
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[2]/div[1]/form[1]/div[3]/button[1]")
	public WebElement closeForgotPasswordButton;

	public void closeButtonForgotPassword() {
		closeForgotPasswordButton.click();
	}

	// X Forgot password Popup locator
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[2]/div[1]/form[1]/div[1]/button[1]/span[1]")
	public WebElement xcloseForgotPassword;

	public void xCloseForgotPasswordButton() {
		xcloseForgotPassword.click();
	}

	// Send forgot password button locator
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[2]/div[1]/form[1]/div[3]/button[3]")
	public WebElement sendForgotPasswordButton;

	public void sendForgotPasswordButton() {
		sendForgotPasswordButton.click();
	}

	// Done forgot password button locator
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[2]/div[1]/form[1]/div[3]/button[2]")
	public WebElement doneForgotPasswordButton;

	public void donePasswordButton() {
		doneForgotPasswordButton.click();
	}

	// Invalid email id for Forgot Password message
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/h6[1]")
	public WebElement invalidMessageforgotPassword;

	// Invalid email id for Forgot Password message
	@FindBy(how = How.XPATH, using = "//*[@id=\"forgot\"]/div[2]/div/form/div[2]/div[1]/div/span[2]")
	public WebElement invalidEmailMessageforgotPassword;

	// Forgot Password Success message
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/h6[1]")
	public WebElement successMessageforgotPassword;

	// Forgot Password Not registered message
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/h6[1]")
	public WebElement notRegisteredforgotPassword;

	// Pagefactory constructor
	public objectForgotPassword(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}
}
