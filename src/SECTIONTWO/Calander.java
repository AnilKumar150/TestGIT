package SECTIONTWO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class Calander {
	public static void main(String[] args) {
		WebDriver Driver = new OperaDriver();
		Driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.get("https://www.spicejet.com");
		Driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	WebElement un	=Driver.findElement(By.xpath("//a[contains(@class,'highlight')]"));
		System.out.println(un.getText());
	}

}
