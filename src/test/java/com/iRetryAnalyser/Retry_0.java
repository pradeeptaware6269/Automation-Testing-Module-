package com.iRetryAnalyser;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_0 implements IRetryAnalyzer {
	int start = 1;
	int end = 5;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if (start < end) {
			start++;
			return true;
		}
		return false;
	}

}
