

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Piash\\eclipse-workspace\\DRIVER\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url= "https://www.amazon.com/";
	//	go to amazon.com 	
		driver.get(url);
		
	//	get page title and match page title
		String t= driver.getTitle();
		System.out.println("Page title: " + t);
		
		String exptitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		if (t.equalsIgnoreCase(exptitle)) {
			System.out.println("Title matched");
		}
		else 
			System.out.println("Title Did NOT match");
		
	// Get title length, current url, page source length.	
		System.out.println("Title length: " + t.length());
		System.out.println("Current URL is: " + driver.getCurrentUrl());
		System.out.println("Page source length: " + driver.getPageSource().length());
		
//		Sign in on AMAZON
		
		
		//	click on the top left side bars by using tag name
		//	driver.findElement(By.tagName("i")).click();
			driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-main']/div[1]/a[1]/i[1]")).click();
			
	//		click on the sign in button. 
		//	driver.findElement(By.xpath("//b[contains(text(),'Hello, Sign in')]")).click();
		//	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/a[2]/div[1]/div[2]/div[1]")).click();
		//	driver.findElement(By.cssSelector("body.a-m-us.a-aui_72554-c.a-aui_control_group_273125-t1.a-aui_dropdown_274033-t1.a-aui_link_rel_noreferrer_noopener_274172-c.a-aui_mm_desktop_exp_291916-c.a-aui_mm_desktop_launch_291918-c.a-aui_mm_desktop_targeted_exp_291928-t1.a-aui_mm_desktop_targeted_launch_291922-t1.a-aui_pci_risk_banner_210084-c.a-aui_perf_130093-c.a-aui_preload_261698-c.a-aui_tnr_v2_180836-c.lock-position:nth-child(2) div.celwidget.nav-sprite-v1.hmenu-visible:nth-child(23) div.nav-ignore-pinning.hmenu-translateX a:nth-child(2) div:nth-child(1) div:nth-child(2) div:nth-child(1) > b:nth-child(1)")).click();
		//	driver.findElement(By.tagName("b")).click();
			driver.findElement(By.xpath("//div[@id='hmenu-customer-avatar-icon']")).clear();
			
			//clear email field using RELATIVE Xpath
			driver.findElement(By.xpath("//input[@id='ap_email']")).clear();
			System.out.println("email field cleared");
			driver.findElement(By.name("email")).sendKeys("getprime001@gmail.com");
			System.out.println("Email address typed");
			
			driver.findElement(By.id("continue")).click();
			System.out.println("email entered and clicked");
			driver.findElement(By.cssSelector("#ap_password")).clear();
			driver.findElement(By.cssSelector("#ap_password")).sendKeys("thunder2");
			driver.findElement(By.className("a-button-input")).click();
			System.out.println("Logged in Successfully");
	
		
	// inspect the product category dropdown in the left L1 header next to amazon logo	
	//	WebElement dd =	driver.findElements(By.id("searchDropdownBox"));
		List<WebElement> category_dd = driver.findElements(By.id("searchDropdownBox"));
		System.out.println("Number of categories in dropdown: " + category_dd.size());
	//	Select selobj =new Select (category_dd);
	// WHY is number of category is showing 1?		
				for (int i=0; i<category_dd.size(); i++) {
					System.out.println((i+1) +"." + category_dd.get(i).getText());
				}
		
				
				
	//	count links in the web site and get link text
	/*	
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No. of Links in Website: " +links.size()); 
		for (int i=0; i<links.size(); i++ ) {
			System.out.println((i+1)+"."+ " " + links.get(i).getText());
			}
	 
	//	Search for a product
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("SSD");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='nav-input' and  @value='Go']")).click();
		
	//	Create object of JavascriptExecutor for scrolling
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		
	
		
		
		
		
	
	/*	
	 
	 
	//	Sign in on AMAZON
		
		
	//	click on the top left side bars by using tag name
		driver.findElement(By.tagName("i")).click();
		
	//	click on the sign in button. Used absolute xpath
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/a[2]/div[1]/div[2]/div[1]")).click();
	//clear email field using RELATIVE Xpath
		driver.findElement(By.xpath("//input[@id='ap_email']")).clear();
		System.out.println("email field cleared");
		driver.findElement(By.name("email")).sendKeys("getprime001@gmail.com");
		System.out.println("Email address typed");
		
		driver.findElement(By.id("continue")).click();
		System.out.println("email entered and clicked");
		driver.findElement(By.cssSelector("#ap_password")).clear();
		driver.findElement(By.cssSelector("#ap_password")).sendKeys("thunder2");
		driver.findElement(By.className("a-button-input")).click();
		System.out.println("Logged in Successfully");
		
		
		// RadioButton, Checkbox, dropdown, alert, popup HOME WORK
																	
		
		
		
		
	//	driver.close();
		
	//	driver.findElement(By.class("nav-line-1")).click();
	//	driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		
		*/

	}

}
