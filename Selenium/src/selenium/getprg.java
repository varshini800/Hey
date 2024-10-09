package selenium;

import java.awt.*;
import org.openqa.selenium.By;
import org.openqa.selenium. WebDriver;
import org.openqa.selenium. WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
@SuppressWarnings("unused")
public class getprg {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver","D:\\22sucg32\\chromedriver-win64\\chromedriver.exe ");
WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();
driver.get("http://www.google.com/");
System.out.println("Current Website openend: " + driver.getCurrentUrl());
System.out.println("Title of the Web Page: " + driver.getTitle());
WebElement gt = driver.findElement(By.id("uname"));
System.out.println("Text of the username: " +gt.getAttribute("placeholder"));
System.out.println("Tag of the username: " +gt.getTagName());

}
} 

