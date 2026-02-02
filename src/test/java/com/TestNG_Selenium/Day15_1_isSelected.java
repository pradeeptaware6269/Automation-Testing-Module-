package com.TestNG_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day15_1_isSelected {
	@Test
	void register() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");

		// Redio Button

//For Male
		WebElement redio_male = driver.findElement(By.xpath("//input[@value='Male']"));
		boolean isselect = redio_male.isSelected();
		if (isselect) {
			System.out.println("This Is Already Selected , you can not again Select it ");
		} else {
			redio_male.click();
		}

// For FeMale
		WebElement redio_female = driver.findElement(By.xpath("//input[@value='FeMale']"));
		boolean isselect1 = redio_male.isSelected();
		if (isselect1) {
			System.out.println("This Is Already Selected , you can not again Select it ");
		} else {
			redio_female.click();
		}

		// Check Box

// Check Box Cricket

		WebElement check_Box = driver.findElement(By.xpath("//input[@value='Cricket']"));
		boolean isselect2 = check_Box.isSelected();
		if (isselect2) {
			System.out.println("This Is Already Selected , you can not again Select it ");
		} else {
			check_Box.click();
		}

// Check Box Movie

		WebElement check_Box1 = driver.findElement(By.xpath("//input[@value='Movies']"));
		boolean isselect3 = check_Box1.isSelected();
		if (isselect3) {
			System.out.println("This Is Already Selected , you can not again Select it ");
		} else {
			check_Box.click();
		}

// Check Box Hockey

		WebElement check_Box3 = driver.findElement(By.xpath("//input[@value='C']"));
		boolean isselect4 = check_Box3.isSelected();
		if (isselect4) {
			System.out.println("This Is Already Selected , you can not again Select it ");
		} else {
			check_Box3.click();
		}
		driver.quit();
	}
}
