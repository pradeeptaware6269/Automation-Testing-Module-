package com.TestNG_Selenium;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Day27_Listner implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TEST STARTED : " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case Passed : " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case Failed: " + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case Skipped: " + result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Case Execution stated here ");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Case Execution Finished here");
	}
}
