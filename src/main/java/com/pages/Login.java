package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;

	By Usernnname = By.xpath(("(//div[@class='form_group'])[1]/input[1]"));

	By password = By.xpath(("(//div[@class='form_group'])[2]/input[1]"));
	By submitbutton = By.xpath(("//input[@class='submit-button btn_action']"));
	By facebooklink = By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[2]/a");

	public Login(WebDriver driver) {

		this.driver = driver;

	}

	public void Username_Method(String username) throws InterruptedException {

		driver.findElement(Usernnname).sendKeys(username);
		Thread.sleep(2000);

		if (driver == null) {

			System.out.println("driver is null ramanan");
		}

	}

	public void password_Method(String passwordd) {
		driver.findElement(password).sendKeys(passwordd);

	}

	public void submitbutton() {

		driver.findElement(submitbutton).click();

	}

	public void facebookLink() {

		driver.findElement(facebooklink).click();

	}
}
