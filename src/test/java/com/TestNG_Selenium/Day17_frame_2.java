package com.TestNG_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day17_frame_2 {
	WebDriver driver;

	@BeforeMethod
	void before() {

		driver = new ChromeDriver();
		driver.navigate().to("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();

	}

	@Test
	void test() {
		driver.switchTo().frame(driver.findElement(By.id("singleframe")));
		WebElement input = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		input.sendKeys("welcome");

		if (input.isEnabled()) {
			Assert.assertTrue(true);
			System.out.println("Element is Inserted you can easily send the value ");
		} else {
			Assert.assertTrue(false);
			System.out.println("Element is Not Inserted ,you can not send the value ");
		}
		// driver.switchTo().parentFrame();// here we can used the parent Frame
		driver.switchTo().defaultContent();// Here we can used the defaultContent
		WebElement wb = driver.findElement(By.linkText("WebTable"));
		boolean enable = wb.isEnabled();
		Assert.assertTrue(enable);
	}

	@AfterMethod
	void end() {
		driver.quit();
	}

}
