package com.TestNG_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day28_1_Main {

	@FindBy(xpath = "//input[@name='username']")
	WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "//button[@id='submit']")
	WebElement submit;

	WebDriver driver;

	public Day28_1_Main(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void username(String name) {
		username.sendKeys(name);
	}

	public void password(String pass) {
		password.sendKeys(pass);
	}

	public void btn() {
		submit.click();
	}

}
