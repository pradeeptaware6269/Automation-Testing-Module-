package com.TestNG_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day15_3_Practice {
	@Test
	void login() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
//username
		WebElement username = driver.findElement(By.id("email"));
		boolean isenable = username.isEnabled();
		if (isenable) {
			username.sendKeys("Pradeep@##43443");
		} else {
			System.out.println("There is an problem you raise the bug");
		}
//password
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		boolean isenable1 = password.isEnabled();
		if (isenable1) {
			password.sendKeys("Pass#4553");
		} else {
			System.out.println("There is an problem you raise the bug");
		}
// Button
		WebElement button = driver.findElement(By.name("login"));
		button.click();
// Actual Error
		WebElement msg = driver.findElement(By.cssSelector("#loginform > div:nth-child(13) > div._9ay7"));
		String masssge = msg.getTagName();
		System.out.println(masssge);

		driver.quit();

	}

}
