package com.TestNG_Selenium;

import org.testng.annotations.Test;

public class Day12_8_group {
	@Test()
	void loggedIn() {
		System.out.println("System Logged In");
	}

	// This test will run first
	@Test(priority = 1, groups = "sanity")
	void display() {
		System.out.println("Display Module");
		// If any error are occured are here then search method cannot be exucute
	}

	// This test will run only after display() executes successfully
	@Test(priority = 2, dependsOnMethods = "display", groups = "smoke")
	void search() {
		System.out.println("Search Module");
	}

	// This test will run last
	@Test(priority = 3, groups = "sanity")
	void register() {
		System.out.println("Register Module");
	}

	@Test(groups = "smoke")
	void logout() {
		System.out.println("System log out ");
	}

	@Test(enabled = false, groups = "regression")
	void view() {
		System.out.println("System view");
	}

}
