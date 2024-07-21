package Locators;

import org.openqa.selenium.By;

import BasePack.BaseClass;

public class AddressInformation extends BaseClass {

	public By FirstName = By.xpath("//input[@name=\"first_name\"]");

	public By LastName = By.xpath("//input[@name=\"last_name\"]");

	public By company = By.xpath("//input[@name=\"company\"]");

	public By CompanyAddress = By.xpath("//input[@id=\"address1\"]");

	public By CompanyAddress2 = By.xpath("//input[@id=\"address2\"]");

	public By State = By.xpath("//input[@id=\"state\"]");

	public By City = By.xpath("//input[@id=\"city\"]");

	public By ZipCode = By.xpath("//input[@id=\"zipcode\"]");

	public By MobileNumber = By.xpath("//input[@id=\"mobile_number\"]");

	public By ClickCreateAcc = By.xpath("//button[text()='Create Account']");

	public void FirstName() {

		driver.findElement(FirstName).sendKeys("Dharaka");

	}

	public void LastName() {

		driver.findElement(LastName).sendKeys("Sundar");

	}

	public void company() {

		driver.findElement(company).sendKeys("Infosys");

	}

	public void CompanyAddress() {

		driver.findElement(CompanyAddress).sendKeys("XXXXXXX ");
	}

	public void CompanyAddress2() {

		driver.findElement(CompanyAddress2).sendKeys("IT park XXXXXX Technology ");
	}

	public void State() {

		driver.findElement(State).sendKeys("Tamil Nadu");
	}

	public void City() {

		driver.findElement(City).sendKeys("Chennai");
	}

	public void ZipCode() {

		driver.findElement(ZipCode).sendKeys("609683");
	}

	public void MobileNumber() {

		driver.findElement(MobileNumber).sendKeys("837363863");
	}

	public void ClickCreateAcc() {
		driver.findElement(ClickCreateAcc).click();
	}

}
