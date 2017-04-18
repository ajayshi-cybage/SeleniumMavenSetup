package SeleniumFramework.SeleniumFramework;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends webDriverBaseClass {

	Logger logger = Logger.getAnonymousLogger();
	public HomePage login(String string, String string2,WebDriver driver) {
		// TODO Auto-generated method stub
		
		System.out.println("String is "+string);
		System.out.println("String is "+string2);
		System.out.println("Driver : " +driver);
		
		
		driver.findElement(By.cssSelector("#Email")).sendKeys(string);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		driver.findElement(By.cssSelector("#Password")).sendKeys(string2);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		driver.findElement(By.cssSelector("body > div > div > div > div > div > div.page-body > div.customer-blocks > div > form > div.buttons > input")).click();
		
		logger.info("User is logged IN");
		return new HomePage();
	}

}
