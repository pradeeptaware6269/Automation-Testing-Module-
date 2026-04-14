package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwitchTo {

	ChromeDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
	}

	@Test
    public void test() {
    	
    	// usinf the name or ID 
        //driver.switchTo().frame("singleframe");
        
        
        // 
        WebElement new1=driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a"));
        driver.switchTo().frame(new1);
        WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));

        Assert.assertTrue(ele.isDisplayed(), "Element not displayed");
        ele.sendKeys("Pradeep Taware");
    }

	@AfterMethod
	public void end() {
		driver.quit();
	}
}