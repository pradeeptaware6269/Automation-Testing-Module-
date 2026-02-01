package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Runner1 {

	WebDriver driver;
	Test1 t;

	@BeforeMethod
	public void before() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		t = new Test1(driver);
	}
//This is the valide Test Case 
	@Test(priority = 0, enabled = true)
	public void test() throws InterruptedException {
		t.firstname("Pradeep");
		t.time();

		t.lastname("Taware");
		t.time();

		t.address("Baramati 413131");
		t.time();

		t.email("pradeeptaware6365@gmail.com");
		t.time();

		t.phone("8421077165");
		t.time();

		t.gender_for_Male();
		t.time();

		t.checkbox1();
		t.checkbox2();
		t.checkbox3();
		t.time();

		t.language(driver, "Arabic", "Bulgarian", "Catalan");
		t.time();

		t.skills(3);
		t.time();

		t.select_country("India", driver);
		t.time();

		t.country(0);
		t.time();

		t.year(4);
		t.month(2);
		t.day(13);
		t.time();

		t.password("Pradeep@#$1234");
		t.time();

		t.submit();
		t.time();

		Assert.assertEquals(driver.getCurrentUrl(), "https://demo.automationtesting.in/Index.html?utm_source=chatgpt.com",
				" Test Case Failed Because Of Actual URL And Expected URL Mismatched");

	}

	//This is the Invalide Test Case 
		@Test(priority = 0, enabled = false)
		public void test1() throws InterruptedException {
			t.firstname("Pradeep");
			t.time();

			t.lastname("Taware");
			t.time();

			t.address("Baramati 413131");
			t.time();

			t.email("pradeeptaware6365.com");
			t.time();

			t.phone("8421@#$165");
			t.time();

			t.gender_for_Male();
			t.time();

			t.checkbox1();
			t.checkbox2();
			t.checkbox3();
			t.time();

			t.language(driver, "Arabic", "Bulgarian", "Catalan");
			t.time();

			t.skills(3);
			t.time();

			t.select_country("India", driver);
			t.time();

			t.country(0);
			t.time();

			t.year(4);
			t.month(2);
			t.day(13);
			t.time();

			t.password("Pradeep@#$1234");
			t.time();

			t.submit();
			t.time();

			Assert.assertEquals(driver.getCurrentUrl(), "Project.Runner1.test",
					" Test Case Failed Because Of Actual And Expected Mismatched");

		}

	@AfterMethod
	public void after() {
		// driver.quit(); // Closing the browser
	}
}
