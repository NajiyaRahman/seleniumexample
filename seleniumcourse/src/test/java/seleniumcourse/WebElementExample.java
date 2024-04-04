package seleniumcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementExample {
	WebDriver driver;
	
	public void initialiseBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	public void webElementsExample()
	{
		WebElement searchButton=driver.findElement(By.id("nav-search-submit-button"));
		WebElement hamburgerMenu=driver.findElement(By.id("nav-hamburger-menu"));
		WebElement amazonLogo=driver.findElement(By.id("nav-logo-sprites"));
		WebElement locationButton=driver.findElement(By.id("nav-global-location-popover-link"));
		WebElement cartButton=driver.findElement(By.id("nav-cart-text-container"));
		
		WebElement languageSelect=driver.findElement(By.className("icp-nav-link-inner"));
		WebElement amazonTv=driver.findElement(By.linkText("Amazon miniTV"));
		
	}
	
	public void browserQuit()
	{
		driver.quit();
	}

	public static void main(String[] args) 
	{
		WebElementExample webelementexample=new WebElementExample();
		webelementexample.initialiseBrowser();
		webelementexample.webElementsExample();
		webelementexample.browserQuit();
    }

}
