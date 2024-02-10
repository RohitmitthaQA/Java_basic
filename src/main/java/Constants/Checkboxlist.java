package Constants;

import java.sql.Driver;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Checkboxlist {
	
	
	public static void main(String[] args)
	{
	 System.setProperty("WebDriver.chrome.driver","d:\\chromedriver.exe");
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		
		WebDriver driver= new ChromeDriver(op);
		
		driver.get("https://www.amazon.in/");
		
		Select drlist= new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> dlistelements = drlist.getOptions();
		System.out.println(dlistelements.size());
		String dnames1 = dlistelements.get(20).getText();
		 System.out.println(dnames1);
		
		for (int i = 0; i < dlistelements.size(); i++)
		{
			System.out.print(i); 
			String dnames = dlistelements.get(i).getText();
		 System.out.println(dnames);
			
		}
		
		
		
		

	}

		
}
