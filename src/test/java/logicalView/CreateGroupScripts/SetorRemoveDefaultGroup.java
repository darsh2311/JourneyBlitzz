package logicalView.CreateGroupScripts;

import commonFunctions.ApplicationUtility;
import testObjects.objectGroups;

public class SetorRemoveDefaultGroup extends ApplicationUtility {
	objectGroups mobjectGroups = new objectGroups(driver);
	CreateInquiryThroughGroup mCreateInquiryThroughGroup = new CreateInquiryThroughGroup();

	public void setDefaultGroup(String strSearchGroup) {

		// Search the group
		mobjectGroups.enterSearchGroup(strSearchGroup);
		waitTime(1000);

		mobjectGroups.clickGroupEllipsis();
		waitTime(500);
		mCreateInquiryThroughGroup.ellipsisList("ellipsisSetDefault");
		waitTime(500);
		mobjectGroups.clickCancelDefaultPopup();
		waitTime(500);
		mobjectGroups.clickGroupEllipsis();
		waitTime(500);
		mCreateInquiryThroughGroup.ellipsisList("ellipsisSetDefault");
		waitTime(500);
		mobjectGroups.clickYesSetDefaultPopup();
		waitTime(4000);

		logger.info("Group has been set to Default");

	}

	public void removeDefaultGroup(String strSearchGroup1) {

		// Search the group
		mobjectGroups.enterSearchGroup(strSearchGroup1);
		waitTime(1000);

		mobjectGroups.clickGroupEllipsis();
		waitTime(500);
		mCreateInquiryThroughGroup.ellipsisList("ellipsisRemoveDefault");
		waitTime(500);
		mobjectGroups.clickCloseRemoveDefaultPopup();
		waitTime(500);
		mobjectGroups.clickGroupEllipsis();
		waitTime(500);
		mCreateInquiryThroughGroup.ellipsisList("ellipsisRemoveDefault");
		waitTime(500);
		mobjectGroups.clickYesRemoveDefaultPopup();
		waitTime(4000);

		logger.info("Group has been Removed as Default");
	}
}
