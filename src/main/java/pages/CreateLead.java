package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class CreateLead  extends LeafTapsWrappers {
	
	
	public CreateLead(RemoteWebDriver driver, ExtentTest test){
			this.driver = driver;
			this.test = test;

			if(!verifyTitle("Create Lead | opentaps CRM")){
				reportStep("This is not Create Lead Page", "FAIL");
			}
		}
	
     	public CreateLead enterCompanyName(String comnyName){
		enterById(prop.getProperty("CreateLead.Company.Id"), comnyName);
		return this;
		
	    }
	
	
		
		public CreateLead enterFirstName(String firstName){
			enterById(prop.getProperty("CreateLead.FirstName.Id"), firstName);
			return this;
		}
		
		
		public CreateLead enterLastName(String lastName){
			enterById(prop.getProperty("CreateLead.LastName.Id"), lastName);
			return this;
			
		}
		
		 
		public ViewLead clickCreateLeadSubmit(){
			clickByName(prop.getProperty("CreateLead.CreateLead.Name"));
			return new ViewLead(driver, test);
		}
		


}
