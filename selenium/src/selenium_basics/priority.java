package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class priority {
	@Test(priority = 1)
	public void signup() {
		System.out.println("sign up");
	}
	@Test(priority = 3)
	public void searchproduct() {
		System.out.println("search product");
	}
	@Test(priority = 4)
	public void addtocart() {
		System.out.println("add to cart");
	}
	@Test(priority = 2)
	public void login() {
		System.out.println("login");
	}
	@Test(priority = 5)
		public void signout() {
			System.out.println("sign out");
	}





	                                                                                           

}
