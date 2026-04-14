package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Actions_1 {

	ChromeDriver driver;
	Actions ac;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		ac = new Actions(driver);

	}

	@Test
	public void testcase() {

		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		firstname.sendKeys("Copy");

		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));

		ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		ac.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		ac.keyDown(lastname, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

	}

	@AfterMethod
	public void end() {

	}

}
