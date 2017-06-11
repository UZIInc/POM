package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.EditLead;
import pages.FindLead;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHome;
import pages.MyLeads;
import pages.ViewLead;
import wrappers.LeafTapsWrappers;

public class TC005_DuplicateLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="EditLead(Positive)";
		testDescription="Edit Lead on LeafTaps";
		browserName="chrome";
		dataSheetName="TC005";
		category="Sanity";
		authors="Gopi";
	}

	@Test(dataProvider="fetchData")
	public void editLead(String userName, String password, String findfistname){

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFALink();
	}
}
