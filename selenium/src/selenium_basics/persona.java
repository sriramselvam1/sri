package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amway.in");
		driver.findElement(By.xpath("//button[.='DISMISS']")).click();
		driver.findElement(By.xpath("//script[@id='__ada']")).click();
		driver.findElement(By.xpath("//a[@title='Set Location']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,1000)");
		

	}

}
