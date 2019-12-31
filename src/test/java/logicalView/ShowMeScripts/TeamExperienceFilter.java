package logicalView.ShowMeScripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonFunctions.ApplicationUtility;
import testObjects.ObjectShowME;

public class TeamExperienceFilter extends ApplicationUtility {
	ObjectShowME mObjectShowME = new ObjectShowME(driver);

	public void selectTeamExperience() {
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 3);
			wait1.until(ExpectedConditions.visibilityOf(mObjectShowME.teamExp));

			mObjectShowME.clickTeamExperience();
			waitTime(1000);

			List<WebElement> listTeamExperience = mObjectShowME.listTeamExperience;
			for (WebElement webElement : listTeamExperience) {

				if (webElement.getText().equalsIgnoreCase("One")) {
					ImplicitWait(3);
					webElement.click();
				}
			}
		} catch (Exception e) {
			logger.info("No Team experience found.");
		}
	}
}