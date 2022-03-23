package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class New1Test {
	
	//both drivers working fine
	
	public static WebDriver driver;
	
	
  @Test(enabled=false)
  public void fTest() {	  
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");	  
	    driver= new ChromeDriver();	
	    driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		driver.get("https://www.softwaretestingmaterial.com");
		System.out.println(driver.getTitle());	    
		System.out.println("hello");  
	
	  
	 
  }
  
  @Test(enabled=false)
  public void f1Test() {	  
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");	  
	    driver= new ChromeDriver();	
	    driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		driver.get("https://www.freshworks.com/");	
	
	  
  }
  
  @Test(enabled=true)
  public void f2Test() {	  
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");	  
	    driver= new ChromeDriver();	
	    driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		//driver.get("https://stackoverflow.com/questions/28921333/installed-python-3-on-mac-os-x-but-its-still-python-2-7");
		
		driver.get("https://classic.crmpro.com/index.html");			
		driver.findElement(By.name("username")).sendKeys("prachi");
		
		  
	  
  }
  
  @Test(enabled=false)
  public void f3Test() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			driver.manage().window().maximize();		
			driver.get("https://stackoverflow.com/questions/28921333/installed-python-3-on-mac-os-x-but-its-still-python-2-7");			
			  
	  
  
}

  @Test(enabled=true)
  public void f4Test() 
  {
	  
	  System.out.println("hello");
	  
  }
  
  
}