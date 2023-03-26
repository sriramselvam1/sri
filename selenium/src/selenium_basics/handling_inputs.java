package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handling_inputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch browser
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver//chromedriver.exe");
				
				ChromeOptions options=new  ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				
	
				WebDriver driver=new ChromeDriver(options);
				driver.get("https://letcode.in/edit");
				//enter a full name
				driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys("Sriram");
				//append a text and press keyboard tab
				driver.findElement(By.xpath("//input[@id='join']")).sendKeys("iam fantastic");
				//what is inside text box
				String value=driver.findElement(By.xpath("//input[@id='getMe']")).getAttribute("value");
				System.out.println(value);
				//clear the text
				driver.findElement(By.xpath("//input[@id='clearMe']")).clear();
				//confirm that edit field is disabled
				boolean edit=driver.findElement(By.xpath("//input[@id='noEdit']")).isEnabled();
				System.out.println(edit);
				
				
				
				

	}

}
