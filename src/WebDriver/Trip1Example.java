package WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
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
    
    
    //Search for To Location Town Hall Station, Sydney   North Sydney Station, North Sydney
    driver.findElement(By.xpath("//*[@id='search-input-To']")).sendKeys("Town Hall Station, Sydney");
    
    //ImplicitWait(driver);
    
    Thread.sleep(1000);
    
    //To click on the Go Button for Results
    driver.findElement(By.xpath("//*[@id='search-button']")).click();
    
    Thread.sleep(1000);
    
    System.out.print("\n");
    	
    	System.out.println( "******Navigation Results******* ");
    	
    	System.out.print("\n");
    	
    	//this is my code for fetching the results from web page to console their are few errors trying to resolve it
    	//Using WebElement i can fetch the data from web page to console output. 
    	// since it is a dynamic data trying out different ways to fetch data from web page
    	
    	//Trip 1 details
    	
    	System.out.println("Trip 1 result is displayed below:");
    	
    	System.out.print("\n");
    	
    String data2= driver.findElement(By.xpath(".//*[@id='tripAnchor0']/div[1]/div/div[1]/div[1]/div/ul/li/div/span[2]/span[2]")).getText();
    System.out.println("Train station : " + data2);
    	
    String data= driver.findElement(By.xpath(".//*[@id='tripAnchor0']/div[1]/div/div[1]/div[1]/div/div/span[3]")).getText();
    System.out.println("Start time of next train : " + data);
    
    String data3= driver.findElement(By.xpath(".//*[@id='tripAnchor0']/div[1]/div/div[1]/div[1]/div/div/span[6]")).getText();
    System.out.println("End time of next train : " + data3);
    
    String data1= driver.findElement(By.xpath(".//*[@id='tripAnchor0']/div[1]/div/div[1]/real-time-departure/div/span[2]")).getText();
    System.out.println("Next train will leave in: " + data1 +" "+  "minitues");   
    
    String data4 = driver.findElement(By.xpath(".//*[@id='tripAnchor0']/div/div/div[2]/div[2]/trip-fare-summary/div/div/object/button")).getText();
    System.out.println("Fare of this trip is: " + data4);
    
	System.out.print("\n");
	
    // Trip 2 Details
	System.out.println("Trip 2 result is displayed below:");
	
	System.out.print("\n");
	
    String data5= driver.findElement(By.xpath(".//*[@id='tripAnchor1']/div[1]/div/div[1]/div[1]/div/ul/li/div/span[2]/span[2]")).getText();
    System.out.println("Train station : " + data5);
	
    String data6= driver.findElement(By.xpath(".//*[@id='tripAnchor1']/div/div/div[1]/div[1]/div/div/span[3]")).getText();
    System.out.println("Start time of next train : " + data6);

    String data7= driver.findElement(By.xpath(".//*[@id='tripAnchor1']/div/div/div[1]/div[1]/div/div/span[6]")).getText();
    System.out.println("End time of next train : " + data7);

    String data8= driver.findElement(By.xpath(".//*[@id='tripAnchor1']/div/div/div[1]/real-time-departure/div/span[2]")).getText();
    System.out.println("Next train will leave in: " + data8 +" "+  "minitues");   

    String data9 = driver.findElement(By.xpath(".//*[@id='tripAnchor1']/div/div/div[2]/div[2]/trip-fare-summary/div/div/object/button")).getText();
    System.out.println("Fare of this trip is: " + data9);
    
    // Trip 3 Details
	System.out.println("Trip 3 result is displayed below:");
	
	System.out.print("\n");
	
    String data10= driver.findElement(By.xpath(".//*[@id='tripAnchor2']/div[1]/div/div[1]/div[1]/div/ul/li/div/span[2]/span[2]")).getText();
    System.out.println("Train station : " + data10);
	
    String data11= driver.findElement(By.xpath(".//*[@id='tripAnchor2']/div/div/div[1]/div[1]/div/div/span[3]")).getText();
    System.out.println("Start time of next train : " + data11);

    String data12= driver.findElement(By.xpath(".//*[@id='tripAnchor2']/div/div/div[1]/div[1]/div/div/span[6]")).getText();
    System.out.println("End time of next train : " + data12);

    String data13= driver.findElement(By.xpath(".//*[@id='tripAnchor2']/div/div/div[1]/real-time-departure/div/span[2]")).getText();
    System.out.println("Next train will leave in: " + data13 +" "+  "minitues");   

    String data14 = driver.findElement(By.xpath(".//*[@id='tripAnchor2']/div/div/div[2]/div[2]/trip-fare-summary/div/div/object/button")).getText();
    System.out.println("Fare of this trip is: " + data14);
    
    // Trip 4 Details
	System.out.println("Trip 4 result is displayed below:");
	
	System.out.print("\n");
	
    String data15= driver.findElement(By.xpath(".//*[@id='tripAnchor3']/div[1]/div/div[1]/div[1]/div/ul/li/div/span[2]/span[2]")).getText();
    System.out.println("Train station : " + data15);
	
    String data16= driver.findElement(By.xpath(".//*[@id='tripAnchor3']/div/div/div[1]/div[1]/div/div/span[3]")).getText();
    System.out.println("Start time of next train : " + data16);

    String data17= driver.findElement(By.xpath(".//*[@id='tripAnchor3']/div/div/div[1]/div[1]/div/div/span[6]")).getText();
    System.out.println("End time of next train : " + data17);

    String data18= driver.findElement(By.xpath(".//*[@id='tripAnchor3']/div/div/div[1]/real-time-departure/div/span[2]")).getText();
    System.out.println("Next train will leave in: " + data18 +" "+  "minitues");   

    String data19 = driver.findElement(By.xpath(".//*[@id='tripAnchor3']/div/div/div[2]/div[2]/trip-fare-summary/div/div/object/button")).getText();
    System.out.println("Fare of this trip is: " + data19);
    
	}

	public static void ImplicitWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


}