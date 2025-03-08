package com.stepsdefnition;

import java.io.IOException;

import com.base.DriverManager;
import com.base.Utility;
import com.pages.PagefactoryLoginPages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDefnition extends DriverManager {

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {

		try {
			Utility ulitiyloading = new Utility();
			ulitiyloading.constantGetting();

			driverInitialisation();

			System.out.println("checkign after the new project has been created in git and checking in old repositi");

		} catch (Exception e) {
			throw new io.cucumber.java.PendingException();
		}

	}

	@When("user enter the valid credentials")
	public void user_enter_the_valid_credentials() {

		try {
			PagefactoryLoginPages pagefactoryobj = new PagefactoryLoginPages(driver);
			pagefactoryobj.userName("standard_user");
			pagefactoryobj.Password("secret_sauce");
			pagefactoryobj.submitButton();

			System.out.println("Ramaan all mass");

		} catch (Exception e) {
			throw new io.cucumber.java.PendingException();
		}

	}

	@Then("user should be navigate to dashboard page.")
	public void user_should_be_navigate_to_dashboard_page() {

		try {
		}

		catch (Exception e) {
			throw new io.cucumber.java.PendingException();

		}

		driver.close();
		driver.quit();

	}

}
