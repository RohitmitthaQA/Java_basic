package Test;

import java.util.Set;

import Constants.Constants;

public class Gmaillogin extends Constants
{
	public void str() 
	 {
   Set<String> all_windows = driver.getWindowHandles() ;
   System.out.println();
   
   Object[] windows = all_windows.toArray();
   String window1= windows[0].toString();
   
   driver.switchTo().window(window1);
   System.out.println(driver.getTitle());
	 }
 	
}
