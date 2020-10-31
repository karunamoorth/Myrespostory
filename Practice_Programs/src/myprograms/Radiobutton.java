package myprograms;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				driver.get("https://www.amazon.com/ref=nav_logo");
				Select S = new Select( driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect']")));
				S.selectByValue("search-alias=appliances");
				S.selectByIndex(2);
				driver.findElement(By.xpath("//a[@class='a-link-normal see-more truncate-1line']")).click();
			
		//select radio button
				driver.get("http://www.echoecho.com/htmlforms10.htm");
				driver.findElement(By.xpath("//input[@value='Butter']")).click();
				
				// How many Button are there??
				
				int sizee = driver.findElements(By.xpath("//input[@name='group1']")).size();
				System.out.println(sizee);
				int siz = driver.findElements(By.xpath("//input[@name='group2']")).size();
				System.out.println(siz);
				for(int i=0; i<siz; i++)
				{
					driver.findElements(By.xpath("//input[@name='group2']")).get(i).click();
				}
				
				//compare and select the radio
				for(int i=0; i<siz; i++)
				{
					String text = driver.findElements(By.xpath("//input[@name='group2']")).get(i).getAttribute("Value");
					System.out.println(text);
					if(text.equals("Beer"))
					{
						driver.findElements(By.xpath("//input[@name='group2']")).get(i).click();
					}
				}
				
				
				driver.close();
	}
	
}
