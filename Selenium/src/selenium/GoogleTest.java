package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("Webdriver.chrome.driver","D:\\22sucg32\\chromedriver-win64\\chromedriver.exe ");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize(); 
			System.out.println("Browser Opened");
			driver.get("https://www.google.com/search?q=gmail&oq=gmail&gs_lcrp=EgZjaHJvbWUyBggAEEUYOdIBCTM4MTNqMGoxNagCALACAQ&sourceid=chrome&ie=UTF-8");
			System.out.println("Title of my webpage: "+driver.getTitle());
			JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,4550)");
			js.executeScript("alert('welcome to Gmail');");
			System.out.println("Browser Closed");
			//driver.close();
			
	}

}
