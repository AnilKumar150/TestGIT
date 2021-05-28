package SECTIONTWO;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class spicejetDATE 
{
	public static void main(String[] args) 
	{
	WebDriver driver = new OperaDriver();
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("(//button [@class='ui-datepicker-trigger'])[1]")).click();
		String CURRENTDATE = "//a[contains(@class,'highlight ')]";
		String allDay = CURRENTDATE +"/../following-sibling::td";
		List<WebElement> allDays = driver.findElements(By.xpath(allDay));
		
	
		
	
	
    }
}
