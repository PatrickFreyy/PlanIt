package de.dhbw.planit;
import io.cucumber.java8.En;
public class usecase1 implements En {
	public usecase1(){

		@Given("I have {String} network connection" , (String networks) -> {
			
			return true;
		});
		
		@When(/^I start the application$/, () => {
			return true;
		});
		
		@Then(/^I can not load the page$/, () => {
			return true;
		});
		
		@Then(/^I get an error$/, () => {
			return true;
		});
		
		@Given(/^I have saved events in local storage$/, () => {
			return true;
		});
		
		@Then(/^I have a network connection$/, () => {
			return true;
		});
		
		@When(/^I start the application$/, () => {
			return true;
		});
		
		Then(/^I see should see all saved events in the application$/, () => {
			return true;
		});
		
		@Given(/^I have no saved events in local storage$/, () => {
			return true;
		});
		
		@Then(/^I have a network connection$/, () => {
			return true;
		});
		
		@When(/^I start the application$/, () => {
			return true;
		});
		
		@Then(/^I see the application with an empty schedule$/, () => {
			return true;
		});
		
	}
}