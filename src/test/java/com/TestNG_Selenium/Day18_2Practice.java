package com.TestNG_Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day18_2Practice {
	WebDriver driver;

	@BeforeMethod
	public void precise() {
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

	}

	@Test(priority = 0, enabled = true)
	public void test() {
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));

		if (search.isEnabled()) {
			search.sendKeys("Shoes for the men");
		}
		String title = driver.getTitle();
		System.out.println(title);

		WebElement contact = driver.findElement(By.linkText("Contact Us"));
		boolean display = contact.isDisplayed();

		WebElement about = driver.findElement(By.linkText("About Us"));
		boolean display1 = about.isDisplayed();

		WebElement payment = driver.findElement(By.linkText("Payments"));
		boolean display2 = payment.isDisplayed();

		if (display & display1 & display2) {

			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 1, enabled = true)
	public void test1() {
		driver.findElement(By.linkText("Cleartrip")).click();

		// Step No 1
		// Set<String> winSet = driver.getWindowHandles();
		// List<String> winList = new ArrayList<String>(winSet);

		// Step No 2
		List<String> winList = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(winList.get(1));

		String expected_r = "https://www.cleartrip.com/";
		String actual_r = driver.getCurrentUrl();
		Assert.assertEquals(actual_r, expected_r);

		driver.switchTo().window(winList.get(1));
		System.out.println(driver.getCurrentUrl());

	}

	@Test

	@AfterMethod
	public void end() {
		driver.quit();
	}
}
