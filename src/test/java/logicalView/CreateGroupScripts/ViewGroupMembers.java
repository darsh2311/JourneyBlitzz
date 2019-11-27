package logicalView.CreateGroupScripts;

import java.util.List;

import org.openqa.selenium.WebElement;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.objectGroups;

public class ViewGroupMembers extends ApplicationUtility {

	objectGroups mobjectGroups = new objectGroups(driver);
	CreateInquiryThroughGroup mCreateInquiryThroughGroup = new CreateInquiryThroughGroup();

	public void ViewGroupMember(String strSearchGroup) {
		waitTime(2000);

		// Search the group
		mobjectGroups.enterSearchGroup(strSearchGroup);
		waitTime(2000);

		mobjectGroups.clickGroupEllipsis();
		waitTime(2000);

		mCreateInquiryThroughGroup.ellipsisList("ellipsisViewMembers");
		waitTime(5000);

		mobjectGroups.clickRemoveMember();
		waitTime(12000);
		logger.info("Group Member is removed.");

		String viewMemberNoParticipantMessages = mobjectGroups.noParticipantMessage.getText();
		waitTime(2000);

		if (viewMemberNoParticipantMessages
				.equalsIgnoreCase(BaseClass.getValueFromPropertyFile("Groups.properties", "viewMembersEmpty"))) {
			logger.error("No Participant to change Role");
		} else {

			mobjectGroups.clickGroupRole();
			waitTime(2000);

			List<WebElement> listGroupRoles = mobjectGroups.listGroupRole;

			for (WebElement element : listGroupRoles) {
				if (element.getText()
						.equalsIgnoreCase(BaseClass.getValueFromPropertyFile("Groups.properties", "groupRole"))) {
					ImplicitWait(3);
					element.click();
					waitTime(2000);
					mobjectGroups.clickUpdateRoles();
					waitTime(1500);

				}
			}

		}

		mobjectGroups.clickCloseGroupRole();
		waitTime(2000);
	}
}
