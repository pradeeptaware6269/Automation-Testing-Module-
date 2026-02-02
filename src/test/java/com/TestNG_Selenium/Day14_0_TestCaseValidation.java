package com.TestNG_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day14_0_TestCaseValidation {

    /*
     * Test Case 2: Negative Username Test
     *
     * Test Objective:
     * Verify that an error message is displayed when an invalid username is entered
     * with a valid password.
     *
     * Test Steps:
     * 1. Open the browser.
     * 2. Navigate to the login page.
     * 3. Enter incorrectUser in Username field.
     * 4. Enter Password123 in Password field.
     * 5. Click on Submit button.
     *
     * Expected Result:
     * Error message should be displayed:
     * "Your username is invalid!"
     */

	@Test
	void testcase() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();

		// Enter the username
		WebElement firstname = driver.findElement(By.name("username"));
		firstname.sendKeys("incorrectUser");

		WebElement passsword = driver.findElement(By.name("password"));
		passsword.sendKeys("Password123");

		WebElement button = driver.findElement(By.id("submit"));
		button.click();

		WebElement message = driver.findElement(By.id("error"));
		boolean isdisplaly = message.isDisplayed();

		// 1
		Assert.assertTrue(isdisplaly);

		// 2
		String msg = message.getText();
		System.out.println(msg);

	}
}
