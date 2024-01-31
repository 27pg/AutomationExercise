package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Tests.login;
import Pages.Testcase_1;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase_14 {

	  public WebDriver driver;
	  
	  @BeforeTest 
	  public void Beforetest() { 
	  try 
	  {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver(); 
	  driver.manage().window().maximize(); 
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://automationexercise.com/"); 
	  driver.findElement(By.xpath("//a[@href='/products']")).click();
	  } 
		  catch(Exception e) 
		  { 
			  System.out.println(e.getMessage()); 
		  }
		  
	  }
	  @Test
	  public void test() throws InterruptedException
	  {
		  login signup1=new login(driver);
		  signup1.placeOrder_2item();	  
		  signup1.signupName();
		  signup1.signupemail(); 
		  signup1.signbtn(); 
		  signup1.title(); 
		  signup1.signuppassword();
		  signup1.dob();
		  signup1.firstname();
		  signup1.lastname();
		  signup1.company();
		  signup1.address();
		  signup1.address2();
		  signup1.country();
		  signup1.state();
		  signup1.city();
		  signup1.zipcode();
		  signup1.mobile();
		  signup1.createacc();		//create account
		  signup1.continue_acc();		//create account continue
		  Thread.sleep(3000);
		  signup1.checkCart();
		  Thread.sleep(3000);
		  signup1.delete_acc();   //delete account
		  signup1.continue_acc(); //  delete continue 
		   
	  }
	  @AfterTest
	  public void AfterTest() throws InterruptedException 
	  { 
		  Thread.sleep(2000);
		  driver.quit();
		  }

}
