package myprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Syncs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicit wait

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://test.salesforce.com");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("lakshmi.majeti@globalpay.com.cert1");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("May@2019");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 35);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='uiImage']")));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(locator)(By.cssSelector("svg#setup")));
		//driver.findElement(By.xpath("//svg[@data-key='setup']")).click();
		driver.findElement(By.xpath("//span[@class='uiImage']")).click();
		driver.findElement(By.linkText("Switch to Salesforce Classic")).click();

	}

}
