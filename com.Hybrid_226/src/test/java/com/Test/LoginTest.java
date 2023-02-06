package com.Test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.DashBoardPage;
import com.pages.LoginPage;
import com.pages.Operator;
import com.pages.UsefullinksPage;
import com.pages.UsersPage;

public class LoginTest extends BaseClass {

	LoginPage lp = null;
	DashBoardPage dbp = null;
	UsersPage up = null;
	Operator op = null;
	UsefullinksPage ufp = null;

	@BeforeSuite
	public void steup() throws Exception {
		initialization();
		reportInit();
		lp = new LoginPage(driver);
		dbp = new DashBoardPage(driver);
		up = new UsersPage(driver);
		op = new Operator(driver);
		ufp = new UsefullinksPage(driver);
	}
//Login Testcases
	@Test
	public void test01() {
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
	}

	@Test
	public void test02() {
		lp.loginToApplication("kiran@gmail.com", "123456");
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
// Dashc=board Testcases
	@Test
	public void test03() {
		String msg1 = dbp.CheckDashboardMsg1();
		Assert.assertEquals(msg1, "Selenium");
	}

	@Test
	public void test04() {
		String msg2 = dbp.CheckDashboardMsg2();
		Assert.assertEquals(msg2, "Java / J2EE");
	}

	@Test
	public void test05() {
		String msg3 = dbp.CheckDashboardMsg3();
		Assert.assertEquals(msg3, "Python");
	}

	@Test
	public void test06() {
		String msg4 = dbp.CheckDashboardMsg4();
		Assert.assertEquals(msg4, "Php");
	}
//User Testcases
	@Test 
	public void test07() {
		up.Usersbuttonverify();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | User");
	}

	//OperatorsPage Testcases
	@Test
	public void test08() {
		op.Operatorbuttonverify();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Operators");
	}

	//Usefullinkspage Testcases
	@Test
	public void test09() {
		ufp.usefullinksbuttonverify();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Useful Links");
	}

}
