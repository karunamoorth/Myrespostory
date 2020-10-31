package myprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/gmail/about/#");
						
		//driver.findElement(By.xpath("//svg[@roll='img'")).click();
		driver.findElement(By.xpath("//section[@class='h-c-footer__global']//following::a[7]")).click();
		
		Set<String> Setname = driver.getWindowHandles();
		
		List<String> Lname = new ArrayList<String>();
		Lname.addAll(Setname);
		
		driver.switchTo().window(Lname.get(0));
		
		driver.quit();
	}

}
