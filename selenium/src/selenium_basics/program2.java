package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeDriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.getTitle();
		//driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		 driver.findElement(By.id("nav-link-accountList")).click();
		 driver.findElement(By.id("ap_email")).sendKeys("9500195945"+Keys.ENTER);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("abishek@123"+Keys.ENTER);
		driver.findElement(By.id("signInSubmit")).click();
		driver.get("https://www.facebook.com/");
		driver.getTitle();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("9500195945"+Keys.ENTER);
		
	driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("abishek@123"+Keys.ENTER);
		driver.findElement(By.xpath("log in")).click();		
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("nav-link-acountlist")).click();
		driver.findElement(By.id("email")).sendKeys("9500195945");
		driver.findElement(By.id("password")).sendKeys("");
		
		
		//driver.findElement(By.xpath(//*[@id="authportal-main-section"]/div[2]/div[1]/div/div/h1
		//		+ )).sendKeys("mobile");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
