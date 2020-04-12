package tcpackage;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.registrationPage;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class tcregister {
	Reporter r= new Reporter();
	registrationPage register;
	static WebDriver driver;
	static int i=1;
	
  @SuppressWarnings("static-access")
@Test
 @When("^the user enter details and click on register$")
	  public void the_user_enter_details_and_click_on_register() throws Throwable
  {
	  
	     register.entergender();
		register.enterFirstname("komaragiri");
		registrationPage.Logger("entered Firstname");
		register.enterlastname("srikanth");
		registrationPage.Logger("entered lastname");
		register.enteremail("car110123@gmail.com");
		registrationPage.Logger("entered email");
		register.enterpassword("SRI@123");
		register.Logger("entered password");
		register.enterconfirmpassword("SRI@123");

		r.log("sucessfully  enterd registerd deatils ......");

		}
@SuppressWarnings({ "static-access" })
@BeforeTest
  @Given("^open application and click on register link$")
	  public void open_application_and_click_on_register_link() throws Throwable 
  {

	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com");
	 
		 r.log("sucessfully browser is opend..");


		 registrationPage.Logger("opening browser");

     register  = new registrationPage(driver);
		register.click_register();
		takeSnap();
		
		r.log("sucessfully  registrationPage is opend......");
		
		registrationPage.Logger("registerpage opend.....");


		
	  	  }
 @SuppressWarnings("static-access")
@AfterTest
  @Then("^the system navigates to login page$")
  public void the_system_navigates_to_login_page() throws Throwable 
  {
	  register.entersubmit();
		registrationPage.Logger("submit is sucessfully completed");
	  r.log("sucessfully submited....");
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input")).click();
	
	 
  }
 public static void takeSnap() throws IOException
 {
 	File scrFile;
 	scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 	Files.copy(scrFile,new File("G:\\user\\workspace\\project\\src\\test\\resources\\com\\screenshots"+i+".png"));
 	i++;
 }

}
