package com.TestNG_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day21_2_Task2 {
	WebDriver driver;

	@BeforeClass
	public void start() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

	}

	@Test(priority = 0, enabled = true)
	public void test() {

		WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));

		Select sc = new Select(year);
		// Using the ID
		// sc.selectByIndex(2);
		// Using The Name
		// sc.selectByValue("2003");

		// Using the Visible Text
		sc.selectByVisibleText("2003");
	}

	@Test(priority = 0, enabled = true)
	public void test1() {

		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));

		Select sc = new Select(month);

		// By Using the index
//		sc.selectByIndex(2);

		// By using the Value
		sc.selectByValue("October");

		// By using the visible Text
		// sc.deselectByVisibleText("October");

	}

	@Test(priority = 0, enabled = true)
	public void test2() {

		WebElement day = driver.findElement(By.xpath("//select[@placeholder='Day']"));

		Select sc = new Select(day);
		// By Using the index
//		sc.selectByIndex(2);

		// By using the Value
		sc.selectByValue("13");

		// By using the visible Text
		// sc.deselectByVisibleText("13");
	}

	@AfterClass
	public void end() {

	}

}
