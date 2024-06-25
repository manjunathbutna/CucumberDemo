package stepdefinitions;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPagesteps {
	
	//DriverFactory driverfactory;
	LoginPage lp = new LoginPage(DriverFactory.getDriver());
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("https://www.saucedemo.com/v1/index.html");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
	    String title = lp.pageTitle();
	    System.out.println("Login page title is "+title);
	}

	@Then("title of the page should be {string}")
	public void title_of_the_page_should_be(String expectedTitle) {
	    System.out.println(expectedTitle);
	    Assert.assertEquals(expectedTitle, lp.pageTitle());
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
	    lp.enterUserName(username);
	}

	@When("user enters the password {string}")
	public void user_enters_the_password(String password) {
	    lp.enterpassword(password);
	}

	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
	    lp.clickOnLoginbtn();
	}

	@Then("user lands on inventory page")
	public void user_lands_on_inventory_page() {
	   System.out.println(lp.landingPageURL());
	}

	@Then("url of the page should be {string}")
	public void url_of_the_page_should_be(String expextedURL) {
		Assert.assertEquals(expextedURL, lp.landingPageURL());
	}

}
