package selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/table");
		WebElement table=driver.findElement(By.xpath("//table[@id='simpletable']"));
		table.click();
		List<WebElement> headers=table.findElements(By.tagName("th"));
		for (WebElement header : headers) {
			String text=header.getText();
			System.out.println(text);
		}
		driver.quit();
		List<WebElement> allrows=table.findElements(By.cssSelector("tbody tr"));
		int size=allrows.size();
		System.out.println("row size"+size);
		
		



}
}
