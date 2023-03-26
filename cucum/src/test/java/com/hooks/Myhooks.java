package com.hooks;

import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Myhooks {
	//@Before(order=2)
	//public void beforescenario1() {
	//	System.out.println("hooks Title page");
	//}

//	@Before(order=3)
//	public void beforescenario2() {
//		System.out.println("hooks URL page");
	//}
//	@Before(order=1)
//	public void beforescenario3() {
//		System.out.println("");
//	}
	@Before
public void beforescenario1(Scenario s) {
	System.out.println("Hook before scenario 1");
	String name=s.getName();
	System.out.println(name);
}
	@After
	public void afterscenario(Scenario s) {
		TakesScreenshot ts= (TakesScreenshot)driver;
		

	
	
}

}
