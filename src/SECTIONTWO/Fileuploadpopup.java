package SECTIONTWO;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Fileuploadpopup {
	public static void main(String[] args) throws AWTException {
		/* Using Robot Key*/
		WebDriver Driver = new OperaDriver();
		Driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.get("https://www.monsterindia.com");
		Driver.findElement(By.className("resume-btn")).click();
		Driver.findElement(By.xpath("//a[contains(@class,'btn block resume')]")).click();
		StringSelection path=new StringSelection("C:\\Users\\USER\\Downloads\\bala newupdated resume (1).doc");
		Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
		clip.setContents(path, null);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	}

}
