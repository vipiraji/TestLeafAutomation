package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC002_CreateLead extends ProjectSpecificMethods{

	@BeforeTest
	public void setData() {
		excelFileName="TC002";
		testcaseName="Create Lead ";
		testcaseDec = "Creating a lead in Leaftaps";
		author="vipitha";
		category="smoke";
		
	}
	
	@Test(dataProvider="fetchData")
	public void runTC002(String username, String password,String cName,String fName,String lName ) {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFALink()
		.clickLeads()
		.clickCreateLeads()
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterCompanyName(cName)
		.clickCreateLead()
		.verifyLead();
		
	}
}
