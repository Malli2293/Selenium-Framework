package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	
	
	
	
	@FindBy(xpath="//*[@id=\"tabs-2\"]/div/div[2]/div[2]/ul/li[5]/a")
	private WebElement coursecategory;
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[2]/a/img")
	private WebElement addcategory;
	
	@FindBy(id="course_category_code")
	private WebElement categorycode;
	
	@FindBy(id="course_category_name")
	private WebElement categoryname;
	
	@FindBy(id="course_category_submit")
	private WebElement addcategoryButton;
	
	
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/ul/li[1]/a")
	private WebElement administration;
	
	@FindBy(xpath="//*[@id=\"tabs-2\"]/div/div[2]/div[2]/ul/li[2]/a")
	private WebElement createcourse;
	
	@FindBy(xpath="//*[@id=\"update_course_title\"]")
	private WebElement title;
	
	@FindBy(xpath="//*[@id=\"visual_code\"]")
	private WebElement code;
	
	@FindBy(xpath="//*[@id=\"update_course\"]/fieldset/div[3]/div[1]/div/button/div/div/div")
	private WebElement categorybox;
	
	@FindBy(xpath="//*[@id=\"update_course\"]/fieldset/div[3]/div[1]/div/div/div[1]/input")
	private WebElement categoryform;
	
	@FindBy(xpath="//*[@id=\"update_course\"]/fieldset/div[4]/div[1]/span/span[1]/span/ul/li/input")
	private WebElement teacher;
	
	@FindBy(xpath="//*[@id=\"update_course\"]/fieldset/div[4]/div[1]/span/span[1]/span/ul/span")
	private WebElement clear;
	
	@FindBy(id="department_name")
	private WebElement Department;
	
	@FindBy(id="department_url")
	private WebElement departmentUrl;
	
	@FindBy(xpath="//*[@id=\"update_course_submit\"]")
	private WebElement Submitbutton;
	
	
	
	
	@FindBy(xpath="//*[@id=\"navbar\"]/ul[1]/li[7]/a")
	private WebElement AdministationHeader;
	
	@FindBy(xpath="//*[@id=\"tabs-1\"]/div/div[2]/div[2]/ul/li[2]/a")
	private WebElement AdduserLink;
	
	@FindBy(id="firstname")
	private WebElement firstName;

	@FindBy(id="lastname")
	private WebElement lastName;
	
	@FindBy(id="email")
	private WebElement Email;
	
	@FindBy(id="phone")
	private WebElement Phone;
	
	@FindBy(id="username")
	private WebElement LoginName;
	
	@FindBy(name="password[password_auto]")
	private WebElement Password;
	
	@FindBy(xpath="//*[@id=\"qf_group_1-group\"]/div[1]/button[2]/em")
	private WebElement Adduserbutton;
	
	
	
	
	@FindBy(xpath="//*[@id=\"tabs-2\"]/div/div[2]/div[2]/ul/li[6]/a")
	private WebElement addUsersTocourseLink;
	
	@FindBy(name="UserList[]")
	private WebElement usersList;
	
	@FindBy(name="CourseList[]")
	private WebElement CourseList;
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/form[2]/table/tbody/tr[2]/td[2]/button")
	private WebElement addCourseButton;
	
	
	
	
	@FindBy(xpath="//*[@id=\"navbar\"]/ul[1]/li[2]/a")
	private WebElement Mycourses;
	
	@FindBy(xpath="//*[@id=\"coursesCollapse\"]/div/ul/li[5]/a")
	private WebElement courseCatelog;
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[2]/div/div/div/div[1]/form/div/input")
	private WebElement searchText;
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[2]/div/div/div/div[1]/form/div/div/button")
	private WebElement searchbutton;
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[3]/div[5]/div/div[1]/a/img")
	private WebElement testImg;
	
	@FindBy(xpath="//*[@id=\"course-info-bottom\"]/div/div[2]/div[1]/div/div/a")
	private WebElement courseHome;
	
	@FindBy(xpath="//*[@id=\"toolimage_2761\"]")
	private WebElement projectIocn;
	
	@FindBy(xpath="/html/body/main/section/div/div[4]/table/tbody/tr[2]/td[1]/a")
	private WebElement ProjectLink;
	
	@FindBy(xpath="//*[@id=\"post-65\"]/div/div/h3/a")
	private WebElement Welcome;
	
	@FindBy(id="add_post_title")
	private WebElement addPostTitle;
	
	@FindBy(xpath="//*[@id=\"add_post_save\"]")
	private WebElement saveButton;
	
	
	
	
	
	
	
	
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
	
	public void createCategory(String categorycode , String categoryname)
	{
		this.coursecategory.click();
		this.addcategory.click();
		this.categorycode.sendKeys(categorycode);
		this.categoryname.sendKeys(categoryname);
		this.addcategoryButton.click();
		
	
	}
	
	public void createCourse(String title , String code , String categoryform ,String teacher,String Department , String deparmentUrl) throws AWTException
	{
		this.administration.click();
		this.createcourse.click();
		this.title.sendKeys(title);
		this.code.sendKeys(code);
		this.categorybox.click();
		driver.findElement(By.xpath("//*[@id=\"update_course\"]/fieldset/div[3]/div[1]/div/div/div[2]/ul/li[11]/a/span")).click();
		this.clear.click();
		Robot robot = new Robot();
		driver.findElement(By.xpath("//*[@id=\"update_course\"]/fieldset/div[4]/div[1]/span/span[1]/span/ul/li/input")).sendKeys("manzoor");
		//robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		this.Department.sendKeys(Department);
		this.departmentUrl.sendKeys(deparmentUrl);
		this.Submitbutton.click();
	}
	public void submitbutton() {
		this.Submitbutton.click();
		
	}
	
	public void addUser(String firstName , String lastName , String Email , String Phone , String LoginName , String Password)
	{
		this.AdministationHeader.click();
		this.AdduserLink.click();
		this.firstName.sendKeys(firstName);
		this.lastName.sendKeys(lastName);
		this.Email.sendKeys(Email);
		this.Phone.sendKeys(Phone);
		this.LoginName.sendKeys(LoginName);
		this.password.sendKeys(Password);
		this.Adduserbutton.click();
		
	}
	
	public void addUserToCourse()
	{
		this.AdministationHeader.click();
		this.addUsersTocourseLink.click();
		
		Select user = new Select(driver.findElement(By.name("UserList[]")));
		user.selectByVisibleText("mehadi manzoor (manzoor12)");
		
		Select course = new Select(driver.findElement(By.name("CourseList[]")));
		course.selectByVisibleText("(SEL) selenium");
		this.addCourseButton.click();
		
	}
	
	public void courseCatelogAddComment(String searchText , String addPostTitle ) throws InterruptedException
	{
		
		this.Mycourses.click();
		this.courseCatelog.click();
		this.searchText.sendKeys(searchText);
		this.searchbutton.click();
		this.testImg.click();
		this.courseHome.click();
		this.projectIocn.click();
		this.ProjectLink.click();
		this.Welcome.click();
		this.addPostTitle.sendKeys(addPostTitle);
		
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"cke_1_contents\"]/iframe"));
		driver.switchTo().frame(frame);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body")).sendKeys("Hello just comment");
		driver.switchTo().defaultContent();
		
		this.saveButton.click();
		
	}
	
	
	
	}
