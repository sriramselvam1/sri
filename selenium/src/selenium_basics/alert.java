package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.findElement(By.xpath("//button[@id='accept']")).click();//alert will come
		Alert alert=driver.switchTo().alert();// alert focus we are switching
		String text=alert.getText();
		System.out.println("simple alert text"+text);
		alert.accept();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		//prompt
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		alert.sendKeys("sriram");
		alert.accept();
		
		
		
		
		
	  
		

	}

}
