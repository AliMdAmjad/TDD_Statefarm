package com.statefarm.qa.Tests;

import org.testng.annotations.Test;

import com.statefarm.qa.base.BaseClass;

public class GroupingAutoQuote extends BaseClass {

	@Test(groups = "User1")

	public void autoQuote1Test() {
	homePage.homepageSteps("14206");
	autoQuote.getQuoteSteps("md", "a", "ali", "952 e lovejoy st", "09-08-1988");

	}
	
	@Test(groups = "User2")

	public void autoQuote2Test() {
	homePage.homepageSteps("14206");
	autoQuote.getQuoteSteps("md", "m", "ahmed", "53 cambridge st", "11-07-1989");

	}

}
