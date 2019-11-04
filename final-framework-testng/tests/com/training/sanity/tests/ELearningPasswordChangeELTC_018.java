package com.training.sanity.tests;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.LoginPOMLearning;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class ELearningPasswordChangeELTC_018 {

	public WebDriver driver;
	private String baseUrl;
	public LoginPOMLearning loginPOM;
	private static Properties properties;
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOMLearning(driver); 
		baseUrl = properties.getProperty("baseURL");
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.close();
	}
	
	
	@Test
	public void validLoginTest() {
		loginPOM.sendUserName("reva");
		loginPOM.sendPassword("reva321");
		loginPOM.clickLoginBtn(); 
		loginPOM.passwordChange("reva321", "reva321", "reva321");
		WebElement message = driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/div[1]"));
		String successPassword = message.getText();
		String actual = "Your new profile has been saved";
		Assert.assertEquals(actual,successPassword);
		
		
	}
	
	
}