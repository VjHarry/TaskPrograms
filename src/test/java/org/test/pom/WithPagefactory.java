package org.test.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WithPagefactory {
@FindBy(id="email")
	public static WebElement user;
@FindBy(id="pass")
	public static WebElement pass;
@FindBy(xpath="//button[@type='submit']")
	public static WebElement btn;
}
