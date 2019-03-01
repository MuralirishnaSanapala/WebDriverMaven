package com.w2a.testcases;

import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;
import com.w2a.utilities.TestUtil;

public class OpenAccountTest extends TestBase{
	
	@Test(dataProviderClass = TestUtil.class, dataProvider="dp")
	public void openAccountTest(Hashtable<String, String> data) throws InterruptedException 
	{
		Assert.fail("open account test is not working");
		if (!TestUtil.isTestRunnable("openAccountTest", excel)) {
			throw new SkipException("Skipping the test" +"openAccountTest".toUpperCase()+ "as the Run mode is NO");
		}
		click("openaccount_XPATH");
		Thread.sleep(3000);
		select("customer_XPATH", data.get("customer"));
		select("currency_XPATH", data.get("currency"));
		Thread.sleep(1000);
		click("process_XPATH");
		Thread.sleep(2000);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		Assert.assertTrue(alert.getText().contains(data.get("alerttext")));
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(1000);
		Reporter.log("Customer added successfully");
		//Assert.fail("Customer not added successfully");
	}
	
	
}
