package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	private static WebElement element=null;
	
	public static  WebElement email(WebDriver driver)
	{
		WebElement element=driver.findElement(By.id("email"));
		return  element;
	}
	public static WebElement pwd(WebDriver driver)
	{
		WebElement element=driver.findElement(By.id("pass"));
		return  element;
		
	}

}
