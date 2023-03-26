package selenium_basics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver","C:\\Selenium\\ChromeDriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().minimize();
		driver.get("https://letcode.in/buttons");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\selva\\OneDrive\\Pictures\\Screenshots");
		FileHandler.copy(src, dest);
		driver.quit();
		
		


	}

}