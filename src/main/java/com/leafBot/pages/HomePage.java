package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;



public class HomePage extends SeleniumBase{
	public HomePage clickLogout() {
		click(locateElement("class","decorativeSubmit"));
		return new HomePage();
	}
	public MyHomePage clickCRMSFALink()
	{
		//driver.findElementByLinkText("CRM/SFA").click();
		click(locateElement("link","CRM/SFA"));
		return new MyHomePage();
	}
}
