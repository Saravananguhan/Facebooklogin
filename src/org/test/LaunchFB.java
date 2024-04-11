package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LaunchFB {
	
	public static void main(String[] args) throws AWTException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN\\Selenium_Test_Practice\\DriverFile\\chromedriver.exe");
	
		WebDriver test1=new ChromeDriver();
		
		test1.get("https://www.greenstechnologys.com/");
		
		test1.manage().window().maximize();
		
		WebElement findElement1 = test1.findElement(By.xpath("//a[text()='COURSES']"));
		
		
		Actions test2=new Actions(test1);
		
		test2.moveToElement(findElement1);
		
		Robot tr=new Robot();
		
		tr.keyPress(KeyEvent.VK_UP);
		tr.keyRelease(KeyEvent.VK_DOWN);
		
		
		
			
		
		
		
		
		
		
		
	
	
	
	
	}

}
