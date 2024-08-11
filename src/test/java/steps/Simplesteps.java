package steps;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Simplesteps {
	
	WebDriver driver;
	
	
	@Given("Open the Browser, enter the Simple Form url")
	public void open_the_browser_enter_the_simple_form_url() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://v1.training-support.net/selenium/simple-form");
	    
	}
	@When("user enters firstname lastname email phnnumber message")
	public void user_enters_firstname_lastname_email_phnnumber_message() {
		
		driver.findElement(By.id("firstName")).sendKeys("Sakshi");
		driver.findElement(By.id("lastName")).sendKeys("Rajawat");
		driver.findElement(By.id("email")).sendKeys("rajawatsakshi400@gmail.com");
		driver.findElement(By.id("number")).sendKeys("6377602937");
		
		JavascriptExecutor jsExecutor =  (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollBy(0,550);");
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].value=arguments[1]", driver.findElement(By.linkText("Message")),"hey this is sakshi");
		
		driver.findElement(By.cssSelector("textarea")).sendKeys("hey this is sakshi");
	    
	}
	@When("click on submit button")
	public void click_on_submit_button() {
		
		driver.findElement(By.cssSelector("[value='submit']")).click();
	    
	}
	@Then("Thank You for reaching out to us, sakshi rajawat should be displayed")
	public void thank_you_for_reaching_out_to_us_sakshi_rajawat_should_be_displayed() {
		
		Alert alert = driver.switchTo().alert();
		alert.getText();
		System.out.println("Thank You for reaching out to us, sakshi rajawat");
		alert.accept();
	    
	}
	/*
	@When("user enters {string} {string} {string} {string} message")
	public void user_enters_message(String Firstname, String Lastname, String Email, String number) {
		
		driver.findElement(By.id("firstName")).sendKeys(Firstname);
		driver.findElement(By.id("lastName")).sendKeys(Lastname);
		driver.findElement(By.id("email")).sendKeys(Email);
		driver.findElement(By.id("number")).sendKeys(number);
		
	}	

	*/	

	
	

}
