package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base {
 
	public void handlingMultipleWindow()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String parentWindowHandleid=driver.getWindowHandle();
		System.out.println(parentWindowHandleid);
		
		WebElement clickField=driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickField.click();
		
		
		
		
	}
	public static void main(String[] args) {
		MultipleWindowHandling multiple=new MultipleWindowHandling();
		multiple.initializeBrowser();
		multiple.handlingMultipleWindow();
		//multiple.driverCloseQuit();
		
	}

}
