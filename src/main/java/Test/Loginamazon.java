package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Constants.Constants;
import Library.AmazonLogin;

public class Loginamazon extends Constants{
	
	
	public static void main(String[] args) throws Throwable 
	{
		
		Constants.lunchapp("https://www.amazon.in/");
		Thread.sleep(5);
		 driver.findElement(By.xpath("//a[@href='https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0']")).click();
	      
			/*
			 * AmazonLogin lp= new AmazonLogin(); Thread.sleep(3) ;
			 * lp.Login("Rohitmittha93@gmail.com","Rm@12345");
			 * 
			 * lp.amazonradiobutton(); driver.close(); lp.amazonmobilecheckbox();
			 */
      
     // lp.bestsacller();
      
      //lp.mobheadset();
      
	}

}
