package com.iRetryAnalyser_0;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase_Method_1 {

	@BeforeClass
	public void before() {
		System.out.println("Actual Execution are started Here ");
	}

	@Test()
	public void test0() {
		Assert.assertEquals(4, 4);
	}

	@Test
	public void test1() {
		Assert.assertEquals(4, 4);
	}

	@Test
	public void test2() {
		Assert.assertEquals(4, 4);
	}

	@Test
	public void test3() {
		Assert.assertEquals(2, 4);
	}

	@Test(retryAnalyzer = Retry_0.class)
	public void test4() {
		Assert.assertEquals(2, 4);
	}

	@Test(retryAnalyzer = Retry_0.class)
	public void test5() {
		Assert.assertEquals(2, 4);
	}

	@Test(retryAnalyzer = Retry_0.class)
	public void test6() {
		Assert.assertEquals(2, 4);
	}

	@Test(retryAnalyzer = Retry_0.class)
	public void test7() {
		Assert.assertEquals(2, 4);
	}

	@Test(retryAnalyzer = Retry_0.class)
	public void test8() {
		Assert.assertEquals(4, 4);
	}

	@Test
	public void test9() {
		throw new SkipException("Skipping this test case 9 intentionally");
	}

	@Test
	public void test10() {
		throw new SkipException("Skipping this test case 10 intentionally");
	}

	@AfterClass
	public void end() {
		System.out.println(" Actual Execution are ended Here ");

	}

}
