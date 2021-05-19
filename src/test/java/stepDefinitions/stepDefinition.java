package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;

import cucumber.automation.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.CheckOutPage;

@RunWith(Cucumber.class)
public class stepDefinition extends Base {
	
	CheckOutPage cp;

    @Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {
    	System.out.println("Deciding the browser to open");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
        System.out.println("Browser is triggered");
    }

    @Then("^Check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
    	System.out.println("Browser is started");
    }
	
	@Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        //Code to navigate to login url
		System.out.println("Navigated to login url");
    }
	
	/*@Then("^Verify selected \"([^\"]*)\" items are displayed in Checkout page$")
    public void verify_selected_something_items_are_displayed_in_checkout_page(String strArg1) throws Throwable {
        
    }*/
	
    @Then("^Verify selected (.+) items are displayed in Checkout page$")
    public void verify_selected_items_are_displayed_in_checkout_page(String name) throws Throwable {
    	cp = new CheckOutPage(driver);
		//Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'Brinjal - 1 Kg')]")).getText().contains(name));
    	Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(name));
    }

	@When("^User login in to application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        //Home page validation
    	System.out.println("Validated homepage");
    }
    
    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
        
    }
    
    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
        List<List<String>> obj = data.asLists();
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));
        System.out.println(obj.get(0).get(4));
    }
    
    @When("^User login into application with (.+) and password (.+)$")
    public void user_login_into_application_with_and_password(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);
    }
    
}
