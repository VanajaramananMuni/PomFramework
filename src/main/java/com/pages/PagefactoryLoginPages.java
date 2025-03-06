package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PagefactoryLoginPages {

	WebDriver driver;
	@FindBy(xpath = "(//div[@class='form_group'])[1]/input[1]")
	WebElement Username;

	@FindBy(xpath = "(//div[@class='form_group'])[2]/input[1]")
	WebElement Password;

	@FindBy(xpath = "//input[@class='submit-button btn_action']")
	WebElement Submitbutton;
	


	public PagefactoryLoginPages(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	public void userName(String username) {

		Username.sendKeys(username);
	}

	public void Password(String Passssword) {

		Password.sendKeys(Passssword);
	}

	public void submitButton() {

		Submitbutton.click();
	}

}
