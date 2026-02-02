package com.TestNG_Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day18_window {
	WebDriver driver;

	@BeforeMethod
	public void precise() {
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

	}

	@Test
	public void window_test() {

		driver.findElement(By.linkText("Myntra")).click();

		Set<String> window_Ele = driver.getWindowHandles();
		List<String> list_window = new ArrayList<>(window_Ele);
		// HERE We can Validate the Mitra page
		String actual_result = driver.getTitle();
		System.out.println(actual_result);
		String expected_result = "Online Shopping India Mobile, Cameras, Lifestyle & more Online @ Flipkart.com";

		Assert.assertEquals(actual_result, expected_result);

		driver.switchTo().window(list_window.get(1));

		WebElement searchBox = driver.findElement(By.className("desktop-searchBar"));
		searchBox.sendKeys("Shoes for men");
		driver.switchTo().window(list_window.get(0));

		String actual = driver.getCurrentUrl();
		String expected = "https://www.flipkart.com/";

		Assert.assertEquals(actual, expected);

	}

	@AfterMethod
	public void end() {
		driver.quit();
	}

}
