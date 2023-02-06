package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	@FindBy(xpath = "//*[text()='Users']")
	WebElement users;

	public UsersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Usersbuttonverify() {
		users.click();
	}

}
