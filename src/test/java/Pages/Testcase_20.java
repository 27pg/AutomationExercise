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

public class Testcase_20 {
	public WebDriver driver;

	@BeforeTest
	public void Beforetest() {
		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://automationexercise.com/");
			driver.findElement(By.xpath("//a[@href='/products']")).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Test
	public void test() throws InterruptedException {
		login search = new login(driver);
		search.searchVerify();
		search.loginemail();
		search.loginpassword();
		search.loginbtn();
		driver.findElement(By.xpath("//a[@href='/view_cart']")).click();
		
	}

	@AfterTest
	public void AfterTest() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}

}
