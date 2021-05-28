package manual.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;
                                     /* search by  vendor number */
public class manualtestcase4 {
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
		
		//
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("vendor_no");
		WebElement list =  driver.findElement(By.xpath("//select[@class='txtBox']"));
		Select s = new Select(list);
		s.selectByValue("vendor_no");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		WebElement Administer = driver.findElement(By.xpath("//td[contains(@onmouseover,'fnDropDownUser')]"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(Administer).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		

	}

}
	
