package SECTIONTWO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class CalanderHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new OperaDriver();
		Driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.get("https://jqueryui.com/datepicker/");
		//Thread.sleep(8000);
		Driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		Driver.findElement(By.xpath("//a[contains(@class,highlight')]")).click();	
		
	}

}