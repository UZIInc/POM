package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class EditLead extends LeafTapsWrappers {
	
	
	public EditLead(RemoteWebDriver driver, ExtentTest test){
			this.driver = driver;
			this.test = test;

			if(!verifyTitle("opentaps CRM")){
				reportStep("This is not Edit Lead Page", "FAIL");
			}
		}
	
     	public EditLead updateCompanyName(String updcomnyName){
		enterById(prop.getProperty("EditLead.Company.Id"), updcomnyName);
		return this;
		
	    }
     	
     	public ViewLead clickUpdateSubmit(){
			clickByName(prop.getProperty("EditLead.Update.Name"));
			return new ViewLead(driver, test);
		}
		
}
     	
