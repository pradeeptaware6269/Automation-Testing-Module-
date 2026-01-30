package com.POM.Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main_class_2 {

	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement lastName;

	@FindBy(xpath = "//textarea[contains(@class,'form-control')]")
	private WebElement address;

	@FindBy(xpath = "//input[@ng-model='EmailAdress']")
	private WebElement email;

	@FindBy(xpath = "//input[@ng-model='Phone']")
	private WebElement phone;

	@FindBy(xpath = "//input[@value='Male']")
	private WebElement maleRadio;

	@FindBy(xpath = "//input[@value='FeMale']")
	private WebElement femaleRadio;

	@FindBy(id = "checkbox1")
	private WebElement hobby1;

	@FindBy(id = "checkbox2")
	private WebElement hobby2;

	@FindBy(id = "checkbox3")
	private WebElement hobby3;

	@FindBy(id = "firstpassword")
	private WebElement password;

	@FindBy(id = "secondpassword")
	private WebElement confirmPassword;

	// Constructor
	public Main_class_2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Actions / Methods
	public void enterFirstName(String name) {
		firstName.sendKeys(name);
	}

	public void enterLastName(String name) {
		lastName.sendKeys(name);
	}

	public void enteradd(String add) {
		address.sendKeys(add);
	}

	public void enterEmail(String mail) {
		email.sendKeys(mail);
	}

	public void enterPhone(String number) {
		phone.sendKeys(number);
	}

	public void selectMale() {
		maleRadio.click();
	}

	public void enterPassword(String pass) {
		password.sendKeys(pass);
		confirmPassword.sendKeys(pass);
	}

	public void hobby() {
		hobby1.click();
		hobby2.click();
		hobby3.click();
	}
}
