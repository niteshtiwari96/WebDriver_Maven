package ShareKhanCore;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportListener extends WebConnector {

	public static ExtentHtmlReporter report=null;
	public static ExtentReports extent=null;
	public static ExtentTest test=null;
	
	public static ExtentReports setup(){
		String reportLocation="./Report/Extent_Report.html";
		report=new ExtentHtmlReporter(reportLocation);
		report.config().setDocumentTitle("Automation Test Report");
		report.config().setReportName("Sharekhan Report");
		report.config().setTheme(Theme.STANDARD);
		System.out.println("Extent Report location initialized......");
		report.start();
		
		extent=new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Application", "Sharekhan");
		extent.setSystemInfo("operating System", System.getProperty("Windows 11"));
		extent.setSystemInfo("User Name", System.getProperty("Nitesh Tiwari"));
		System.out.println("System Info. set in Extemnt Report");
		return extent;
	}
	
	public static void testStepHandle(String testStatus, WebDriver driver,ExtentTest extenttest,Throwable t){
		switch(testStatus)
		{
			case "FAIL":
			extenttest.fail(MarkupHelper.createLabel("Test Case is Failed : ", ExtentColor.RED));
			extenttest.error(t.fillInStackTrace());
		
		if(driver!=null){
			driver.quit();
		}
		break;
		
			case "PASS":
			extenttest.pass(MarkupHelper.createLabel("Test Case is Passed : ", ExtentColor.GREEN));
			break;
			
			default:
				break;
		}
	}
	
}
