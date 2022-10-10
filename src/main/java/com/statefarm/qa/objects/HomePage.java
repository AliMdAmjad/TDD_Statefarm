package com.statefarm.qa.objects;

import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.statefarm.qa.common.CommonFunctions;
import com.statefarm.qa.utils.AutoData;

import static com.statefarm.qa.utils.DataMap.*;

public class HomePage {

	CommonFunctions commons;
	WebDriver driver;

	public HomePage(WebDriver driver, CommonFunctions commons) {
		PageFactory.initElements(driver, this);
		this.commons = commons;
		this.driver = driver;
	}

	@FindBy(css = "input#quote-main-zip-code-input")
	WebElement enterZipCodElement;

	@FindBy(id = "quote-main-zip-btn")
	WebElement getQuotElement;

	private void inputZipCode(String value) {
		commons.inputValues(enterZipCodElement, value);
	}

	private void clickAtGetQuote() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", getQuotElement);
		commons.click(getQuotElement);
	}

	public void homepageSteps(String value) {

		inputZipCode(value);
		clickAtGetQuote();

	}

	public void homepageSteps(Map<String, String> map) {

		inputZipCode(map.get(ZipCode.getValue()));
		clickAtGetQuote();

	}

public void homepageSteps(AutoData autoData) {
	
	inputZipCode(autoData.getZipCode());
	clickAtGetQuote();
}
	
	
	

}
