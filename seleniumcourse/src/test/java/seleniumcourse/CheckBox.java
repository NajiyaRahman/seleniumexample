package seleniumcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends Base {
	
	public void verifySingleChecboxDemo()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement singleCheckBox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		singleCheckBox.click();
		Boolean isSingleCheckBoxSelected=singleCheckBox.isSelected();
	}
	
	public void verifyMultipleCheckboxDemo()
	{
		WebElement checkBoxOne=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		Boolean isCheckBoxOneSelected=checkBoxOne.isSelected();
		WebElement checkBoxTwo=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		Boolean isCheckBoxTwoSelected=checkBoxTwo.isSelected();
		WebElement checkBoxThree=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		Boolean isCheckBoxThreeSelected=checkBoxThree.isSelected();
		WebElement checkBoxFour=driver.findElement(By.xpath("//input[@id='check-box-four']"));
		Boolean isCheckBoxFourSelected=checkBoxFour.isSelected();
		if(isCheckBoxOneSelected==false && isCheckBoxTwoSelected==false && isCheckBoxThreeSelected==false && isCheckBoxFourSelected==false)
		{
			System.out.println("check boxes are unselected");
		}
		else
		{
			System.out.println("check boxes are selected");
		}
	}
	
	public void verifyTwoCheckBoxes()
	{
		WebElement checkBoxOne=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		checkBoxOne.click();
		Boolean isCheckBoxOneSelected=checkBoxOne.isSelected();
		WebElement checkBoxTwo=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		checkBoxTwo.click();
		Boolean isCheckBoxTwoSelected=checkBoxTwo.isSelected();
		if(isCheckBoxOneSelected==true && isCheckBoxTwoSelected==true)
		{
			System.out.println("Two checkboxes are selected");
		}
	}
	
	public void verifySelectAllButton()
	{
		WebElement selectAllButton=driver.findElement(By.xpath("//input[@id='button-two']"));
		selectAllButton.click();
		selectAllButton.getText();
		WebElement checkBoxOne=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		Boolean isCheckBoxOneSelected=checkBoxOne.isSelected();
		WebElement checkBoxTwo=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		Boolean isCheckBoxTwoSelected=checkBoxTwo.isSelected();
		WebElement checkBoxThree=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		Boolean isCheckBoxThreeSelected=checkBoxThree.isSelected();
		WebElement checkBoxFour=driver.findElement(By.xpath("//input[@id='check-box-four']"));
		Boolean isCheckBoxFourSelected=checkBoxFour.isSelected();
		
		
	}
	

	public static void main(String[] args) {
		CheckBox checkbox=new CheckBox();
		checkbox.initialiseBrowser();
		checkbox.verifySingleChecboxDemo();
		checkbox.verifyMultipleCheckboxDemo();
		checkbox.verifyTwoCheckBoxes();
		checkbox.verifySelectAllButton();
		//checkbox.browserQuit();
		

	}

}
