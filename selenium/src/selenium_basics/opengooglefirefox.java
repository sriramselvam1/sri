package selenium_basics;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class opengooglefirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","c:\\selenium\\geckodriver//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in");
		
		

	}

}
