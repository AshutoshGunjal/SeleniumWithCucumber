package com.api.cucumber.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class GeneralHooks {
	
	//Steps to create hooks
	// 1. create public method 
	// 2. Use @Before and @After annotations with the methods
	// 3. Specify the package in the runner
	// 4. Inject scenario object inside the hook method
	
	@Before
	public void setup(Scenario name) {
		System.out.println("***Before Hook***");
		System.out.println("Name : "+name.getName());
		System.out.println("Status : "+name.getStatus());
	}
	
	@After
	public void tearDown(Scenario name) {
		System.out.println("***After Hook***");
		System.out.println("Name : "+name.getName());
		System.out.println("Status : "+name.getStatus());
	}
}
