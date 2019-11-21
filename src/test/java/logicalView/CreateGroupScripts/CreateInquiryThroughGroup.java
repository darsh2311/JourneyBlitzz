package logicalView.CreateGroupScripts;

import java.util.List;

import org.openqa.selenium.WebElement;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import logicalView.NewInquiry2;
import testObjects.objectGroups;

public class CreateInquiryThroughGroup extends ApplicationUtility {
	objectGroups mobjectGroups = new objectGroups(driver);
	NewInquiry2 mNewInquiry2 = new NewInquiry2();

	public void createInquiryFromGroup(String StrSearchString) {

		// Enter Search String to search the newly created Groups
		mobjectGroups.enterSearchGroup(StrSearchString);
		waitTime(1000);

		// Click Group Ellipsis Menu
		mobjectGroups.clickGroupEllipsis();
		waitTime(500);
		ellipsisList("ellipsisCreateInq");
		waitTime(1000);
		mNewInquiry2.createNewInquiry();
		System.out.println(1);
		waitTime(12000);
		System.out.println(2);

		mobjectGroups.clickGroupTab();

	}

	public void ellipsisList(String strEllipsisValue) {

		List<WebElement> listEllipsisOptions = mobjectGroups.listEllipsisValue;
		for (WebElement listElement : listEllipsisOptions) {
			if (listElement.getText()
					.equalsIgnoreCase(BaseClass.getValueFromPropertyFile("Groups.properties", strEllipsisValue))) {
				ImplicitWait(3);
				listElement.click();
			}
		}
	}

}
