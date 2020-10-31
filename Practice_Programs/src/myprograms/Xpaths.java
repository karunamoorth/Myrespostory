package myprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\MY Automation\\check\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://devhints.io/xpath#using-axes");
		System.out.println(driver.findElement(By.xpath("//table[@class='-headers']/tbody[4]/tr[3t]/preceding-sibling::tr")).getText());
		
	}

}
