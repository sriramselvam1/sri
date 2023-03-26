package selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class selectclassdropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver","C:\\Selenium\\ChromeDriver//chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
	
	driver.get("https://letcode.in/dropdowns");
	Select s=new Select(driver.findElement(By.xpath("//select[@id='country']")));
	List<WebElement>a=s.getOptions();
	for(int i=0;i<11;i++) {
		Thread.sleep(2000);
		s.selectByIndex(i);
		Thread.sleep(2000);
		s.isMultiple();
		
	}
	Select s1=new Select(driver.findElement(By.xpath("//select[@id='fruits']")));
	List<WebElement>b=s1.getOptions();
	for(int i=0;i<4;i++) {
		Thread.sleep(2000);
		s1.selectByIndex(i);
		
		
	}
	Select s2=new Select(driver.findElement(By.xpath("//select[@id='lang']")));
	List<WebElement>c=s2.getOptions();
	for(int i=0;i<4;i++) {
		Thread.sleep(2000);
		s2.selectByIndex(i);
	}
	}
}
	
	
		
	

	


