
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class list {

public static void main(String[] args) {
System.setProperty("Webdriver.chrome.driver","D:\\\\22sucg32\\\\chromedriver-win64\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///E:/list.html");
driver.manage().window().maximize();
Select col = new Select(driver.findElement(By.id("color")));
col.selectByValue("Red");
col.selectByVisibleText("Violet");
col.selectByIndex(3);
//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
System.out.println("Select value is: " + col.getFirstSelectedOption().getText()+"\n");
System.out.println("The dropdown options in the list are -");
List<WebElement> options = col.getOptions();
for(WebElement option: options)
System.out.println(option.getText());
System.out.println("\nThe Selected dropdown options in the list are -");
List<WebElement> selectedOptions = col.getAllSelectedOptions();
for(WebElement selectedOption: selectedOptions)
System.out.println(selectedOption.getText());


}
}