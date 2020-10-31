package myprograms;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\MY Automation\\check\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.xpath("//a[@href='https://support.google.com/accounts?hl=en-GB']")).click();
		System.out.println(driver.getTitle());
				
		//driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Karuna");
		
		//switching off second window
		//1. create sets
				
		Set<String> names= driver.getWindowHandles();
		
		ArrayList<String> lname = new ArrayList<String>();	
		lname.addAll(names);
		
		
		
		driver.switchTo().window(lname.get(0));
		String child = driver.getTitle();
		System.out.println("First window"+driver.getTitle());
		if(child.equals("Create your Google Account"))
		{
			driver.switchTo().window(lname.get(1));
			System.out.println("Second window"+driver.getTitle());
		}
		
	}

}
