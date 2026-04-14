package com.tka.jbk.crm_1.Selenium_Script;

import org.openqa.selenium.WebDriver;   
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;  // ✅ For headless
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day12_new_HeadLess_Browser {

    WebDriver driver;

    @BeforeMethod
    void before() {

       
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
       
        driver = new ChromeDriver(options); 
        driver.get("https://omayo.blogspot.com/");
    }

    @Test
    public void testCase() {

        String title = driver.getTitle();
        System.out.println(title);

    }

    @AfterMethod
    public void end() {
        driver.quit();
    }
}