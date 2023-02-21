package baseClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;

	public static FileReader fr;
	public static  Properties config = new Properties();

	@BeforeTest
	public void browsersetup() throws IOException {

		if(driver == null) {
		fr = new FileReader(
				System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
		config.load(fr);
		}
		
		if(config.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("Browser launched successfully");
			driver.get(config.getProperty("testurl"));
			
		}
	}

//	@AfterTest
//	public void teardown() {
//		
//		driver.quit();
//		System.out.println("Browser closed successfully");
//
//	}

}
