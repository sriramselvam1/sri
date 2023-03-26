package com.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdefinition  {
	public static WebDriver driver;
	@Given("User is on facebook page")
	public void user_is_on_facebook_page() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		System.out.println("fb page launched");
	}
	@When("User enter <{string}> and <{string}>")
	public void user_enter_and(String user, String pass) {
		driver.findElement(By.id("email")).sendKeys(user);
	    driver.findElement(By.id("pass")).sendKeys(pass);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.name("login")).click();
	   
	}
	

}
