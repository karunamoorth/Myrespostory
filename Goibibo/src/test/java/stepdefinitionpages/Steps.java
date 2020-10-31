package stepdefinitionpages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import home.home.Drivers;


public class Steps {

	WebDriver driver;

	Properties props= new Properties();



	Drivers d = new Drivers();


	@Given("^open browser and hit goibibo site$")
	public void open_browser_and_hit_goibibo_site() throws IOException, InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		FileInputStream FIS = new FileInputStream("src//test//java//home//home//prop.properties");
		props.load(FIS);
		driver= d.driverselect("chrome");

		driver.get(props.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@When("^click on hotel tab$")
	public void click_on_hotel_tab()  {
		// Write code here that turns the phrase above into concrete actions

		driver.findElement(By.xpath(props.getProperty("hoteltab"))).click();
	}



	@When("^select place$")
	public void select_place() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		//places
		driver.findElement(By.xpath(props.getProperty("radio"))).click();

		driver.findElement(By.xpath(props.getProperty("location"))).sendKeys("salem");
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN);
		action.sendKeys(Keys.ENTER);
		action.build().perform();
	}


	@When("^select check in and check out$")
	public void select_check_in_and_check_out() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		driver.findElement(By.xpath(props.getProperty("checkin"))).click();
		driver.findElement(By.xpath(props.getProperty("StartDate"))).click();
		driver.findElement(By.xpath(props.getProperty("EndDate"))).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath(props.getProperty("submit"))).click();

	}

	@When("^select first hotel from the list$")
	public void select_first_hotel_from_the_list() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		driver.findElement(By.xpath(props.getProperty("hotel"))).click();
	}

	@When("^select Costly room$")
	public void select_Costly_room()  {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^Take screenshot$")
	public void take_screenshot() {
		// Write code here that turns the phrase above into concrete actions

		//driver.close();
	}

}
