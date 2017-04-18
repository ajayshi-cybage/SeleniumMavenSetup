package SeleniumFramework.SeleniumFramework;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage extends webDriverBaseClass{
	Logger logger = Logger.getAnonymousLogger();
	public LogoutPage() {
		// TODO Auto-generated constructor stub
	}
	
	public LogoutPage(WebDriver driver){
		super();
		this.driver = driver;
	}

	public HomePage logout(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/ul/li[3]/a")).click();
		
		logger.info("User is logged out");
		return new HomePage();
	}
}
