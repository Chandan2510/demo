package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsefullinksPage {
	@FindBy(xpath = "//ul/li[5]/a/span")
	WebElement UL;

	public UsefullinksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void usefullinksbuttonverify() {
		UL.click();
	}
	

}
