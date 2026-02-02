package com.TestNG_Selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day24_TakeSreenShot {

	WebDriver driver;

	@BeforeMethod
	public void before() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
	}

	@Test
	public void test() throws Exception {

// Step 1
		TakesScreenshot tka = (TakesScreenshot) driver;

		File sourceFile = tka.getScreenshotAs(OutputType.FILE);

		File targetFile = new File(
				"D:\\JBK\\Automation Module\\Pradeep_Selenium_Scripts\\TKA.JBKCRM\\target\\loginfail.png");

		FileHandler.copy(sourceFile, targetFile);

//Step 2
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));

		File sourceFile1 = firstname.getScreenshotAs(OutputType.FILE);

		File targetFile1 = new File(
				"D:\\JBK\\Automation Module\\Pradeep_Selenium_Scripts\\TKA.JBKCRM\\target\\element.png");

		FileHandler.copy(sourceFile1, targetFile1);
	}

	@AfterMethod
	public void after() {
		// driver.quit();
	}
}
