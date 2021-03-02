package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCases002 {
  @Test
  public void AddEmp() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Snehal joshi\\Downloads\\geckodriver-v0.29.0-win64/geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "C:\\Users\\Snehal joshi\\Downloads\\geckodriver-v0.29.0-win64/LogFile.txt");
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click(); // Click on PIM
		Thread.sleep(2000);
		
		driver.findElement(By.id("menu_pim_addEmployee")).click(); //Click on Add Employee
		Thread.sleep(2000);
		
		driver.findElement(By.id("firstName")).sendKeys("Snehal");
		driver.findElement(By.id("lastName")).sendKeys("joshi");
		
		driver.findElement(By.id("chkLogin")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("user_name")).sendKeys("Snehal_joshi2021");
		driver.findElement(By.name("user_password")).sendKeys("snehal2021");
		driver.findElement(By.name("re_password")).sendKeys("snehal2021");
		//driver.findElement(By.name("status")).click();
		driver.findElement(By.id("btnSave")).click();
		
		Thread.sleep(2000);
		
		// Logout
		
		driver.findElement(By.xpath("//*[@id='welcome']")).click();		
		Thread.sleep(2000);
				
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		
		
		driver.close();	

  }
}
