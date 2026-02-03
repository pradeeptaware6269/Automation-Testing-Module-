package com.TestNG_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day26_runner {

	WebDriver driver;
	Day26_DataProvider_Main ms;

	@BeforeMethod
	public void before() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		ms = new Day26_DataProvider_Main(driver);
	}

	@Test(dataProvider = "bg")
	public void testLogin(String user_name, String password, String istrue) {

		ms.username(user_name);
		ms.password(password);
		ms.submit();

		// validation logic
		if (istrue.equals("1")) {
			Assert.assertEquals(ms.getSuccessMessage(), "Logged In Successfully", "Login success message mismatch");

		} else if (istrue.equals("2")) {
			Assert.assertTrue(ms.getErrorMessage().contains("Your username is invalid"),
					"Invalid username error not shown");

		} else if (istrue.equals("3")) {
			Assert.assertTrue(ms.getErrorMessage().contains("Your password is invalid"),
					"Invalid password error not shown");

		} else if (istrue.equals("4")) {
			Assert.assertTrue(ms.getErrorMessage().contains("invalid"), "Empty field validation not shown");
		}
	}

	@DataProvider(name = "bg")
	public String[][] validate() {
		String data[][] = new String[4][3];
		// set 1
		data[0][0] = "student";
		data[0][1] = "Password123";
		data[0][2] = "1";

		// set 2
		data[1][0] = "student123";
		data[1][1] = "Password123";
		data[1][2] = "2";

		// set 3
		data[2][0] = "student";
		data[2][1] = "Password";
		data[2][2] = "3";

		// set 4
		data[3][0] = "";
		data[3][1] = "";
		data[3][2] = "4";

		return data;
	}

	@AfterMethod
	public void after() {
		driver.quit();
	}
}
