package com.TestNG_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day13_1_Practice {

	/*
	 * Test Case : Validate registration form with valid details
	 *
	 * Website : https://demo.automationtesting.in/Register.html
	 *
	 * Test Data : First Name : Pradeep Last Name : Taware Address : Pune,
	 * Maharashtra Email : pradeep@test.com Phone : 9876543210 Gender : Male Hobbies
	 * : Cricket Language : English Skill : Java
	 *
	 * Test Steps : 1. Open browser 2. Enter URL 3. Fill all required fields 4.
	 * Click on Submit button
	 *
	 * Expected Result : Form should be submitted without any error
	 */

	@Test
	public void validateRegistrationForm() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// 1 & 2. Open browser and enter URL
		driver.get("https://demo.automationtesting.in/Register.html");

		// 3. Fill form
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Pradeep");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Taware");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Pune, Maharashtra");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pradeep@test.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9870043210");

		// Gender
		driver.findElement(By.xpath("//input[@value='Male']")).click();

		// Hobby
		driver.findElement(By.id("checkbox1")).click();

		// Skill
		driver.findElement(By.id("Skills")).sendKeys("Java");

		Thread.sleep(2000);

		// Simple validation – page title should not be empty
		String title = driver.getTitle();
		Assert.assertTrue(title.length() > 0, "Page title is empty");

		// Close browser
		driver.quit();
	}
}
