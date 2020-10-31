package myprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxtest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\MY Automation\\check\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_form_checkbox");
		driver.switchTo().frame("iframeResult");
		//testNG validation
		//assert false
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Bike']")).isSelected());
		Assert.assertFalse(false);
		
		System.out.println(driver.findElement(By.xpath("//input[@value='Bike']")).isSelected());
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Bike']")).click();
		
		//Assert true
		System.out.println(driver.findElement(By.cssSelector("input[value='Bike']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[value='Bike']")).isSelected());
		Assert.assertTrue(true);
		//size of check box
		int size = (driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		//Assert.equal
		Assert.assertEquals(size, 2);
		System.out.println(size);
		
		driver.close();
	}

}




