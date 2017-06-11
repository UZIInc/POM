package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyHome extends LeafTapsWrappers {

	public MyHome(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("My Home | opentaps CRM")){
			reportStep("This is not My Home Page", "FAIL");
		}
	}
	
	// Click Leads 
			public MyLeads clickLeadLink(){
				clickByLink((prop.getProperty("MyHome.Leads.Link")));
				return new MyLeads(driver, test);
			}

			
}
