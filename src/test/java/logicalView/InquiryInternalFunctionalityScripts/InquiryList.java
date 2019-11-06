package logicalView.InquiryInternalFunctionalityScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;

public class InquiryList extends ApplicationUtility {

	public void getInquiryList() {

		List<WebElement> listInquiries = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/div[1]/a"));

		for (WebElement lisElement : listInquiries) {

			if (lisElement.getText()
					.contains(BaseClass.getValueFromPropertyFile("InternalInquiry.properties", "noInquiriesMessage"))) {
				logger.info(
						BaseClass.getValueFromPropertyFile("InternalInquiry.properties", "noInquiriesErrorMessage"));

			} else {

				lisElement.click();
				logger.info(BaseClass.getValueFromPropertyFile("InternalInquiry.properties", "selectInquiry"));
				waitTime(4000);
				break;
			}
		}

	}
}
