package org.ip;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Interview {
	
	public static void main(String[] args) throws IOException, AWTException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		
		
		//single tab condition
		for (String one : child) {
			if (!parent.equals(child)) {
				driver.switchTo().window(one);	
			}
		}
		
		
		driver.findElement(By.xpath("(//input[@type='submit'])[7]")).click();
		driver.navigate().back();
		
		List<String> l=new ArrayList<String>();
		l.addAll(child);
		driver.switchTo().window(l.get(0));
		
		driver.navigate().back();
		driver.navigate().to("https://www.flipkart.com/");
		
		//Filkart
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobile");
	//	driver.findElement(By.xpath("//button[@type='submit']")).click();
//		driver.findElement(By.tagName("button")).click();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		}
			
	}


