package stepDefinitions;

	
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.core.logging.Logger;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver;
	String password;
	
	@Before 	public void setup()
	{
		System.out.println("Before Browser Starts");
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	     driver = new ChromeDriver();
	     //driver.get("www.google.com");
	     
	         	     
	     		
	}
	
	
	
	
	@Given("^Open Chrome browser$")
	public void open_chrome_browser() throws Throwable
	{
		System.out.println("Open the chrome browser");
		


	        driver.get("https://login.norton.com/");
	        //driver.manage().window().maximize();
	        ((JavascriptExecutor)driver).executeScript("window.resizeTo(1024, 768)");
	        

	}
	
	@When("^Click on Sign in link$")
	public void click_on_sign_in_link() throws Throwable
	{
		System.out.println("Click on Sign In Link");
		
		String s = driver.findElement(By.xpath("//*[@id=\'registerToggleButton\']")).getCssValue("color");
		
		System.out.println("Color : "+ s);
		driver.findElement(By.xpath("//*[@id=\'registerToggleButton\']")).click();
        
	      

	}

	@Then("^Create account successfully \"([^\"]*)\" and \"([^\"]*)\"$")
	public void create_account_successfully_username_and_password(String username, String password) throws Throwable
	{
        driver.findElement(By.xpath("//*[@id=\'registerEmailAddress\']")).sendKeys(username);
        
        //Wait wait = new FluentWait(driver, reference).withTimeout(timeout, SECONDS).pollingEvery(timeout, SECONDS).ignoring(Exception.class);
        
        //driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        
        
        driver.findElement(By.xpath("//*[@id=\'confirmEmailAddress\']")).sendKeys(username);
        driver.findElement(By.xpath("//*[@id=\'registerPassword\']")).sendKeys(password);
        
        driver.findElement(By.xpath("//*[@id=\'firstName\']")).sendKeys("Pugal");
        driver.findElement(By.xpath("//*[@id=\'lastName\']")).sendKeys("Murugan");
        
        driver.findElement(By.xpath("//*[@id=\'mobilePhone\']")).sendKeys("9842673768");
        
        driver.findElement(By.xpath("//*[@id=\'btn-sign-up\']")).click();
        
        if(driver.findElement(By.xpath("//*[@id=\'registerEmailAddress.errors\']")).isDisplayed())
        {
        	System.out.println("The User is Already Registered");
        }
        
        
        Actions act = new Actions(driver);
        
        act.doubleClick(driver.findElement(By.xpath("//*[@id=\'registerEmailAddress.errors\']")));
        

        
		System.out.println("Account Created Successfully");
		
		
		
	}
	
	@Given("^Launch the application$")
	public void Launch_the_application() throws Throwable
	{
		System.out.println("Launch the Application");
	}
	
	@When("^Login to the Application$")
	public void Login_to_the_Application() throws Throwable
	{
		System.out.println("Login to the Application");
	}
	
	@Then("^User should be able login successfully$")
	public void User_should_be_able_login_successfully() throws Throwable
	{
		System.out.println("User should be able login successfully");
	}
	
	@After 
	public void cleanUp(){ 
		System.out.println("After Browser Closes");
	      driver.close();
	}
}
