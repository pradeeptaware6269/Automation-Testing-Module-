package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebDriver {

	ChromeDriver driver;

	@BeforeMethod
	public void preconditon() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

	}

	@Test
	public void testCase() {

		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		firstname.sendKeys("Pradeep");

		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
		lastname.sendKeys("Taware");

		WebElement button = driver.findElement(By.xpath("//button[@id=\"submitbtn\"]"));
		if (button.isEnabled()) {
			System.out.println("Current Test Case is Passed ...");

		} else {
			System.out.println("Current test Case is Failed ...");
		}

	}

	@AfterMethod
	public void end() {
		driver.close();

	}
}
