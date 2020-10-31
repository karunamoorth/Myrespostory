package myprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SslGateway {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//ch.setCapability(CapabilityType.SUPPORTS_ALERTS, true);
				
		ChromeOptions c = new ChromeOptions();
		//c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver75.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://g1nwgrocw001.gpn.globalpay.com/IMViewer/Login.aspx");
		
	}
}

/*public void certificationExceptionForSSL() {
	if (webDriver.getTitle().equalsIgnoreCase("Certificate Error: Navigation Blocked")) {
		certificationException();
	}
}

public void certificationException() {
	try {
		webDriver.navigate().to("javascript:document.getElementById('overridelink').click()");
	} catch (NoSuchElementException e) {
	}
} */