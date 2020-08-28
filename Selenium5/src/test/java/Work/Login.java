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

public class Login extends Base{
	@Test
    public void Login() throws InterruptedException
    {
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
      WebElement Sign= driver.findElement(By.xpath("//a[text()='Sign In']"));
      Sign.click();
      

      driver.findElement(By.xpath("//a[text()='Register Now!']")).click();
      
      
           
      
      WebElement UserID =driver.findElement(By.xpath("//*[@name='username']"));
      UserID.click();
      UserID.clear();
      UserID.sendKeys("saurabhgta");
       
        

        WebElement Pwd =driver.findElement(By.xpath("//*[@name='password']"));
        Pwd.click();
        Pwd.clear();
        Pwd.sendKeys("Trump@Modi");
        
        
        WebElement Pwd1 =driver.findElement(By.xpath("//*[@name='repeatedPassword']"));
        Pwd1.click();
        Pwd1.clear();
        Pwd1.sendKeys("Trump@Modi");
        
        WebElement FirstName =driver.findElement(By.xpath("//*[@name='account.firstName']"));
        FirstName.click();
        FirstName.clear();
        FirstName.sendKeys("Saurabh");
          
        WebElement lastName =driver.findElement(By.xpath("//*[@name='account.lastName']"));
        lastName.click();
        lastName.clear();
        lastName.sendKeys("Sharma");

        WebElement email =driver.findElement(By.xpath("//*[@name='account.email']"));
        email.click();
        email.clear();
        email.sendKeys("Saurabh.Sharma@gmail.com");
        
        WebElement Phone =driver.findElement(By.xpath("//*[@name='account.phone']"));
        Phone.click();
        Phone.clear();
        Phone.sendKeys("9999988888");
        
        WebElement Ad1 =driver.findElement(By.xpath("//*[@name='account.address1']"));
        Ad1.click();
        Ad1.clear();
        Ad1.sendKeys("GURGAON");

        WebElement Ad2 =driver.findElement(By.xpath("//*[@name='account.address2']"));
        Ad2.click();
        Ad2.clear();
        Ad2.sendKeys("GURGAON");
        
        WebElement city =driver.findElement(By.xpath("//*[@name='account.city']"));
        city.click();
        city.clear();
        city.sendKeys("GURGAON");
        
        WebElement state =driver.findElement(By.xpath("//*[@name='account.state']"));
        state.click();
        state.clear();
        state.sendKeys("HARYANA");
        
        WebElement zip =driver.findElement(By.xpath("//*[@name='account.zip']"));
        zip.click();
        zip.clear();
        zip.sendKeys("111000");
        
        WebElement country =driver.findElement(By.xpath("//*[@name='account.country']"));
        country.click();
        country.clear();
        country.sendKeys("INDIA");
        
        driver.findElement(By.xpath("//*[@name='newAccount']")).click();
        
        driver.navigate().back();

        
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