package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class ViewLead extends LeafTapsWrappers  {

	public ViewLead(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("View Lead | opentaps CRM")){
			reportStep("This is not Home Page", "FAIL");
		}
	}
	
	public ViewLead verifyFirstName(String fname) {
		verifyTextContainsById(prop.getProperty("ViewLead.FirstName.Id"), fname);
		return this;
	}
	
	public EditLead clickEditLeadLink(){
		clickByLink(prop.getProperty("ViewLead.Edit.Link"));
		return new EditLead(driver, test);
	}
	
	public DuplicateLead clickDuplicateLeadLink(){
		clickByLink(prop.getProperty("ViewLead.Duplicate.Link"));
		return new DuplicateLead(driver, test);
	}
	public DeleteLead clickDeleteLeadLink(){
		clickByLink(prop.getProperty("DeleteLead.Delete.Link"));
		return new DeleteLead(driver, test);
	}
	
	
	
	
	
}
