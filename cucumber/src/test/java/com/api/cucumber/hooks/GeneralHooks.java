package com.api.cucumber.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class GeneralHooks {
	
	//Steps to create hooks
	// 1. create public method 
	// 2. Use @Before and @After annotations with the methods
	// 3. Specify the package in the runner
	
	@Before
	public void setup() {
		System.out.println("***Before Hook***");
	}
	
	@After
	public void tearDown() {
		System.out.println("***After Hook***");
	}
}
