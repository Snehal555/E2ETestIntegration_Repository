package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCases001 {
  @Test
  public void GetTitle() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Snehal joshi\\Downloads\\geckodriver-v0.29.0-win64/geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "C:\\Users\\Snehal joshi\\Downloads\\geckodriver-v0.29.0-win64/LogFile.txt");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		String expTitle = "Google";
		String actTitle = driver.getTitle();
		System.out.println("expTitle "+expTitle);
		System.out.println("actTitle "+actTitle);

		if(expTitle.equals(actTitle))
		{
			System.out.println("Testcases pass");

		}
		else
		{
			System.out.println("Testcases fail");

		}
		driver.close();
  }
  
}
