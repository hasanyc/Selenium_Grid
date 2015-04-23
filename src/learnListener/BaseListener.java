package learnListener;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import basePack.Log4j;


public class BaseListener extends TestListenerAdapter{

	

	public void onTestFailure (ITestResult tr){
		System.out.println ("Listener: FAILED. Test Case Name is ===>> " + tr.getName());
		Log4j.APPLICATION_LOG.debug("Listener: FAILED. Test Case Name is ===>> " + tr.getName());	
		
	}


	public void onTestSkipped (ITestResult tr){
		System.out.println ("Listener: SKIPPED. Test Case Name is ===>> " + tr.getName());
		Log4j.APPLICATION_LOG.debug("Listener: SKIPPED. Test Case Name is ===>> " + tr.getName());
		
	}


	public void onTestSuccess (ITestResult tr){
		System.out.println ("Listener: PASSED. Test Case Name is ===>> " + tr.getName());
		Log4j.APPLICATION_LOG.debug("Listener: PASSED. Test Case Name is ===>> " + tr.getName());
	}



}




