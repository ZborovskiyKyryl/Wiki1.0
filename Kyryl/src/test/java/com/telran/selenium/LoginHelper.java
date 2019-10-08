package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginHelper extends TestBase {

    WebDriver driver;

    public LoginHelper(WebDriver driver) {
            this.driver = driver;
    }


    public void type(By locator, String text) {
        app.getSessionHelper().click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }
}
