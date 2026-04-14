package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetAttribute {
	ChromeDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

	}

	@Test(enabled = true, priority = 0)
	public void testCase() {

		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));

		String value = firstName.getAttribute("placeholder"); // or "value"
		String value1 = firstName.getDomAttribute("placeholder");
		System.out.println(value);
		System.out.println(value1);
	}

	@AfterMethod
	public void end() {

		// driver.quit();

	}
}
