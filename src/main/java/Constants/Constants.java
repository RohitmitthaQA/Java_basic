package Constants;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
 

public class Constants 
{
	public static WebDriver driver;
public static String url;
	
	public static void lunchapp(String url)		
	{
		System.setProperty("webdriver.chromedriver.driver","d:\\chromedriver.exe");
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		
		/*ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		*/		
		driver = new ChromeDriver(op);
		driver.get(url);
		
	}
	
	public void closebrowser()
	{
			driver.close();
	}

	
}
