package task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Task1 {
	WebDriver driver;
	boolean result;
	@Test(dataProvider = "datasuplier")
	public void login(String uname,String pass,String message)
	{
		
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");


			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			try{
			WebElement logo = driver.findElement(By.xpath("//span[@class='title']"));
			result = logo.isDisplayed();
			Assert.assertTrue(result);
			}
			catch (Exception e) {
			System.out.println("Can't login to the account");
			String errormsg = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
			boolean result = errormsg.equals(message);
			Assert.assertTrue(result);
			}

			driver.close();

			}
		    
	        @DataProvider
	        public String[][] datasuplier(){
	    		String[][] data= {{"standard_user","secret_sauce",""},
	    		{"ramyamallela","ramya@123","Epic sadface: Username and password do not match any user in this service"},
	    		{"","","Epic sadface: Username is required"},
	    		{"locked_out_user","secret_sauce","Epic sadface: Username and password do not match any user in this service"},
	    		{"problem_user","secret_sauce",""},
	    		{"performance_glitch_user","secret_sauce",""},
	    		{"error_user","secret_sauce",""},
	    		{"visual_user","secret_sauce",""}};


	    		return data;

	    		}
		
	



	
}
