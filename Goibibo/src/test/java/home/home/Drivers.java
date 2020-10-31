package home.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Drivers {
	
	WebDriver driver;
	public WebDriver driverselect(String name)
	{
		if(name.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\MY Automation\\check\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(name.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\MY Automation\\check\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(name.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\MY Automation\\check\\driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		return driver;
	}

}
