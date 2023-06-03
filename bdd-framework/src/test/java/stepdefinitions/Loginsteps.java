package stepdefinitions;

import org.openqa.selenium.WebDriver;

import config.TestConfig;
import cucumberrunner.TestNGTestRunner;
import io.cucumber.java.en.*;
import pageobjects.Loginpage;

public class Loginsteps extends TestNGTestRunner{
	public WebDriver driver;
	public TestConfig testConfig;
	public Loginpage loginpage;
	
	public Loginsteps(TestConfig testConfig) {
		this.testConfig=testConfig;
		loginpage=testConfig.pageobjectManager.getLoginpageObject();
	}
	
	 @Given("^I am on the login page of the website$")
	    public void i_am_on_the_login_page_of_the_website() throws Throwable {
	        loginpage.ensureLoginpage();
	    }

	    @When("^I enter the username (.+)$")
	    public void i_enter_the_username(String username) throws Throwable {
	        loginpage.enterUsername();
	    }

	    @Then("^I should be able to login successfully$")
	    public void i_should_be_able_to_login_successfully() throws Throwable {
	        loginpage.ensureHomepage();
	    }

	    @And("^I enter the password (.+)$")
	    public void i_enter_the_password(String password) throws Throwable {
	        loginpage.enterPassword();
	    }

	    @And("^I click on Login button$")
	    public void i_click_on_login_button() throws Throwable {
	        loginpage.clickLogin();
	    }

	    @And("^I should be navigated to the Homepage of the application$")
	    public void i_should_be_navigated_to_the_homepage_of_the_application() throws Throwable {
	    	loginpage.ensureHomepage();
	    }

}
