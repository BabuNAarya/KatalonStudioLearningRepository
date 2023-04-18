import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class LoginSteps {
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		println " I am inside given"
	}
	
	@When("user enters the username and password")
	public void user_enters_the_username_and_password() {
		println " I am inside when"
	}
	
	@And("clicks on login button")
	public void clicks_on_login_button() {
		println " I am inside And"
	}
	
	@Then("user is navigated to the Home page")
	public void user_is_navigated_to_the_Home_page() {
		println " I am inside Then"
	}
	
}


