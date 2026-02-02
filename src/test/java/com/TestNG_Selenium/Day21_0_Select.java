package com.TestNG_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day21_0_Select {
	WebDriver driver;
	Actions ac;

	@BeforeClass
	public void strat() {

		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		ac = new Actions(driver);
	}

//for a singal value select
	@Test(enabled = false)
	public void test() {

		WebElement ele = driver.findElement(By.xpath("//select[@type='text']"));
		ac.scrollToElement(ele);
		Select sc = new Select(ele);

		sc.selectByIndex(1);

	}

//for a singal value select
	@Test(enabled = false)
	public void test1() {

		WebElement ele = driver.findElement(By.xpath("//select[@type='text']"));
		ac.scrollToElement(ele);
		Select sc = new Select(ele);

		sc.selectByValue("Adobe InDesign");

	}

// for a singal value select
	@Test(priority = 0, enabled = true)
	public void test2() {

		WebElement ele = driver.findElement(By.xpath("//select[@type='text']"));
		ac.scrollToElement(ele);
		Select sc = new Select(ele);

		sc.selectByVisibleText("Android");

	}

//for a Multiple value select
	@Test(priority = 1, enabled = true)
	public void test3() {
		WebElement lanuage = driver.findElement(By.id("msdd"));
		lanuage.click();

		List<WebElement> option = driver.findElements(By.xpath("//li[@class='ng-scope']"));

		for (WebElement webEle : option) {
			System.out.println(webEle.getText());

			String getText = webEle.getText();
			if (getText == "Hindi" || getText == "Croatian" || getText == " Czech" || getText == "Danish"
					|| getText == "Dutc") {
				webEle.click();
			}

		}
	}

	@AfterClass
	public void end() {
		//driver.quit();
	}

}
