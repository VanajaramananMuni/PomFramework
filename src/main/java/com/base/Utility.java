package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Utility extends DriverManager {

	WebDriver driver;

	public void urlLaunching() {

		System.out.println("Navigating to URL: " + Constants.URL);

	}

	public void constantGetting() throws IOException {

		FileInputStream stream = new FileInputStream(
				"C:\\Users\\91978\\eclipse-workspace\\PomFramework\\src\\test\\resources\\Confirg.properties");
		Properties prop = new Properties();
		prop.load(stream);
		Constants.URL = prop.getProperty("URL");
		Constants.Browser = prop.getProperty("Browser");

	}

}
