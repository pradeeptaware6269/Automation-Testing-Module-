package com.iRetryAnalyser_1;

// We are taking the Main class for the finding the actual element in this current application (useing the POM) 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main {

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

	public Main(WebDriver driver) {
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
