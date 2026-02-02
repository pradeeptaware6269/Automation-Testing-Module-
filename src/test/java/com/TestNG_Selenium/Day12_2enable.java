package com.TestNG_Selenium;

import org.testng.annotations.Test;

public class Day12_2enable {
	@Test
	void loggedIn() {
		System.out.println("System Logged In");
	}

	// This test will run first
	@Test(priority = 1, enabled = false)
	void display() {
		System.out.println("Display Module");
	}

	// This test will run second
	@Test(priority = 2)
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
