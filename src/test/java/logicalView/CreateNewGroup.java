package logicalView;

import java.util.List;

import org.openqa.selenium.WebElement;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.objectGroups;

public class CreateNewGroup extends ApplicationUtility {

	objectGroups mobjectGroups = new objectGroups(driver);
	public String groupSubject = "TestGroup " + (int) (Math.random() * 99999);

	public void CreateNewGroupwithValidData() {

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

		// Click on the Select Participant Dropdown
		mobjectGroups.clickSelectParticipant();
		waitTime(500);

		List<WebElement> listContacts = mobjectGroups.contactList;

		if (listContacts.size() != 0) {

			for (int i = 0; i < listContacts.size(); i++) {
				listContacts.get(i).click();
			}
			mobjectGroups.addParticipantButton();
			waitTime(1000);

		} else {
			mobjectGroups.CloseParticipantSideBarButton();
		}

		// Click on Upload photo
		mobjectGroups.clickUploadPhoto();
		waitTime(500);

		attachmedia("groupImage.jpg");
		waitTime(3000);

		mobjectGroups.submitCreateGroup();
		waitTime(3000);
	}
}
