package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMLearning {
	private WebDriver driver;

	public LoginPOMLearning(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//*[@id=\"navbar\"]/ul[2]/li[2]/a")
	private WebElement myprofile;
	
	@FindBy(id="logout_button")
	private WebElement logout;
	
	@FindBy(xpath="//*[@id=\"navbar\"]/ul[2]/li[2]/ul/li[1]/div/a/p")
	private WebElement link;
	
	@FindBy(xpath="//*[@id=\"sn-avatar-one\"]/div/ul/li[4]/a")
	private WebElement editprofile;
	
	@FindBy(id="profile_password0")
	private WebElement currentpass;
	
	@FindBy(id="profile_password1")
	private WebElement newpass;
	
	@FindBy(id="profile_password2")
	private WebElement confirmpass;
	
	@FindBy(id="profile_apply_change")
	private WebElement savebutton;
	
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void logoutMethod()
	{
	this.myprofile.click();
	this.logout.click();
	}
	public void passwordChange(String currentpass,String newpass,String confirmpass)
	{
	this.myprofile.click();
	this.link.click();
	this.editprofile.click();
	this.currentpass.sendKeys(currentpass);
	this.currentpass.sendKeys(newpass);
	this.currentpass.sendKeys(confirmpass);
	this.savebutton.click();
	
	}
	
	}
