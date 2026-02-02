package com.TestNG_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day13_0_validation_testcase {
	/*
	 * Test Case : Validate login page with valid credential
	 * 
	 * Test Data :
	 * 
	 * Username: student Password: Password123
	 * 
	 * Test Steps :
	 * 
	 * 1. Open browser 2. Enter URL 3. Enter valid username in username field 4.
	 * Enter valid password in password field 5. Click on submit button 6. Close the
	 * browser
	 * 
	 * Expected Result :
	 * 
	 * User should login successfully and validate:
	 * 
	 * 1. Title should be "Login Success" 2. URL of the page:
	 * https://practicetestautomation.com/practice-test-login/admin 3. Heading text
	 * should be "Admin Dashboard"
	 * 
	 */
	@Test(priority = 0)
	void title_validation() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");

		WebElement firstname = driver.findElement(By.name("username"));
		firstname.sendKeys("student");

		WebElement passsword = driver.findElement(By.name("password"));
		passsword.sendKeys("Password123");

		WebElement button = driver.findElement(By.id("submit"));
		button.click();

		// Title Validation
		String actualtitle = driver.getTitle();
		String expectedtitle = "Login Success";

		Assert.assertEquals(actualtitle, expectedtitle, "----  Sorry But title Is not validate ----");
		driver.quit();

	}

	@Test(priority = 1)
	void url_validation() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");

		WebElement firstname = driver.findElement(By.name("username"));
		firstname.sendKeys("student");

		WebElement passsword = driver.findElement(By.name("password"));
		passsword.sendKeys("Password123");

		WebElement button = driver.findElement(By.id("submit"));
		button.click();

		// Title Validation
		String actualurl = driver.getCurrentUrl();
		String expectedurl = "https://practicetestautomation.com/practice-test-login/admin";

		Assert.assertEquals(actualurl, expectedurl, "----  Sorry Yout url is not validate ----");
		driver.quit();

	}

	@Test(priority = 2)
	void heading_validation() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");

		WebElement firstname = driver.findElement(By.name("username"));
		firstname.sendKeys("student");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Password123");

		WebElement button = driver.findElement(By.id("submit"));
		button.click();

		// Heading Validation
		WebElement heading = driver.findElement(By.tagName("h3"));
		String actualHeading = heading.getText();
		String expectedHeading = "Admin Dashboard";

		Assert.assertEquals(actualHeading, expectedHeading, "---- Sorry Pradeep, Heading text is not matching ----");

		driver.quit();
	}

}
