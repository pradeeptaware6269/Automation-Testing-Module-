package com.TestNG_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day21_1_Task1 {
	WebDriver driver;

	@BeforeClass
	public void start() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

	}

	@Test(priority = 0, enabled = true)

	public void test() {

		WebElement contry = driver.findElement(By.xpath("//span[@role='combobox']"));
		contry.click();

		WebElement value = driver.findElement(By.xpath("//li[text()='Australia']"));
		value.click();
	}

	@AfterClass
	public void end() {

	}

}
