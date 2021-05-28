package SECTIONTWO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class NOON {
	public static void main(String[] args) {
		WebDriver Driver = new OperaDriver();
		Driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.get("https://www.noon.com/");
		
	}

}
