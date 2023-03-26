package selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeDriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.zalora.com");
		driver.findElement(By.xpath("//a[@id='MALAYSIA']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,500)");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("men"+Keys.ENTER);
		driver.findElement(By.xpath("//span[@class='b-checkbox__label'and@title='Activewear']")).click();
		js.executeScript("window.scroll(0,500)");
		driver.findElement(By.xpath("//body[@class='js l-full-hd ui-page-bg  thm-core thm-local thm-myfas  l-hasSidebar ui-bg-light-primary no-touch']")).click();
	    driver.findElement(By.xpath("//select[@id='productSizeSelect']")).click();
	   // driver.findElement(By.xpath("//select[@id='productSizeSelect']")).click();
	   // Select s=new Select(driver.findElement(By.xpath("//select[@id='productSizeSelect']")));
	    
	    Thread.sleep(1500);
	   driver.findElement(By.xpath("//a[contains(text(),'Close')]")).click();
	   // driver.findElement(By.xpath("//button[contains(text(),'Add to Bag')]")).click();
	    }
	  
		
		
		
		

	}


