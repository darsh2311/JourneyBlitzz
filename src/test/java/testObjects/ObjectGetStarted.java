package testObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObjectGetStarted {

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[4]/div[1]/div[3]/div[4]/a[1]/div[1]/div[1]")
	public WebElement getStartedButton;

	public void clickGetStartedButton() {
		getStartedButton.click();
	}

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[4]/div[1]/div[3]/div[4]/ul[1]/li[2]/a[1]")
	public WebElement newDocument;

	public void clickNewDocument() {
		newDocument.click();
	}
}
