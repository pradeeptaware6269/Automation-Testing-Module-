package com.POM.Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.POM.Main.Main_class_1;

public class Runner_1 {
	WebDriver driver;

	Main_class_1 ms;

	@BeforeMethod
	public void before() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		ms = new Main_class_1(driver);
	}

// Passing the valide data
	@Test(priority = 0, enabled = true)
	public void test1() {
		ms.username("pradeep");
		ms.password("pass@123");
		ms.submit();

		String actual_result = driver.getCurrentUrl();
		String expected_result = "https://practicetestautomation.com/logged-in-successfully/";

		Assert.assertEquals(actual_result, expected_result,
				"-------- Actual result And Expected Both are the Mismatched-----");
	}

//Passing the Invalide data
	@Test(priority = 1, enabled = false)
	public void test() {
		ms.username("student");
		ms.password("Password123");
		ms.submit();

		WebElement error = driver.findElement(By.id("error"));
		String actual_result = error.getText();
		String expected_result = "Your username is invalid!";

		Assert.assertEquals(actual_result, expected_result,
				"-------- Actual result And Expected Both are the Mismatched-----");
	}

// Passing the Invalide Username
	@Test(priority = 2, enabled = false)
	public void test2() {
		ms.username("pradeep");
		ms.password("Password123");
		ms.submit();

		WebElement error = driver.findElement(By.id("error"));
		String actual_result = error.getText();
		String expected_result = "Your username is invalid!";

		Assert.assertEquals(actual_result, expected_result,
				"-------- Actual result And Expected Both are the Mismatched-----");

	}

// Passing the Invalide Password
	@Test(priority = 3, enabled = false)
	public void test3() {
		ms.username("student");
		ms.password("Pass123");
		ms.submit();

		WebElement error = driver.findElement(By.id("error"));
		String actual_result = error.getText();
		String expected_result = "Your username is invalid!";

		Assert.assertEquals(actual_result, expected_result,
				"-------- Actual result And Expected Both are the Mismatched -----");

	}

// Passing the Empty Username
	@Test(priority = 4, enabled = false)
	public void test4() {
		ms.username("");
		ms.password("Password123");
		ms.submit();

		WebElement error = driver.findElement(By.id("error"));
		String actual_result = error.getText();
		String expected_result = "Your username is invalid!";

		Assert.assertEquals(actual_result, expected_result,
				"-------- Actual result And Expected Both are the Mismatched -----");

	}

// Passing the Empty password
	@Test(priority = 5, enabled = false)
	public void test5() {

		ms.username("student");
		ms.password("");
		ms.submit();

		WebElement error = driver.findElement(By.xpath("//div[@id='error']"));
		String actual_result = error.getText();
		String expected_result = "Your password is invalid!";

		Assert.assertEquals(actual_result, expected_result,
				"-------- Actual result And Expected Both are the Mismatched -----");

	}

}
