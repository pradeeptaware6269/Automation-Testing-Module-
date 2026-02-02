package com.TestNG_Selenium;

import org.testng.annotations.Test;

public class Day12_7_description {
	@Test
	void loggedIn() {
		System.out.println("System Logged In");
	}

	// This test will run first
	@Test(priority = 1)
	void display() {
		System.out.println("Display Module");
		// If any error are occured are here then search method cannot be exucute
	}

	// This test will run only after display() executes successfully
	@Test(priority = 2, dependsOnMethods = "display", description = "This is search method")
	void search() {
		System.out.println("Search Module");
	}

	// This test will run last
	@Test(priority = 3)
	void register() {
		System.out.println("Register Module");
	}

	@Test(description = "Logged out method")
	void logout() {
		System.out.println("System log out ");
	}

	@Test(enabled = false)
	void view() {
		System.out.println("System view");
	}
}
