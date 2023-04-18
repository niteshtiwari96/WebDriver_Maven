package com.test.Git_Project_For_Facebook_Login_Functionality;

import java.util.concurrent.TimeUnit;
//Secure shell cryptography

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void InitialStep()
	{
		System.setProperty("webdriver.geckodriver.driver", "D:\\Manual Testing and Automation Selenium\\Selenium_Drivers\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
		WebDriver driver=new  FirefoxDriver();
		System.out.println("Lauching Browser");
		
	}

	@Test
	public void doLogin()
	{
		System.out.println("Executing Logn Test");
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		System.out.println("Entering Username");
		driver.findElement(By.xpath("//*[@id='email'")).sendKeys("niteshtiwari186@gmail.com");
		
		System.out.println("Entering password");
		driver.findElement(By.xpath("//*[@id='pass'")).sendKeys("nitesh123");
		
		System.out.println("Clicking on login Button");
		driver.findElement(By.name("login")).click();
		
		System.out.println("Loginning into facebook account");
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		if(driver!=null)
		{
			driver.close();
		}
	}
}
