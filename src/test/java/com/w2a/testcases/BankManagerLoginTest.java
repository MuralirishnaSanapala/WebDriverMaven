package com.w2a.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class BankManagerLoginTest extends TestBase{
	@Test
	public void bankManagerLoginTest() throws InterruptedException, IOException 
	{
		
		//Assert.fail("Login not successful");
		//verifyEquals("abc", "xyz");
		//Thread.sleep(3000);
		log.debug("Inside login test");
		click("bmlBtn_XPATH");
		//driver.findElement(By.xpath(OR.getProperty("bmlBtn"))).click();
		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("addCustBtn_XPATH"))),"Login not Successful");
		log.debug("Login successfully executed");
		Reporter.log("Login successfully executed");
		//Assert.fail("Login not successful");
		
		
	} 
}
