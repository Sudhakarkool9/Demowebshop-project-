package tcpackage;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import org.testng.Reporter;
public class addcard {
	
 
	  Reporter r = new Reporter();
	  static WebDriver driver;
	  static int i=1;
	  WebElement link,link1,img,add,sh,ch,checkout,gu,deta;
	            @SuppressWarnings("static-access")
				@Test
public void launch() throws IOException
{
	    	   
	  link =driver.findElement(By.partialLinkText("Computers"));
		link.click();
		r.log("sucessfully selected computer categiry ......");
		
		 }
   
public addcard(WebDriver driver)
{
	this.driver=driver;
}
		
@SuppressWarnings("static-access")
public void click_desktops() throws IOException {
	         link1=driver.findElement(By.partialLinkText("Desktops"));
	             link1.click();
	             r.log("sucessfully selected desktop product .......");
	             
}
public void click_img() throws IOException {
	        img=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[1]/a/img"));
	          img.click();
	          takesnap();
	            System.out.println("click image..");
	         
}
@SuppressWarnings("static-access")
public void addcard() throws IOException 
{
	     add = driver.findElement(By.id("add-to-cart-button-72"));
	       add.click();
	        System.out.println("addcart");
	        r.log("sucessfully product is added to cart...");
	        
}
@SuppressWarnings("static-access")
public void shoppinglink() 
{
	        sh=driver.findElement(By.partialLinkText("Shopping cart"));
	          sh.click();
	            System.out.println("shipping");
	            r.log("sucessfully shipped to cart...");
	            
}
@SuppressWarnings("static-access")
public void checkbox() {
	   driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();
	           System.out.println("checkbox");
	       r.log("sucessfully checked..");
}
@SuppressWarnings("static-access")
public void checkout() throws IOException {
	       checkout=driver.findElement(By.xpath("//button[@id='checkout']"));
	         checkout.click();
	         r.log("sucessfully checkout......");
	         takesnap();
	         System.out.println("checkout");
}                                                                

 @SuppressWarnings("static-access")
public void building_address() throws IOException 
 {
	 Select s=new Select(driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]")));
       s.selectByVisibleText("India");

 	  deta=driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_City\"]"));
	    deta.sendKeys("nellore");
	    deta=driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address1\"]"));
	    deta.sendKeys("nagendhra,nager");
	    deta=driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address2\"]"));
	    deta.sendKeys("nagendhra,nager");
	    
	       deta=driver.findElement(By.name("BillingNewAddress.ZipPostalCode"));
	           deta.sendKeys("516360");
	              deta=driver.findElement(By.name("BillingNewAddress.PhoneNumber"));
	                 deta.sendKeys("8171234569");
	                 takesnap();
	                 System.out.println("building sucessful");
	                 r.log("sucessfully completed building adress...........");
	                 deta = driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input"));
	                 deta.click();
 }
	                 @SuppressWarnings("static-access")
					public void ship()
	                 {
	                 deta = driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input"));
	                 deta.click();
	                 r.log("shipping address......");
	                 }
	                 
	                 @SuppressWarnings("static-access")
					public void sm()
	                 {
	                 deta = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input"));
	                 deta.click();
	                 r.log("sucessfully completed shipping method...");
	                 }
	                 
	                 //continue cod
	                 @SuppressWarnings("static-access")
					public void cod() {
	                	 deta = driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input"));
	                	 deta.click();
	                	 r.log("sucessfully completed payment method...");
	                 }
	                 @SuppressWarnings("static-access")
					public void payinfo()
	                 {
                   
	                 deta = driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input"));
	                 deta.click();
	                 r.log("payment information....");
	                 }
	               //confirm order
	                 @SuppressWarnings("static-access")
					public void conforder()
	                 {
	                 
	                 deta = driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input"));
	                 deta.click();
	                 r.log("sucessfully completed conformorder...");
	                 }
	                 //Thank you
	                 @SuppressWarnings("static-access")
					public void thank() throws IOException
	                 {
	              
	                 deta = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input"));
	                 deta.click();
	                 r.log("Thank You....");
	                 takesnap();
	                 
	                 }        
	                 
	                 
	                 
	                 
	                 
	                 
 
	
	    @SuppressWarnings("static-access")
		public void logout1()
	    {
 driver.findElement(By.linkText("Log out")).click();
 driver.quit();
 r.log("sucessfully logout..........");
	    }
	                public  static void  takesnap() throws IOException {
	               	   File scrFile;
	               		scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	               		Files.copy(scrFile,new File("G:\\user\\workspace\\project\\src\\test\\resources\\com\\screenshots"+i+".png"));
	               		i++;
	               	     }
	                
	                
 }   	                   
	   	                   
 
 