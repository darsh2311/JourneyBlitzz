package logicalView.ValidSignUpScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;

import commonFunctions.ApplicationUtility;
import commonFunctions.BaseClass;
import testObjects.ObjectSignUp;

public class SignUPVerifyEmail extends ApplicationUtility {

	ObjectSignUp objSignUp = new ObjectSignUp(driver);

	public void VerifySignUpDomainwithEmail(String verifyEmail) {

		// Click on SignUp link on SignIn page
		objSignUp.clickSignUpLink();
		ImplicitWait(100);
		waitTime(1300);

		// Enter already created User's Email to verify
		objSignUp.enterVerifyEmail(verifyEmail);
		ImplicitWait(100);

		// Click on Verify button
		objSignUp.clickverifyEmail();
		waitTime(3000);

		// Upload the profile Photo
		objSignUp.uploadPhoto();
		waitTime(1000);

		// Using the Robot class to upload the file

		try {
			setClipboardData(System.getProperty("user.dir") + "/src/test/resources/Profilephoto.jpg");
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			waitTime(1500);

		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		waitTime(3000);

		// Enter FirstName
		objSignUp.enterVerifiedFirstname(BaseClass.getValueFromPropertyFile("signUp.properties", "VerifiedFirstname"));

		// Enter LastName
		objSignUp.enterverifylastname(BaseClass.getValueFromPropertyFile("signUp.properties", "verifylastname"));

		// Enter Jobrole
		objSignUp.enterJobRole(BaseClass.getValueFromPropertyFile("signUp.properties", "JobRole"));

		// Enter New Password
		objSignUp.addVerifyPassword(BaseClass.getValueFromPropertyFile("signUp.properties", "verifyPassword"));

		// Enter Confirm Password
		objSignUp.addVerifyConfirmPassword(
				BaseClass.getValueFromPropertyFile("signUp.properties", "verifyConfirmPassword"));

		// Enter Country Code
		objSignUp.addCountryCode(BaseClass.getValueFromPropertyFile("signUp.properties", "verifyCountryCode"));

		// Enter Mobile Number
		objSignUp.addmobileNumber(BaseClass.getValueFromPropertyFile("signUp.properties", "verifyMobileNumber"));

		// Check Terms and conditions
		objSignUp.checkTermsConditions();
		waitTime(2300);

		// Scroll to the SignUp button as it is not visible
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", objSignUp.clickSignUp);

		// Click on Signup button
		objSignUp.clickSignUp();
		waitFluent();
		waitTime(10000);
	}
}
