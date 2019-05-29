package Com.parametertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginwithParameter {

	WebDriver driver;
	
	@BeforeMethod
	@Parameters({"url","browser"})
	public void setup(String url,String browser){	
		if(browser.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Softwares\\Suresh Sir Selinum\\New Softwares&Jars\\Browser\\chromedriver 74 version.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		}
	}
	@Test
	@Parameters({"firstname"})
	public void Register(String firstname){
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("gaduputi");
	}
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
}
