package com.TestNG_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Objects;

public class Day16_0_TestValidation {

	WebDriver driver;
	WebElement text;
	WebElement text1;
	String userError;
	String passError;

	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.get("https://javabykiran.in/other/CC/login");
	}

	@AfterClass
	void close() {
		driver.quit();
	}

	@Test(priority = 1)
	void field() {
		WebElement username = driver.findElement(By.name("username"));
		boolean isEnable = username.isEnabled();

		WebElement password = driver.findElement(By.name("password"));
		boolean isEnable1 = password.isEnabled();

		if (isEnable && isEnable1) {
			WebElement remember = driver.findElement(By.xpath("//input[@name='remember']"));
			remember.click();

			WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
			button.click();
		}

		Assert.assertTrue(isEnable1);
		Assert.assertTrue(isEnable);
	}

	@Test(priority = 2, dependsOnMethods = "field")
	void display() {
		text = driver.findElement(By.xpath("//small[@class='error']"));
		userError = text.getText();
		System.out.println("Username Error: " + userError);

		text1 = driver.findElement(By.xpath("//small[@id='login-password-error']"));
		passError = text1.getText();
		System.out.println("Password Error: " + passError);

		Assert.assertEquals(userError, "Please enter a valid email address.");
		Assert.assertEquals(passError, "Please enter a password.");
	}

	@Test(priority = 3, dependsOnMethods = "display")
	void checkText() {
		boolean check = Objects.equals(userError, passError);

		if (!check) {
			System.out.println("Both errors are not the same");
		}

		Assert.assertTrue(check, "Username and Password are different");
	}
}
