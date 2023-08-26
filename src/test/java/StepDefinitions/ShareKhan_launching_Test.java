package StepDefinitions;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import ShareKhanCore.WebConnector;
import ShareKhan_Util.testUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class ShareKhan_launching_Test extends WebConnector{
	
	   
	

	  @Given("^ShareKhan website is open in the browser$")
	    public void sharekhan_website_is_open_in_the_browser() throws Throwable 
	    {
		  try{
			  
		  Thread.sleep(5000);
		  System.out.println("ShareKhan website is open in the browser");
		  //System.getProperty("webdriver.chrome.driver", "D:\\Selenium_Drivers\\chromedriver.exe");	
		  //driver=new ChromeDriver();
		  driver.get(config.getProperty("testsite"));
		  driver.getTitle();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40L));
		  }catch (Throwable t)
			{
				testUtil.captureScreenshot("ShareKhan_launching_Test");
				Assert.assertTrue(false, t.getMessage());
				
			}
			
	    }

	  
	  @Then("^the website is launched successfully$")
	    public void the_website_is_launched_successfully() throws Throwable 
	    {
		  try{
		   Thread.sleep(2000);
	       System.out.println("the website is launched successfully");
		  }catch (Throwable t)
			{
				testUtil.captureScreenshot("ShareKhan_launching_Test");
				Assert.assertTrue(false, t.getMessage());
				
			}
	    }
	    
	    
	 
	    @When("^user clicks on main menu$")
	    public void user_clicks_on_main_menu() throws Throwable 
	    {
	    	
	    	try{
	    	Thread.sleep(5000);
	    	System.out.println("user clicks on main menu");
	    	 WebElement MarketButton=driver.findElement(By.xpath(object.getProperty("MarketButton")));
	    	 MarketButton.click();
	    	 System.out.println(MarketButton.getText());
	    	 driver.navigate().back();
	    	 
	    	 Thread.sleep(5000);
	    	 WebElement NewToMarketButton=driver.findElement(By.xpath(object.getProperty("NewToMarketButton")));
	    	 NewToMarketButton.click();
	    	 System.out.println(NewToMarketButton.getText());
	    	 driver.navigate().back();
	    	 
	    	 Thread.sleep(5000);
	    	 WebElement SuperInverstorButton=driver.findElement(By.xpath(object.getProperty("SuperInverstorButton")));
	    	 SuperInverstorButton.click();
	    	 System.out.println(SuperInverstorButton.getText());
	    	 driver.navigate().back();
	    	 
	    	 Thread.sleep(5000);
	    	 WebElement ActiveTenderButton=driver.findElement(By.xpath(object.getProperty("ActiveTenderButton")));
	    	 ActiveTenderButton.click();
	    	 System.out.println(ActiveTenderButton.getText());
	    	 driver.navigate().back();
	    	 
	    	 Thread.sleep(5000);
	    	 WebElement MutualFundsButton=driver.findElement(By.xpath(object.getProperty("MutualFundsButton")));
	    	 MutualFundsButton.click();
	    	 System.out.println(MutualFundsButton.getText());
	    	 driver.navigate().back();
	    	
	    	 Thread.sleep(5000);
	    	 WebElement ResearchButton=driver.findElement(By.xpath(object.getProperty("ResearchButton")));
	    	 ResearchButton.click();
	    	 System.out.println(ResearchButton.getText());
	    	 driver.navigate().back();
	    	 
	    	 Thread.sleep(5000);
	    	 WebElement EducationFirstButton=driver.findElement(By.xpath(object.getProperty("EducationFirstButton")));
	    	 EducationFirstButton.click();
	    	 System.out.println(EducationFirstButton.getText());
	    	 driver.navigate().back();
	    	 
	    	 Thread.sleep(5000);
	    	 WebElement ProductandServiceButton=driver.findElement(By.xpath(object.getProperty("ProductandServiceButton")));
	    	 ProductandServiceButton.click();
	    	 System.out.println(ProductandServiceButton.getText());
	    	 driver.navigate().back();
	         }catch (Throwable t)
		     {
			      testUtil.captureScreenshot("ShareKhan_launching_Test");
			      Assert.assertTrue(false, t.getMessage());
			
		      }
	    	 
	    }
	    

	    @Then("^main menu pop is displayed$")
	    public void main_menu_pop_is_displayed() throws Throwable 
	    {
	    	try{
	      Thread.sleep(5000);
	      System.out.println("main menu pop is displayed");  
	    	}catch (Throwable t)
			{
				testUtil.captureScreenshot("ShareKhan_launching_Test");
				Assert.assertTrue(false, t.getMessage());
				
			}
	    }
	    
	    
		

}
