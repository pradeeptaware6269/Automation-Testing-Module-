package com.TestNG_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day30_Parameter {

	WebDriver driver;

	@Parameters({ "url", "browser" })
	@BeforeMethod
	public void setup(String url, String brname) {

		if (brname.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (brname.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (brname.equalsIgnoreCase("ie")) {
			driver = new InternetExplorerDriver();
		} else if (brname.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		driver.get(url);

	}

	@Parameters({ "username", "password" })
	@Test
	public void testcase(String username, String password) {

		WebElement name = driver.findElement(By.id("username"));
		name.sendKeys(username);

		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys(password);

		WebElement submit = driver.findElement(By.id("submit"));
		submit.click();
	}

	@AfterMethod
	public void end() {
		driver.quit();
	}
}
