package com.w2a.rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenAccountTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.way2automation.com//angularjs-protractor//banking//#//login");
		//driver.get("http://www.way2automation.com//angularjs-protractor//banking//#//manager");
		driver.findElement(By.xpath("//button[text()='Bank Manager Login']")).click();
		driver.findElement(By.xpath("//button[@ng-class='btnClass2']")).click();
		//Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//select[@id='currency']"));
		//currency_CSS=//select[@id='currency']
		Select sel = new Select(ele);
		sel.selectByVisibleText("Rupee");
		

	}

}
