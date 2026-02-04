package com.Practice_TKA_JBK;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day26_practice_Run {

	WebDriver driver;
	Day26_practice_Main t;

	@BeforeMethod
	public void before() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		t = new Day26_practice_Main(driver);
	}

	@Test(priority = 0, dataProvider = "validUserData")
	public void test(String firstName, String lastName, String address, String email, String phone, String country,
			String password) throws InterruptedException {

		t.firstname(firstName);
		t.lastname(lastName);
		t.address(address);
		t.email(email);
		t.phone(phone);
		t.gender_for_Male();
		t.checkbox1();
		t.checkbox2();
		t.checkbox3();
		t.language(driver, "Arabic", "Bulgarian", "Catalan");
		t.skills(3);
		t.select_country(country, driver);
		t.country(0);
		t.year(4);
		t.month(2);
		t.day(13);
		t.password(password);
		t.submit();
	}

	@DataProvider(name = "validUserData")
	public Object[][] getData() {
		return new Object[][] { { "Pradeep", "Taware", "Baramati 413131", "pradeeptaware6365@gmail.com", "8421077165",
				"India", "Pradeep@#$1234" } };
	}

	@AfterMethod
	public void after() {
		driver.quit(); // Closing the browser
	}
}
