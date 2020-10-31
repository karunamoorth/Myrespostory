package myprograms;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class objectfind {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int i =0;
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("alex");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.DOWN);
		//System.out.println(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).getText());
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String value = "return document.getElementById(\"twotabsearchtextbox\").value;";
		
		String textbox = (String) js.executeScript(value);
		//System.out.println(textbox);
		
		while(!textbox.equalsIgnoreCase("alexa smart plugs"))
		{
			i++;
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.DOWN);
			
			textbox = (String) js.executeScript(value);
			if(i>10)
			{
				break;
			}
		}
		if(i>10)
		{
			System.out.println("Element Not found");
		}
		else {
			System.out.println(textbox);
		}
		
	}

}
