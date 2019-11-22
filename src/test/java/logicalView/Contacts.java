package logicalView;

import org.openqa.selenium.By;

import commonFunctions.ApplicationUtility;
import testObjects.ObjectContacts;

public class Contacts extends ApplicationUtility {

	ObjectContacts mObjectContacts = new ObjectContacts(driver);
	ModuleTabs mModuleTabs = new ModuleTabs();

	public void checkContactsandGroups() {

		waitTime(10000);
		String errorNoContacts = mObjectContacts.noContactsorGroups.getText();
		if (errorNoContacts.equalsIgnoreCase("Please select any contact to get started.")) {
			System.out.println("Passed");
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/a[1]/div[1]"))
					.click();
			waitTime(1000);

			// 1:1
			driver.findElement(
					By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]"))
					.click();
			waitTime(10000);

			mModuleTabs.clickContactsTab();
			waitTime(1000);

			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/a[1]/div[1]"))
					.click();
			waitTime(1000);

			driver.findElement(
					By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]"))
					.click();
			waitTime(1000);

		} else {
			System.out.println("Failed");
		}
	}
}
