package selenium_basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prog3 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Properties prop=new Properties();
		prop.load(new FileInputStream("C:\\Users\\selva\\eclipse-workspace\\selenium\\src\\selenium_basics\\config.properties"));
		String url=prop.getProperty("url");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		driver.get(url);
		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.xpath("//input[@id='user-name']"));
		user.sendKeys(username);
		WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
		user.sendKeys(password);
		
		

	}

}
