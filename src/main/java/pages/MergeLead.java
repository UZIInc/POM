package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MergeLead extends LeafTapsWrappers {
	
	
	public MergeLead(RemoteWebDriver driver, ExtentTest test){
			this.driver = driver;
			this.test = test;

			if(!verifyTitle("Merge Leads | opentaps CRM")){
				reportStep("This is not Merge Leads Page", "FAIL");
			}
		}
	
	public FindLead clickMyfromLink(){
		clickByXpathNoSnap(prop.getProperty("MergeLead.FromLead.Xpath"));
		return new FindLead(driver, test);
	
	
		
	}
	
	public MergeLead clickFindleads(){
		clickByXpathNoSnap(prop.getProperty("EditLead.FindLeads.Xpath"));
		return this;
   }
	
	public ViewLead clickResultingLeads(){
		clickByXpathNoSnap(prop.getProperty("EditLead.Result.Xpath"));
		return new ViewLead(driver, test);
	}
}