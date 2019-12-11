package logicalView;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commonFunctions.ApplicationUtility;
import testObjects.ObjectContacts;
import testObjects.ObjectShowME;
import testObjects.objectGroups;

public class ModuleTabs extends ApplicationUtility {
	ObjectShowME mObjectShowME = new ObjectShowME(driver);
	objectGroups mobjectGroups = new objectGroups(driver);
	ObjectContacts mObjectContacts = new ObjectContacts(driver);

	public void clickInquiriesTab() {
		List<WebElement> listTabs = driver
				.findElements(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[5]/div[1]/a/div[1]"));

		for (WebElement element : listTabs) {
			if (element.getText().equalsIgnoreCase("Inquiries")) {
				ImplicitWait(3);
				element.click();
				break;
			}
		}

		waitTime(10000);
	}

	public void clickShowMETab() {

		List<WebElement> listTabs = driver
				.findElements(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[5]/div[1]/a/div[1]"));

		for (WebElement element : listTabs) {
			if (element.getText().equalsIgnoreCase("ShowMe")) {
				ImplicitWait(3);
				element.click();
				break;
			}
		}
		waitTime(10000);

	}

	public void clickGroupTab() {
		List<WebElement> listTabs = driver
				.findElements(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[5]/div[1]/a/div[1]"));

		for (WebElement element : listTabs) {
			if (element.getText().equalsIgnoreCase("Groups")) {
				ImplicitWait(3);
				element.click();
				break;
			}
		}

		waitTime(15000);
	}

	public void clickContactsTab() {

		List<WebElement> listTabs = driver
				.findElements(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[5]/div[1]/a/div[1]"));

		for (WebElement element : listTabs) {
			if (element.getText().equalsIgnoreCase("Contacts")) {
				ImplicitWait(3);
				element.click();
				break;
			}
		}

		waitTime(15000);
	}

	public void clickVideosTab() {
		List<WebElement> listTabs = driver
				.findElements(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[5]/div[1]/a/div[1]"));

		for (WebElement element : listTabs) {
			if (element.getText().equalsIgnoreCase("Videos")) {
				ImplicitWait(3);
				element.click();
				break;
			}
		}

		waitTime(15000);
	}

}
