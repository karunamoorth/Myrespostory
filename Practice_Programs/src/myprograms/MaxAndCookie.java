package myprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxAndCookie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver75.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://aims.gpn.globalpay.com/");
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("subramka");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Kitkat@555");
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		driver.manage().deleteAllCookies();
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
