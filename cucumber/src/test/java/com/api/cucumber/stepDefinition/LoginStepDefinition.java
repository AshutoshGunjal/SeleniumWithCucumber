package com.api.cucumber.stepDefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	@Given("^User is at the login page of the application $")
    public void user_is_at_the_login_page_of_the_application() throws Throwable {
        
    }

    @When("^User login with following username and password $")
    public void user_login_with_following_username_and_password(DataTable table) throws Throwable {
    	List<List<String>> data = table.cells();
    	  for(List<String> str : data) {// iterate over to outer list 
    		  for(String str1 : str) {//iterate over to inner list 
    			  System.out.println("Data : " + str1);
    		  }
    	  }
    }

    @Then("^User should be able to login with correct username and passwrod$")
    public void user_should_be_able_to_login_with_correct_username_and_passwrod() throws Throwable {
    		System.out.println("Succesfull logged in");
    }
    
    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
    	System.out.println("Navigated to login url");
    }

    @When("^User loing into application with Username and Password$")
    public void user_loing_into_application_with_username_and_password() throws Throwable {
    	System.out.println("Logged in successfully");
    }

    @Then("^Home Page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Validated home page");
    }

    @And("^Cards are displyed$")
    public void cards_are_displyed() throws Throwable {
    
    }
}
