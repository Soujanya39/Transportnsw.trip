package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MacAndWin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String os= System.getProperty("os.name").toLowerCase();
		
		
		WebDriver driver=new ChromeDriver();
		
		if (os.contains("mac")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		}
	  driver.get("https://www.google.com");
}
}