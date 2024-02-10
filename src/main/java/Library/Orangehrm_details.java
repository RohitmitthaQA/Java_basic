package Library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.common.annotations.VisibleForTesting;

import Constants.Constants;

public class Orangehrm_details extends Constants 
{
    @FindBy(id="divUsername")WebElement uid;
    @FindBy(id= "divPassword") WebElement pwd;
    
    @FindBy(xpath="//*[@id='btnLogin']") WebElement login;
    
   public void login(String username,String Password) throws Throwable
   {
	   Thread.sleep(5);
	   uid.sendKeys(username);;
	   pwd.sendKeys(Password);
	   login.click();
	   
	   
   }
   
	
	
	
	
}
