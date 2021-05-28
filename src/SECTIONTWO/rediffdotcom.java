package SECTIONTWO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class rediffdotcom {
	public static void main(String[] args) 
	{
	    WebDriver driver = new OperaDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Jeeni Alladhin");
		/*Keys.TAB,"jeeniAlladhin123",Keys.TAB,
		Keys.TAB,"@nilkumar123",Keys.TAB,"@nilkumar123",Keys.TAB,"anilkumar150.ce@gmail.com",
		Keys.TAB,);*/
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("JeeniAlladhin123");
		driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("@nilKumar150");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("@nilKumar150");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("@nilKumar150@gmail.com");
		driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys("8019400301");
		
		WebElement list = driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));
		Select s = new Select(list);
		s.selectByValue("02");
		
		WebElement list1 = driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"));
		Select s1 = new Select(list1);
		s1.selectByValue("04");	
		
		WebElement list2 = driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]"));
		Select s2 = new Select(list2);
		s2.selectByValue("2021");
		
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		WebElement list3 = driver.findElement(By.xpath("//select[contains(@name,'country')]"));
		Select s3 = new Select(list3);
		s3.selectByValue("99");
		
		WebElement list4 = driver.findElement(By.xpath("//select[contains(@name,'city')]"));
		Select s4 = new Select(list4);
		s4.selectByValue("Lucknow");
		driver.quit();
		//td[text()='Date of Birth']/../td[3]/select/option[5]
		//td[text()='Date of Birth']/../td[3]/select[2]/option[4]
		//td[text()='Date of Birth']/../td[3]/select[3]/option[2]	

}
}
