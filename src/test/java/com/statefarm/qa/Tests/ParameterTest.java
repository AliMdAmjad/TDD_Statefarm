package com.statefarm.qa.Tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.statefarm.qa.base.BaseClass;

public class ParameterTest extends BaseClass{
	
	@Parameters("zipcode")
	@Test
	public void homePageTest(String zipCode) {
		homePage.homepageSteps(zipCode);
	}

}
