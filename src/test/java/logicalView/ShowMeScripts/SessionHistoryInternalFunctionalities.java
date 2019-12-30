package logicalView.ShowMeScripts;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectShowME;

public class SessionHistoryInternalFunctionalities extends ApplicationUtility {

	ObjectShowME mObjectShowME = new ObjectShowME(driver);
	CreateShowMeSessionwithEmail mCreateShowMeSessionwithEmail = new CreateShowMeSessionwithEmail();
	public String ReferenceId = "Test Session " + (int) (Math.random() * 999);
	public int count = 0;

	public void copySessionCode() {

		ImplicitWait(10);

		// Enter the New Reference Id to create session
		mObjectShowME.enterReference(ReferenceId);
		waitTime(1000);

		// Clicking Invite Participant to Create session
		mObjectShowME.clickInviteParticipant();
		waitTime(4500);

		// Select Invite Option from Ellipsis menu
		invtieEllipsisOption(BaseClass.getValueFromPropertyFile("Showme.properties", "copySessionCode"));
		waitTime(1000);

	}

	public void copyGuestUrl() {

		ImplicitWait(5);

		// Enter the New Reference Id to create session
		mObjectShowME.enterReference(ReferenceId);
		waitTime(1000);

		// Clicking Invite Participant to Create session
		mObjectShowME.clickInviteParticipant();
		waitTime(4500);

		// Select Invite Option from Ellipsis menu
		invtieEllipsisOption(BaseClass.getValueFromPropertyFile("Showme.properties", "copyGuestUrl"));
		waitTime(1000);

	}

	public void clickJoinSessionCall() {

		refreshPage();
		waitTime(10000);

		// Clicking Invite and join Button to join the call
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 3);
			wait1.until(ExpectedConditions.elementToBeClickable(mObjectShowME.joinCallButton));
			// Click on Join button to start session call
			mObjectShowME.clickJoinCallButton();
			waitTime(10000);
			popupWindowHandle();
			waitTime(1000);
			logger.info("JoinSessionCall test-case Passed.");
		} catch (NoSuchElementException e) {
			logger.error("JoinSessionCall test-case failed.");
			waitTime(1000);
			throw (e);
		}

	}

	public void verifyInviteEllipsisOption() {
		refreshPage();
		ImplicitWait(5);

		// Click on Ellipsis menu of Particular session
		mObjectShowME.clickSessionEllipsisOption();
		waitTime(1000);

		// Select the invite option from the Ellipsis menu
		sessionEllipsisOptions(BaseClass.getValueFromPropertyFile("Showme.properties", "ellipsisOptionInvite"));
		waitTime(1000);

		if (count == 1) {

			// Select Invite Option from Ellipsis menu
			mCreateShowMeSessionwithEmail
					.invtieEllipsisOption(BaseClass.getValueFromPropertyFile("Showme.properties", "inviteOptionEmail"));

			logger.info("InviteEllipsisOption test-case Passed.");

		} else {
			logger.error(BaseClass.getValueFromPropertyFile("Showme.properties", "ellipsisOptionInvite")
					+ " option not found, So skipping this Testcase.");
			// Click on Close to close the Invite popup
			// mObjectShowME.clickCloseInvitePopup();
			waitTime(1000);
			throw new NoSuchElementException(
					BaseClass.getValueFromPropertyFile("Showme.properties", "ellipsisOptionInvite"));
		}

	}

	public void CopySessionUrlEllipsisOption() {

		ImplicitWait(5);

		// Click on Ellipsis menu of Particular session
		mObjectShowME.clickSessionEllipsisOption();
		waitTime(1000);

		// Select the Copy Session URL option from the Ellipsis menu
		sessionEllipsisOptions(BaseClass.getValueFromPropertyFile("Showme.properties", "ellipsisOptionCopySessionUrl"));
		waitTime(1000);

		if (count == 2) {

			// Paste the Copied URL to Search Area
			mObjectShowME.entersearchReferenceId(Keys.chord(Keys.CONTROL, "v"));
			waitTime(3000);

			// Clear the Pasted URL
			mObjectShowME.clearSearchReferenceId();
			waitTime(1000);
			logger.info("CopySessionUrlEllipsisOption test-case Passed.");

		} else {
			logger.error(BaseClass.getValueFromPropertyFile("Showme.properties", "ellipsisOptionCopySessionUrl")
					+ " option not found, So skipping this Testcase.");
			// Click on Close to close the Invite popup
			// mObjectShowME.clickCloseInvitePopup();
			waitTime(1000);
			throw new NoSuchElementException(
					BaseClass.getValueFromPropertyFile("Showme.properties", "ellipsisOptionCopySessionUrl"));
		}
	}

	public void EndSessionEllipsisOption() {

		ImplicitWait(5);

		// Click on Ellipsis menu of Particular session
		mObjectShowME.clickSessionEllipsisOption();
		waitTime(1000);

		// Select the End Session option from the Ellipsis menu
		sessionEllipsisOptions(BaseClass.getValueFromPropertyFile("Showme.properties", "ellipsisOptionEndSession"));
		waitTime(1000);
		if (count == 3) {
			logger.info("EndSessionEllipsisOption: Passed");
		} else {
			logger.error(BaseClass.getValueFromPropertyFile("Showme.properties", "ellipsisOptionEndSession")
					+ " option not found, So skipping this Testcase.");
			// Click on Close to close the Invite popup
			// mObjectShowME.clickCloseInvitePopup();
			waitTime(1000);
			throw new NoSuchElementException(
					BaseClass.getValueFromPropertyFile("Showme.properties", "ellipsisOptionEndSession"));
		}
	}

	public void DeleteSessionEllipsisOption() {

		ImplicitWait(5);

		// Click on Ellipsis menu of Particular session
		mObjectShowME.clickSessionEllipsisOption();
		waitTime(1000);

		// Select the Delete Session option from the Ellipsis menu
		sessionEllipsisOptions(BaseClass.getValueFromPropertyFile("Showme.properties", "ellipsisOptionDeleteCode"));
		waitTime(1000);

		if (count == 4) {

			// Click on OK button to close the Delete Session popup to close it
			mObjectShowME.clickOkDeleteSession();
			waitTime(12000);
			logger.info("DeleteSessionEllipsisOption test-case Passed.");

		} else {
			logger.error(BaseClass.getValueFromPropertyFile("Showme.properties", "ellipsisOptionDeleteCode")
					+ " option not found, So skipping this Testcase.");
			// Click on Close to close the Invite popup
			// mObjectShowME.clickCloseInvitePopup();
			waitTime(1000);
			throw new NoSuchElementException(
					BaseClass.getValueFromPropertyFile("Showme.properties", "ellipsisOptionDeleteCode"));
		}
	}

	public void sessionEllipsisOptions(String sessionEllipsis) {

		List<WebElement> listSessionOptions = mObjectShowME.listSessionEllipsisOptions;

		for (WebElement element : listSessionOptions) {

			if (element.getText().equalsIgnoreCase(sessionEllipsis)) {

				ImplicitWait(5);
				element.click();
				count = count + 1;
			}
		}

	}

	public void invtieEllipsisOption(String strInviteOption) {
		// Click on the Invite Ellipsis Dropdown button
		mObjectShowME.clickInviteEllipsis();
		waitTime(1000);

		// Select the Invite option through which Invitation will be sent.
		// and Also select Country Name
		try {
			List<WebElement> listEllipsisOptions = mObjectShowME.listEllipsisOptions;
			for (WebElement element : listEllipsisOptions) {

				if (element.getText().equalsIgnoreCase(strInviteOption)) {
					ImplicitWait(5);
					element.click();
				}
			}

			// Click on Close button of Invite popup
			mObjectShowME.clickCloseInvitePopup();
			waitTime(1000);

			// Enter Copied string to Search Area to check it is copied.
			mObjectShowME.entersearchReferenceId(Keys.chord(Keys.CONTROL, "v"));
			waitTime(3000);

			// Clear the Pasted string
			mObjectShowME.clearSearchReferenceId();
			logger.info(strInviteOption + " Invitation test-case Passed.");

		} catch (NoSuchElementException e) {
			logger.error(strInviteOption + " Invitation test-case failed.");
			mObjectShowME.clickCloseInvitePopup();
			// TODO Auto-generated catch block
			throw (e);
		}
	}
}
