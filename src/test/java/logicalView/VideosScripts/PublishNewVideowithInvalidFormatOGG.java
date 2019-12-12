package logicalView.VideosScripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectVideo;

public class PublishNewVideowithInvalidFormatOGG extends ApplicationUtility {

	ObjectVideo mObjectVideo = new ObjectVideo(driver);

	public void publishNewVideo() {

		refreshPage();
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

		// Click on Upload Video button
		mObjectVideo.clickUploadVideoButton();
		waitTime(1000);

		// Select the video tobe uploaded
		attachmedia("file_example_OGG_480_1_7mg.ogg");
		waitTime(8000);

		// Enter video Title
		mObjectVideo.enterVideoTitle(BaseClass.getValueFromPropertyFile("videos.properties", "videoTitle"));

		// Enter the video Description
		mObjectVideo.enterVideoDescription(BaseClass.getValueFromPropertyFile("videos.properties", "videoDescription"));
		waitTime(1000);

		// Enter the Video Category
		mObjectVideo.enterVideoCategory(BaseClass.getValueFromPropertyFile("videos.properties", "videoCategory"));
		waitTime(3000);

		// Enter the Video Tag
		mObjectVideo.entervideoTags(BaseClass.getValueFromPropertyFile("videos.properties", "videoTag"));
		waitTime(1000);

		// Select the video Visibility
		List<WebElement> listVideoVisibilityOptions = mObjectVideo.listVideoVisibility;

		for (WebElement element : listVideoVisibilityOptions) {

			if (element.getText().equalsIgnoreCase(
					BaseClass.getValueFromPropertyFile("videos.properties", "videoVisibilityOption"))) {
				ImplicitWait(3);
				element.click();
			}
		}
		waitTime(4000);

		// Check the button is Clickable or not
		try {
			WebDriverWait wait = new WebDriverWait(driver, 6);
			wait.until(ExpectedConditions.elementToBeClickable(mObjectVideo.uploadVideoSubmitButton));
			logger.error(
					"Upload Video(submit with Invalid Format OGG button should not be Clickable with Invalid Values: Failed");
		} catch (Exception e) {
			logger.info(
					"Upload Video(submit with Invalid Format OGG button should not be Clickable with Invalid Values: Passed");
		}

	}
}
