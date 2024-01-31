package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Tests.login;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase_18 {

	public WebDriver driver;

	@BeforeTest
	public void Beforetest() {
		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://automationexercise.com/");
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Test
	public void test() throws InterruptedException {
		login viewCategoryProducts = new login(driver);
		viewCategoryProducts.verify();
	}

	@AfterTest
	public void AfterTest() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}
}
