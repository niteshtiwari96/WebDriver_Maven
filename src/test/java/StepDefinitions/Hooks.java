package StepDefinitions;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;



import ShareKhanCore.WebConnector;
import ShareKhan_Util.TestConfig;
import ShareKhan_Util.monitoringMail;
import ShareKhan_Util.testUtil;

import cucumber.api.java.After;
import cucumber.api.java.Before;




public class Hooks extends WebConnector {
	
	@Before("@MobileTest")
	public void openBrowser()
	{
		
		//Checking browser and launching according to it.
		if(config.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Manual Testing and Automation Selenium\\Selenium_Drivers\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}else if(config.getProperty("browser").equals("Edge"))
		{
			System.setProperty("webdriver.msedgedriver.driver", "D:\\Manual Testing and Automation Selenium\\Selenium_Drivers\\edgedriver_win64\\msedgedriver");
			driver=new  EdgeDriver();
			
		}else if(config.getProperty("browser").equals("firefox"))
		{
			System.setProperty("webdriver.geckodriver.driver", "D:\\Manual Testing and Automation Selenium\\Selenium_Drivers\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
			driver=new  FirefoxDriver();
		}
	}
	
	
	
	@After("@MobileTest")
	public void close_Browser_after_execution() throws AddressException, MessagingException
	{
		if(driver!=null)
		driver.close();
		testUtil.zip(System.getProperty("user.dir")+"\\screenshot\\");
		monitoringMail mail=new monitoringMail();
		mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);
		
	}
	
	 /*@After(order=1) //Cucumber hook - runs for each scenario
	 public static void quitDriver() throws Exception
	 {
	  driver.quit();
	 }
	 @After(order = 2) // Cucumber After Hook with order 1
	 public void takeScreenShotOnFailedScenario(Scenario scenario) {

	  System.out.println("Taking screenshot from Cucumber After hook with order=2 if the scenario fails");
	  if ((scenario.isFailed())) {
	   final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	   scenario.attach(screenshot, "image/png", scenario.getName());
	  }
	 }*/
	
}