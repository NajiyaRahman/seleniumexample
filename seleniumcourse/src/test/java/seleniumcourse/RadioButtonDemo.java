package seleniumcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtonDemo extends Base {
	
	public void verifyRadioButtonDemo()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		maleRadioButton.click();
		Boolean isMaleRadioButtonSelected=maleRadioButton.isSelected();
	}
	
	public void verifyGroupRadioButtonsDemo()
	{
		WebElement maleButton=driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		Boolean ismaleButtonSelected=maleButton.isSelected();
		WebElement femaleButton=driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		Boolean isfemaleButtonSelected=femaleButton.isSelected();
		WebElement ageGroup1to18=driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		Boolean isAgeGroup1to18Selected=ageGroup1to18.isSelected();
		WebElement ageGroup19to44=driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		Boolean isAgeGroup19to44Selected=ageGroup19to44.isSelected();
		WebElement ageGroup45to60=driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		Boolean isAgeGroup45to60Selected=ageGroup45to60.isSelected();
		if(ismaleButtonSelected==false && isfemaleButtonSelected==false && isAgeGroup1to18Selected==false && isAgeGroup19to44Selected==false && isAgeGroup45to60Selected==false )
		{
			System.out.println("all buttons are unselected");
		}
		else
		{
			System.out.println("all buttons are selected");
		}
	}
	
	public void verifyGroupRadioButtonSelection()
	{
		WebElement femaleButton=driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		femaleButton.click();
		Boolean isfemaleButtonSelected=femaleButton.isSelected();
		WebElement ageGroup19to44=driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		ageGroup19to44.click();
		Boolean isAgeGroup19to44Selected=ageGroup19to44.isSelected();
		WebElement getResultsButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		getResultsButton.click();
		WebElement genderAndAge=driver.findElement(By.xpath("//div[@id='message-two']"));
		String genderAndAgeText=genderAndAge.getText();
		
	}
	
	

	public static void main(String[] args) 
	{
		RadioButtonDemo radiobuttondemo=new RadioButtonDemo();
		radiobuttondemo.initialiseBrowser();
		radiobuttondemo.verifyRadioButtonDemo();
		radiobuttondemo.verifyGroupRadioButtonsDemo();
		radiobuttondemo.verifyGroupRadioButtonSelection();
		radiobuttondemo.browserQuit();

	}

}
