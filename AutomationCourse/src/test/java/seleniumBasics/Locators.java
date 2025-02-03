package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void locators() {

		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");// to go to input page of obsqura
																					// testing
		WebElement messageField = driver.findElement(By.id("single-input-field"));//to locate using id
		WebElement messageField1=driver.findElement(By.className("form-control"));//to locate using classname
		WebElement ShowmessageBox = driver.findElement(By.tagName("button-one"));//to locate using tagname
		WebElement headName = driver.findElement(By.name("description"));//to locate using name
		WebElement linkName = driver.findElement(By.linkText("Checkbox Demo"));
		WebElement linkNamePartial = driver.findElement(By.partialLinkText("Checkbox"));
		WebElement cssLocator=driver.findElement(By.cssSelector("button[id='button-one']"));
	}
	

	public static void main(String[] args) {

		Locators locators = new Locators();
		locators.initializeBrowser();
		locators.locators();
		locators.driverCloseQuit();

	}

}
