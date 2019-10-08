package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends TestBase {

    WebDriver driver;

    public SessionHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void openWiki(){
        driver.get("https://en.wikipedia.org");
    }

    public void type(By locator) {
        click(locator);
        driver.findElement(By.name("wpName")).clear();
        driver.findElement(By.name("wpName")).sendKeys("chachacha");
    }

    public void click(By locator)
    {
        driver.findElement(locator).click();
    }
}
