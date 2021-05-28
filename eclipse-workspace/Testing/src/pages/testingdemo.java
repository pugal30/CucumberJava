package pages;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	 
public class testingdemo {
	 
	 WebDriver driver;
	 
	 //Constructor that will be automatically called as soon as the object of the class is created
	 public testingdemo(WebDriver driver) {
	 this.driver=driver;
	 }
	 
	 //Locators for the page title and the logout button
	 By heading = By.xpath("//div[@class=\"main-header\"]");
	 By logoutBtn = By.id("submit");
	 
	 //Method to capture the page heading
	 public String getHeading() {
	 String head = driver.findElement(heading).getText();
	 return head;
	 }
	 
	 //Method to click on Logout button
	 public void clickLogout() {
	 driver.findElement(logoutBtn).click();
	 }
	}


