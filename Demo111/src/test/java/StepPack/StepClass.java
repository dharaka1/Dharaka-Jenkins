package StepPack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import BasePack.BaseClass;
import Locators.AddressInformation;
import Locators.FillupDetails;
import Locators.Signin;
import Locators.Signup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepClass extends BaseClass {
	Signup pg = new Signup();
	FillupDetails pd = new FillupDetails();
	AddressInformation as = new AddressInformation();
	Signin sg = new Signin();

	@Given("User Launch {string}")
	public void user_launch(String string) {

		driver = new ChromeDriver();
	}

	@When("Navigate to url")
	public void navigate_to_url() {

		Url("https://automationexercise.com/");
	}

	@When("user2 Click on {string} button")
	public void user2_click_on_button(String Signup) {
		//pg.clickLogin();
		//pg.Name();
		//pg.Email();
		//pg.SignUp();

	}

	@When("user3 Verify {string} is visible")
	public void user3_verify_is_visible(String FillUpDetails) {

		//pd.pass();

		//WebElement Day = driver.findElement(pd.Day);
		//Select s = new Select(Day);
		//s.selectByValue("30");

		//WebElement month = driver.findElement(pd.Month);
		//Select s1 = new Select(month);
		//s1.selectByIndex(5);

		//WebElement year = driver.findElement(pd.Year);
		//Select s2 = new Select(year);
		//s2.selectByValue("1999");

		//pd.ClickCheckBox();

	}

	@When("user4 Enter {string} button")
	public void user4_click_button(String EnterTheAddressInformation) {

		//as.FirstName();
		//as.LastName();
		//as.company();
		//as.CompanyAddress();
		//as.CompanyAddress2();
		//as.State();
		//as.City();
		//as.ZipCode();
		//as.MobileNumber();

	}

	@When("user5 Verify that {string} is visible")
	public void user5_verify_that_is_visible(String string) {

	//	as.ClickCreateAcc();
	}

	@When("user10  Click {string}")
	public void user10_click(String string) {
		sg.Singin();
	}

	@When("user11 Verify that {string} is visible")
	public void user11_verify_that_is_visible(String string) {
		sg.Username();
	}

	@When("user  Click {string} button")
	public void user_click_button(String string) {
		sg.password();
	}

	@Then("user  Verify that {string} is visible")
	public void user_verify_that_is_visible(String string) {

		sg.LoginIn();
	}

}
