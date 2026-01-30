package com.POM.Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.POM.Main.Main_class_2;

public class Runner_2 {

	Main_class_2 ms;
	WebDriver driver;

	@BeforeMethod
	public void before() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		ms = new Main_class_2(driver);
	}

	@Test
	public void test() {
		ms.enterFirstName("pradeep");
		ms.enterLastName("taware");
		ms.enteradd("Baramati");
		ms.enterEmail("pradeeptaware452@gamil.com");
		ms.enterPassword("Pass@123");
		ms.enterPhone("8455454544");
		ms.selectMale();
		ms.hobby();
	}

	@Test
	public void test1() {
		ms.enterFirstName("Ram");
		ms.enterLastName("Pawar");
		ms.enteradd("Baramati");
		ms.enterEmail("Ram452@gamil.com");
		ms.enterPassword("Pass@123");
		ms.enterPhone("8465454544");
		ms.selectMale();
		ms.hobby();
	}

}
