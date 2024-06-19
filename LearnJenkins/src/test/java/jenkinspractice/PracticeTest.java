package jenkinspractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.beust.jcommander.internal.Console;

public class PracticeTest {
	@Test
	public void launchLinekdin() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://in.linkedin.com/");
		Reporter.log("Executed linkedin", true);
		driver.quit();
	}
	@Test
	public void launchVtiger() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		Reporter.log("Executed", true);
		driver.quit();
	}
	
	@Test
	public void launchFacebook() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Reporter.log("Executed", true);
		driver.quit();
	}

}
