package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EWSubsPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		
	    WebDriver driver = new ChromeDriver();
	    
		driver.get("https://subscription.ew.com/storefront/subscribe-to-entertainment-weekly/site/ew-respppe0216-tpl.html");
		
		driver.manage().window().maximize();
		
		// To Select 2 year(100) issues for $34
		driver.findElement(By.id("//*[@id='tab_0']/button")).click();
		
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='premiumSelectOne']")));
		
		dropdown.selectByIndex(1);
		
		Select dropdown1 = new Select(driver.findElement(By.xpath("//*[@id='premiumSelectTwo']")));
		
		dropdown1.selectByIndex(2);	
		
		driver.findElement(By.xpath("//*[@id='creditcardButton']")).click();
		
		driver.findElement(By.id("billingAddress.firstName")).sendKeys("Test");
		
		driver.findElement(By.id("billingAddress.lastName")).sendKeys("Test");
		
		driver.findElement(By.id("billingAddress.street1")).sendKeys("po box no 1234");
		
		driver.findElement(By.id("billingAddress.city")).sendKeys("tampa");
		
		Select dropdown2 = new Select(driver.findElement(By.xpath("//*[@id='billingAddress.subCountry']")));
		
		dropdown2.selectByValue("FL");	
		
		driver.findElement(By.xpath("//*[@id='billingAddress.zipPostalCode']")).sendKeys("33609");
		
		driver.findElement(By.xpath("/*[@id='billingAddress.email']")).sendKeys("abcd1234@gmail.com");
		
		driver.findElement(By.id("paymentFormBean.unencryptedCardNumber")).sendKeys("4444444444444448");
		
		Select dropdown3 = new Select(driver.findElement(By.xpath("//*[@id='paymentFormBean.expiryMonth']")));
		
		dropdown3.selectByValue("06");
		
		Select dropdown4 = new Select(driver.findElement(By.xpath("//*[@id='paymentFormBean.expiryYear']")));
		
		dropdown4.selectByValue("2021");
		
		driver.findElement(By.xpath("//*[@id='formSubmit']")).click();
		
	}

}
