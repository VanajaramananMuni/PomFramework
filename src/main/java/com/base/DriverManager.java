package com.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	public WebDriver driver;

	public void driverInitialisation() throws IOException {

		switch (Constants.Browser) {

		case "chrome":
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");

			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup(); // Setup Firefox driver
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			break;
		}

	}

	public void tearDown() {

		driver.close();
		driver.quit();
	}

}
