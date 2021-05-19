package stepDefinitions;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.automation.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.HomePage;
import io.cucumber.java.PendingException;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
	public WebDriver driver;
	HomePage h;

    @Given("^User is on Greencart landing page$")
    public void user_is_on_greencart_landing_page() throws Throwable {
    	driver = Base.getDriver();
    }

    @When("^User search for (.+) vegetable$")
    public void user_search_for_something_vegetable(String strArg1) throws Throwable {
    	//	//tagname[@attribute='value']
    	h = new HomePage(driver);
    	h.getSearch().sendKeys(strArg1);
    	Thread.sleep(3000);
    }

    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
    	Assert.assertTrue(driver.findElement(By.xpath("//h4[contains(text(),'Cucumber - 1 Kg')]")).getText().contains(strArg1));
    }
    
    /*@Then("^Verify selected \"([^\"]*)\" items are displayed in Checkout page$")
    public void verify_selected_something_items_are_displayed_in_checkout_page(String strArg1) throws Throwable {
        Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'Brinjal - 1 Kg')]")).getText().contains(strArg1));
    }*/

    @And("^Added items to cart$")
    public void added_items_to_cart() throws Throwable {
        driver.findElement(By.xpath("//a[contains(text(),'+')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
    }

    @And("^User proceeded to Checkout page for purcharse$")
    public void user_proceeded_to_checkout_page_for_purcharse() throws Throwable {
        driver.findElement(By.xpath("//header/div[1]/div[3]/a[4]/img[1]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
    }

}