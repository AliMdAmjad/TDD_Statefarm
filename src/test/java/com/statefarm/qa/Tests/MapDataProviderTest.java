package com.statefarm.qa.Tests;

import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.statefarm.qa.base.BaseClass;
import com.statefarm.qa.utils.ExcelUtil;
import static com.statefarm.qa.utils.DataMap.*;

public class MapDataProviderTest extends BaseClass {
	
	@DataProvider( name = "DataProviderMap")
	public Object[][] mapData(){
		String pathString = configuration.get("excelPath");
		String sheetNameString = configuration.get("excelSheetMap");
		ExcelUtil excelUtil = new ExcelUtil(pathString, sheetNameString);
		int size = excelUtil.dataMap().size();
		Object[][] objects2d = new Object[size][1];
		/*
		 * objects2d is an two-dimensional array
		 * Object[][] objects2d = new Object[size][1]
		 * define size = basically that many number of rows in dataMap
		 * 1 = is basically each dataMap index has one map
		 */
		for(int i = 0; i < size; i++) {
			objects2d[i][0] = excelUtil.dataMap().get(i);
		}
		return objects2d;
	}
	
	
	@Test(enabled = true, dataProvider = "DataProviderMap")
	public void dataProviderMap(Map<String, String> map) {
		homePage.homepageSteps(map);
		autoQuote.getQuoteSteps(map);
		
	}
	
	@Test(enabled = false, dataProvider = "DataProviderMap")
	public void autoDataWithMap(Map<String, String> map) {
		homePage.homepageSteps(map.get("Zip Code"));
		autoQuote.getQuoteSteps(map.get("First Name"),map.get("Middle Name"), map.get("Last Name"), map.get("Address"), map.get("DOB"));
	}
	
	@Test(enabled = true, dataProvider = "DataProviderMap")
	public void autoDataWithEnum(Map<String, String> map) {
		homePage.homepageSteps(map.get(ZipCode.getValue()));
		autoQuote.getQuoteSteps(map.get(FirstName.getValue()), map.get(MiddleName.getValue()), map.get(LastName.getValue()), map.get(Address.name()), map.get(DOB.name()));
	}
	
	

}
