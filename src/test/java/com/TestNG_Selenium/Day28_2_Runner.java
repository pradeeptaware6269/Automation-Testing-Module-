package com.TestNG_Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day28_2_Runner {

	WebDriver driver;
	Day28_1_Main mn;

	@BeforeMethod
	public void before() {
		System.out.println("Before Method Annonation");
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		// driver.manage().window().maximize();
		mn = new Day28_1_Main(driver);

	}

	@Test(priority = 0, enabled = true)
	public void test(String name, String pass, String istrue) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].value=arguments[1];", mn.username, name);
		js.executeScript("arguments[0].value=arguments[1];", mn.password, pass);

		js.executeScript("arguments[0].click();", mn.submit);
		js.executeScript("window.scrollBy(0,900)");

		if (istrue.equals("1")) {
			Assert.assertTrue(true);
		} else if (istrue.equals("2")) {
			Assert.assertTrue(false);
		} else if (istrue.equals("3")) {
			Assert.assertTrue(false);
		} else {
			System.out.println("Invalide Case Data ");
		}
	}

	@DataProvider(name = "cx")
	public String[][] provide() {
		String[][] data = new String[3][3];
		// Valide Data
		data[0][0] = "student";
		data[0][1] = "Password123";
		data[0][2] = "1";

		// Invalide Data
		data[1][0] = "student";
		data[1][1] = "Password123";
		data[1][2] = "2";

		// Empty data
		data[2][0] = "";
		data[2][1] = "";
		data[2][2] = "3";

		return null;
	}

	@AfterMethod
	public void after() {
		driver.quit();
		System.out.println("After Method Annotation");
	}

}
