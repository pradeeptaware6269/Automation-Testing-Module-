package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Navigation1{   

    ChromeDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com");
    }

    @Test
    public void test() throws InterruptedException  {

        Navigation nv = driver.navigate();   // ✅ no casting

        // Navigate to another site
        nv.to("https://www.google.com");
        Thread.sleep(2000);

        // Back to Flipkart
        nv.back();
        Thread.sleep(2000);

        // Forward again
        nv.forward();
        Thread.sleep(2000);

        // Refresh page
        nv.refresh();
    }

    @AfterMethod
    public void end() {
        driver.quit();   // ✅ important
    }
}