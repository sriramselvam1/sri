package snippet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snippet {
	public static void main(String args[]) {
		
	
	System.setProperty("webDriver.Chrome.driver","C:\\Selenium\\ChromeDriver//chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9500195945");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("selvamahe");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	
	}
	
}

