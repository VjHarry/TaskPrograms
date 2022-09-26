package org.test.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WithoutPagefactory {
	public static WebElement user(WebDriver driver) {
		return driver.findElement(By.name("email"));
	}

	public static WebElement pass(WebDriver driver) {
		return driver.findElement(By.id("pass"));
	}
	public static WebElement clickbtn(WebDriver driver) {
		return driver.findElement(By.id("loginbutton"));
	}
}
