package com.TestNG_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day14_1_TestCaseValidation {
	/*
	 * 
	 * ### **Test Case 3: Negative Password Test**
	 ** 
	 * Test Objective:** Verify that an error message is displayed when a valid
	 * username is entered with an invalid password.
	 * 
	 * Precondition : Login page is accessible.
	 ** 
	 * Test Steps:**
	 * 
	 * 1. Open the browser.
	 * 2. Navigate to the login page. 
	 * 3. Enter `student` in the  **Username** field. 
	 * 4. Enter `incorrectPassword` in the **Password** field.
	 * 5. Click on the **Submit/Login** button.
	 ** 
	 * Expected Result:**
	 * 
	 * An error message should be displayed. Error message text should be:
	 ** "Your password is invalid!"**
	 */

	@Test
	void testcase() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();

		// Enter the username
		WebElement firstname = driver.findElement(By.name("username"));
		firstname.sendKeys("student");

		WebElement passsword = driver.findElement(By.name("password"));
		passsword.sendKeys("incorrectPassword");

		WebElement button = driver.findElement(By.id("submit"));
		button.click();
		WebElement message = driver.findElement(By.id("error"));
		boolean isdisplaly = message.isDisplayed();

		// 1
		Assert.assertTrue(isdisplaly);

		// 2
		String msg1 = message.getText();
		System.out.println(msg1);
		
		driver.quit();
	}
}
