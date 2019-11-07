package testObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObjectSignUpCopy {

	// SignUp link of Login page locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/a[2]")
	public WebElement linkSignUp;

	public void clickSignUpLink() {
		linkSignUp.click();
	}

	// Enter Email to Verify locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	public WebElement verifyEnterEmail;

	public void enterVerifyEmail(String enterEmail) {
		verifyEnterEmail.clear();
		verifyEnterEmail.sendKeys(enterEmail);
	}

	// Verify button for the Signup email locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/button[1]")
	public WebElement verifyEmailButton;

	public void clickverifyEmail() {
		verifyEmailButton.click();
	}

	// Add Photo for SignUp
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/a[1]")
	public WebElement addPhoto;
	// html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/a[1]

	public void uploadPhoto() {
		addPhoto.sendKeys("/home/darshan/eclipse-workspace/Journey/src/test/resources/photo.jpg");
	}

	// Add Firstname for SignUp
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	public WebElement verifyFirstname;

	public void enterVerifiedFirstname(String strFirstName) {
		verifyFirstname.sendKeys(strFirstName);
	}

	// Add lastname for SignUp
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/input[1]")
	public WebElement verifylastname;

	public void enterverifylastname(String strLastName) {
		verifylastname.sendKeys(strLastName);
	}

	// Add Jobrole for SignUp
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[5]/input[1]")
	public WebElement verifyJobRole;

	public void enterJobRole(String strJobRole) {
		verifyJobRole.sendKeys(strJobRole);
	}

	// Add Password for SignUp
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[6]/input[1]")
	public WebElement addVerifyPassword;

	public void addVerifyPassword(String strPassword) {
		addVerifyPassword.sendKeys(strPassword);
	}

	// Add Confirm Password for SignUp
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[7]/input[1]")
	public WebElement addVerifyConfirmPassword;

	public void addVerifyConfirmPassword(String strConfirmPassword) {
		addVerifyConfirmPassword.sendKeys(strConfirmPassword);
	}

	// Add Country Code for SignUp
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[8]/div[1]/input[1]")
	public WebElement addCountryCode;

	public void addCountryCode(String inCode) {
		addCountryCode.clear();
		addCountryCode.sendKeys(inCode);
	}

	// Add Mobile Number for SignUp
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[8]/div[3]/input[1]")
	public WebElement addmobileNumber;

	public void addmobileNumber(String number) {
		addmobileNumber.sendKeys(number);
	}

	// Check Terms & Conditions for SignUp
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/label[1]/span[1]")
	public WebElement checkTermsConditions;

	public void checkTermsConditions() {
		checkTermsConditions.click();
	}

	// Click signup
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/button[1]")
	public WebElement clickSignUp;

	public void clickSignUp() {
		clickSignUp.click();
	}

	// Back to Login icon locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/a[1]/i[1]")
	public WebElement backtoLogin;

	public void backToLoginIcon() {
		backtoLogin.click();
	}

	// Settings button locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[4]/div[1]/div[3]/div[2]/a[1]/div[1]/div[1]")
	public WebElement settings;

	public void clickSettings() {
		settings.click();
	}

	// User Management button locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[7]")
	public WebElement userManagement;

	public void clickUserManagement() {
		userManagement.click();
	}

	// Add User button locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/a[1]")
	public WebElement addUserButton;

	public void clickAddButton() {
		addUserButton.click();
	}

	// By Email tab locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")
	public WebElement byEmailTab;

	public void clickByEmailTab() {
		byEmailTab.click();
	}

	// Enter Email Signup locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	public WebElement enterEmail;

	public void enterEmailID(String strEnterEmail) {
		enterEmail.sendKeys(strEnterEmail);
	}

	// Enter Userid Signup locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	public WebElement enterUserid;

	public void enterUserID(String strEnterEmail) {
		enterUserid.sendKeys(strEnterEmail);
	}

	// Click on User type locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/button[1]")
	public WebElement selectUser;

	public void clickUserType() {
		selectUser.click();
	}

	// Select User type Admin Dropdown locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
	public WebElement userAdmin;

	public void selectUserAdmin() {
		userAdmin.click();
	}

	// Select User type Internal Dropdown locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")
	public WebElement userInternal;

	public void selectUserInternal() {
		userInternal.click();
	}

	// Select User type External Dropdown locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
	public WebElement userExternal;

	public void selectUserExternal() {
		userExternal.click();
	}

	// Set password toggle On/Off locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/label[1]/span[1]")
	public WebElement setPassword;

	public void setPasswordToggle() {
		setPassword.click();
	}

	// Enter New Password textbox locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/input[1]")
	public WebElement enterPassword;

	public void enterPassword(String strPassword) {
		enterPassword.sendKeys(strPassword);
	}

	// Enter Confirm Password textbox locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[4]/div[2]/input[1]")
	public WebElement enterConfirmPassword;

	public void enterConfirmPassword(String strConfirmPassword) {
		enterConfirmPassword.sendKeys(strConfirmPassword);
	}

	// Enter First Name textbox locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[4]/div[3]/input[1]")
	public WebElement enterFirstName;

	public void enterFirstName(String strFirstName) {
		enterFirstName.sendKeys(strFirstName);
	}

	// Enter Last Name textbox locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[4]/div[4]/input[1]")
	public WebElement enterLastName;

	public void enterLastName(String strLastName) {
		enterLastName.sendKeys(strLastName);
	}

	// Add Another User checkbox locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement checkBoxAddAnotherUser;

	public void clickcheckBoxAddAnotherUser() {
		checkBoxAddAnotherUser.click();
	}

	// By UserId tab locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")
	public WebElement byUserIdTab;

	public void clickByUserIdTab() {
		byUserIdTab.click();
	}

	// Close Add User sidebar locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/button[1]")
	public WebElement closebutton;

	public void closeAddUserSidebar() {
		closebutton.click();
	}

	// Add User button sidebar locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/button[2]")
	public WebElement saveAddUser;

	public void saveAddUser() {
		saveAddUser.submit();
	}

	// Notify by Email locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[4]/div[5]/div[1]/label[1]/span[1]")
	public WebElement notifyByEmail;

	public void notifyByEmail() {
		notifyByEmail.click();
	}

	// Enter Email to Notify locator
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[4]/div[6]/div[1]/input[1]")
	public WebElement enterNotifyEmail;

	public void enterNotifyEmailId(String notifyEmail) {
		enterNotifyEmail.sendKeys(notifyEmail);
	}

	/*
	 * // Pagefactory constructor public ObjectSignUpCopy(WebDriver driver) {
	 * 
	 * PageFactory.initElements(driver, this);
	 * 
	 * }
	 */

	/////////////////////////////////////
	// Success messages/Error Messages////
	/////////////////////////////////////

	// Verify Account Submission with blank email
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/span[1]")
	public WebElement blankVerifyEmailErrorMessage;

	// Invalid or not registered Email/Userid Error message
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[2]/div[1]/div[1]/h4[1]/span[1]")
	public WebElement invalidVerifyEmailErrorMessage;

	// Error Message Dismiss Button
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[2]/div[1]/div[3]/button[1]")
	public WebElement errorMessageDismissButton;

	public void errorMessageDismissButton() {
		errorMessageDismissButton.click();
	}

	// Error Message Close Button
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[2]/div[1]/div[1]/button[1]/span[1]")
	public WebElement errorMessageCloseButton;

	public void errorMessageCloseButton() {
		errorMessageCloseButton.click();
	}

}
