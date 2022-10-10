package com.statefarm.qa.objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.statefarm.qa.common.CommonFunctions;
import com.statefarm.qa.utils.AutoData;

import static com.statefarm.qa.utils.DataMap.*;

import java.util.Map;

public class AutoQuote {
	CommonFunctions commons;
	WebDriver driver;

	public AutoQuote(WebDriver driver, CommonFunctions commons) {
		PageFactory.initElements(driver, this);
		this.commons = commons;
		this.driver = driver;
	}

	@FindBy(css = "input#first_name")
	WebElement firstNamElement;

	@FindBy(name = "middleName")
	WebElement middleNamElement;

	@FindBy(css = "input#last_name")
	WebElement lastNamElement;

	@FindBy(css = "input#street1")
	WebElement addressElement;

	@FindBy(css = "input#date_of_birth")
	WebElement dobElement;

	@FindBy(xpath = "//div[@class='-oneX-terms-and-conditions-checkbox marginBottom40 marginTop1']")
	WebElement acceptTermsElement;

	@FindBy(name = "nextVehicles")
	WebElement nextVehiclesElement;

	private void typeFirstName(String firstname) {
		commons.inputValues(firstNamElement, firstname);
	}

	private void typeMiddleName(String middlename) {
		commons.inputValues(middleNamElement, middlename);
	}

	private void typeLastName(String lastname) {
		commons.inputValues(lastNamElement, lastname);
	}

	private void typeAddrerss(String address) {
		commons.inputValues(addressElement, address);
	}

	private void typeDob(String dob) {
		commons.inputValues(dobElement, dob);
	}

	private void clickAtTermsCondition() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", acceptTermsElement);
		commons.click(acceptTermsElement);
	}

	private void clickNextVehicles() {
		commons.click(nextVehiclesElement);
	}

	public void getQuoteSteps(String firstname, String middlename, String lastname, String address, String dob) {
		typeFirstName(firstname);
		typeMiddleName(middlename);
		typeLastName(lastname);
		typeAddrerss(address);
		typeDob(dob);
		clickAtTermsCondition();
		clickNextVehicles();

	}
	
	public void getQuoteSteps(Map<String , String> map) {
		typeFirstName(map.get(FirstName.getValue()));
		typeMiddleName(map.get(MiddleName.getValue()));
		typeLastName(map.get(LastName.getValue()));
		typeAddrerss(map.get(Address.name()));
		typeDob(map.get(DOB.name()));
		clickAtTermsCondition();
		clickNextVehicles();

	}
	
	public void getQuoteSteps(AutoData autoData) {
		typeFirstName(autoData.getFirstName());
		typeMiddleName(autoData.getMiddleName());
		typeLastName(autoData.getLastName());
		typeAddrerss(autoData.getLastName());
		typeDob(autoData.getDob());
		clickAtTermsCondition();
		clickNextVehicles();

	}

}
