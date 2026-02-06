package com.iRetryAnalyser_1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
	int start = 0;
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
