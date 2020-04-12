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

import com.google.common.io.Files;

import tcpackage.tclogin;

public class login 
{
	static WebDriver driver;
	static int i = 1;
	WebElement username,loginlog,password,sub;

	 public void click_login() throws IOException
		{
			loginlog =driver.findElement(By.linkText("Log in"));
			loginlog.click();
			takeSnap();
		}

	 public login(WebDriver driver)
		{
			this.driver = driver;
		}
		public void enteruser_Name(String s)
		{
			username = driver.findElement(By.name("Email"));
			username.sendKeys(s);
		}
		public void enterpass(String s)
		{
		password = 	driver.findElement(By.name("Password"));
		password.sendKeys(s);
		}
		public void entersub() throws IOException
		{

			sub = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
			sub.submit();
			takeSnap();
		}
		public static void takeSnap() throws IOException
		 {
		 	File scrFile;
		 	scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 	Files.copy(scrFile,new File("G:\\user\\workspace\\srikanth\\src\\test\\resources\\com\\screenshots"+i+".jpeg"));
		 	i++;
		 }
		public static void Logger(String msg) 
		{
			Logger lo=Logger.getLogger(tclogin.class.getName());
			lo.setLevel(Level.ALL);
			lo.info(msg);
		}




}
