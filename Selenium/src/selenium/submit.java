package selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class submit {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver","D:\\22sucg32\\chromedriver-win64\\chromedriver.exe ");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize(); 
driver.get("https://www.google.com/");
System.out.println("Title : " + driver.getTitle());
WebElement g=driver.findElement(By.id("APjFqb"));
g.sendKeys("software testing");
g.submit();
 
 WebElement g1=driver.findElement(By.partialLinkText("Software Testing"));
g1.click();
System.out.println("Title : " + driver.getTitle());
 
driver.navigate().back();
driver.navigate().refresh();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
System.out.println("Title : " + driver.getTitle());
driver.navigate().back();
driver.navigate().refresh();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
System.out.println("Title : " + driver.getTitle());
driver.close();
}
}