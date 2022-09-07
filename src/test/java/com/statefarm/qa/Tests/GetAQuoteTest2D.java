package com.statefarm.qa.Tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.statefarm.qa.base.BaseClass;
import com.statefarm.qa.utils.ExcelUtil;

public class GetAQuoteTest2D extends BaseClass {
	
	@DataProvider(name = "autoData2DExcel")
	public Object[][] autoData(){
		String pathString = configuration.get("excelPath");
		String sheetNameString = configuration.get("excelSheet");
		ExcelUtil excelUtil = new ExcelUtil(pathString, sheetNameString);
		return excelUtil.dataObjects();
	}

	@Test(enabled = true, dataProvider = "autoData2DExcel")

	public void autoQuoteTest(String zipcode, String firstname, String middlename, String lastname, String address, String dob) {
	homePage.homepageSteps(zipcode);
	autoQuote.getQuoteSteps(firstname, middlename, lastname, address, dob);

	}

}
