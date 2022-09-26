package org.test.pom;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class POMRunClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login/");

// POM Without using PageFactory
		
	/*	WithoutPagefactory.user(driver).sendKeys("vjharry1703@gmail.com");
		WithoutPagefactory.pass(driver).sendKeys("123456789");
		WithoutPagefactory.clickbtn(driver).click();  */
		
// POM With using PageFactory
		
		PageFactory.initElements(driver,WithPagefactory.class);
		
		WithPagefactory.user.sendKeys("vjharry1703@gmail.com");
		WithPagefactory.pass.sendKeys("12345678");
		WithPagefactory.btn.click();
		
		Thread.sleep(3000);
		driver.quit();
}}
