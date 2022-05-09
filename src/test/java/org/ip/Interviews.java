package org.ip;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Interviews {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cleartrip.com/");
		
		Actions a=new Actions(driver);

		
	WebElement from = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	from.click();
	
	Thread.sleep(5000);
	WebElement click = driver.findElement(By.xpath("//p[text()='Chennai, IN - Chennai Airport (MAA)']"));
	a.moveToElement(click).perform();
	a.doubleClick().perform();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
	WebElement to = driver.findElement(By.xpath("//p[text()='Bangalore, IN - Kempegowda International Airport (BLR)']"));
	a.moveToElement(to).perform();
	a.doubleClick().perform();

	driver.findElement(By.xpath("//button[text()='Search flights']")).click();
	
	List<WebElement> t = driver.findElements(By.xpath("//p[@class='m-0 fs-5 fw-700 c-neutral-900 h-7']"));
	int b = t.size();
	System.out.println(b);
	
	for (int i = 0; i < t.size(); i++) {
		WebElement e = t.get(i);
		String tx = e.getText();
		System.out.println(tx);
		
	}
	Set<WebElement> set = new HashSet<WebElement>();
	set.addAll(t);
	
	if (t.size() == set.size()) {
		System.out.println("No Duplicates :" +t.size());
		
	}else {
		System.out.println("Duplicates Available :" +set.size());
	}
		}

	}

