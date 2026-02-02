package com.TestNG_Selenium;

import org.testng.annotations.Test;

public class Day12_4_alwaysRun {

	// This test will run even if display() fails
	@Test(priority = 2, dependsOnMethods = "display", alwaysRun = true)
	void search() {
		System.out.println("Search Module");
	}

	// This test will run last
	@Test(priority = 3, alwaysRun = false, enabled = false)
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
