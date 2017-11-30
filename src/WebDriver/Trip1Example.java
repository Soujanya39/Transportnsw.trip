package WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Trip1Example {

	public static void main(String[] args) throws InterruptedException {
		
	// ChromeDriver 
    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
	
    WebDriver driver = new ChromeDriver();
    
    System.out.println("This is Trip Plan Project program");
    
    //To land on the transportnsw.info page
	driver.navigate().to("https://transportnsw.info/trip");
	
    //Search for From Location
    driver.findElement(By.xpath("//*[@id='search-input-From']")).sendKeys("North Sydney Station, North Sydney");
    
    
    //Search for To Location
    driver.findElement(By.xpath("//*[@id='search-input-To']")).sendKeys("Town Hall Station, Sydney");
    
    //ImplicitWait(driver);
    
    Thread.sleep(3000);
    
    //To click on the Go Button for Results
    driver.findElement(By.xpath("//*[@id='search-button']")).click();
    
    Thread.sleep(3000);
    
    	driver.close();
    	
    	System.out.println("Results shown will be displayed in console if i write a code to fetch data from web page ");
    
	}

	public static void ImplicitWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}