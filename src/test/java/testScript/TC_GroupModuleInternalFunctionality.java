package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ApplicationUtility;
import logicalView.ModuleTabs;
import logicalView.SignInwithValidData;
import logicalView.Signout;
import logicalView.VerifyDomain;
import logicalView.CreateGroupScripts.AddGroupMembers;
import logicalView.CreateGroupScripts.CreateInquiryThroughGroup;
import logicalView.CreateGroupScripts.CreateNewGroup;
import logicalView.CreateGroupScripts.DeleteGroupMember;
import logicalView.CreateGroupScripts.EditGroupDetails;
import logicalView.CreateGroupScripts.SetorRemoveDefaultGroup;
import logicalView.CreateGroupScripts.ViewGroupMembers;

public class TC_GroupModuleInternalFunctionality extends ApplicationUtility {

	SignInwithValidData mSignIn;
	VerifyDomain mVerifyDomain;
	Signout mSignOut;
	CreateNewGroup mCreateNewGroup;
	ModuleTabs mModuleTabs;
	CreateInquiryThroughGroup mCreateInquiryThroughGroup;
	SetorRemoveDefaultGroup mSetorRemoveDefaultGroup;
	EditGroupDetails mEditGroupDetails;
	ViewGroupMembers mViewGroupMembers;
	AddGroupMembers mAddGroupMembers;
	DeleteGroupMember mDeleteGroupMember;

	@BeforeTest
	public void beforeTest() {

		openBrowser();
		mSignIn = new SignInwithValidData();
		mVerifyDomain = new VerifyDomain();
		mSignOut = new Signout();
		mCreateNewGroup = new CreateNewGroup();
		mModuleTabs = new ModuleTabs();
		mCreateInquiryThroughGroup = new CreateInquiryThroughGroup();
		mSetorRemoveDefaultGroup = new SetorRemoveDefaultGroup();
		mEditGroupDetails = new EditGroupDetails();
		mViewGroupMembers = new ViewGroupMembers();
		mAddGroupMembers = new AddGroupMembers();
		mDeleteGroupMember = new DeleteGroupMember();
	}

	@Test(priority = 1)
	public void TC_SignIN() {

		mVerifyDomain.VerifyValidDomain();
		mSignIn.validSignIn();
		mModuleTabs.clickGroupTab();
		mCreateNewGroup.CreateNewGroupwithValidData();

	}

	@Test(priority = 2)
	public void TC_CreateInquiryFromGroupModule() {

		mCreateInquiryThroughGroup.createInquiryFromGroup(mCreateNewGroup.groupSubject);
	}

	@Test(priority = 3)
	public void TC_SetOrRemoveGroupDefault() {
		mSetorRemoveDefaultGroup.setDefaultGroup(mCreateNewGroup.groupSubject);
		mSetorRemoveDefaultGroup.removeDefaultGroup(mCreateNewGroup.groupSubject);
	}

	@Test(priority = 4)
	public void TC_EditGroupDetails() {
		mEditGroupDetails.editGroupDetail(mCreateNewGroup.groupSubject);
	}

	@Test(priority = 5)
	public void TC_AddGroupMembers() {
		mAddGroupMembers.AddGroupMember(mEditGroupDetails.editedGroupSubject);
	}

	@Test(priority = 6)
	public void TC_ViewGroupMembers() {
		mViewGroupMembers.ViewGroupMember(mEditGroupDetails.editedGroupSubject);
	}

	@Test(priority = 7)
	public void TC_DeleteGroupMember() {
		mDeleteGroupMember.DeleteGroupMembers(mEditGroupDetails.editedGroupSubject);
	}

	@Test(priority = 8)
	public void TC_SignOut() {

		mSignOut.SignOut();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
