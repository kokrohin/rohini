package com.practice.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1 {

	

	@Test
	public void testCase1() {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.navigate().to("https://www.amazon.in/");
		
	} 
}
