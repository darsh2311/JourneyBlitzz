package logicalView.CreateGroupScripts.InvalidGroupScripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonFunctions.ApplicationUtility;
import testObjects.objectGroups;

public class CreateNewGroupwithBlankValues extends ApplicationUtility {

	objectGroups mobjectGroups = new objectGroups(driver);
	public String groupSubject = "TestGroup " + (int) (Math.random() * 99999);

	public void NewGroupwithBlankValues() {

		// Click on Create New Group Button
		mobjectGroups.clickCreateNewGroup();
		waitTime(1500);

		// Save the User by clicking on AddUser button
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 3);
			wait1.until(ExpectedConditions.elementToBeClickable(mobjectGroups.createGroupButton));
			logger.error("Create Group submit button should not be Clickable with Blank Values: Failed");
		} catch (Exception e) {
			logger.info("Create Group submit button should not be Clickable with Blank Values: Passed");
		}

		waitTime(2500);

		mobjectGroups.cancelCreateGroup();
		waitTime(1000);

	}
}
