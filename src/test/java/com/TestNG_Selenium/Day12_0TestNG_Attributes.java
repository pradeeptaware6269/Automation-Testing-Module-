package com.TestNG_Selenium;

import org.testng.annotations.Test;

public class Day12_0TestNG_Attributes {

	// This test will run first
	@Test()
	void display() {
		System.out.println("Display Module");
	}

	// This test will run second
	@Test()
	void search() {
		System.out.println("Search Module");
	}

	// This test will run last
	@Test()
	void register() {
		System.out.println("Register Module");
	}
}
