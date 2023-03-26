package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//load URL
		driver.get( "https://letcode.in/");
		//click login button
		driver.findElement(By.linkText("Log in")).click();
		//enter email id
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("koushik350@gmail.com"+Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		//enter password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pass123$"+Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		//click login button
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();
		
				
	}

}