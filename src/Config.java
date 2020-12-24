

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import utils_GenericMethods.GenericMethods;

public class Config extends GenericMethods {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("----------Suite has started----------");
		log.info("----------Suite has started----------");
		
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("----------SUite has ended----------");
		log.info("----------SUite has ended----------");
	}
	
	
	@BeforeTest
	public void browserOpen() {

//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Piash\\eclipse-workspace\\DRIVER\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\DRIVER\\chromedriver.exe");
	driver=new ChromeDriver();
	String url= "https://www.amazon.com/";
	driver.get(url);
	maxPage();
	}
	
	@AfterTest
	public void afterMethod() {
		System.out.println("----------Browser is closed----------");
//		log.info("----------Browser is closed----------");
		driver.close();
	}
}
