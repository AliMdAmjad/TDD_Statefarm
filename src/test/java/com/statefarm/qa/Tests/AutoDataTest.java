package com.statefarm.qa.Tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.statefarm.qa.base.BaseClass;
import com.statefarm.qa.utils.AutoData;

public class AutoDataTest extends BaseClass {

	@DataProvider(name = "autoDataIterator")
	public Iterator<AutoData> autoDataIterator() {
		List<AutoData> list = new ArrayList<AutoData>();
		AutoData autoData1 = new AutoData("14206", "Md", "A", "Ali", "952 E Lovejoy St", "09-08-1988");
		AutoData autoData2 = new AutoData("14215", "Md", "M", "Ahmed", "53 Cambridge Ave", "08-09-1989");
		list.add(autoData1);
		list.add(autoData2);
		return list.iterator();

	}

	@DataProvider(name = "autoDataObject")
	public Object[][] autoDataObject() {
		AutoData autoData1 = new AutoData("14206", "Md", "A", "Ali", "952 E Lovejoy St", "09-08-1988");
		AutoData autoData2 = new AutoData("14215", "Md", "M", "Ahmed", "53 Cambridge Ave", "08-09-1989");
		return new Object[][] { { autoData1 }, { autoData2 } };
	}
	
	@Test(enabled = true, dataProvider = "autoDataObject")
	public void autoDataTestAut(AutoData autoData) {
		homePage.homepageSteps(autoData);
		autoQuote.getQuoteSteps(autoData);
	}

}
