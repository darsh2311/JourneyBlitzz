package logicalView.CreateGroupScripts;

import commonFunctions.ApplicationUtility;
import testObjects.objectGroups;

public class DeleteGroupMember extends ApplicationUtility {

	objectGroups mobjectGroups = new objectGroups(driver);
	CreateInquiryThroughGroup mCreateInquiryThroughGroup = new CreateInquiryThroughGroup();

	public void DeleteGroupMembers(String strSearchGroup) {

		// Search the group
		mobjectGroups.enterSearchGroup(strSearchGroup);
		waitTime(1000);

		mobjectGroups.clickGroupEllipsis();
		waitTime(1000);

		mCreateInquiryThroughGroup.ellipsisList("ellipsisDeleteGroup");
		waitTime(2000);

		mobjectGroups.clickCloseDeleteMemberPopup();
		waitTime(2000);

		mobjectGroups.clickGroupEllipsis();
		waitTime(1000);

		mCreateInquiryThroughGroup.ellipsisList("ellipsisDeleteGroup");
		waitTime(2000);

		mobjectGroups.clickDeleteMemberPopup();
		waitTime(10000);

	}
}
