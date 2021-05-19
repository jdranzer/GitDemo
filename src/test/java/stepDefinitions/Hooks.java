package stepDefinitions;

import cucumber.automation.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {

	@Before("@MobileTest")
	public void beforeValidation()
	{
		System.out.println("Before Mobile hook");
	}
	
	@After("@SmokeTest")
	public void afterValidation()
	{
		driver.close();
	}
	
	@Before("@WebTest")
	public void beforeWebValidation()
	{
		System.out.println("Before Web hook");
	}
	
	@After("@WebTest")
	public void afterWebValidation()
	{
		System.out.println("After Web hook");
	}
	
	@After("@RegressionTest")
	public void afterSeleniumTest()
	{
		driver.close();
	}
}
