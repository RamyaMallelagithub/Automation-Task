package task1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Task3 {

	WebDriver driver;
	@Test
	public void formValidation()
	{
		
		driver = new EdgeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("firstName")).sendKeys("ramya");
		driver.findElement(By.id("lastName")).sendKeys("mallela");
		driver.findElement(By.id("userEmail")).sendKeys("ramyamallela@gmail.com");
		
		List<WebElement> gender = driver.findElements(By.xpath("//div[contains(@class,'custom-radio')]"));
		for(WebElement category: gender )
		{
			if(category.getText().equalsIgnoreCase("Female"))
			{
				category.click();
			}
			 
		}
		
		driver.findElement(By.id("userNumber")).sendKeys("6304471030");
		WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
		dob.click();
		Select month = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		month.selectByVisibleText("May");
		Select year = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		year.selectByVisibleText("2000");
		driver.findElement(By.xpath("//div[text()='2']")).click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0, 300);");
		 driver.findElement(By.xpath("//div[@id='subjectsContainer']")).sendKeys("Eng");
		 driver.findElement(By.xpath("//div[contains(text(),'Chemistry')]")).click();
		 
		
		List<WebElement> check_box = driver.findElements(By.xpath("//div[@id='hobbiesWrapper']/div[2]"));
		for(WebElement checkboxs:check_box)
		{
			if(checkboxs.getText().equalsIgnoreCase("Sports"))
			{
				checkboxs.click();
			}
		}
		
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\DELL\\OneDrive\\Desktop\\profile.jpg");
		driver.findElement(By.id("currentAddress")).sendKeys("KPHB Colony, Hyderabad");
		
		driver.findElement(By.id("state")).click();
		driver.findElement(By.xpath("//div[text()='Rajasthan']")).click();
		driver.findElement(By.id("city")).click();
		driver.findElement(By.xpath("//div[text()='Lucknow']")).click();
		
		
		
		
		driver.findElement(By.id("hobbies-checkbox-2")).click();
		driver.findElement(By.xpath("hobbies-checkbox-3")).click();
		
	}
}
