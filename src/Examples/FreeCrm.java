package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FreeCrm {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver","D:\\Testing Softwares\\Suresh Sir Selinum\\New Softwares&Jars\\Browser\\chromedriver 74 version.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://freecrm.com/");
	}
	@Test
	public void gettittle(){
		String tittle=driver.getTitle();
		System.out.println(tittle);
		
	}
	@Test(priority=1)
	public void login() throws Exception{
		/*boolean login=driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).isEnabled();
		System.out.println(login);*/
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		Thread.sleep(5000);
		System.out.println("Login page Display");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sekhargaduputi@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sekhar@9676");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		
	}
	@Test(priority=2)
	public void logout() throws Exception{
		System.out.println("Login Successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='settings icon']")).click();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Log Out"))).build().perform();
		driver.findElement(By.linkText("Log Out")).click();
	}
	
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}

}
