package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyLeads extends LeafTapsWrappers {

	public MyLeads(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("My Leads | opentaps CRM")){
			reportStep("This is not My Leads Page", "FAIL");
		}
	}
	
	// Click Create Leads 
			public CreateLead clickMyLeadLink(){
				clickByLink(prop.getProperty("MyHome.CreateLead.Link"));
				return new CreateLead(driver, test);
			}
			
			public FindLead findLead(){
				clickByLink(prop.getProperty("MyLead.FindLeads.Link"));
				return new FindLead(driver, test);
			}
			
			public FindLead mergeLead(){
				clickByLink(prop.getProperty("MyLead.MergeLead.Link"));
				return new FindLead(driver, test);
			}

}
