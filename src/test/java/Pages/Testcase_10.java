package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Tests.login; 
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase_10 {

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
	  } 
		  catch(Exception e) 
		  { 
			  System.out.println(e.getMessage()); 
		  }
		  
	  }
	  @Test
	  public void test() throws InterruptedException
	  {
		login page=new login(driver);
		page.subscribe();
		  }
	  @AfterTest
	  public void AfterTest() throws InterruptedException 
	  { 
		  Thread.sleep(2000);
		  driver.quit();
		  }

}
