package logicalView.InvalidCreateGroupScripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.objectGroups;

public class CreateNewGroupwithInvalidValues extends ApplicationUtility {

	objectGroups mobjectGroups = new objectGroups(driver);
	public String groupSubject = "TestGroup " + (int) (Math.random() * 99999);

	public void CreateNewGroupwithInValidData() {

		// Click on Create New Group Button
		mobjectGroups.clickCreateNewGroup();
		waitTime(1500);

		// Enter Group Name
		mobjectGroups.enterGroupSubject(BaseClass.getValueFromPropertyFile("Groups.properties", "invalidGroupName"));
		waitTime(500);

		// Enter Group Description
		mobjectGroups.enterGroupDescription(
				BaseClass.getValueFromPropertyFile("Groups.properties", "invalidGroupDescription"));
		waitTime(500);

		// Click on Upload photo
		mobjectGroups.clickUploadPhoto();
		waitTime(500);

		attachmedia("inquiryDoc1MB.docx");
		waitTime(3000);

		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 3);
			wait1.until(ExpectedConditions.elementToBeClickable(mobjectGroups.createGroupButton));
			logger.error("Create Group submit button should not be Clickable with Invalid Values: Failed");
		} catch (Exception e) {
			logger.info("Create Group submit button should not be Clickable with Invalid Values: Passed");
		}

		waitTime(1500);
		mobjectGroups.cancelCreateGroup();
		waitTime(1000);

	}
}
