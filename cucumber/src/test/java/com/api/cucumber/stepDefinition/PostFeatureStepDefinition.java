package com.api.cucumber.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostFeatureStepDefinition {
	@Given("^User should be logged in $")
	public void user_should_be_logged_in() throws Throwable {
		System.out.println("Given User should be logged in");
	}

	@When("^I type the post as \"([^\"]*)\" in the text wall$")
	    public void i_type_the_post_as_something_in_the_text_wall(String strArg1) throws Throwable {
	        System.out.println("Value : " + strArg1);
	}

	@When("^User supply the YouTube link as \"([^\"]*)\" in the textbox$")
	public void user_supply_the_youtube_link_as_something_in_the_textbox(String strArg1) throws Throwable {
		System.out.println("Value : " + strArg1);
	}

	@Then("^The message should get posted$")
	public void the_message_should_get_posted() throws Throwable {
		System.out.println("Then The message should get posted");
	}

	@Then("^Video should posted on user wall$")
	public void video_should_posted_on_user_wall() throws Throwable {
		System.out.println("Then Video should posted on user wall");
	}

	@And("^should be present at its own wall$")
	public void should_be_present_at_its_own_wall() throws Throwable {
		System.out.println("And should be present at its own walls");
	}

	@And("^Click on post button$")
	public void click_on_post_button() throws Throwable {
		System.out.println("And Click on post button");
	}

	@And("^Video should have proper Thumbnail$")
	public void video_should_have_proper_thumbnail() throws Throwable {
		System.out.println("And Video should have proper Thumbnail");
	}

}
