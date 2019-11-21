package logicalView.CreateGroupScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.objectGroups;

public class AddGroupMembers extends ApplicationUtility {
	objectGroups mobjectGroups = new objectGroups(driver);
	CreateInquiryThroughGroup mCreateInquiryThroughGroup = new CreateInquiryThroughGroup();

	public void AddGroupMember(String strSearchGroup) {

		// Search the group
		mobjectGroups.enterSearchGroup(strSearchGroup);
		waitTime(1000);

		mobjectGroups.clickGroupEllipsis();
		waitTime(1000);

		mCreateInquiryThroughGroup.ellipsisList("ellipsisAddMembers");
		waitTime(3000);

		String addMemberNoParticipantMessages = mobjectGroups.noAddParticipantMessage.getText();

		if (addMemberNoParticipantMessages
				.equalsIgnoreCase(BaseClass.getValueFromPropertyFile("Groups.properties", "addMembersEmpty"))) {
			mobjectGroups.clickCloseMemberPopup();
			waitTime(1000);
			logger.error("No Participant to Add in the Group");
		} else {
			List<WebElement> listContacts = driver.findElements(By.xpath(
					"/html[1]/body[1]/div[3]/div[2]/div[5]/div[2]/div[1]/div[2]/div[4]/div[1]/div/div[1]/div[1]/div[1]/label[1]/span[1]"));

			for (WebElement element : listContacts) {
				ImplicitWait(3);
				element.click();
				break;
			}

			mobjectGroups.clickAddMemberPopup();
			waitTime(1000);
		}

	}
}
