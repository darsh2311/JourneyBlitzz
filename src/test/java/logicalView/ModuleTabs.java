package logicalView;

import commonFunctions.ApplicationUtility;
import testObjects.ObjectShowME;
import testObjects.objectGroups;

public class ModuleTabs extends ApplicationUtility {
	ObjectShowME mObjectShowME = new ObjectShowME(driver);
	objectGroups mobjectGroups = new objectGroups(driver);

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

}
