package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VeryStartingpracticeTest {
	
	private static WebDriver driver;
	
	@BeforeClass
	public void general1Test()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
	}
	
	
  //@Test(priority = 2)
  public void fTest() {
	
	  driver.get("https://www.naukri.com/");
	  driver.findElement(By.id("qsb-keyword-sugg")).sendKeys("QA");
	 driver.findElement(By.id("qsb-location-sugg")).sendKeys("pune");
	 driver.findElement(By.xpath("//button[text()='Search']")).click();
	 driver.quit();
	  
	  
	  
}
  //@Test(priority = 1)
  public void f1Test() throws InterruptedException
  {
	  
	  driver.get("https://www.guru99.com/");
	  driver.findElement(By.xpath("//span[text()='SAP']")).click();
	  Thread.sleep(3000);
  
	  
	  
  }
  
  @Test(priority = 1)
  public void f2Test()
  {
	  driver.get("https://www.irctc.co.in/nget/train-search");
	  
	  
  }
  
  
  
  
  
  
}
