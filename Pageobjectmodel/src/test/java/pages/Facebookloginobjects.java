package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebookloginobjects {
	
	WebDriver driver = null;
	
	
	By email=By.id("email");
	
	By pass=By.id("pass");
	
	public Facebookloginobjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enteremail(String text)
	{
		driver.findElement(email).sendKeys(text);
	}
	
	public void enterpass(String text)
	{
		driver.findElement(pass).sendKeys(text);
	}

}