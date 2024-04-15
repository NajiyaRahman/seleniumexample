package seleniumcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{
	
	
	public void verifySingleInputField()
	{
		String input="abc";
		WebElement enterMessageTextField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		enterMessageTextField.sendKeys(input);
		WebElement showMessageButton=driver.findElement(By.id("button-one"));
		showMessageButton.click();
		WebElement yourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		String yourMessageText=yourMessage.getText();
		String outputYourMessage = yourMessageText.replace("Your Message : ", ""); 
		if(outputYourMessage.equals(input))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
	}
	
	public void verifyTwoInputFields()
	{
		int inputA=10;
		int inputB=20;
	    int sum=inputA+inputB;
		String expected=("Total A + B : ")+sum;
		WebElement enterValueAField=driver.findElement(By.xpath("//input[@id='value-a']"));
		enterValueAField.sendKeys(String.valueOf(inputA));
		WebElement enterValueBField=driver.findElement(By.xpath("//input[@id='value-b']"));
		enterValueBField.sendKeys(String.valueOf(inputB));
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		getTotalButton.click();
		WebElement total=driver.findElement(By.xpath("//div[@id='message-two']"));
		String totalSum=total.getText();
		if(expected.equals(totalSum))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		
	}	
	public void otherWebelementCommands()
	{
	    WebElement showMessageButton=driver.findElement(By.id("button-one"));
		Boolean isShowMessageButtonDisplayed=showMessageButton.isDisplayed();
		Boolean isShowMessageButtonEnabled=showMessageButton.isEnabled();
		
		String showMessageButtonClassname=showMessageButton.getAttribute("class");
		
		String backgroundColor=showMessageButton.getCssValue("background-color");
		String borderColor=showMessageButton.getCssValue("border-color");
		String color=showMessageButton.getCssValue("color");
		String fontWeight=showMessageButton.getCssValue("font-weight");
		
	}
		
		
	    public static void main(String[] args) {
		WebElementCommands webElementCommands=new WebElementCommands();
		webElementCommands.initialiseBrowser();
		//webElementCommands.verifySingleInputField();
		//webElementCommands.verifyTwoInputFields();
		webElementCommands.otherWebelementCommands();
		webElementCommands.browserQuit();
				
		

	}

}
