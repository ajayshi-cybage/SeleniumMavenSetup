package SeleniumFramework.SeleniumFramework;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.junit.experimental.theories.suppliers.TestedOn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class webdriverSmokeTestDemo extends webDriverBaseClass {

	Logger logger = Logger.getAnonymousLogger();
	
	
	public webdriverSmokeTestDemo() {
		// TODO Auto-generated constructor stub
	}
	
	public webdriverSmokeTestDemo(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super();
		this.driver = driver;
	}
	
	@Test
	public void verifyLogin(){
		
		LoginPage loginpage = new LoginPage();
		HomePage homepage = loginpage.login("admin@yourstore.com","admin",driver);
		Assert.assertTrue(homepage.isUserLogin(driver));
		logger.info("Login Successfully");		
	}
	
	/*@Test
	public void verifyLogout(){
		
		LogoutPage logoutpage = new LogoutPage();
		HomePage homePage = logoutpage.logout(driver);
		Assert.assertTrue(homePage.isUserLoggedout());
		logger.info("Logged out Successfully");		
	}*/
	/*@Test
	public void verfiyNewCustomerAdd(){
		LoginPage loginpage = new LoginPage();
		HomePage homepage = loginpage.login("admin@yourstore.com","admin",driver);
		Assert.assertTrue(homepage.isUserLogin(driver));
		logger.info("Login Successfully");
		CustomerPage customerPage = homepage.gotoCustomerPage();
		customerPage.createNewCustomerAddIn();
		Assert.assertTrue(CustomerPage.isCustomerAdded());
		logger.info("Login Successfully");		
	}	*/
		
}
