package com.TestNG_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day20_0_Action_mouse {
	WebDriver driver;
	Actions ac;

	@BeforeMethod
	public void before() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		ac = new Actions(driver); // ✅ Correct place
	}

	@Test(priority = 0)
	public void test() {

		// Right click
		WebElement element = driver.findElement(By.linkText("Register"));
		ac.contextClick(element).perform();
	}

	@Test(priority = 1, enabled = true)
	public void test1() {

		// Drag and Drop
		WebElement source_element = driver.findElement(By.id("imagetrgt"));
		WebElement target_element = driver.findElement(By.xpath("//*[@id='basicBootstrapForm']//textarea"));

		ac.dragAndDrop(source_element, target_element).perform();
	}

	@Test(enabled = true, priority = 2)
	public void test2() {// double click
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/h1"));
		ac.doubleClick(element1);

		// ac.scrollByAmount(0, 500);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"footer\"]/div/div/div[2]/a[5]"));
		ac.scrollToElement(element);
	}

	@AfterMethod
	public void after() {
		driver.quit();
	}
}
