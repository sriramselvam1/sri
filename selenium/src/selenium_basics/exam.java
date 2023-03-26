package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class exam {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.Chrome.driver","C:\\Selenium\\ChromeDriver//chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		driver.findElement(By.xpath("//input[@id='inputValEnter']")).sendKeys("Tshirt"+Keys.ENTER);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[@data-pagename='searchResult']")).click();
		jse.executeScript("window.scrollBy(0,500)");
		
		
	
		
		
		

	}

}
