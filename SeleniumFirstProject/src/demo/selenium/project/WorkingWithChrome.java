package demo.selenium.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {

	
	ChromeDriver driver;
	
		public void invokeBrowser()
		{
			System.setProperty("webdriver.chrome.driver", "D:\\jar files\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.google.com");	
		}
	    
		public void getTitle()
		{
			System.out.println("Page Title "+driver.getTitle());   
		}
		
		public void navigateCommands()
		{
			driver.navigate().to("https://www.facebook.com"); //It is called as "Method Chaning".
			driver.navigate().back();//it will take one step back to the browsing history.
			driver.navigate().forward();//it will take one step forward to the browsing history.
			driver.navigate().refresh();//it will reload the page
		}

		public void closeBrowser()
		{
			driver.close(); //closes the current instance of a browser
			//driver.quit(); //closes all the instance of the browser
		}
	}


