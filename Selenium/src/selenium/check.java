package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class check {
public static void main(String[] args) {
System.setProperty("Webdriver.chrome.driver","D:\\22sucg32\\chromedriver-win64\\chromedriver.exe ");
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/22sucg32/check.html");
driver.manage().window().maximize();
WebElement h1 = driver.findElement(By.id("h1"));
h1.click();
WebElement h2 = driver.findElement(By.id("h2"));
WebElement h3 = driver.findElement(By.id("h3"));
h3.click();
System.out.println("Hobbies"+"\n"+"*******"+"\n"+"Reading Book Button selected --->"+h1.isSelected());
System.out.println("Watching Movies Button selected --->"+h2.isSelected());
System.out.println("Playing Cricket Button selected --->"+h3.isSelected());
if (h1.isSelected() && h2.isSelected())
{
System.out.println("Reading Book and Watching Movies is Selected");
}
else if (h1.isSelected() && h3.isSelected())
{
System.out.println("Reading Book and Playing Cricket is Selected");
}
else if (h2.isSelected() && h3.isSelected())
{
System.out.println("Watching Movies and Playing Cricket is Selected");
}
else if (h1.isSelected())
{
System.out.println("Reading Book is Selected");
}
else if (h2.isSelected())
{
System.out.println("Watching Movies is Selected");
}
else
{
System.out.println("Playing Cricket is Selected");
}
System.out.println("\n"+"Food Details"+"\n"+"*************");
WebElement veg = driver.findElement(By.id("v"));
veg.click();
WebElement nv = driver.findElement(By.id("nv"));
System.out.println("Vegeterian Button selected ---->"+veg.isSelected());
System.out.println("Non Vegeterian Button selected---> "+nv.isSelected());
if (veg.isSelected() && nv.isSelected())
{
System.out.println("Veg and Non Veg is Selected");
}
else if (veg.isSelected())
{
System.out.println("Vegeterian is Selected");
}
else if (nv.isSelected())
{
System.out.println("Non Vegeterain is Selected");
}
else
{
System.out.println("Nothing is selected");
}
}
}