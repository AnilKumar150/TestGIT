package SECTIONTWO;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

public class FrameHandling {
 public static void main(String[] args) {
	WebDriver driver = new OperaDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/droppable/");
	// switch to frame 
   WebElement FramesEle= driver.findElement(By.className("demo-frame"));
   driver.switchTo().frame(FramesEle);
   Actions Act = new Actions(driver);
   
   WebElement drag = driver.findElement(By.id("draggable"));
   WebElement drop=driver.findElement(By.id("droppable"));
   Act.dragAndDrop(drag,drop).perform();
   //switch to main page
   driver.switchTo().defaultContent();
   String data= driver.findElement(By.cssSelector(".desc")).getText();
   System.out.println(data);
   driver.close();
   
	
	
}

}
