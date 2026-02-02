package com.TestNG_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day19_0_Alert {

	WebDriver driver;

	@BeforeClass
	public void precise() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();

	}

	@Test(priority = 0, enabled = true)
	public void test() {

		WebElement alertLink = driver.findElement(By.linkText("Alert with OK "));
		alertLink.click();

		WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		button.click();

		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@Test(priority = 1, enabled = true)
	public void test1() {
		WebElement alertlink1 = driver.findElement(By.linkText("Alert with OK & Cancel "));
		alertlink1.click();

		WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		button.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		WebElement alertlink2 = driver.findElement(By.linkText("Alert with OK & Cancel "));
		alertlink2.click();

		WebElement button2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		button2.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();

	}

	@Test(priority = 2, enabled = true)
	public void test2() {

		WebElement alertLink = driver.findElement(By.linkText("Alert with Textbox  "));
		alertLink.click();

		WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		button.click();

		Alert alert = driver.switchTo().alert();

		alert.sendKeys("Pradeep Taware Patil");
		alert.accept();
	}

	@AfterClass
	public void end() {
		driver.quit();

	}

}
