package com.practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Window {

    ChromeDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // ✅ Handle Login Popup
        try {
            WebElement closeBtn = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='✕']"))
            );
            closeBtn.click();
        } catch (Exception e) {
            System.out.println("Popup not displayed");
        }
    }

    @Test
    public void testcase() {

        String parentID = driver.getWindowHandle();

        // Click Myntra link
        WebElement myntra = wait.until(
            ExpectedConditions.elementToBeClickable(By.linkText("Myntra"))
        );
        myntra.click();

        // Get all window IDs
        Set<String> allWindows = driver.getWindowHandles();

        // Switch to child window
        for (String id : allWindows) {
            if (!id.equals(parentID)) {
                driver.switchTo().window(id);
                break;
            }
        }

        // Validate Myntra page
        String actualURL = driver.getCurrentUrl();
        System.out.println("Child URL: " + actualURL);

        Assert.assertTrue(actualURL.contains("myntra"),
                "Myntra page not opened");

        // Optional: perform action
        WebElement searchBox = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.className("desktop-searchBar"))
        );
        searchBox.sendKeys("Shoes");

        // Switch back to parent window
        driver.switchTo().window(parentID);

        Assert.assertTrue(driver.getCurrentUrl().contains("flipkart"));
    }

    @AfterMethod
    public void end() {
        driver.quit();
    }
}