package myprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.cssSelector("label[for='departure']")).click();
			
		List<WebElement> dates = driver.findElements(By.cssSelector("div[class='dateInnerCell']"));
//		WebElement na = dates.get(3);
//		String s= na.getText();
//		System.out.println(s);
		
		/*for(WebElement nam : dates)
		{
		String namee = nam.
		System.out.println(namee);
		}*/
		int count = driver.findElements(By.cssSelector("div[class='dateInnerCell']")).size();
		
		for(int i=0; i<count;i++)
		{
			//String text = driver.findElements(By.cssSelector("div[class='dateInnerCell']")).get(i).getText();
			String tes = dates.get(i).getText();
			System.out.println(tes);
			
		if(tes.equalsIgnoreCase("16"))
			{
				driver.findElements(By.cssSelector("div[class='dateInnerCell']")).get(i).click();
				
				System.out.println("if condition");
				break;
			}
		}
	//	System.out.println("done");*/
		//driver.close();
	}

}
