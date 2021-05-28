package SECTIONTWO;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WindowsHandlingflipkart {
	public static void main(String[] args) 
	{
		
	WebDriver driver = new OperaDriver();
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nokia 2");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	String mainID = driver.getWindowHandle();
	Set<String> allID  = driver.getWindowHandles();
	for(String id: allID)
	{
	
		if (mainID.equals(id))
		{
			System.out.println(id);
			driver.switchTo().window(id);
			
		}
		driver.findElement(By.xpath("//div[text()='Nokia 2 (Copper/Black, 8 GB)']")).click();
	}
  }
}
