package pages;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.google.common.io.Files;

import tcpackage.tcregister;

public class registrationPage
{
Reporter r =new Reporter();
	static WebDriver driver;
	static Logger lo;
	static int i = 1;
	WebElement Register,firstname, lastname, Gender, email, password,confirmpassword, submit;
	 public void click_register() throws IOException 
	{
		Register =driver.findElement(By.linkText("Register"));
		Register.click();
	takeSnap();
		
	
	}
	 public registrationPage(WebDriver driver)
	{
		registrationPage.driver = driver;
	}
	 public void entergender()
		{
			Gender = driver.findElement(By.name("Gender"));
			Gender.click();
			
		}
	public void enterFirstname(String s)
	{
		firstname = driver.findElement(By.name("FirstName"));
		firstname.sendKeys(s);
		
	}
	public void enterlastname(String s)
	{
		lastname = driver.findElement(By.name("LastName"));
		lastname.sendKeys(s);
	}
	public void enteremail(String s)
	{
		email = driver.findElement(By.name("Email"));
		email.sendKeys(s);
	}
	
	public void enterpassword(String s)
	{
		password = driver.findElement(By.name("Password"));
		password.sendKeys(s);
	}
	
	public void enterconfirmpassword(String s)
	{
		confirmpassword= driver.findElement(By.name("ConfirmPassword"));
		confirmpassword.sendKeys(s);
	}
	public void entersubmit() throws IOException
	{
		submit = driver.findElement(By.name("register-button"));
		submit.submit();
		takeSnap();
	}
	public static void takeSnap() throws IOException
	 {
	 	File scrFile;
	 	scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 	Files.copy(scrFile,new File("G:\\user\\workspace\\project\\src\\test\\resources\\com\\screenshots"+i+".png"));
	 	i++;
	 }

	public static void Logger(String msg) {
		Logger lo=Logger.getLogger(tcregister.class.getName());
		lo.setLevel(Level.ALL);
		lo.info(msg);
	}
	
	
	
}
