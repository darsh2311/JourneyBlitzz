package testObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectVideo {

	public ObjectVideo(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	// List of video options
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button")
	public List<WebElement> listVideoButtons;

	// List of Publish new Video
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li/button[1]")
	public List<WebElement> listpublishVideoButtons;

	// Upload video button
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
	WebElement uploadVideoButton;

	public void clickUploadVideoButton() {
		uploadVideoButton.click();
	}

	// Enter Video Title
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement VideoTitle;

	public void enterVideoTitle(String videoTitle) {
		VideoTitle.sendKeys(videoTitle);
	}

	public void clearVideoTitle() {
		VideoTitle.clear();
	}

	// Enter Description for video
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/textarea[1]")
	WebElement videoDescription;

	public void enterVideoDescription(String strVideoDescription) {
		videoDescription.sendKeys(strVideoDescription);
	}

	// Enter Category for video
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[3]/div[1]/input[1]")
	WebElement videoCategory;

	public void enterVideoCategory(String strVideoCategory) {
		videoCategory.sendKeys(strVideoCategory);
	}

	// Enter Tags for video
	@FindBy(xpath = "//input[@placeholder='Tags (Eg. Sensor calibration, Motor Installation etc)']")
	WebElement videoTags;

	public void entervideoTags(String strvideoTags) {
		videoTags.sendKeys(strvideoTags);
	}

	// List of video visibility options
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[6]/label/span[1]")
	public List<WebElement> listVideoVisibility;

	// Submit Upload button
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/button[1]")
	public WebElement uploadVideoSubmitButton;

	public void clickuploadVideoSubmit() {
		uploadVideoSubmitButton.submit();
	}

	// Cancel video button
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[7]/div[2]/div[1]/a[1]")
	WebElement cancelVideoButton;

	public void clickCanceluploadVideoButton() {
		cancelVideoButton.click();
	}

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[7]/div[3]/div[1]")
	public WebElement uploadProgressBar;
}
