package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

	@FindBy(xpath = "//h3[text()='Selenium']")
	WebElement actualMsg1;

	@FindBy(xpath = "//h3[text()='Java / J2EE']")
	WebElement actualMsg2;

	@FindBy(xpath = "//h3[text()='Python']")
	WebElement actualMsg3;

	@FindBy(xpath = "//h3[text()='Php']")
	WebElement actualMsg4;

	


	public DashBoardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String CheckDashboardMsg1() {
		String Actual1 = actualMsg1.getText();
		return Actual1;

	}

	public String CheckDashboardMsg2() {
		String Actual2 = actualMsg2.getText();
		return Actual2;
	}

	public String CheckDashboardMsg3() {
		String Actual3 = actualMsg3.getText();
		return Actual3;
	}

	public String CheckDashboardMsg4() {
		String Actual4 = actualMsg4.getText();
		return Actual4;
	}



	

}
