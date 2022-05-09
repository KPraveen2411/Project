package org.ip;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MapUse {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://cosmocode.io/automation-practice-webtable/");

		List<WebElement> countries = driver.findElements(By.xpath("//table[@id='countries']//tr//td[2]"));
		List<WebElement> captitals = driver.findElements(By.xpath("//table[@id='countries']//tr//td[3]"));

		Map<String, String> map = new LinkedHashMap<String, String>();

		for (int i = 0; i < countries.size(); i++) {

			WebElement country = countries.get(i);
			WebElement capital = captitals.get(i);

			String textCountry = country.getText();
			String textCapital = capital.getText();

			map.put(textCountry, textCapital);
		}
		
		for (Entry<String,String> node : map.entrySet()) {
			System.out.println(node);
		}

		
	}

}
