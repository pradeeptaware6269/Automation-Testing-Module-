package com.TestNG_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day15_0_isEnable {
	@Test
	void register() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
// for the First Name
		WebElement first_name = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		boolean isenable = first_name.isEnabled();
		first_name.clear();
		if (isenable) {
			first_name.sendKeys("Pradeep");
		} else {
			System.out.println("There is an Problem Please Check on the developer side");
		}
// For the Last Name
		WebElement Last_name = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		boolean isenable1 = Last_name.isEnabled();
		Last_name.clear();
		if (isenable1) {
			Last_name.sendKeys("Taware");
		} else {
			System.out.println("There is an Problem Please Check on the developer side");
		}

// For the Address

		WebElement address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		boolean isenable2 = address.isEnabled();
		address.clear();
		if (isenable2) {
			address.sendKeys("Barmati 413115");
		} else {
			System.out.println("There is an Problem Please Check on the developer side");
		}
//For the Email
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		boolean isenable3 = address.isEnabled();
		email.clear();
		if (isenable3) {
			address.sendKeys("pradeeptaware@gmail.com");
		} else {
			System.out.println("There is an Problem Please Check on the developer side");
		}
		driver.quit();
	}

}
