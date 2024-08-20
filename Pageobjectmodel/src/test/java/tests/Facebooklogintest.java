package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import pages.GoogleSearchPage;

public class Facebooklogintest {
	
	static WebDriver driver= null;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		facebooklogin();
		}
	
	public static void facebooklogin() throws InterruptedException
	{

	System.setProperty("webdriver.chrome.driver",
			   "C:/Users/nanin/Downloads/chromedriver-win64 (10)/chromedriver-win64/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
        Thread.sleep(2000);
    
        //driver.findElement(By.id("email")).sendKeys("8639403690");
        GoogleSearchPage.email(driver).sendKeys("8639403690");
    
    
        // driver.findElement(By.id("pass")).sendKeys("Nani@279");
        GoogleSearchPage.pwd(driver).sendKeys("Nani@279");
    
    
        driver.close();
	}
    

}
