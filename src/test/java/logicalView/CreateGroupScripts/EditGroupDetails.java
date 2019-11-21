package logicalView.CreateGroupScripts;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.objectGroups;

public class EditGroupDetails extends ApplicationUtility {
	objectGroups mobjectGroups = new objectGroups(driver);
	CreateInquiryThroughGroup mCreateInquiryThroughGroup = new CreateInquiryThroughGroup();
	public String editedGroupSubject = "Edited Group" + (int) (Math.random() * 9999);

	public void editGroupDetail(String strSearchGroup) {

		// Search the group
		mobjectGroups.enterSearchGroup(strSearchGroup);
		waitTime(1000);

		mobjectGroups.clickGroupEllipsis();
		waitTime(1000);

		mCreateInquiryThroughGroup.ellipsisList("ellipsisEditDetail");
		waitTime(1000);

		mobjectGroups.clickCloseEditGroup();
		waitTime(1000);

		mobjectGroups.clickGroupEllipsis();
		waitTime(1000);

		mCreateInquiryThroughGroup.ellipsisList("ellipsisEditDetail");
		waitTime(2000);

		mobjectGroups.clickEditGroupImage();
		attachmedia("Profilephoto.jpg");
		waitTime(4000);

		mobjectGroups.enterEditedGroupSubject(editedGroupSubject);
		waitTime(500);

		mobjectGroups.enterEditedGroupDescription(
				BaseClass.getValueFromPropertyFile("Groups.properties", "enterEditedGroupDescription"));
		waitTime(500);

		mobjectGroups.clickUpdateEditGroup();
		waitTime(3000);

		// clear Search Area
		mobjectGroups.enterSearchGroup(editedGroupSubject);
		waitTime(3000);
		mobjectGroups.clearSearchGroup();

		String noGroupsAvailable = objectGroups.noGroupAvailable.getText();
		if (noGroupsAvailable
				.equalsIgnoreCase(BaseClass.getValueFromPropertyFile("Groups.properties", "NoGroupsAvailable"))) {

			logger.error("Edit Group successfully updated: Failed");
		} else {
			logger.info("Edit Group successfully updated: Passed");
		}
	}
}
