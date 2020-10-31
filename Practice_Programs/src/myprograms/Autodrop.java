package myprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autodrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\MY Automation\\check\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("MI");
		driver.findElement(By.name("q")).sendKeys(Keys.DOWN);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//String text = "return document.getElementsByName(\"q\");";
		String text = "return document.getElementsByTagName(\"input\");";
		String result = (String) js.executeScript(text);
		System.out.println(result);
		
		while(!result.equalsIgnoreCase("mi")) 
		{
			driver.findElement(By.name("q")).sendKeys(Keys.DOWN);
			result = (String)js.executeScript(text);
		}
		System.out.println(result);
	}

}