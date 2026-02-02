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

public class Day22_1_waits {

	WebDriver driver;

	@BeforeMethod
	public void before() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
	}

	// ---------- Explicit Wait (WebDriverWait) ----------
	@Test(priority = 1)
	public void explicitWaitTest() {

		driver.findElement(By.id("btn1")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement text1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1")));

		text1.sendKeys("---- Explicit Wait ----");
	}

	// ---------- Implicit Wait ----------
	@Test(priority = 2)
	public void implicitWaitTest() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("btn2")).click();

		driver.findElement(By.id("txt1")).sendKeys("Pradeep");
		driver.findElement(By.id("txt2")).sendKeys("Taware");
	}

	// ---------- Fluent Wait ----------
	@Test(priority = 3)
	public void fluentWaitTest() {

		driver.findElement(By.id("btn1")).click();

		Wait<WebDriver> fluentWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

		WebElement text2 = fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));

		WebElement text1 = (WebElement) fluentWait
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("txt1")));

		text1.sendKeys("Pradeep");
		text2.sendKeys("Taware");
	}

	@AfterMethod
	public void after() {
		driver.quit();
	}
}
