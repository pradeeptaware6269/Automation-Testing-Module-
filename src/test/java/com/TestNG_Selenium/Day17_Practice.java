package com.TestNG_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day17_Practice {
	/*
	 * 
	 * 📝 Task Steps: Open the URL
	 * :https://practicetestautomation.com/practice-test-login/
	 * 
	 * Locate Username field
	 * 
	 * Locate Password field
	 * 
	 * Check:
	 * 
	 * Username is enabled
	 * 
	 * Password is displayed
	 * 
	 * Print results
	 * 
	 * Use assertions for validation
	 */
	WebDriver driver;

	@BeforeMethod
	void precondition() {
		driver = new ChromeDriver();
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");

	}

	@Test
	void test() {
		WebElement useraname = driver.findElement(By.name("username"));
		boolean enable = useraname.isEnabled();

		WebElement password = driver.findElement(By.name("password"));
		boolean display = password.isDisplayed();

		System.out.println("Username Enabled :" + enable);
		System.out.println("Password Display :" + display);

		Assert.assertTrue(enable, "Username field is NOT enabled");
		Assert.assertTrue(display, "Password field is NOT displayed");

	}

	@AfterMethod
	void end() {
		driver.quit();
	}

}
