package logicalView;

import commonFunctions.ApplicationUtility;
import testObjects.ObjectContacts;
import testObjects.ObjectShowME;
import testObjects.objectGroups;

public class ModuleTabs extends ApplicationUtility {
	ObjectShowME mObjectShowME = new ObjectShowME(driver);
	objectGroups mobjectGroups = new objectGroups(driver);
	ObjectContacts mObjectContacts = new ObjectContacts(driver);
	// List<WebElement> listTabs =
	// driver.findElements(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[5]/div[1]/a/div[1]"));

	public void clickShowMETab() {

		ImplicitWait(15);
		// Click on ShowMe Tab
		mObjectShowME.clickShowmeTab();
		waitTime(10000);
	}

	public void clickGroupTab() {

		ImplicitWait(10);
		// Click on ShowMe Tab
		mobjectGroups.clickGroupTab();
		waitTime(8000);
	}

	public void clickContactsTab() {
		ImplicitWait(10);
		mObjectContacts.clickContactsTab();
	}

}
