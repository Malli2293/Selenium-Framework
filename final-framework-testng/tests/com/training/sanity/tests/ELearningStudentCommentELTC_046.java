package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.LoginPOMLearning;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELearningStudentCommentELTC_046 {
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
		driver.close();
	}
	
	
	@Test
	public void validLoginTest() throws InterruptedException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		loginPOM.courseCatelogAddComment("Testing", "Testing");
		
		WebElement message = driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[3]/div/div[2]"));
		String successPassword = message.getText();
		String actual = "You comment has been added";
		Assert.assertEquals(actual,successPassword);
		
	}
	
}
