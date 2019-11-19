package logicalView;

import commonFunctions.ApplicationUtility;
import testObjects.ObjectShowME;

public class ModuleTabs extends ApplicationUtility {
	ObjectShowME mObjectShowME = new ObjectShowME(driver);

	public void clickShowMETab() {

		ImplicitWait(15);
		// Click on ShowMe Tab
		mObjectShowME.clickShowmeTab();
		waitTime(10000);
	}

}
