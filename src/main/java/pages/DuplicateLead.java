package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class DuplicateLead extends LeafTapsWrappers {
	
	
	public DuplicateLead(RemoteWebDriver driver, ExtentTest test){
			this.driver = driver;
			this.test = test;

			if(!verifyTitle("Duplicate Lead | opentaps CRM")){
				reportStep("This is not Duplicate Lead Page", "FAIL");
			}
		}
	
	
		
	public ViewLead clickCreateLeadDublicate(){
		clickByName(prop.getProperty("DuplicateLead.CreateLead.Name"));
		return new ViewLead(driver, test);
	}
}
