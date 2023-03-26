package com.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	public WebDriver driver;
	
	//SnippetS
	@Given("User is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com/");
	}
	@When("User enter the username and password")
	public void user_enter_the_username_and_password() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9500195945");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("selvamahe");
	   
	}
	@When("User clicks on login Page")
	public void user_clicks_on_login_page() {
		driver.findElement(By.name("login")).click();
	    
	}
	@Then("User verify the error message")
	public void user_verify_the_error_message() {
		WebElement errormessage=driver.findElement(By.xpath(""));
	 
	}
	

}
