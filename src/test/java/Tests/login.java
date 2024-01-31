package Tests;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {
WebDriver driver;
	
	public login( WebDriver d) {
		// TODO Auto-generated constructor stub
		this.driver =d;
	}

	public void signupName()
	{	
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='name']"))).sendKeys("poonam");
	}
	public void signupemail()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-qa='signup-email']"))).sendKeys("poonamg@hotmail.com");
	}
	public void signbtn()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Signup']"))).click();
	}
	public void title() 
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='id_gender2']"))).click();
	}
	public void signuppassword()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']"))).sendKeys("poonam@123");
	}
	public void dob()
	{
		try {
			WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)", "");		
			Select day=new Select(driver.findElement(By.xpath("//select[@id='days']")));
			day.selectByVisibleText("22");
			Select month=new Select(driver.findElement(By.xpath("//select[@id='months']")));
			month.selectByVisibleText("May");
			Select year=new Select(driver.findElement(By.xpath("//select[@id='years']")));
			year.selectByVisibleText("1990");
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='newsletter']"))).click();
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='optin']"))).click();
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	public void firstname()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='first_name']"))).sendKeys("Poonam");
	}
	public void lastname()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='last_name']"))).sendKeys("Gade");
	}
	public void company()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(250,450)", "");	
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='company']"))).sendKeys("ExcelR");
	}
	public void address()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='address1']"))).sendKeys("ABC Road");
	}
	public void address2()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='address2']"))).sendKeys("Pune");
	}
	public void country()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		WebElement dropdown=w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='country']")));	
		Select con=new Select(dropdown);
		con.selectByVisibleText("India");
	}
	public void state()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='state']"))).sendKeys("Maharashtra");
	}
	public void city()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='city']"))).sendKeys("Pune");
	}
	public void zipcode()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='zipcode']"))).sendKeys("411045");
	}
	public void mobile()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='mobile_number']"))).sendKeys("9876543210");
	}
	public void createacc()
	{
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Create Account']"))).click();
	}
	public void continue_acc()
	{
		//driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-primary']"))).click();
	}
	public void delete_acc()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/delete_account']"))).click();
	}
	public void continue_acc1()
	{
		//driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-primary']"))).click();
	}
	public void loginemail()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-qa='login-email']"))).sendKeys("poonam@hotmail.com");
	}
	public void loginpassword()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-qa='login-password']"))).sendKeys("poonam@123");
	}
	public void loginbtn()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Login']"))).click();
	}
	public void loginemail1() //incorrect email
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-qa='login-email']"))).sendKeys("poonam22@hotmail.com");
	}
	public void logout()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' Logout']"))).click();
	}
	public void contactus_name()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-qa='name']"))).sendKeys("Poonam");
	}
	public void contactus_email()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-qa='email']"))).sendKeys("poonamg@hotmail.com");
	}
	public void contactus_subject()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-qa='subject']"))).sendKeys("Automation");
	}
	public void contactus_message()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='message']"))).sendKeys("Automated testing is the application of software tools to automate a\"\r\n"
				+ "				+ \" human-driven manual process of reviewing and validating a software product.");
		
	}
	public void contactus_file()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		WebElement browse = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='upload_file']")));
		browse.sendKeys("C:\\Users\\yoges\\Downloads\\Suggestions.txt");
	}
	public void contact_submitbtn()
	{try
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='submit']"))).click();
		Alert a=driver.switchTo().alert();		
		a.accept();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	}
	public void home()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Home']"))).click();
	}
	public void testcase_page() throws InterruptedException
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' Test Cases']"))).click();
		Thread.sleep(3000);
	}
	public void product() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(150,450)", "");	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")).click();
	}
	public void product_search()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");	
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='search_product']"))).sendKeys("jeans");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='submit_search']"))).click();
		js.executeScript("window.scrollBy(150,450)", "");	
	}
	public void subscribe() throws InterruptedException
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		js.executeScript("window.scrollBy(0,500)", "");	
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='susbscribe_email']"))).sendKeys("poonamgade@hotmail.com");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='subscribe']"))).click();
	}
	public void addToCart() throws InterruptedException 
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(50,350)", "");	
		
		Actions a=new Actions(driver);
		
		WebElement mouseHover1 = driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[1]//div[1]"));//first item
	 	a.moveToElement(mouseHover1).build().perform();
	 	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]"))).click(); //add to cart
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-content']//div[3]//button"))).click();//continue
	 	
		WebElement mouseHover2 =driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']//div[3]//div[1]//div[1]//div[1]"));//second item
	 	a.moveToElement(mouseHover2).build().perform();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/a[1]"))).click();//add to cart
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-content']//div[3]//button"))).click();//continue
		Thread.sleep(1000);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-content']//div[2]//p[2]//u"))).click(); //view cart
	 
	} 
	public void addToCart_quantity() throws InterruptedException
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(250,500)", "");	
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-sm-9 padding-right']//div[5]//div[1]//div[2]//ul[1]//li[1]//a[1]"))).click(); //third item click
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='quantity']"))).clear();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='quantity']"))).sendKeys("4");    //increase quantity 4
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-default cart']"))).click();  //add to cart
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-content']//div[2]//p[2]//u"))).click();//view cart

	}

public void placeOrder_2item() throws InterruptedException {
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(250,500)", "");
		Actions a = new Actions(driver);
		/*a.moveToElement(mouseHover1).build().perform();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[3]//div[1]//div[1]//div[2]//div[1]//a[1]")))
				.click();// 2nd item add to cart
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-content']//div[2]//p[2]//u"))).click();// view cart
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-default check_out']"))).click(); // proceed to checkout button
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-content']//p[2]//a//u"))).click();// register/login button
	*/
		WebElement mouseHover2 =driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']//div[3]//div[1]//div[1]//div[1]"));//second item
	 	a.moveToElement(mouseHover2).build().perform();
	 	Thread.sleep(1000);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/a[1]"))).click();//add to cart
		Thread.sleep(1000);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-content']//div[2]//p[2]//u"))).click(); //view cart
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-default check_out']"))).click(); // proceed to checkout button
		
		js.executeScript("window.scrollBy(350,500)", "");
	} 

	public void checkCart() throws InterruptedException {
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(350,500)", "");
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//u[normalize-space()='View Cart']"))).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@class='form-control']"))).sendKeys("Please Call ,before you delivered the Package.Dont handover to anybody,Thank you !!!");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-default check_out']"))).click();  //proceed to checkout button
		Thread.sleep(1000);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/payment']"))).click();  //place order button
		Thread.sleep(2000);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='name_on_card']"))).sendKeys("Poonam Gade");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='card_number']"))).sendKeys("4444333322221111");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='cvc']"))).sendKeys("123");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='expiry_month']"))).sendKeys("12");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='expiry_year']"))).sendKeys("2027");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='submit']"))).click();
	}
	public void removeCart() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(250,500)", "");
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Add to cart')][1]"))).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Your product has been added to cart.')]/..//a[@href='/view_cart']"))).click();// view cart
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@class='cart_delete']/a"))).click();// delete cart
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text(),'Cart is empty!')]"))).click();// delete cart
	}

	public void verify() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//a[@href='#Women']")).click();
		driver.findElement(By.xpath("//a[@href='/category_products/1']")).click();
		driver.findElement(By.xpath("//h2[contains(text(),'Women - Dress Products')]"));
		driver.findElement(By.xpath("//a[@href='#Men']")).click();
		driver.findElement(By.xpath("//a[@href='/category_products/3']")).click();
		driver.findElement(By.xpath("//h2[contains(text(),'Men - Tshirts Products')]"));
	}

	public void viewBrand() throws InterruptedException {
		driver.findElement(By.xpath("//a[@href='/brand_products/Polo']")).click();
		driver.findElement(By.xpath("//h2[contains(text(),'Brand - Polo Products')]"));
		driver.findElement(By.xpath("//a[@href='/brand_products/H&M']")).click();
		driver.findElement(By.xpath("//h2[contains(text(),'Brand - H&M Products')]"));
	}
		
	public void searchVerify() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='search_product']")).sendKeys("Blue Top");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//button[@id='submit_search']")).click();
		js.executeScript("window.scrollBy(250,500)", "");
		driver.findElement(By.xpath("//a[contains(text(), 'Add to cart')][1]")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Your product has been added to cart.')]/..//a[@href='/view_cart']")).click();// view cart
		driver.findElement(By.xpath("//a[contains(text(),'Blue Top')]"));
		driver.findElement(By.xpath("//a[@href='/login']")).click();
	
	}
	
	
	
	
}
