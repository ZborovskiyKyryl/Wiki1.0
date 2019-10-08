package com.telran.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class LoginToWiki extends TestBase {

    @Test
    public void loginToWiki() {
        app.getSessionHelper().openWiki();
        app.getSessionHelper().click(By.id("pt-login"));
        app.getSessionHelper().type(By.name("wpName"));
        app.getLoginHelper().type(By.name("wpPassword"), "111");
        app.getSessionHelper().click(By.name("wpRemember"));
        app.getSessionHelper().click(By.name("wploginattempt"));



    }



}
