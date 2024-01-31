package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Testcase_5;
import Tests.login;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase_5 {
	public WebDriver driver;
	  @BeforeTest 
	  public void Beforetest() { 
	  try 
	  {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver(); 
	  driver.manage().window().maximize(); 
	  Thread.sleep(3000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://automationexercise.com/"); 
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
	  Thread.sleep(2000);
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
		  signup1.signupName();
		  signup1.signupemail();
		  signup1.signbtn();
	  }
	  @AfterTest 
	  public void AfterTest() throws InterruptedException 
	  { 
		  Thread.sleep(2000);
		  driver.quit();
		  }
}
