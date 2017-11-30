package WebDriver;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;


public class MyFirstScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("This is my first WebDriver program");
    
    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
	
    WebDriver driver = new ChromeDriver();
    
    driver.get("https://www.google.com.au");
    
    driver.findElement(By.name("q")).sendKeys("selenium web classes");
    
    driver.findElement(By.name("btnK")).click();
    
    	driver.close();

	}
	//public static void ExplicitWait(WebDriver driver, String text)
	//{
	//	(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='search-button']")));
		
	//}
	//public static void ImplicitWait(WebDriver driver)
	//{
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//}

}
