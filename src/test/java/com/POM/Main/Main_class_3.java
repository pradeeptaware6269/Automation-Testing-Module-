package com.POM.Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main_class_3 {

	WebDriver driver;

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(id = "submit")
	WebElement submit;

	@FindBy(id = "error")
	WebElement error;

	public Main_class_3(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void username(String name) {
		username.sendKeys(name);
	}

	public void password(String pass) {
		password.sendKeys(pass);
	}

	public void submit() {
		submit.click();
	}

	public String actual_result() {
		return driver.getCurrentUrl();
	}

	public String actual_result1() {
		return error.getText();
	}
}
