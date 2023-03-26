package selenium_basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class window {
	public void tc1() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeDriver//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	
	Thread.sleep(3000);
	String parentwindowId=driver.getWindowHandle();
	System.out.println(parentwindowId);
	driver.findElement(By.id("newWindowBtn")).click();
	Set<String> allwindowid=driver.getWindowHandles();
	System.out.println(allwindowid);
	
	for(String allwindows:allwindowid) {
		if(!allwindows.equals(parentwindowId)) {
			driver.switchTo().window(allwindows);
			driver.findElement(By.id("firstName")).sendKeys("Hello Java");
			Thread.sleep(2000);
			driver.close();
		}
	}
	driver.switchTo().window(parentwindowId);
	driver.findElement(By.xpath("//*[@id='name']")).sendKeys("SeeYOU");
	
	
	

}
}
