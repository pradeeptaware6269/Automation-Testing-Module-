package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Absoluate_Xpath {

	ChromeDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

	}

	@Test(enabled = true, priority = 0)
	public void testCase() {

		WebElement firstName = driver
				.findElement(By.xpath("/html//body//section//div//div/div[2]//form//div//div//input"));
		firstName.sendKeys("Pradeep");

	}

	@Test
	public void testcase2() {

		WebElement dob = driver.findElement(By.xpath("//input[@id=\"dateOfBirthInput\"]"));
//		dob.sendKeys(Keys.CONTROL+"a");
//		dob.sendKeys(Keys.DELETE);
		dob.clear();

	}

	@AfterMethod
	public void end() {

		// driver.quit();

	}
}
