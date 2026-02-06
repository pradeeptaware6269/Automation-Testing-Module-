package com.iRetryAnalyser;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase_Method_2 {

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

	@Test
	public void test4() {
		Assert.assertEquals(2, 4);
	}

	@Test
	public void test5() {
		Assert.assertEquals(2, 4);
	}

	@Test
	public void test6() {
		Assert.assertEquals(2, 4);
	}

	@Test
	public void test7() {
		Assert.assertEquals(2, 4);
	}

	@Test
	public void test8() {
		Assert.assertEquals(4, 4);
	}

	@AfterClass
	public void end() {
		System.out.println(" Actual Execution are ended Here ");

	}

}
