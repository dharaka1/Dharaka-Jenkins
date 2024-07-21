package Locators;

import org.openqa.selenium.By;

import BasePack.BaseClass;

public class Signup extends BaseClass {

	public By Singup = By.xpath("//a[text()=' Signup / Login']");

	public By Name = By.xpath("//input[@name=\"name\"]");
	
	public By Email=By.xpath("(//input[@placeholder=\"Email Address\"])[2]");
	
    public By SignUp2=By.xpath("//button[text()='Signup']");
    

	public void clickLogin() {

		driver.findElement(Singup).click();

	}

	public void Name() {
		
		driver.findElement(Name).sendKeys("Dharaka");
	}

	public void Email() {
		
                   driver.findElement(Email).sendKeys("Dharakasundar1@gmail.com");		
	}

	public void SignUp() {

		driver.findElement(SignUp2).click();
	}
	

}
