package selenium_basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		//Select sc=new Select(driver.findElement(By.xpath("//select[@id='fruits']")));
		//sc.selectByVisibleText("Apple");
		//sc.selectByIndex(4);
		//Select sc=new Select(driver.findElement(By.xpath("//select[@id='superheros']")));
		//sc.selectByIndex(2);
		//Select sc=new Select(driver.findElement(By.xpath("//select[@id='fruits']")));
		//sc.selectByIndex(3);
		//List<WebElement>all=sc.getOptions();
		//for(int i=0;i<6;i++) {
			//Thread.sleep(2000);
			//sc.selectByIndex(i);
		//}
		Select ss=new Select(driver.findElement(By.xpath("//select[@id='lang']")));
		List<WebElement>a=ss.getOptions();
		for(int i=0;i<5;i++) {
			ss.selectByIndex(i);
		Select s=new Select(driver.findElement(By.xpath("//select[@id='country']")));	
		List<WebElement>b=s.getOptions();
		for(int j=0;j<12;j++) {
			s.selectByIndex(j);
		Select s1=new Select(driver.findElement(By.xpath("//select[@id='superheros']")));
              s1.selectByIndex(2);
		}
			
		}
				}
		
		
	

}
