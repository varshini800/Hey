package selenium;

import java.awt.*;
import org.openqa.selenium.By;
import org.openqa.selenium. WebDriver;
import org.openqa.selenium. WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
@SuppressWarnings("unused")
public class get {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver","D:\\22sucg32\\chromedriver-win64\\chromedriver.exe ");
WebDriver driver=new ChromeDriver();
System.out.println("Browser opened");
driver.get("https://www.google.com/");
driver.manage().window().maximize();
//System.out.println("Current Website openend: " + driver.getCurrentUrl());
System.out.println("Title of the Web Page: " + driver.getTitle());
System.out.println("Browser closed");
}
} 
