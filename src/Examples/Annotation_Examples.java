package Examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_Examples {
	
	@BeforeSuite()                               //1
		public void setUp(){
			System.out.println("Setup system");
	}
	@BeforeTest                                  //2
	public void launchbrowser(){
		System.out.println("Launch browser");
	}
	@BeforeClass                                 //3
	public void login(){
		System.out.println("login");
	}
	
	@BeforeMethod                               //4
	public void enterurl(){
		System.out.println("Enter URL");
	}
	@Test
	public void a(){
		System.out.println("a test");
	}
	@Test                    //5
	public void googletittle(){
		System.out.println("Google tittle");  
	}
	@Test
	public void verfy(){
		System.out.println("Verify data");
	}
	@AfterMethod            //6
	public void logout(){
		System.out.println("logout method");
	}
	@AfterClass()       //7
	 public void closebrowser(){
		 System.out.println("Close browser");
	 }
	 @AfterTest            //8
	 public void deteleallcookies(){
		 System.out.println("Deleted cookies");
	 }
	 
		 @AfterSuite()  //9
		 public void tearDown(){
			 System.out.println("generted test reports");
		 }
	 }
	
	


