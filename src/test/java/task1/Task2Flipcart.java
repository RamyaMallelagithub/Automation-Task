package task1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task2Flipcart {

	WebDriver driver;
	@Test(dataProvider = "SearchProducts", dataProviderClass = Task2.class)
	void testOpencart(String Products)
	{
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys(Products);
		ele.click();
		
	}
}






