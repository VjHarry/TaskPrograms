package org.test.tasks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Verify;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 {
	public static void main(String[] arguments ) throws Exception {
//		System.setProperty("webdriver.chrome.driver", null);
//		Webdriver driver= new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.loganair.co.uk/");	
		
		Select ss=new Select(driver.findElement(By.cssSelector("select#JourneyType")));
		ss.selectByValue("0");
				
		driver.findElement(By.cssSelector("input#OutboundDate")).click();
		List<WebElement> ee = driver.findElements(By.cssSelector("div.qs-datepicker-container"));
		
		String txt=driver.findElement(By.xpath("//span[contains(text(),'Aug')]")).getText();
		String txt1=driver.findElement(By.xpath("//span[contains(text(),'2022')]")).getText();
		 Scanner st=new Scanner(System.in);  System.out.println("enter month :");
		 String month = st.next();	System.out.println("enter year :");
		 String year = st.next();
		 WebElement exp=driver.findElement(By.xpath("//span[contains(text(),'26')]"));
		 WebDriverWait w=new WebDriverWait(driver,10);			
			w.until(ExpectedConditions.elementToBeClickable(exp));
		if(txt.equals(month) && txt1.equals(year)) {		
					exp.click();
		}else {
				System.out.println("not found");
			}
//		Actions aa=new Actions(driver);
//		aa.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		
		
		System.out.println("Done");
	//	driver.quit();				
	}
}
