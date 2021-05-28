package SECTIONTWO;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WindowsHandling 
{
	public static void main(String[] args) 
	{
		
	WebDriver driver = new OperaDriver();
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com");
	
	String mainID = driver.getWindowHandle();
	Set<String> allID  = driver.getWindowHandles();
	for(String id: allID)
	{
	
		if (mainID.equals(id))
		{
			driver.switchTo().window(id);
			 driver.close();
		}
	}
 }
}