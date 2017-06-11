package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHome;
import pages.MyLeads;
import pages.ViewLead;
import wrappers.LeafTapsWrappers;

public class TC001_CreateLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="CreateLead(Positive)";
		testDescription="Create Lead on LeafTaps";
		browserName="chrome";
		dataSheetName="TC003";
		category="Smoke";
		authors="Gopi";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String userName, String password, String comnyName, String firstName, String lastName){

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
		.verifyFirstName(firstName);			
	}
}
