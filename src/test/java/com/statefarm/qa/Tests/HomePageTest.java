package com.statefarm.qa.Tests;

import org.testng.annotations.Test;
import com.statefarm.qa.base.BaseClass;

public class HomePageTest extends BaseClass{
	
	@Test
	public void homePageTest() {
		homePage.homepageSteps("14206");
	}

}
