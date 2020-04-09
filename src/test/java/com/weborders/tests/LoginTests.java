package com.weborders.tests;

import com.weborders.pages.LoginPage;
import org.testng.Assert;

import org.testng.annotations.Test;
//import static org.testng.Assert.*; //will not need to write Assert.assertEquals

public class LoginTests extends AbstractBaseTest {

    @Test
    public void login(){
        extentTest=extentReports.createTest("verify page logo");// for report
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        Assert.assertEquals(loginPage.getPageLogoText(),"Web Orders");

        extentTest.pass("Logo verified!");

    }
}
