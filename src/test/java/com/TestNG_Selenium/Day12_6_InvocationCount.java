package com.TestNG_Selenium;

import org.testng.annotations.Test;

public class Day12_6_InvocationCount {
	@Test
	void loggedIn() {
		System.out.println("System Logged In");
	}

	// This test will run first
	@Test(priority = 1, invocationCount = 2, alwaysRun = true)
	void display() {
		System.out.println("Display Module");
		// If any error are occured are here then search method cannot be exucute
	}

	// This test will run only after display() executes successfully
	@Test(priority = 2, dependsOnMethods = "display")
	void search() {
		System.out.println("Search Module");
	}

	// This test will run last
	@Test(priority = 3)
	void register() {
		System.out.println("Register Module");
	}

	@Test
	void logout() {
		System.out.println("System log out ");
	}

	@Test(enabled = false)
	void view() {
		System.out.println("System view");
	}

}
