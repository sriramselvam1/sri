package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://letcode.in/buttons");
		
		String url=driver.getCurrentUrl();
		
		System.out.println("Button URL:  "+url);
		
		driver.findElement(By.id("home")).click();
		
		String homeurl=driver.getCurrentUrl();
		
		System.out.println("home page URL"+homeurl);
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		System.out.println("return to button page"+driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		driver.navigate().to("https://letcode.in/signin");
		
		
		
		

	}

}
