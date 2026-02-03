package com.TestNG_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day26_DataProvider_Main {

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(id = "submit")
	WebElement submit;

	// success message
	@FindBy(xpath = "//h1[text()='Logged In Successfully']")
	WebElement successMsg;

	// error message
	@FindBy(id = "error")
	WebElement errorMsg;

	public Day26_DataProvider_Main(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void username(String name) {
		username.clear();
		username.sendKeys(name);
	}

	public void password(String pass) {
		password.clear();
		password.sendKeys(pass);
	}

	public void submit() {
		submit.click();
	}

	public String getSuccessMessage() {
		return successMsg.getText();
	}

	public String getErrorMessage() {
		return errorMsg.getText();
	}
}
