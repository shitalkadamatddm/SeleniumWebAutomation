import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser 
{
	public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	//method to get pagesource of webpage
	//System.out.println(driver.getPageSource());
	driver.navigate().to("https://www.skyscanner.net/");
	//driver.navigate().back();
	//driver.navigate().forward();
	driver.findElement(By.className("login")).click();
	//driver.close();
Testcase1 t = new Testcase1();
t.ExecutePrint();
System.out.println(t.ReturingString());
System.out.println(t.ReturnInteger());
}
}
