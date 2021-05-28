package SECTIONTWO;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class HandleTommarowDate {
	public static void main(String[] args) {
		WebDriver driver = new OperaDriver();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		String CURRENTDATE = "//a[contains(@class,'highlight ')]";
		String allDay = CURRENTDATE +"/../following-sibling::td";
		List<WebElement> allDays = driver.findElements(By.xpath(allDay));
	
		
		
	if(allDays.size() == 0)
		{
			String nextweek =  CURRENTDATE + "/../../following-sibling::tr";
			List<WebElement> nextweek1 = driver.findElements(By.xpath(nextweek));
	
		   if(nextweek1.size() == 0)
		              {
			              String nmt =  CURRENTDATE + "/../../../../../following-sibling::div[1]/table/tbody/tr/td/a";
			              driver.findElement(By.xpath(nmt)).click();
			 
		              }else{
		            	           
			                 String nwt =  CURRENTDATE +"/../../following-sibling::tr[1]/td";
			                 driver.findElement(By.xpath(nwt)).click();
		                   }
		}            else{
	                	  
			                 String swt =  CURRENTDATE +"/../../following-sibling::tr[1]/td";
			                 driver.findElement(By.xpath(swt)).click();
		                  }
	
	   }

  }

