package com.TestNG_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day20_1_Action {
	WebDriver driver;
	Actions ac;

	@BeforeMethod
	public void before() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		ac = new Actions(driver);
	}

	@Test
	public void test() {
		WebElement txtfirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		WebElement txtEmail = driver.findElement(By.xpath("//input[@type='email']"));

		txtfirstName.sendKeys("welcome Family");

		// Control All
		ac.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

		// Control c
		ac.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

		ac.sendKeys(Keys.TAB);
		// Control All
		ac.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

		ac.keyDown(txtEmail, Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	}
}
