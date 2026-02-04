package com.TestNG_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(com.TestNG_Selenium.Day27_Listner.class)
public class Day27_Listner_main {

    WebDriver driver;

    @BeforeMethod
    public void before() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @Test
    public void test1() {
        Assert.assertEquals(2, 4);
    }

    @Test
    public void test2() {
        Assert.assertEquals(2, 2);
    }

    @Test
    public void test3() {
        Assert.assertEquals(2, 4);
    }

    @Test
    public void test4() {
        Assert.assertEquals(4, 4);
    }

    @Test
    public void test5() {
        Assert.assertEquals(5, 4);
    }

    @AfterMethod
    public void after() {
       
            driver.quit();
    }
}
