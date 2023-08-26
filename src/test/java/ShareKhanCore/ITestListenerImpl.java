package ShareKhanCore;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

public class ITestListenerImpl extends ExtentReportListener implements ITestListener{
	
	private static ExtentReports extent;

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("Execution completed on UAT env......");
		extent.flush();
		System.out.println("Generated Report ....................");
		
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("Execution started on UAT env......");
		extent=setup();
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailedButWithinSuccessPercentage");
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailure");
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("onTestSkipped");
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("onTestStart");
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("onTestSuccess");
	}
	
}
