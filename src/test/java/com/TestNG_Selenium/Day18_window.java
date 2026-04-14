package com.TestNG_Selenium;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day18_window {

	WebDriver driver;

	@BeforeMethod
	public void precise() {
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		// Close login popup
		try {
			driver.findElement(By.xpath("//button[text()='✕']")).click();
		} catch (Exception e) {
			// Ignore if not present
		}
	}

	@Test
	public void window_test() throws InterruptedException {

		String parentWindow = driver.getWindowHandle();

		// Click Myntra link
		driver.findElement(By.linkText("Myntra")).click();

		// Get all windows
		Set<String> windowHandles = driver.getWindowHandles();

		// Switch to child window
		for (String window : windowHandles) {
			if (!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				break;
			}
		}

		// Validate Myntra page title
		String actualTitle = driver.getTitle();
		System.out.println("Child Window Title: " + actualTitle);

		Assert.assertTrue(actualTitle.contains("Myntra"));

		// Perform action in child window
		WebElement searchBox = driver.findElement(By.className("desktop-searchBar"));
		searchBox.sendKeys("Shoes for men");

		// Switch back to parent window
		driver.switchTo().window(parentWindow);

		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.flipkart.com/");
	}

	@AfterMethod
	public void end() {
		driver.quit();
	}
}