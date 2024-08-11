package steps;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class instasteps {
	
	WebDriver driver;
	
	@Given("Open the Browser,enter the Insta Signup url")
	public void open_the_browser_enter_the_insta_signup_url() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/accounts/emailsignup/");
	    
	}
	@When("user enters the email fullname username password")
	public void user_enters_the_email_fullname_username_password() {
		
		driver.findElement(By.cssSelector("[name='emailOrPhone']")).sendKeys("malvika00@gmail.com");
		driver.findElement(By.cssSelector("[name='fullName']")).sendKeys("Malvika sesodia");
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("malvikasesodia");
		driver.findElement(By.cssSelector("[name='password']")).sendKeys("malvika123");
	    
	}
	@When("click on signup button")
	public void click_on_signup_button() {
		
		driver.findElement(By.cssSelector("[type='submit']")).click();
	    
	}
	@Then("Signup successfully message should be displayed")
	public void signup_successfully_message_should_be_displayed() {
		
		String ab = driver.findElement(By.xpath("//span[text()='Add Your Birthday']")).getText();
		String cd = "Add Your Birthday";
		Assert.assertEquals(cd, ab);
	    
	}


}
