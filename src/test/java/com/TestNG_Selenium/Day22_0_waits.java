package com.TestNG_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day22_0_waits {

	WebDriver driver;

	@BeforeMethod
	public void before() {
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
	}

	@Test
	public void test() {

		WebElement btn1 = driver.findElement(By.id("btn1"));
		btn1.click();

		// Explicit Wait
		//WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement firstText = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1")));
		//firstText.sendKeys("---- Welcome -----");

		// Fluent Wait
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofSeconds(4))
				.ignoring(NoSuchElementException.class);

		WebElement secondText = fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
		secondText.sendKeys("---- Fluent Wait -----");
	}

	@AfterMethod
	public void after() {
		driver.quit();
	}
}
