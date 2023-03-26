package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.adidas.com");
		driver.findElement(By.xpath("//input[@data-auto-id='searchinput-desktop']")).sendKeys("tshirts"+Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[text()='Techfit Training Long Sleeve Tee']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@data-auto-id='open-mobile-menu-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='XL']//parent::button")).click();
		
	}

}
