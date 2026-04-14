package com.Practice_TKA_JBK;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://stackoverflow.com/questions");
		driver.manage().window().maximize();
	}

	@Test(priority = 0, enabled = false)
	public void testcase1() {

		String currentUrl = driver.getCurrentUrl();

		Assert.assertTrue(currentUrl.contains("stackoverflow"), "URL does not contain stackoverflow");

	}
	
	

	@Test(priority = 0, enabled = true)
	public void testcase2() {

		WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search…']"));
		searchBox.sendKeys("Python list comprehension");

		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ENTER).perform();

		WebElement exp = driver.findElement(By.xpath("//div[@class='mb8' and contains(text(),'python list comprehension')]"));

		String result = exp.getText().toLowerCase();

		Assert.assertTrue(result.contains("python list comprehension"), "Search results not displayed correctly");

	}

	@AfterMethod
	public void end() {
		driver.quit();
	}
}
