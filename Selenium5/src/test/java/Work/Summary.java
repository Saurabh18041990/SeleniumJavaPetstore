package Work;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Summary extends Base
{

	@SuppressWarnings("unlikely-arg-type")
	@Test
    public void shopping() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("(//*[@class='Button'])[2]")).click();
	
		driver.findElement(By.xpath("(//*[@class='Button'])[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@type='checkbox']")).click();
		
		driver.findElement(By.xpath("//*[@value='Continue']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@value='Continue']")).click();
		
		driver.findElement(By.xpath("//*[@class='Button']")).click();
		
		Thread.sleep(2000);


		WebElement Order = driver.findElement(By.xpath("//tr[1]//th[@align='center']"));
		System.out.println(Order.getText());
		
		driver.findElement(By.xpath("//*[text()='Sign Out']")).click();
		
		
	}
	}