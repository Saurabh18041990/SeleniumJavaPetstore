package Work;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;


//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Logincredential extends Base{
	@Test
    public void Login() throws InterruptedException
    {
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
       
        WebElement Sign1= driver.findElement(By.xpath("//a[text()='Sign In']"));
        Sign1.click();
        
        
        Thread.sleep(2000);
        
        
        WebElement User2 =driver.findElement(By.xpath("//*[@name='username']"));
        User2.click();
        User2.clear();
        User2.sendKeys("saurabhgta");
        

        WebElement Pwd2 =driver.findElement(By.xpath("//*[@name='password']"));
        Pwd2.click();
        Pwd2.clear();
        Pwd2.sendKeys("Trump@Modi");
        
        driver.findElement(By.xpath("//*[@name='signon']")).click();
        
        
        WebElement A1 = driver.findElement(By.xpath("//*[@id='WelcomeContent']"));


    	System.out.println(A1.getText());
    	
    	if(A1.getText().equals("Welcome Saurabh!"))
    	{
    		System.out.println("Login is confirmed");
    	}
    	else {
    		System.out.println("Login is not confirmed");
    	}


    }
}