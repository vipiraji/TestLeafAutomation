package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;



public class CreateLeadPage extends SeleniumBase {
	
	public CreateLeadPage enterFirstName(String fName)
	{
		
		//driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		clearAndType(locateElement("id","createLeadForm_firstName"),fName);
	    return this;
	}
 public CreateLeadPage enterLastName(String lName)
 {
	 //driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	 clearAndType(locateElement("id","createLeadForm_lastName"),lName);
	 return this;
 }
 public CreateLeadPage enterCompanyName(String cName)
 {
	 //driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	 clearAndType(locateElement("id","createLeadForm_companyName"),cName);
	 return this;
 }
 public ViewLeadPage clickCreateLead()
 {
	 //driver.findElementByClassName("smallSubmit").click();
	 click(locateElement("class","smallSubmit"));
	 return new ViewLeadPage();
 }

}
