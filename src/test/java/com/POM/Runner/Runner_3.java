package com.POM.Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.POM.Main.Main_class_3;

public class Runner_3 {
	WebDriver driver;

	Main_class_3 ms;

	@BeforeMethod
	public void before() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		ms = new Main_class_3(driver);
	}

// Passing the valide data
	@Test(priority = 0, enabled = true)
	public void test1() {
		ms.username("pradeep");
		ms.password("pass@123");
		ms.submit();

		Assert.assertEquals(ms.actual_result(), "https://practicetestautomation.com/logged-in-successfully/");
	}

//Passing the Invalide data
	@Test(priority = 1, enabled = false)
	public void test() {
		ms.username("student");
		ms.password("Password123");
		ms.submit();

		Assert.assertEquals(ms.actual_result1(), "Your username is invalid!");
	}

// Passing the Invalide Username
	@Test(priority = 2, enabled = false)
	public void test2() {
		ms.username("pradeep");
		ms.password("Password123");
		ms.submit();

		Assert.assertEquals(ms.actual_result1(), "Your username is invalid!");
	}
}
