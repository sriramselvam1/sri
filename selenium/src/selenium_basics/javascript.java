package selenium_basics;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript {

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scroll(0,1000)");//scroll down
		Thread.sleep(9000);
		jse.executeScript("window.scroll(0,-1000)");//scroll up
		Thread.sleep(9000);
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
		
		
		

	}		
}
