package WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Trip1Example {


	public static void main(String[] args) throws InterruptedException {
		
	// ChromeDriver 
    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
	
    WebDriver driver = new ChromeDriver();
    
    System.out.println("This is Trip Plan Project program");
    
    //To land on the transportnsw.info#trip page
	driver.navigate().to("https://transportnsw.info/trip");
	
    //Search for From Location
    driver.findElement(By.xpath("//*[@id='search-input-From']")).sendKeys("North Sydney Station, North Sydney");
    
    
    //Search for To Location
    driver.findElement(By.xpath("//*[@id='search-input-To']")).sendKeys("Town Hall Station, Sydney");
    
    //ImplicitWait(driver);
    
    Thread.sleep(3000);
    
    //To click on the Go Button for Results
    driver.findElement(By.xpath("//*[@id='search-button']")).click();
    
    Thread.sleep(7000);
    
    	driver.close();
    	
    	System.out.println("Navigation Results shown will be displayed below: ");
    	
    	//this is my code for fetching the results from web page to console their are few errors trying to resolve it
    	//Using WebElement i can fetch the data from web page to console output. 
    	// since it is a dynamic data trying out different ways to fetch data from web page
    	
    //WebElement element= driver.findElement(By.xpath("//*[@id='tripAnchor0']/div[1]/div/div[1]"));
    	
    //System.out.println("Trip 1 results are displayed below:");
    	
    //System.out.println(element.getText());
    
	}

	public static void ImplicitWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


}