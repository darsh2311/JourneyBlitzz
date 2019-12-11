package testScript;

import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriverManager.getInstance(CHROME).setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.softwaretestingmaterial.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("zooming");
		// To zoom in 3 times
		for (int i = 0; i < 3; i++) {
			driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
		}
		// To zoom out 3 times
		for (int i = 0; i < 3; i++) {
			driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		}
		// To set the browser to default zoom level ie., 100%
		driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, "0"));
	}
}
