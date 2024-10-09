package selenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;
public class enterkey {
public static void main(String[] args) {
// To Launch web browser
	 System.setProperty("Webdriver.chrome.driver","D:\\22sucg32\\chromedriver-win64\\chromedriver.exe ");
WebDriver driver=new ChromeDriver(); 
// to maximize the window
driver.manage().window().maximize(); 
driver.get("https://www.google.com/");
System.out.println("Title : " + driver.getTitle());
driver.findElement(By.id("APjFqb")).sendKeys("Software Testing", 
 Keys.ENTER);
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