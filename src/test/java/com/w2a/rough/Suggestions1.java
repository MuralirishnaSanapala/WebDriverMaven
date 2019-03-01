package com.w2a.rough;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suggestions1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\su\\murali-workspace\\DataDrivenFramework_2.53.1\\src\\test\\resources\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		String expCity, actCity=null;
		expCity = "Hyderabad, IN - Rajiv Gandhi International (HYD)";
		boolean cityExists = false;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("FromTag")).sendKeys("Hyd");
		driver.findElement(By.id("FromTag")).click();
		Thread.sleep(3000);
		List<WebElement> cityList = driver.findElements(By.xpath("html/body/ul[1]/li/a"));
		System.out.println(cityList.size());
		for (int i = 0; i < cityList.size(); i++) {
			actCity = cityList.get(i).getText();
			if (expCity.contains(actCity)) {
				
				System.out.println("given city" +expCity+ "is exists");
				cityExists=true;
				break;
			}
		}
			if (cityExists) {
				
				System.out.println("test pass");
			}
			else
			{
				System.out.println("test fail");
			}
		
	}

}
