package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManadger   {


    WebDriver driver;
    LoginHelper loginHelper;
    SessionHelper sessionHelper;

    public String browser;

    public ApplicationManadger(String browser){
        this.browser = browser;
    }


    public void init(){
        if(browser.equals(BrowserType.CHROME)){
            driver = new ChromeDriver();
        }else if(browser.equals(BrowserType.FIREFOX)){
            driver = new FirefoxDriver();
        }else if(browser.equals(BrowserType.IE)) {
            driver = new InternetExplorerDriver();
        }

        driver.manage().window().maximize();
        sessionHelper = new SessionHelper(driver);
        loginHelper = new LoginHelper(driver);

    }



    public LoginHelper getLoginHelper(){
        return loginHelper;
    }

    public SessionHelper getSessionHelper(){
        return sessionHelper;
    }


}
