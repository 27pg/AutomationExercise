package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Tests.login;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase_6 {
	public WebDriver driver;
	  
	  @BeforeTest 
	  public void Beforetest() { 
	  try 
	  {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver(); 
	  driver.manage().window().maximize(); 
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://automationexercise.com/"); 
	  driver.findElement(By.xpath("//a[text()=\" Contact us\"]")).click();
	  Thread.sleep(1000);
	  } 
		  catch(Exception e) 
		  { 
			  System.out.println(e.getMessage()); 
		  }	  
	  }
	  @Test
	  public void test() throws InterruptedException
	  {
		  login contact=new login(driver);
		  contact.contactus_name();
		  contact.contactus_email();
		  contact.contactus_subject();
		  contact.contactus_message();
		  contact.contactus_file();
		  contact.contact_submitbtn();
		  contact.home();  
	  }  
	  @AfterTest
	  public void AfterTest() throws InterruptedException 
	  { 
		  Thread.sleep(2000);
		  driver.quit();
		  } 

}
