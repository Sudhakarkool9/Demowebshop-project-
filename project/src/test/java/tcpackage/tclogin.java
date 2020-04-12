package tcpackage;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.login;


import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;


import org.apache.log4j.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class tclogin
{
login lo;

	static WebDriver driver;
	 static int i=1;
	 Reporter r = new Reporter();
	 addcard d;
	 static Logger log = Logger.getLogger(tcregister.class.getName());
  @SuppressWarnings("static-access")
@Test
	  @When("^the user enters the valid username and valid password and click submit$")
	  public void the_user_enters_the_valid_username_and_valid_password_and_click_submit() throws 
	  Throwable
	  { 
		lo.enteruser_Name("car110123@gmail.com");
		login.Logger("enter email");
		lo.enterpass("SRI@123");
		login.Logger("enter password");
		lo.entersub();
		takesnap();
		r.log("sucessfully navigate to home page ....");

		
	}
  @SuppressWarnings("static-access")
@BeforeTest
 @Given("^open application and click on Login link$")
public void open_application_and_click_on_Login_link() throws Throwable {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("http://demowebshop.tricentis.com");
	   login.Logger("opening beowser");
		lo = new login(driver);
		lo.click_login();
		takesnap();
	     r.log("sucessfully opend loginpage....");
		
	     login.Logger("submit is sucessfully completed");
		}
 @AfterTest
  @Then("^the system naviagates to HOME page$")
	  public void the_system_naviagates_to_HOME_page() throws Throwable
 {    
	 
		System.out.println("user sucessfully navigates to home page..........");
		addcard d=new addcard(driver);
        d.launch();
        
        d.click_desktops();
        d.click_img();
        d.addcard();
        Thread.sleep(5000);

        d.shoppinglink();
        Thread.sleep(3000);
        d.checkbox();
        d.checkout();
        Thread.sleep(3000);
      d.building_address();
      Thread.sleep(3000);
      d.ship();
     Thread.sleep(5000);
     d.sm();
     Thread.sleep(5000);
     d.cod();
     Thread.sleep(5000);
     d.payinfo();
     Thread.sleep(5000);
     d.conforder();
     Thread.sleep(5000);
     d.thank();
     Thread.sleep(5000);
      d.logout1(); 



 }
 public  static void  takesnap() throws IOException {
	   File scrFile;
		scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile,new File("G:\\user\\workspace\\project\\src\\test\\resources\\com\\screenshots"+i+".png"));
		i++;
	     }
 
}
