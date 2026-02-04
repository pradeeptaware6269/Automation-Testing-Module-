package com.Practice_TKA_JBK;

import org.openqa.selenium.support.FindBy;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Day26_practice_Main {

	// First Name
	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement first_name;

	// Last Name
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement last_name;

	// Address
	@FindBy(xpath = "//textarea[@ng-model='Adress']")
	WebElement address;

	// Email
	@FindBy(xpath = "//input[@type='email']")
	WebElement email;

	// Phone
	@FindBy(xpath = "//input[@type='tel']")
	WebElement phone_no;

	// Radio Male
	@FindBy(xpath = "//input[@value='Male']")
	WebElement radio_male;

	// Radio FeMale
	@FindBy(xpath = "//input[@value='FeMale']")
	WebElement radio_female;

	// Hobby Check Box cricket
	@FindBy(xpath = "//input[@id='checkbox1']")
	WebElement checkBox1;

	// Hobby Check Box Movie
	@FindBy(xpath = "//input[@id='checkbox2']")
	WebElement checkBox2;

	// Hobby Check Box hockey
	@FindBy(xpath = "//input[@id='checkbox3']")
	WebElement checkBox3;

	// Language
	@FindBy(xpath = "//div[@id='msdd']")
	WebElement language;

	// Skills
	@FindBy(xpath = "//select[@id='Skills']")
	WebElement skills;

	// Country
	@FindBy(xpath = "//select[@id='countries']")
	WebElement country;

	// Select country
	@FindBy(xpath = "//span[@role='combobox']")
	WebElement select_country;

	// Selecting the value
	public void select_country(String value, WebDriver driver) {
		select_country.click();

		WebElement countryOption = driver.findElement(By.xpath("//li[text()='" + value + "']"));
		countryOption.click(); // Select country
	}

	// year
	@FindBy(xpath = "//select[@id='yearbox']")
	WebElement year;
	// month
	@FindBy(xpath = "//select[@placeholder='Month']")
	WebElement month;
	// Day
	@FindBy(xpath = "//select[@placeholder='Day']")
	WebElement day;

	// Selcting the year ID
	public void year(int id) {
		Select sc = new Select(year);
		sc.selectByIndex(2);
	}

	// Selecting the month ID
	public void month(int id) {
		Select sc = new Select(month);
		sc.selectByIndex(id);
	}

	// Selecting the day ID
	public void day(int id) {

		Select sc = new Select(day);
		sc.selectByIndex(2);
	}

	// Password
	@FindBy(xpath = "//input[@id='firstpassword']")
	WebElement password;

	// Confirm Password
	@FindBy(xpath = "//input[@id='secondpassword']")
	WebElement confirm_passElement;

	// Submit
	@FindBy(xpath = "//button[@id='submitbtn']")
	WebElement submit;

	// Refresh
	@FindBy(xpath = "//button[@id='Button1']")
	WebElement refresh;

	public Day26_practice_Main(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Passing the First name value
	public void firstname(String f_name) {
		first_name.sendKeys(f_name);
	}

	// Passing the Last name Value
	public void lastname(String l_name) {
		last_name.sendKeys(l_name);
	}

	// Passing the Address Value
	public void address(String add) {
		address.sendKeys(add);
	}

	// Passing the Email Values
	public void email(String email_id) {
		email.sendKeys(email_id);
	}

	// Passing the Mobile Number
	public void phone(String mobile_no) {
		phone_no.sendKeys(mobile_no);
	}

	// For Male
	public void gender_for_Male() {
		radio_male.click();
	}

	// For Female
	public void gender_for_Female() {
		radio_female.click();
	}

	// For checkbox cricket
	public void checkbox1() {
		checkBox1.click();
	}

	// For checkbox Movie
	public void checkbox2() {
		checkBox2.click();
	}

	// For checkbox Hockey
	public void checkbox3() {
		checkBox3.click();
	}

	// Selecting the contry index
	public void country(int id) {
		Select sc = new Select(country);
		sc.selectByIndex(id);
	}

	// Selecting multiple languages
	public void language(WebDriver driver, String value1, String value2, String value3) {

		language.click(); // Open language dropdown

		List<WebElement> option = driver.findElements(By.xpath("//li[@class='ng-scope']"));

		for (WebElement webEle : option) {

			String getText = webEle.getText();
			if (getText.equals(value1) || getText.equals(value2) || getText.equals(value3)) {
				webEle.click();
			}
		}
	}

	// Selecting skill by index
	public void skills(int id) {
		Select sc = new Select(skills);
		sc.selectByIndex(id);
	}

	// For Password And Confirm Password
	public void password(String pass) {
		password.sendKeys(pass);
		confirm_passElement.sendKeys(pass);
	}

	// click on submit button
	public void submit() {
		submit.click();
	}

	// click on refresh button
	public void refresh() {
		refresh.click();
	}

}
