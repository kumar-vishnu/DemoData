package org.class1;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\selenium\\selenium project\\SeleniumJava\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("a077aa5e");
		WebElement ifr = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		ifr.click();
}	
}
