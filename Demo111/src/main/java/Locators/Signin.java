package Locators;

import org.openqa.selenium.By;

import BasePack.BaseClass;

public class Signin extends BaseClass {

	public By Singin = By.xpath("//a[text()=' Signup / Login']");

	public By Username = By.xpath("(//input[@placeholder=\"Email Address\"])");

	public By password = By.xpath("	//input[@placeholder=\"Password\"]");

	public By LoginIn = By.xpath("//button[text()='Login']");

	public void Singin() {

		driver.findElement(Singin).click();
	}

	public void Username() {

		driver.findElement(Username).sendKeys("Dharakasundar1@gmail.com");
	}

	public void password() {

		driver.findElement(password).sendKeys("Sundar@123");
	}

	public void LoginIn() {
		driver.findElement(LoginIn).click();
	}

}
