package seleniumcourse;

public class BrowserCommands extends Base {
	
	
	public void browserCommandsSample()
	{
		 String Title=driver.getTitle();
		 String url=driver.getCurrentUrl();
		 String pagesource= driver.getPageSource();
	}
	public void navigationCommands()
	{
		driver.navigate().to("https://www.github.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) 
	{
		BrowserCommands browsercommands=new BrowserCommands();
		browsercommands.initialiseBrowser();
		browsercommands.navigationCommands();
		browsercommands.browserQuit();
		

	}
}
