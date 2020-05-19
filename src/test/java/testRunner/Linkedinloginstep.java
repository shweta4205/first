package testRunner;

import java.io.IOException;

import com.baseclass.com.Library;
import com.pages.Linkedinlogin;
import com.seleniumutils.Utils;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Linkedinloginstep extends Library {
	Linkedinlogin login;
	
			 
	@Given("^Launch the chrome browser and enter the url$")
	public void launch_the_chrome_browser_and_enter_the_url() throws IOException{
		System.out.println("1111--launching application"); 
		
			lunchapplication();
		}

	@When("^linked Login page is opened$")
	public void linked_Login_page_is_opened() {
		 System.out.println("browser is open");
	}
		 
	@Then("^click Sign in$")
	public void click_Sign_in(){
		 System.out.println("going to click");	 
		 login = new Linkedinlogin(driver);
		 System.out.println("going to click2222");	 
		 login.clickSigninbutton();
	   
	}


	@Then("^on linked Enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void on_linked_Enter_and(String email, String password) {
		 System.out.println("setting user name and pwd is open"); 
		login = new Linkedinlogin(driver);
		 login.Linkedinlogin1(email, password); 
	}

	



}
