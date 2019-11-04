package com.training.sanity.tests;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.LoginPOMLearning;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELearningAdminCreateCategoryELTC_047 {

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
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.close();
	}
	
	
	@Test
	public void validLoginTest() throws AWTException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		loginPOM.createCategory("BL","Blended Learning");
		loginPOM.createCourse("SQL", "2290", "BLENDED LEARNING","manzoor", "Selenium", "selenium.hq");
		loginPOM.submitbutton();
		
		String course = driver.findElement(By.xpath("//*[@id=\"course-list\"]/tbody/tr[2]/td[2]")).getText();
		driver.findElement(By.xpath("//*[@id=\"course-search-keyword\"]")).sendKeys("SQL");
		driver.findElement(By.id("search_simple_submit")).click();
		
		String actual ="SQL";
		Assert.assertEquals(actual,course);
		
		
		
		
		
	}
	
	
	
	
			
	}
