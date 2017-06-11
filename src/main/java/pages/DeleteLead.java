package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class DeleteLead extends LeafTapsWrappers {
	
	
	public DeleteLead(RemoteWebDriver driver, ExtentTest test){
			this.driver = driver;
			this.test = test;

			if(!verifyTitle("My Leads | opentaps CRM")){
				reportStep("This is not My Lead Page", "FAIL");
			}
		}
	
	
		
	public FindLead findLeads(){
		clickByLink(prop.getProperty("MyLead.FindLeads.Link"));
		return new FindLead(driver, test);
	}
	
}
