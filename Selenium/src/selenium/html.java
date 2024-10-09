package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class html
{
@SuppressWarnings("deprecation")
public static void main(String[] args)
{
	
System.setProperty("Webdriver.chrome.driver","D:\\22sucg32\\chromedriver-win64\\chromedriver.exe ");
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
driver.get("file:///D:/22sucg32/index.html");
WebElement a=driver.findElement(By.linkText("ALPHABETS"));
a.click();
driver.navigate().back();
driver.navigate().refresh();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
WebElement b=driver.findElement(By.linkText("NUMBERS"));
b.click();
driver.navigate().back();
driver.navigate().refresh();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
WebElement c=driver.findElement(By.linkText("COLORS"));
c.click();
driver.navigate().back();
driver.navigate().refresh();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
WebElement d=driver.findElement(By.partialLinkText("SHAPES"));
d.click();
driver.navigate().back();
driver.navigate().refresh();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//driver.close();
}

}
