package PagePO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

public class Test2 {

	WebDriver driver=null;
@BeforeTest
	public void setUpTest()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}

@Test
		public void googlesearch2() {
	
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation testing");
		driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[3]/center/input[1]")).click();
	    driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
	
	}
@AfterTest
		public void teardown() {
			
			driver.close();
			driver.quit();
}
		}
		
	
	

