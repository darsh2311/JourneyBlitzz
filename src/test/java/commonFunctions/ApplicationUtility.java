package commonFunctions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ApplicationUtility {
	public static WebDriver driver;
	public static Logger logger = Logger.getLogger(ApplicationUtility.class);

	public void openBrowser() {

		driver = initialliseBrowserDriver();

		driver.manage().window().maximize();
		driver.get(BaseClass.getValueFromPropertyFile("Property.properties", "Url"));
		waitForPageLoaded();
		logger.info("Browser Driver is now initilized.");
		ImplicitWait(50);

	}

	public WebDriver initialliseBrowserDriver() {

		String browserName = BaseClass.getValueFromPropertyFile("Property.properties", "browserName");
		if (browserName.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments(Arrays.asList("--disable-notifications", "--use-fake-ui-for-media-stream"));
			driver = new ChromeDriver(options);
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/src/test/resources/chromedriver");
		}
		return driver;
	}

	public void ImplicitWait(Integer time) {

		// wait till the page is loaded
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public void waitTime(Integer time) {

		// wait till the page is loaded
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void waitForPageLoaded() {
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
						.equals("complete");
			}
		};
		try {
			Thread.sleep(1000);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(expectation);
		} catch (Throwable error) {
			Assert.fail("Timeout waiting for Page Load Request to complete.");
		}
	}

	public Wait<WebDriver> waitFluent() {
		Wait<WebDriver> gWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(100))
				.pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);
		return gWait;
	}

	public void refreshPage() {
		driver.navigate().refresh();
	}

	public static void setClipboardData(String string) {
		// StringSelection is a class that can be used for copy and paste operations.
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}

	public void takeScreenShot(String fileWithPath) {

		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(driver);

		try {
			ImageIO.write(screenshot.getImage(), "jpg", new File(fileWithPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void attachmedia(String strImage) {
		// Using the Robot class to upload the file
		try {
			waitTime(1000);

			setClipboardData(System.getProperty("user.dir") + "/src/test/resources/" + strImage);
			Robot robot = new Robot();
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void popupWindowHandle() {

		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();

		String parent = it.next();

		String child = it.next();
		waitTime(1000);

		driver.switchTo().window(child);
		waitTime(1000);
		driver.close();
		driver.switchTo().window(parent);
		waitTime(1000);

	}
}