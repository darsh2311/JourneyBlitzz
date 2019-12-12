package logicalView.VideosScripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectVideo;

public class PublishNewVideowithBlankValues extends ApplicationUtility {

	ObjectVideo mObjectVideo = new ObjectVideo(driver);

	public void publishNewVideo() {

		ImplicitWait(5);
		// Select the option Publish new Video option
		List<WebElement> listVideoOptions = mObjectVideo.listVideoButtons;

		for (WebElement element : listVideoOptions) {

			if (element.getText()
					.equalsIgnoreCase(BaseClass.getValueFromPropertyFile("videos.properties", "videoPublish"))) {
				ImplicitWait(3);
				element.click();
			}
		}
		waitTime(1000);

		// Upload from Computer
		List<WebElement> listPublishVideoOptions = mObjectVideo.listpublishVideoButtons;

		for (WebElement element : listPublishVideoOptions) {

			if (element.getText().equalsIgnoreCase(
					BaseClass.getValueFromPropertyFile("videos.properties", "selectVideoUploadOption"))) {
				ImplicitWait(3);
				element.click();
			}
		}
		waitTime(3000);
		mObjectVideo.enterVideoTitle(BaseClass.getValueFromPropertyFile("videos.properties", "videoTitle"));
		waitTime(1000);
		mObjectVideo.clearVideoTitle();
		waitTime(3000);

		// Check the button is Clickable or not
		try {
			WebDriverWait wait = new WebDriverWait(driver, 6);
			wait.until(ExpectedConditions.elementToBeClickable(mObjectVideo.uploadVideoSubmitButton));
			logger.error(
					"Upload Video(submit with Blank values button should not be Clickable with Blank Values: Failed");
		} catch (Exception e) {
			logger.info(
					"Upload Video(submit with Blank values button should not be Clickable with Blank Values: Passed");
		}

	}
}
