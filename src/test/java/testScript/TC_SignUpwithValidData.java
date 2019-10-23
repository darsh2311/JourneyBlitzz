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

public class TC_SignUpwithValidData extends ApplicationUtility {

	@BeforeTest
	public void beforeTest() {

		openBrowser();
	}

	@Test(priority = 1, enabled = true)
	public void TC_SignUpwithEmailandPassword() {

		VerifyDomain.VerifyValidDomain();
		SignIn.validSignIn();
		SignUp.addUser();
		SignUp.signUpAdminwithEmail();
		Signout.SignOut();
		VerifyDomain.VerifyValidDomain();
		SignINwithSignUP.validSignInwithSignup(SignUp.email);
		Signout.SignOut();
	}

	@Test(priority = 2, enabled = true)
	public void TC_SignUpwithUserIdandPassword() {

		VerifyDomain.VerifyValidDomain();
		SignIn.validSignIn();
		SignUp.addUser();
		SignUp.signUpAdminwithUserId();
		Signout.SignOut();
		VerifyDomain.VerifyValidDomain();
		SignINwithSignUP.validSignInwithSignup(SignUp.userId);
		Signout.SignOut();
	}

	@Test(priority = 3, enabled = true)
	public void TC_SignUpwithEmailwithoutPassword() {

		VerifyDomain.VerifyValidDomain();
		SignIn.validSignIn();
		SignUp.addUser();
		SignUp.emailSignUpwithoutPassword();
		Signout.SignOut();
		SignINwithSignUP.VerifySignUpDomainwithEmail(SignUp.email);
		SignINwithSignUP.signUpDetails();
	}

	@Test(priority = 4, enabled = true)
	public void TC_SignUpwithUserIdwithoutPassword() {

		VerifyDomain.VerifyValidDomain();
		SignIn.validSignIn();
		SignUp.addUser();
		SignUp.userIdSignUpwithoutPassword();
		Signout.SignOut();
		SignINwithSignUP.VerifySignUpDomainwithUserId(SignUp.userId);
		SignINwithSignUP.signUpDetails();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
