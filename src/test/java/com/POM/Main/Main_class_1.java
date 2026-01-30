package com.POM.Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main_class_1 {

	@FindBy(name = "username")
	WebElement username;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(id = "submit")
	WebElement submit;

	public Main_class_1(WebDriver driver) {
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

}
