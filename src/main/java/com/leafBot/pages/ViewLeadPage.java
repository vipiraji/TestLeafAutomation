package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class ViewLeadPage extends SeleniumBase {

	public void verifyLead()
	  {
		  String text = getElementText(locateElement("id","viewLead_firstName_sp"));
		  System.out.println(text);
	  }
/*	  public EditLeadPage clickEdit()
	  {
		  driver.findElementByLinkText("Edit").click();
		  return new EditLeadPage();
	  }
	  public ViewLeadPage verfifyModifiedCompanyName()
	  {
		  String modifiedCompany = driver.findElementById("viewLead_companyName_sp").getText();
		  System.out.println(modifiedCompany);
		  return this;
	  }*/
}
