package logicalView.InquiryInternalFunctionalityScripts;

import commonFunctions.ApplicationUtility;
import testObjects.ObjectInquiryFunctionalities;

public class AddNotes extends ApplicationUtility {

	ObjectInquiryFunctionalities mObjectInquiryFunctionalities = new ObjectInquiryFunctionalities(driver);
	public String inqiryNote = "Test Note" + (int) (Math.random() * 9999);
	public String editedNote = "Note" + (int) (Math.random() * 9999);

	public void addNote() {
		waitTime(20000);

		ImplicitWait(10);
		// Click on Add Note Icon
		mObjectInquiryFunctionalities.clickAddNotes();
		waitTime(1500);

		// Enter Note
		mObjectInquiryFunctionalities.enterNote(inqiryNote);
		waitTime(3000);

		// Submit Note
		mObjectInquiryFunctionalities.submitNote();
		waitTime(2500);
	}

	public void editNote() {
		waitTime(10000);

		ImplicitWait(10);

		// Refresh the Note
		mObjectInquiryFunctionalities.clickRefreshNote();
		waitTime(1000);

		// Click on the Ellipsis menu
		mObjectInquiryFunctionalities.clickEllipsisNote();
		waitTime(500);

		// Click on Edit button
		mObjectInquiryFunctionalities.clickEditNote();
		waitTime(500);

		// click on Cancel button
		mObjectInquiryFunctionalities.cancelEditNote();
		waitTime(500);

		// Click on the Ellipsis menu
		mObjectInquiryFunctionalities.clickEllipsisNote();
		waitTime(500);

		// Click on Edit button
		mObjectInquiryFunctionalities.clickEditNote();
		waitTime(1000);

		// Edit the Entered Note
		mObjectInquiryFunctionalities.enterEditNote(editedNote);
		waitTime(2500);

		// Save the Edited Note
		mObjectInquiryFunctionalities.doneEditNote();
	}

	public void deleteNote() {
		waitTime(10000);

		ImplicitWait(10);

		// Refresh the Note
		mObjectInquiryFunctionalities.clickRefreshNote();
		waitTime(1000);

		// Click on the Ellipsis menu
		mObjectInquiryFunctionalities.clickEllipsisNote();
		waitTime(500);

		// Delete the Created Note
		mObjectInquiryFunctionalities.clickDeleteNote();
		waitTime(1000);

		// Cancel the Delete Popup
		mObjectInquiryFunctionalities.cancelDeleteNote();
		waitTime(500);

		// Click on the Ellipsis menu
		mObjectInquiryFunctionalities.clickEllipsisNote();
		waitTime(500);

		// Delete the Created Note
		mObjectInquiryFunctionalities.clickDeleteNote();
		waitTime(1000);

		// Confirm the Delete note
		mObjectInquiryFunctionalities.confirmDeleteNote();
		waitTime(1000);

		// Close the Add Note Sidebar
		mObjectInquiryFunctionalities.clickCloseNote();

	}
}
