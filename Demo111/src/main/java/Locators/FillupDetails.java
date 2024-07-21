package Locators;

import org.openqa.selenium.By;

import BasePack.BaseClass;

public class FillupDetails extends BaseClass {

	public By pass = By.xpath("//input[@name=\"password\"]");

	public By Day = By.xpath("//select[@id=\"days\"]");

	public By Month = By.xpath("//select[@id=\"months\"]");

	public By Year = By.xpath("//select[@id=\"years\"]");

	public By ClickCheckBox = By.xpath("//input[@id=\"newsletter\"]");

	public void pass() {
		
		driver.findElement(pass).sendKeys("Sundar@123");
	}

	public void ClickCheckBox() {
		
		driver.findElement(ClickCheckBox).click();
	}

}
