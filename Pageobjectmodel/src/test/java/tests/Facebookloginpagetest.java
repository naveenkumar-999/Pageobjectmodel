package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Facebookloginobjects;

public class Facebookloginpagetest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		facebookloginpagetest();
	}
	
	public static void facebookloginpagetest()
	{
		System.setProperty("webdriver.chrome.driver",
				   "C:/Users/nanin/Downloads/chromedriver-win64 (10)/chromedriver-win64/chromedriver.exe");
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver = new ChromeDriver();
			
	    Facebookloginobjects loginpageobj = new Facebookloginobjects(driver);
	
	    driver.get("https://www.facebook.com");
	
	    loginpageobj.enteremail("8639403690");
	
	    loginpageobj.enterpass("Nani@279");
	
	    driver.close();
	}

}
