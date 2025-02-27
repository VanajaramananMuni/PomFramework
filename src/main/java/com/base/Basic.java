package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
	

	public static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.xpath("(//div[@class='form_group'])[1]/input[1]")).sendKeys("standard_user");
		WebElement password = driver.findElement(By.xpath("(//div[@class='form_group'])[2]/input[1]"));

		WebElement submitbutton = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));

		password.sendKeys("secret_sauces");
		submitbutton.click();

	}

}
