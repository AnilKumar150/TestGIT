package manual.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
                                   /* Deleting  vendor */
public class manualtestcase2 {
	public static void main(String[] args) {
		WebDriver driver = new OperaDriver();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		 
//Enter into URL
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("root");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
//navigate to  more and click vendor 
		WebElement More = driver.findElement(By.xpath("(//td[@class='small'])[5]/table/tbody/tr/td[22]"));
		Actions act = new Actions(driver);
		act.moveToElement(More).perform();
		driver.findElement(By.xpath("//a[@name='Vendors']")).click();
		String initialvalue =driver.findElement(By.xpath("//table[@class='layerPopupTransport']/tbody/tr/td[1]")).getText();
		 System.out.println("initial value of vendor is "+ initialvalue);
		
		/*WebElement checkbox= driver.findElement(By.xpath("(//input[@onclick='check_object(this)'])[1]"));
        Actions act1 = new Actions (driver);
        act1.moveToElement(checkbox).perform();*/
        driver.findElement(By.xpath("(//input[@onclick='check_object(this)'])[1]")).click();
		//driver.findElement(By.xpath("(//input[@onclick='check_object(this)'])[1]")).click();
        
        
// click on delete button and capture the MESSAGE
		driver.findElement(By.xpath("(//a[text()='del'])[1]")).click();
         Alert alt = driver.switchTo().alert();
         String alertmsg = alt.getText();
         System.out.println(alertmsg);
         alt.accept();
// actual value after deleting 
         WebElement prestentvalue= driver.findElement(By.xpath("(//td[contains(text(),'Showing Records')])[1]"));
          String actualvalue =prestentvalue.getText();
          String X = driver.findElement(By.xpath("//tr[@id=\"row_23\"]/td[3]")).getText();
          if(actualvalue.equals(initialvalue))
          {
        	  System.out.println("vendor is not deleted and "+initialvalue);
          }
          else
          {
        	  System.out.println("vendor is " + X +" deleted and "+actualvalue);
          }
//navigate to  more and click on signout
         WebElement Administer = driver.findElement(By.xpath("//td[contains(@onmouseover,'fnDropDownUser')]"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(Administer).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		driver.close();
		
		
	
	}

}
