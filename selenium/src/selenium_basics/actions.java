package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class actions {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver//chromedriver.exe");
		
		ChromeOptions options=new  ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		WebElement d=driver.findElement(By.linkText("Droppable"));
		d.click();
		WebElement frames=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frames);
		Actions ac=new Actions(driver);
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement des=driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(3000);
		ac.dragAndDrop(src, des).perform();

	}

} 










