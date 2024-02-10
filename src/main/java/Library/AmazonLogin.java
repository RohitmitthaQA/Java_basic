package Library;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Constants.Constants;

public class AmazonLogin extends Constants {

	public void Login(String id, String pwd) throws Throwable

	{
		driver.findElement(By.id("ap_email")).sendKeys(id);
		driver.findElement(By.id("continue")).click();

		driver.findElement(By.id("ap_password")).sendKeys(pwd);
		driver.findElement(By.id("signInSubmit")).click();

	}

	public void amazonradiobutton() throws Throwable {
		WebElement radio;
		
		driver.findElement(By.id("icp-nav-flyout")).click();
		
		Thread.sleep(3);
		
		List<WebElement> radiobuts = driver.findElements(By.xpath("//input[@type='radio']"));

		System.out.println(radiobuts.size());
		
	List<WebElement>	rdlist = driver.findElements(By.xpath("//i[@class='a-icon a-icon-radio']"));
	rdlist.get(1).click();
		//radiobuts.get(1).click();
		Thread.sleep(5);
		
		driver.findElement(By.id("icp-save-button")).click();
		
		Thread.sleep(5);
		
		
		for(int i =0;i<radiobuts.size();i++)
		{
			String rbname = radiobuts.get(i).getAttribute("value");
			System.out.println(rbname);
		}

	}
	
	public void amazonmobilecheckbox() throws Throwable
	{
		driver.findElement(By.xpath("//a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']")).click();
		Thread.sleep(5);
		
		driver.findElement(By.xpath("//html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[5]/ul/li[1]/span/a/div")).click();
		
	}
	
	public void bestsacller() throws Throwable
	{
		
		driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']")).click();
		
	WebElement dlist= driver.findElement(By.id("anonCarousel1"));
List<WebElement>	dlist1=driver.findElements(By.tagName("a"));
	System.out.println(dlist1.size());
	
	
	/*
	 * // for(int i=0;i<dlist1.size();i++) // { // // String links =
	 * dlist1.get(i).getText(); // String
	 * linkurl=dlist1.get(i).getAttribute("href"); // System.out.println(links
	 * +"  :  "+linkurl); // // }
	 */	
	Thread.sleep(3);
	
	driver.findElement(By.partialLinkText("/Vacalvers-Multicolor-Bracelet-Chocolate-K1_300_P32")).click();
	//<a class="a-link-normal" href="/Vacalvers-Multicolor-Bracelet-Chocolate-K1_300_P32/dp/B09BFRKWJB/ref=zg_bs_c_grocery_sccl_1/257-0097102-0388601?pd_rd_w=0buie&amp;content-id=amzn1.sym.7dd29d48-66c1-486c-967d-2ed40101f2ea&amp;pf_rd_p=7dd29d48-66c1-486c-967d-2ed40101f2ea&amp;pf_rd_r=37FNX2QSD1E9H9JFDB41&amp;pd_rd_wg=WGygn&amp;pd_rd_r=9850d2eb-6227-4836-aa1b-d8f91ff8896f&amp;pd_rd_i=B09BFRKWJB&amp;psc=1" role="link"><span><div class="p13n-sc-truncate-desktop-type2  p13n-sc-truncated" aria-hidden="true" data-rows="4" title="Vacalvers Multicolor Bracelet/Rakhi for Brother, Bhaiya, Bhabhi, Chocolate Peanuts 32gm &amp; Pooja Thali, Rakhi with card and chocolate,chocolate gift pack,bracelet for men (K1_501_P32+DS)">Vacalvers Multicolor Bracelet/Rakhi for Brother, Bhaiya, Bhabhi, Chocolate Peanuts 32gm &amp; Pooja Thali, Rakhi with card and…</div></span></a>
		
	}

	public void mobheadset() throws Throwable
	{
		driver.findElement(By.xpath("//a[text()='Today's Deals']")).click();
		
		
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]"))).click();
		act.build().perform();
		
		Thread.sleep(3);
		
		driver.findElement(By.xpath("//a[@href='/b?node=1389402031&ref_=MH1_Accessories']")).click();
		
		
		
	}
	
	
	
	
	

}
