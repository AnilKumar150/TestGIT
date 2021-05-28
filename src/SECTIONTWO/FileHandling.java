package SECTIONTWO;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class FileHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new OperaDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		Thread.sleep(2000);
		String mainId = driver.getWindowHandle();
		Set<String>allId = driver.getWindowHandles();
		for(String id :allId)
		{
			if(!mainId.equals(id))
			{
				driver.switchTo().window(id);
				driver.close();
			}
		}
		driver.findElement(By.id("block"));
		driver.findElement(By.id("file_upload")).sendKeys("C:\\Users\\USER\\Desktop\\Document Files\\(.rtf) Rich Text Format Document\\00000.rtf");
		String s = driver.findElement(By.xpath("// span[@class='upload-cv-success-msg']")).getText();
		System.out.println(s);
		driver.close();
		
		
	}

}
