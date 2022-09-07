package com.statefarm.qa.Tests;

import org.testng.annotations.Test;

import com.statefarm.qa.base.BaseClass;

public class GetAQuoteTest extends BaseClass {

	@Test

	public void autoQuoteTest() {
	homePage.homepageSteps("14206");
	autoQuote.getQuoteSteps("md", "a", "ali", "952 e lovejoy st", "09-08-1988");

	}

}
