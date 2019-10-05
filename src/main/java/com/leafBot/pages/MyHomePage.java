package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;



public class MyHomePage extends SeleniumBase {

	public MyLeadsPage clickLeads()
	{
		//driver.findElementByLinkText("Leads").click();
		click(locateElement("link","Leads"));
		return new MyLeadsPage();
	}
}
