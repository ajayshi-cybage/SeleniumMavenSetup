package SeleniumFramework.SeleniumFramework;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class webDriverBaseClass {

	protected static WebDriver driver = null;
	public static String BROWSER = "Chrome";
	/*public String getBROWSER() {
		return BROWSER;
	}

	public void setBROWSER(String bROWSER) {
		BROWSER = bROWSER;
	}*/
		
	@BeforeClass(alwaysRun=true)
	public WebDriver getdriver(){
		
		String browser = "Chrome";
		if (browser.equals("IE")) {
			driver = new InternetExplorerDriver();		
		}else{			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("Start-maximize");
			driver = new ChromeDriver(options);
		}
	
		driver.get("http://admin-demo.nopcommerce.com/");
		
		System.out.println("Driver  " +driver);
		
		return driver;
	}
	
	/*@AfterClass(alwaysRun=true)
	public void DriverStop(){
		if(driver!=null){
		driver.quit();
		}
	}*/

	
}
