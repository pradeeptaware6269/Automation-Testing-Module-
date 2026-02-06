package com.iRetryAnalyser_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase {

	WebDriver driver;
	Main ms;

	@BeforeMethod
	public void before() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
//		driver.manage().window().maximize();
		ms = new Main(driver);
	}

	@Test(dataProvider = "newData")
	public void testLogin(String user_name, String password, String istrue) {

		ms.username(user_name);
		ms.password(password);
		ms.submit();

		if (istrue.equals("1")) {
			Assert.assertEquals(ms.getSuccessMessage(), "Logged In Successfully");

		} else if (istrue.equals("2")) {
			Assert.assertEquals(ms.getErrorMessage(), "Logged In Successfully");

		} else if (istrue.equals("3")) {
			Assert.assertEquals(ms.getErrorMessage(), "Your password is invalid!");

		} else if (istrue.equals("4")) {
			Assert.assertEquals(ms.getErrorMessage(), "Logged In Successfully");
		}
	}

	@DataProvider(name = "newData")
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
