package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.SignINwithSignUP;
import logicalView.SignIn;
import logicalView.SignUp;
import logicalView.Signout;
import logicalView.VerifyDomain;

public class TC_SignUpInvitewithValidData extends ApplicationUtility {

	@BeforeTest
	public void beforeTest() {

		ApplicationUtility.openBrowser();
	}

	@Test(priority = 1, enabled = true)
	public void TC_SignUpwithEmailwithoutPassword() {

		VerifyDomain.VerifyValidDomain();
		SignIn.validSignIn();
		SignUp.addUser();
		SignUp.emailSignUpwithoutPassword();
		Signout.SignOut();
		SignINwithSignUP.VerifySignUpDomainwithEmail(SignUp.email);
		SignINwithSignUP.signUpDetails();
		Signout.SignOut();

	}

	@Test(priority = 2, enabled = true)
	public void TC_SignUpwithUserIdwithoutPassword() {

		VerifyDomain.VerifyValidDomain();
		SignIn.validSignIn();
		SignUp.addUser();
		SignUp.userIdSignUpwithoutPassword();
		Signout.SignOut();
		SignINwithSignUP.VerifySignUpDomainwithUserId(SignUp.userId);
		SignINwithSignUP.signUpDetails();
		Signout.SignOut();

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
