package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Utility.PropertiesUtils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {
	public static WebDriver driver = null;
	public static ExtentReports reports = null;
	public static ExtentSparkReporter spark  = null;
	public static ExtentTest test = null;
	public static void initialization() throws Exception{
		String browsereName = PropertiesUtils.readProperty("browser");
		if (browsereName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");	
		driver = new ChromeDriver();
		}
		if (browsereName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","D:/geckodriver.exe");	
			driver = new FirefoxDriver();
			}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(PropertiesUtils.readProperty("url"));
	}
	public void reportInit() {
		reports = new ExtentReports();
		spark = new ExtentSparkReporter(System.getProperty("user.dir")+ "/target/ExtentReport.html");
		reports.attachReporter(spark);
	}
	}