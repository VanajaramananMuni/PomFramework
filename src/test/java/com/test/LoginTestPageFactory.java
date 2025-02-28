package com.test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.DriverManager;
import com.base.Utility;
import com.pages.Login;
import com.pages.PagefactoryLoginPages;

public class LoginTestPageFactory extends DriverManager {

	@BeforeClass
	public void setUp() throws IOException {
		Utility ulitiyloading = new Utility();
		ulitiyloading.constantGetting();

		driverInitialisation();

		System.out.println("checkign after the new project has been created in git and checking in old repositi");
	}
@Test
	public void userLoginFunctionalityTest() throws InterruptedException {

		PagefactoryLoginPages pagefactoryobj = new PagefactoryLoginPages(driver);
		pagefactoryobj.userName("standard_user");
		pagefactoryobj.Password("secret_sauce");
		pagefactoryobj.submitButton();

		System.out.println("Ramaan all mass");
	}

	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();

	}

}
