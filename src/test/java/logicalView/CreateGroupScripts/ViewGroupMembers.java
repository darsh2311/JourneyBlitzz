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

		// Search the group
		mobjectGroups.enterSearchGroup(strSearchGroup);
		waitTime(1000);

		mobjectGroups.clickGroupEllipsis();
		waitTime(1000);

		mCreateInquiryThroughGroup.ellipsisList("ellipsisViewMembers");
		waitTime(3000);

		mobjectGroups.clickRemoveMember();
		waitTime(5000);
		logger.info("Group Member is removed.");

		String viewMemberNoParticipantMessages = mobjectGroups.noParticipantMessage.getText();

		if (viewMemberNoParticipantMessages
				.equalsIgnoreCase(BaseClass.getValueFromPropertyFile("Groups.properties", "viewMembersEmpty"))) {
			logger.error("No Participant to change Role");
		} else {

			mobjectGroups.clickGroupRole();
			waitTime(1000);

			List<WebElement> listGroupRoles = mobjectGroups.listGroupRole;

			for (WebElement element : listGroupRoles) {
				if (element.getText()
						.equalsIgnoreCase(BaseClass.getValueFromPropertyFile("Groups.properties", "groupRole"))) {
					ImplicitWait(3);
					element.click();
					waitTime(1000);
					mobjectGroups.clickUpdateRoles();
					waitTime(1500);

				}
			}

		}

		mobjectGroups.clickCloseGroupRole();
		waitTime(1000);
	}
}
