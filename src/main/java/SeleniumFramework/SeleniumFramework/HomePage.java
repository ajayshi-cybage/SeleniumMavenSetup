package SeleniumFramework.SeleniumFramework;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	Logger logger = Logger.getAnonymousLogger();
	public boolean isUserLogin(WebDriver driver) {
		// TODO Auto-generated method stub
		String getlogindetails = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/ul/li[2]")).getText();
		if (getlogindetails.contains("John")) {
			logger.info("Home page loogged in By " +getlogindetails);
			return true ;
		}else{
		logger.info("Returning User is logged IN");
		}
		return false;
	}
	public CustomerPage gotoCustomerPage() {
		// TODO Auto-generated method stub
		logger.info("Customer Page is Shown up");
		return new CustomerPage();
	}
	public boolean isUserLoggedout() {
		// TODO Auto-generated method stub
		logger.info("Returning User is logged out");
		return true;
	}

}
