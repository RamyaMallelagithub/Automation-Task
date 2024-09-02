package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class End2EndTest {
	
	WebDriver driver;
	@Given("Open the browser")
	public void open_the_browser() {
	    
		driver = new ChromeDriver();
		
	}

	@Given("Access the application")
	public void access_the_application() {
	   
		driver.get("https://www.saucedemo.com/");
	}

	@When("Login to application")
	public void login_to_application() {
	    
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}

	@When("Add product to cart")
	public void add_product_to_cart() {
	    
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.name("add-to-cart-sauce-labs-bike-light")).click();
	}

	@When("Open the cart")
	public void open_the_cart() {
	    
		driver.findElement(By.className("shopping_cart_badge")).click();
	}

	@When("Remove the product")
	public void remove_the_product() {
	    
		driver.findElement(By.name("remove-sauce-labs-bike-light")).click();
	}
	@Then("Check out")
	public void check_out() {
	   
		driver.findElement(By.id("checkout")).click();
	}

	@Then("Enter the details and continue")
	public void enter_the_details_and_continue() {
	
		driver.findElement(By.id("first-name")).sendKeys("Ramya");
		driver.findElement(By.id("last-name")).sendKeys("Mallela");
		driver.findElement(By.id("postal-code")).sendKeys("521511");
		driver.findElement(By.id("continue")).click();
	}

	@Then("Click on finish")
	public void click_on_finish() {
	   
		driver.findElement(By.id("finish")).click();
	}

	@Then("Back to home page")
	public void back_to_home_page() {
	   
		driver.findElement(By.id("back-to-products")).click();
	}




}
