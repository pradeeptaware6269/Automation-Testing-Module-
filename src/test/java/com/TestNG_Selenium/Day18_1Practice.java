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

public class Day18_1Practice {
	WebDriver driver;

	@BeforeMethod
	public void precise() {
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}

	
	@Test
	public void test() {

		driver.findElement(By.xpath("//a[@href='https://www.shopsy.in']")).click();

		Set<String> win = driver.getWindowHandles();
		List<String> list_win = new ArrayList<>(win);

		driver.switchTo().window(list_win.get(1));

		String expected_result = "Shop Online for Mens & Womens Fashion, Beauty, Home, & More | Shopsy";
		String actual_result = driver.getTitle();
		Assert.assertEquals(actual_result, expected_result);

		WebElement login = driver.findElement(By.linkText("Login"));
		Assert.assertTrue(login.isDisplayed());

		driver.switchTo().window(list_win.get(0));

		String current_actual = driver.getCurrentUrl();
		String current_expected = "https://www.flipkart.com/";
		Assert.assertEquals(current_actual, current_expected);
	}

	@AfterMethod
	public void end() {
		driver.quit();
	}

}
