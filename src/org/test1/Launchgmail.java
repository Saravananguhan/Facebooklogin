package org.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchgmail {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN\\Selenium_Test_Practice\\Chrome Driver 123\\chromedriver.exe");
	
	   WebDriver driver =new ChromeDriver();
	   
	   driver.get("https://mail.google.com/");
	   
	
	
	
	}

}
