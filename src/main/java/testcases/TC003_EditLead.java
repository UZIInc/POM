package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.EditLead;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHome;
import pages.MyLeads;
import pages.ViewLead;
import wrappers.LeafTapsWrappers;

public class TC003_EditLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="EditLead(Positive)";
		testDescription="Edit Lead on LeafTaps";
		browserName="chrome";
		dataSheetName="TC004";
		category="Smoke";
		authors="Babu";
	}

	@Test(dataProvider="fetchData")
	public void editLead(String userName, String password, String comnyName, String firstName, String lastName, String updcomnyName){

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()		
		.clickCRMSFALink()		
		.clickLeadLink()		
		.clickMyLeadLink()		
		.enterCompanyName(comnyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickCreateLeadSubmit()
		.verifyFirstName(firstName)
		.clickEditLeadLink()		
		.updateCompanyName(updcomnyName)
		.clickUpdateSubmit();		
	}

}
