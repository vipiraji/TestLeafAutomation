package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;



public class MyLeadsPage extends SeleniumBase{

	public CreateLeadPage clickCreateLeads()
	  {
		  //driver.findElementByLinkText("Create Lead").click();
		click(locateElement("link","Create Lead"));
		  return new CreateLeadPage();
	  }
//	  public FindLeadsPage clickFindLeads()
//	  {
//		  driver.findElementByLinkText("Find Leads").click();
//		  return new FindLeadsPage();
//	  }
}
