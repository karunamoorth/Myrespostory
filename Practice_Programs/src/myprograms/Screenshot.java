package myprograms;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver75.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.Google.com");
		driver.manage().window().maximize();
		
		//Take Screenshot
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Pasting the screen shot in desired folder
		
		FileUtils.copyFile(source,new File("D:\\ScreenshotFile\\Screenshot.jpg"));
		
		driver.quit();
	}

}
