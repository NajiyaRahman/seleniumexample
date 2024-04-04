package seleniumcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	
	public void webElementCommands()
	{
		WebElement showMessageButton=driver.findElement(By.id("button-one"));
		WebElement classnameExample=driver.findElement(By.className("mb-sec"));
		WebElement radioButton=driver.findElement(By.linkText("Radio Buttons Demo"));
		WebElement partialLink=driver.findElement(By.partialLinkText("Radio Buttons"));
        WebElement nameExample=driver.findElement(By.name("keywords"));
		WebElement tagname=driver.findElement(By.tagName("div"));
		WebElement cssselectId=driver.findElement(By.cssSelector("button#button-one"));
		WebElement cssSelectClass=driver.findElement(By.cssSelector("div.header-top")); 
		WebElement csscombination=driver.findElement(By.cssSelector("button[data-target='#collapsibleNavbar']"));
		WebElement xpathExample=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement messageXpathContains=driver.findElement(By.xpath("//input[contains(@id,'input-field')]"));
		WebElement gettotalStarts=driver.findElement(By.xpath("//button[starts-with(@id,'button-t')]"));
		WebElement textofExample=driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement andExample=driver.findElement(By.xpath("//button[@id='button-one' and text()='Show Message']"));
		WebElement orExample=driver.findElement(By.xpath("//button[@id='button-one' or text()='Show Message']"));
		
		
		WebElement simpleFormLink=driver.findElement(By.linkText("Simple Form Demo"));
		WebElement jquerySelectLink=driver.findElement(By.linkText("Jquery Select2"));
		WebElement checkboxLink=driver.findElement(By.linkText("Checkbox Demo"));
		WebElement selectLink=driver.findElement(By.linkText("Select Input"));
		WebElement ajaxformLink=driver.findElement(By.linkText("Ajax Form Submit"));
		
		WebElement simpleFormPartial=driver.findElement(By.partialLinkText("Simple Form"));
		WebElement checkboxPartial=driver.findElement(By.partialLinkText("Checkbox"));
		WebElement ajaxFormPartial=driver.findElement(By.partialLinkText("Ajax Form"));
		WebElement selectPartial=driver.findElement(By.partialLinkText("Jquery"));
		WebElement Partial=driver.findElement(By.partialLinkText("Select"));
		
		WebElement nameExample1=driver.findElement(By.name("description"));
		WebElement nameExample2=driver.findElement(By.name("author"));
		WebElement nameExample3=driver.findElement(By.name("viewport"));
		
		WebElement tagname1=driver.findElement(By.tagName("button"));
		WebElement tagname2=driver.findElement(By.tagName("a"));
		WebElement tagname3=driver.findElement(By.tagName("li"));
		WebElement tagname4=driver.findElement(By.tagName("label"));
		WebElement tagname5=driver.findElement(By.tagName("input"));
		
		WebElement cssSelector=driver.findElement(By.cssSelector("button#button-two"));
		WebElement messageoneCss=driver.findElement(By.cssSelector("div#message-one"));
		WebElement showmessageCss=driver.findElement(By.cssSelector("button#button-one"));
		WebElement totalSumCss=driver.findElement(By.cssSelector("div#message-two"));
		WebElement messageCss=driver.findElement(By.cssSelector("input#single-input-field"));
		
		WebElement logoCssClass=driver.findElement(By.cssSelector("div.top-logo"));
		WebElement homeCssClass=driver.findElement(By.cssSelector("button.navbar-toggler"));
		WebElement cssSelectorclass=driver.findElement(By.cssSelector("section.clearfix"));
		WebElement cssSelectorclass1=driver.findElement(By.cssSelector("div.mb-sec"));
		WebElement cssSelectorclass2=driver.findElement(By.cssSelector("div.header-top"));
		
		WebElement enterMessageCss=driver.findElement(By.cssSelector("label[for='inputEmail4']"));
		WebElement messageFieldCss=driver.findElement(By.cssSelector("input[placeholder='Message']"));
		WebElement attributeCss1=driver.findElement(By.cssSelector("button[data-toggle='collapse']"));
		
		WebElement valuebXpath=driver.findElement(By.xpath("//input[@id='value-b']"));
		WebElement valueaXpath=driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement getTotalXpath=driver.findElement(By.xpath("//button[@id='button-two']"));
		WebElement entermessageContains=driver.findElement(By.xpath("//label[contains(@for,'input')]"));
		WebElement yourmessageContains=driver.findElement(By.xpath("//div[contains(@id,'-one')]"));
		WebElement gettotalContains=driver.findElement(By.xpath("//button[contains(@id,'-two')]"));
		WebElement exampleContains=driver.findElement(By.xpath("//div[contains(@id,'collapsibleNa')]"));
		WebElement startswithExample=driver.findElement(By.xpath("//button[starts-with(@class,'navbar-tog')]"));
		WebElement startswithExample1=driver.findElement(By.xpath("//div[starts-with(@id,'collapsibleNavb')]"));
		WebElement startswithExample2=driver.findElement(By.xpath("//div[contains(@id,'message-o')]"));
		WebElement textExample=driver.findElement(By.xpath("//label[text()='Enter Message']"));
		WebElement textExample2=driver.findElement(By.xpath("//button[text()='Get Total']"));
		WebElement combinationText=driver.findElement(By.xpath("//label[@for='inputEmail4' and text()='Enter Message']"));
		WebElement combinationText2=driver.findElement(By.xpath("//button[@id='button-two' and text()='Get Total']"));
		WebElement combinationText3=driver.findElement(By.xpath("//label[@for='inputEmail4' or text()='Enter Message']"));
		WebElement combinationText4=driver.findElement(By.xpath("//button[@id='button-two' or text()='Get Total']"));
		
		WebElement parentTec=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
		WebElement childTec=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child::ul"));
		WebElement following=driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']"));
		WebElement preceding=driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='header-top']"));
		WebElement ancestor=driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='card-body']"));
		WebElement descendant=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//descendant::a[@id='progress-bars']"));
		
		WebElement parentExample=driver.findElement(By.xpath("//div[@id='message-one']//parent::form"));
		WebElement parentExample1=driver.findElement(By.xpath("//meta[@name='keywords']//parent::head"));
		WebElement parentExample2=driver.findElement(By.xpath("//div[@class='copyright']//parent::footer"));
		WebElement parentExample3=driver.findElement(By.xpath("//button[text()='Show Message']//parent::form"));
		WebElement parentExample4=driver.findElement(By.xpath("//a[@class='navbar-brand']//parent::nav"));
		
		WebElement childExample=driver.findElement(By.xpath("//button[@class='navbar-toggler']//child::span"));
		WebElement childExample1=driver.findElement(By.xpath("//button[@data-target='#collapsibleNavbar']//child::span"));
		WebElement childExample2=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child::ul"));
		
		WebElement followingExample=driver.findElement(By.xpath("//button[@id='button-two']//following::div[@id='message-two']"));
		WebElement followingExample1=driver.findElement(By.xpath("//label[@for='inputEmail4']//following::input[@placeholder='Message']"));
		WebElement followingExample2=driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']//following::ul[@class='navbar-nav']"));
		
		WebElement precedingExample=driver.findElement(By.xpath("//preceding::form[@method='POST']"));
		WebElement precedingExample1=driver.findElement(By.xpath("//div[@id='message-one']//preceding::input[@type='text']"));
		WebElement precedingExample2=driver.findElement(By.xpath("//meta[@name='keywords']//preceding::link[@rel='canonical']"));
		
		WebElement ancestorExample=driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']//ancestor::button[@class='navbar-toggler']"));
		WebElement ancestorExample1=driver.findElement(By.xpath("//a[@class='navbar-brand']//ancestor::div[@class='mb-sec']"));
		WebElement ancestorExample2=driver.findElement(By.xpath("//a[@class='nav-link']//ancestor::div[@id='collapsibleNavbar']"));
		
		WebElement descendantExample=driver.findElement(By.xpath("//div[@class='mb-sec']//descendant::button[@data-toggle='collapse']"));
		WebElement descendantExample1=driver.findElement(By.xpath("//div[@class='container page']//descendant::div[@class='row']"));
		WebElement descendantExample2=driver.findElement(By.xpath("//div[@class='header-top']//descendant::div[@class='top-logo']"));
	}
    public static void main(String[] args) 
    {
		WebElementCommands webelementcommands=new WebElementCommands();
		webelementcommands.initialiseBrowser();
		webelementcommands.webElementCommands();
		webelementcommands.browserQuit();
	}

}
