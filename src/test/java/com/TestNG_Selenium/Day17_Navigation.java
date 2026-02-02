package com.TestNG_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day17_Navigation {

	WebDriver driver;

	@BeforeMethod
	void precondition() {
		driver = new ChromeDriver();
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();

	}

	@Test
	void validation() {
		WebElement policy = driver.findElement(By.linkText("Privacy Policy"));
		policy.click();

		String actual_Result = driver.getTitle();
		String expectedResult = "Privacy Policy | Practice Test Automation";

		Assert.assertEquals(actual_Result, expectedResult,
				"----- Actual Result And Expected Result Both are the Mismatched ---- ");

		Navigation nv = driver.navigate();
		nv.back();

		String actualTitle = driver.getTitle();
		String expectedTitle = "Test Login | Practice Test Automation";
		System.out.println(actualTitle);
		nv.refresh();
		Assert.assertEquals(actualTitle, expectedTitle,
				"----- Actual Result And Expected Result Both are the Mismatched ----");

		nv.forward();
	}

	@AfterMethod
	void end() {
		driver.quit();
	}

}
