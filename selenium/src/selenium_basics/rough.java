package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class rough{
	@Test
	public void food() {
		System.out.println("fodd is biriyani");
	}
	@BeforeSuite
	public void clothes() {
		System.out.println("cloth isn t shirt");
	}
	@AfterSuite
	public void games() {
		System.out.println("temple run");
	}
	@AfterTest
	public void music() {
		System.out.println("music is channa mereya");
	}
	@AfterClass
	public void books() {
		System.out.println("book is silence");
		
	}
}
