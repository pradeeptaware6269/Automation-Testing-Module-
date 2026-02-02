package com.TestNG_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day20_2_Keyboard_Practice {

	WebDriver driver;
	Actions ac;

	@BeforeClass
	public void before() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		ac = new Actions(driver);
	}

	@Test(priority = 0)
	public void test() {

		WebElement txtSkill = driver.findElement(By.id("Skills"));

		ac.scrollToElement(txtSkill).perform();
		ac.click(txtSkill).perform();
		ac.sendKeys(Keys.TAB).perform();
	}

	@Test(priority = 1)
	public void test1() {

		WebElement txtFirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		txtFirstName.sendKeys("Pradeep");
		ac.click(txtFirstName).sendKeys(Keys.BACK_SPACE).perform();

		WebElement txtLastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtLastName.sendKeys("Taware");
		ac.click(txtLastName).sendKeys(Keys.BACK_SPACE).perform();

		WebElement refreshBtn = driver.findElement(By.id("Button1"));
		ac.click(refreshBtn).sendKeys(Keys.ENTER).perform();

		WebElement submitBtn = driver.findElement(By.id("submitbtn"));
		ac.click(submitBtn).sendKeys(Keys.ENTER).perform();

		String actualResult = driver.getCurrentUrl();
		String expectedResult = "https://demo.automationtesting.in/Register.html";

		Assert.assertEquals(actualResult, expectedResult, "Actual Result and Expected Result are mismatched");
	}

	@Test(priority = 2)
	public void test2() {

		WebElement radioBtn = driver.findElement(By.xpath("//input[@type='radio' and @value='Male']"));
		ac.doubleClick(radioBtn).perform();

		WebElement check1 = driver.findElement(By.id("checkbox1"));
		WebElement check2 = driver.findElement(By.id("checkbox2"));
		WebElement check3 = driver.findElement(By.id("checkbox3"));

		ac.click(check1).click(check2).click(check3).perform();
	}

	@AfterClass
	public void after() {
		driver.quit();
	}
}
