package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN\\Selenium_Test_Practice\\Chrome Driver 123\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.id("email")).sendKeys("yhu@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("hhdhh");
		driver.findElement(By.id("loginbutton")).click();
		  
	}

}
