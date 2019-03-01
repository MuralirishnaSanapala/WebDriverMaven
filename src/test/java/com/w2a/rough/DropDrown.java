package com.w2a.rough;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDrown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\su\\murali-workspace\\DataDrivenFramework_2.53.1\\src\\test\\resources\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mi.com/in/note4/");
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.className("main-category")));
		act.build().perform();
		driver.findElement(By.className("product-image")).click();
	}

}
