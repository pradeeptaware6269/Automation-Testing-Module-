package com.TestNG_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day15_2_getPageSource {
	@Test
	void register() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");

		String pagesource = driver.getPageSource();
		System.out.println(pagesource);

		Assert.assertTrue(pagesource.contains("Register"));
		driver.quit();
	}

}
