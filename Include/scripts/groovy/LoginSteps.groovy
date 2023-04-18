import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class LoginSteps {
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		println " I am inside given"
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')		
	}
	
	@When("user enters the (.*) and (.*)")
	public void user_enters_the_username_and_password(String username , String password) {
		println " I am inside when"
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Gebruikersnaam_username'), username)
WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Wachtwoord_password'), password)
	}
	
	@And("clicks on login button")
	public void clicks_on_login_button() {
		println " I am inside And"
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))
	}
	
	@Then("user is navigated to the Home page")
	public void user_is_navigated_to_the_Home_page() {
		println " I am inside Then"
		WebUI.closeBrowser()
		
	}
	
}


