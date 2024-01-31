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

public class Testcase_16 {
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
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[@href='/login']")).click();
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
		  signup1.loginemail();
		  signup1.loginpassword();
		  signup1.loginbtn();	//login
		  driver.findElement(By.xpath("//a[@href='/products']")).click();
		  
		  signup1.placeOrder_2item();
		  
		  signup1.checkCart();
		
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
