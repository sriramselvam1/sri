package selenium_basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeDriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		driver.manage().window().maximize();
        driver.getCurrentUrl();
        driver.getTitle();
        driver.getPageSource();
        driver.navigate().to("https://www.instagram.com/");
        driver.navigate().back();
        driver.switchTo().newWindow(WindowType.TAB);
        Set<String>handles=driver.getWindowHandles();
        List<String>ls=new ArrayList<String>(handles);
        String parentwindowid=ls.get(0);
        String childwindowid=ls.get(1);
        System.out.println(parentwindowid);
        System.out.println(childwindowid);
        System.out.println("beforeswitching"+driver.getTitle());
        driver.switchTo().window(parentwindowid);
        System.out.println("afterswitching"+driver.getTitle());
        int count=handles.size();
        System.out.println("no of tabs/windows"+count);
        driver.close();
        
	}

}
