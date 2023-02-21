package testClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseClass.BaseTest;

public class LoginTest extends BaseTest {

	@Test
	public void login() {

		// using implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//using explicit wait
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// maximize the window
		driver.manage().window().maximize();
		
		//close the ad
		driver.findElement(By.xpath("//button[@class='needsclick klaviyo-close-form kl-private-reset-css-Xuajs1']")).click();

		// click the account-icon
		WebElement acc_icon = driver.findElement(By.xpath("//div[@id='upper-content']//a[@href='/account/login']"));
		acc_icon.click();
		
		//enter the email
		WebElement email = driver.findElement(By.xpath("//input[@id='customer-email']"));
		email.sendKeys(config.getProperty("email_field"));
		
		//enter the password
		WebElement pass = driver.findElement(By.xpath("//input[@id='customer-password']"));
		pass.sendKeys(config.getProperty("pass_field"));
		
		//click the sigin button
		WebElement signin = driver.findElement(By.xpath("//div[@class='desktop-12 tablet-6 mobile-3 a-left relative']//input[@value='Sign In']"));
		signin.click();
	}

}
