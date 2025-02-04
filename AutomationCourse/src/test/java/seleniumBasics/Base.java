package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;// declare webdriver variable. WebDriver is an interface
//method to initialize browser

	public void initializeBrowser() {
		driver = new FirefoxDriver();// create a new instance for Firefox browser.FirefoxDriver is a class
		// driver=new ChromeDriver();//create a new instance for chrome browser
		// driver=new EdgeDriver();//create a new instance for Edge browser
		driver.get("https://selenium.qabible.in/");// open or launch URL
		driver.manage().window().maximize();// to maximize the screen
	}


	public void driverCloseQuit() {
		// driver.close();//to close the latest window in the session
		driver.quit();// to close all windows in the session
	}

	public static void main(String[] args) {
		Base base = new Base();
		base.initializeBrowser();// call to launch Firefox
		base.driverCloseQuit();

	}

}
