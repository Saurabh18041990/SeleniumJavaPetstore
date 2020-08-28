package Work;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Dogselection extends Base
{
	@Test
    public void Dogselection() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		Thread.sleep(3000);
		List<WebElement> A2 = driver.findElements(By.xpath("//*[@id='SidebarContent']"));
		
		 for (WebElement PA: A2) {
		 System.out.println(PA.getText());
		 if(PA.getText().equals("Various Breeds"))
			 Thread.sleep(2000);
		 {
			driver.findElement(By.xpath("//*[@id='SidebarContent']/a[2]")).click();
			
			}
		 
		 }
		 Thread.sleep(3000);
		
		 
		 List<WebElement> A3 = driver.findElements(By.xpath("html/body/div[2]/div[2]/table/tbody/tr/td/a"));
			
		 for (WebElement PB: A3) {
		 System.out.println(PB.getText());
		 Thread.sleep(2000);
		 if(PB.getText().equals("K9-CW-01"))
		 
		 {
			 Thread.sleep(2000);

			WebElement POP = driver.findElement(By.xpath("//*[text()='Chihuahua']"));
			System.out.println(POP.getText()+ " is present");
			
	driver.findElement(By.xpath("//a[text()='K9-CW-01']")).click();
			
	}
		 
		 }
		 Thread.sleep(3000);
		 
		 
		 
		 

	
}}