package StepDefs;

import io.cucumber.java.en.*;


public class LoginSteps {
	@Given("user in login page")
	public void user_in_login_page() {
	   System.out.println("inside step - user in login page");
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
		System.out.println("inside step - user enter valid username and password");
	}
	
	@And("click login button")
	public void click_login_button() {
		System.out.println("inside step - click login button");
	}

	@Then("the user is navigated to the home page")
	public void the_user_is_navigated_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("inside step - the user is navigated to the home page");
	}
}
