package com.test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.DriverManager;
import com.base.Utility;
import com.pages.Login;

public class LoginTestPOM extends DriverManager {

	@BeforeClass
	public void setUp() throws IOException {
		Utility ulitiyloading = new Utility();
		ulitiyloading.constantGetting();

		driverInitialisation();
	}

	@Test
	public void userLoginFunctionalityTest() throws InterruptedException {
		Login ll = new Login(driver);
		ll.Username_Method("standard_user");
		ll.password_Method("secret_sauce");
		ll.submitbutton();
		ll.facebookLink();
		System.out.println("Ramaan all mass");
	}

	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();

	}

}
