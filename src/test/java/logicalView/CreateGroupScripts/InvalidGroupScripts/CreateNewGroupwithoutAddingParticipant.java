package logicalView.CreateGroupScripts.InvalidGroupScripts;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.objectGroups;

public class CreateNewGroupwithoutAddingParticipant extends ApplicationUtility {

	objectGroups mobjectGroups = new objectGroups(driver);
	public String groupSubject = "TestGroup " + (int) (Math.random() * 99999);

	public void CreateNewGroupwithoutParticipant() {

		// Click on Create New Group Button
		mobjectGroups.clickCreateNewGroup();
		waitTime(1000);

		// Enter Group Name
		mobjectGroups.enterGroupSubject(groupSubject);
		waitTime(500);

		// Enter Group Description
		mobjectGroups
				.enterGroupDescription(BaseClass.getValueFromPropertyFile("Groups.properties", "groupDescription"));
		waitTime(500);

		// Click on Upload photo
		mobjectGroups.clickUploadPhoto();
		waitTime(500);

		attachmedia("groupImage.jpg");
		waitTime(3000);

		mobjectGroups.submitCreateGroup();
		waitTime(3000);

		String errorSelectParticipant = mobjectGroups.errorSelectParticipant.getText();

		if (errorSelectParticipant.equalsIgnoreCase(
				BaseClass.getValueFromPropertyFile("Groups.properties", "selectMemberErrorMessage"))) {

			logger.info("Create Group submit button should not be Clickable with No Participant added: Passed");
		} else {
			logger.error("Create Group submit button should not be Clickable with No Participant added: Failed");

		}

		mobjectGroups.cancelCreateGroup();
		waitTime(1000);
	}
}
