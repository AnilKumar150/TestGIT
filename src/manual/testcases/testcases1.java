package manual.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;
                                    /* creating   new vendor */
public class testcases1 {
	public static void main(String[] args) throws InterruptedException {
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
		
// capturing the initial values of vendor
		String  expectedvalue =driver.findElement(By.xpath("//table[@class='layerPopupTransport']/tbody/tr/td[1]")).getText();
		System.out.println("initial value of vendore "+ expectedvalue);
		
//write mandatary feilds 
		driver.findElement(By.xpath("//img[@title='Create Vendor...']")).click();
		WebElement un = driver.findElement(By.xpath("//input[@name='vendorname']"));
		un.sendKeys("monu",Keys.TAB,Keys.TAB,"anilkumar150.ce@gmail.com",Keys.TAB,"56789123");
		WebElement list=driver.findElement(By.xpath("//select[@name='glacct']"));
		Select s = new Select(list);
		s.selectByValue("305-Sales Other");
		WebElement un1 = driver.findElement(By.xpath("//input[@name='website'] "));
		un1.sendKeys("www.civilrockzs.com",Keys.TAB,"General",Keys.TAB,"murgespalya",Keys.TAB,
				"headofffice",Keys.TAB,"banglore",Keys.TAB," karnatka",Keys.TAB,"456123",Keys.TAB,
				"india",Keys.TAB,"iam new vendor");
//click on save 
		driver.findElement(By.xpath("(//input[@value='  Save  '] )[2]")).click();
		
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr/td/table[1]/tbody/tr[2]/td[1]/a")).click();
		
		
//PRESENT VALUES OF VENDORS
		 WebElement presentvalue =driver.findElement(By.xpath("(//td[contains(text(),'Showing Records')])[1]"));
	 
		String actualText = presentvalue.getText();
	 
//COMPARE THE TEXT
		if(actualText.equals(expectedvalue))
		{
			System.out.println("New vendore is not created "+ actualText);
		}
		else 
		{
			System.out.println("new vendore is created "+ actualText);
		}
		
//navigate to  more and click on signout
		WebElement Administer = driver.findElement(By.xpath("//td[contains(@onmouseover,'fnDropDownUser')]"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(Administer).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		driver.close();
	
	}

}
