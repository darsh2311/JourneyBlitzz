package logicalView.VideosScripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectVideo;

public class PublishNewVideowithValidFormat extends ApplicationUtility {

	ObjectVideo mObjectVideo = new ObjectVideo(driver);

	public void publishNewVideo(String strVideo) {
		ImplicitWait(10);

		// Select the option Publish new Video option
		List<WebElement> listVideoOptions = mObjectVideo.listVideoButtons;

		for (WebElement element : listVideoOptions) {

			if (element.getText()
					.equalsIgnoreCase(BaseClass.getValueFromPropertyFile("videos.properties", "videoPublish"))) {
				ImplicitWait(10);
				// Issue is there after uploading a video, Publish new video button doesn't work
				// after 1 click, Need to click 2 times.
				element.click();
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
		waitTime(5000);

		// Click on Upload Video button
		mObjectVideo.clickUploadVideoButton();
		waitTime(1000);

		// Select the video tobe uploaded
		attachmedia(strVideo);
		waitTime(8000);

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

		// Click on submit Video
		mObjectVideo.clickuploadVideoSubmit();
		waitTime(20000);

		String verifyLoginTitle = driver.getTitle();
		String expectedLoginTitle = BaseClass.getValueFromPropertyFile("videos.properties", "expectedLoginTitle");

		try {
			Assert.assertEquals(verifyLoginTitle, expectedLoginTitle);
			logger.info(BaseClass.getValueFromPropertyFile("videos.properties", "successMessage") + " with " + strVideo
					+ " video format: Passed");
		} catch (Throwable e) {
			logger.error(BaseClass.getValueFromPropertyFile("videos.properties", "successMessage") + " with " + strVideo
					+ " video format: Failed" + e);
		}

	}
}
