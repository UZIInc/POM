package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLead extends LeafTapsWrappers {
	
	
	public FindLead(RemoteWebDriver driver, ExtentTest test){
			this.driver = driver;
			this.test = test;

			if(!verifyTitle("Find Leads | opentaps CRM")){
				reportStep("This is not Find Leads Page", "FAIL");
			}
		}
	
	public FindLead findFirstName(String findfistname){
		enterByXpath(prop.getProperty("EditLead.FirstName.Xpath"), findfistname);
		return this;
		
	}
	
	public FindLead clickFindleads(){
		clickByXpathNoSnap(prop.getProperty("EditLead.FindLeads.Xpath"));
		return this;
   }
	
	public ViewLead clickResultingLeads(){
		clickByXpathNoSnap(prop.getProperty("EditLead.Result.Xpath"));
		return new ViewLead(driver, test);
	}
}