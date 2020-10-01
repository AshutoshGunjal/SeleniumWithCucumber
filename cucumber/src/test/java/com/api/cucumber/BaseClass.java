package com.api.cucumber;

public class BaseClass {
	
	private String featureName;
	public String getFeatureName() {
		return featureName;
	}
	
	private String scenarioName;
	public String getScenarioName() {
		return scenarioName;
	}
	
	public BaseClass() {
		featureName = "BDD";
		scenarioName = "Dependency Injection";
	}
	
}
