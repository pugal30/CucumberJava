package Jenkins_Sample;
 
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Jenkins {
 
@Test
 
public static void testJenkins() throws IOException
{
		
	


	WebDriver driver = new ChromeDriver();	
	driver.get("http://priodsdevint-internal.vndev.nonprd.gsi.local/Index.aspx");
	String expectedUrl = "http://priodsdevint-internal.vndev.nonprd.gsi.local/Index.aspx";
	driver.manage().window().maximize();
	
	Assert.assertEquals(expectedUrl,  driver.getCurrentUrl());
	
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	
	boolean text = driver.findElement(By.xpath("//*[@id='Logon']/form/table/tbody/tr[1]/td[2]/input")).isEnabled();
	
	System.out.println(text);
	
	String s = driver.findElement(By.xpath("//*[@id='Logon']/form/table/tbody/tr[1]/td[1]")).getText();
	System.out.println(s);
	
		
	String title = driver.getTitle( );
	System.out.println(title);
	File shot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(shot, new File("C:\\Personal\\shot1.jpg"));
	
	Actions actions = new Actions(driver);
	WebElement mouseHover = driver.findElement(By.xpath("//*[@id=Logon']/form/table/tbody/tr[2]/td[2]/input"));
	actions.moveToElement(mouseHover).perform();
	


	
}


}


