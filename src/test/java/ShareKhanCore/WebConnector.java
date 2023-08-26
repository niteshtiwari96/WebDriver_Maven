package ShareKhanCore;
/*
1.Use @Before("TestCaseTagName") in Hooks and Launch browser in it.
2.Complete Upload Photo Testcase
3.Generate Reports:html,json and junit
4.Use Attributes: monochrome and strict
5.Execeute cucumber project in eclipse.
6.Execute cucumber project from command prompt
7.Run project in Jenkins and generate test report in it.
8.Generate logs:Selenium and Application
9.Create screenshot folder in case of an error.
10.Send mail after complete execution.(Hooks)
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;


public class WebConnector {
	
	public static Properties config=new Properties();
	public static Properties object=new Properties();
	public static FileInputStream fis;
	public static WebDriver driver=null;
	public static Logger logs=Logger.getLogger("devpinoyLogger");
	//Extent Report/Customized Report
    

	
	public WebConnector() 
	{
		if(driver==null)
		{
			//loading config property file
			try {
				fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\ShareKhanConfig\\Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				config.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//loading object property file
			try {
				fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\ShareKhanConfig\\Object.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				object.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}	

}
