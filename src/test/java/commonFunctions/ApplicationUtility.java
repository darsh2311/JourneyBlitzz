package commonFunctions;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.time.Duration;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

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
			System.setProperty("webdriver.chrome.driver", "/home/darshan/Downloads/chromedriver_linux64/chromedriver");
			driver = new ChromeDriver(options);

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
}