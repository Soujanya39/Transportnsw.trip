package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
	
    WebDriver driver = new ChromeDriver();
    
	driver.get("https://www.google.com.au");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.id("lst-ib")).sendKeys("This week Sydney city highlights");
	
	driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
			
	
	}

}
