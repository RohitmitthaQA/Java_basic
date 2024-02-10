package Test;

import org.openqa.selenium.support.PageFactory;

import Constants.Constants;
import Library.Orangehrm_details;

public class OrangehrmTest extends Constants {

	public static void main(String[] args) throws Throwable 
	{
		Constants.lunchapp("http://orangehrm.qedgetech.com");
		Thread.sleep(5);
	 Orangehrm_details ohrm= PageFactory.initElements(driver, Orangehrm_details.class);
	 ohrm.login("Admin", "Qedge123!@#");
	 
		
		
		
	}

}
