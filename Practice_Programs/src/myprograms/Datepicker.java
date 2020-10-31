package myprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\MY Automation\\check\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("label[for='departure']")).click();
			
	while(!driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText().contains("Sep"))
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}

	//	List<WebElement> dates = driver.findElements(By.xpath("//div[contains(@aria-label,'2019')]"));
		
	//	int count = driver.findElements(By.xpath("//div[contains(@aria-label,'2019')]")).size();

		List<WebElement> dates = driver.findElements(By.xpath("//div[@role='gridcell']"));
		
		int count = driver.findElements(By.xpath("//div[@role='gridcell']")).size();
		
		for(int i=0; i<count;i++)
		{
			String tes = dates.get(i).getText();
		//	System.out.println(tes);

			if(tes.contains("7"))
			{
				//driver.findElements(By.xpath("//div[contains(@aria-label,'2019')]")).get(i).click();
				
				driver.findElements(By.xpath("//div[@role='gridcell']")).get(i).click();

				
				break;
			}
		}
	//	driver.close();
	}

}
