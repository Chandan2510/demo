package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Operator {
	@FindBy(xpath = "//ul/li[4]/a/span")
	WebElement Operators;

	public Operator(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Operatorbuttonverify() {
		Operators.click();
	}
}
