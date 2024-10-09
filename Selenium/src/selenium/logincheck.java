package selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class logincheck {
public static void main(String[] args) {
	    System.setProperty("Webdriver.chrome.driver","D:\\22sucg32\\chromedriver-win64\\chromedriver.exe ");
			WebDriver driver=new ChromeDriver();
			driver.get("file:///D:/22sucg32/success.html");
			driver.manage().window().maximize();
			WebElement un = driver.findElement(By.id("uname"));
			WebElement pass = driver.findElement(By.id("psw"));
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			un.sendKeys("sujitha@gmail.com");
			pass.sendKeys("Happy");
			var un1=un.getAttribute("value");
			var pass1=pass.getAttribute("value");
			System.out.println("Username passed in text box : "+un1);
			System.out.println("Password passed in text box : "+pass1);
			if(un1.contentEquals("sujitha@gmail.com") && pass1.contentEquals("Happy"))
			{
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 WebElement login = driver.findElement(By.id("SubmitLogin"));
			 login.click();
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 System.out.println("Match Occurs - Login Done with Click");
			 }
			else
			 {
			 System.out.println("Not Match - Username or Password Incorrect");
			 }
			driver.close();
}
}