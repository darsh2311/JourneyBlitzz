package logicalView.ShowMeScripts;

import java.util.List;

import org.openqa.selenium.WebElement;

import commonFunctions.ApplicationUtility;
import testObjects.ObjectShowME;

public class SessionStatusFilter extends ApplicationUtility {

	ObjectShowME mObjectShowME = new ObjectShowME(driver);

	public void sessionFilter() {

		mObjectShowME.clickStatusFilter();
		waitTime(1000);
		// List of the Session Status Filter
		List<WebElement> listSessionStatus = mObjectShowME.listSessionStatusFilter;

		for (WebElement element : listSessionStatus) {
			// Match the list with the desired Country Code Option
			if (element.getText().equalsIgnoreCase("Inactive")) {
				ImplicitWait(5);
				// Click on the Country Code after it is matched
				element.click();
				waitTime(1000);

			}
		}
	}

}
