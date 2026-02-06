package com.TestNG_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day28_0_JavaScript_Executer {

	WebDriver driver;

	@BeforeMethod
	public void before() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();

	}

	@Test
	public void test() {
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));

		WebElement submit = driver.findElement(By.xpath("//button[@id=\"submit\"]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].value='pradeep';", username);
		js.executeScript("arguments[0].value='pass@123';", password);
		js.executeScript("arguments[0].click();", submit);

		js.executeScript("window.scrollBy(0,900)");

	}
}
