package com.co.senasoft.pageobjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    By TXT_USER_NAME = By.xpath("//input[@id='username']");
    By TXT_PASSWORD = By.xpath("//input[@id='password']");
    By BTN_LOGIN = By.xpath("//button[@type='submit']");


    public By getTXT_USER_NAME() {
        return TXT_USER_NAME;
    }

    public void setTXT_USER_NAME(By TXT_FIRST_NAME) {
        this.TXT_USER_NAME = TXT_FIRST_NAME;
    }

    public By getTXT_PASSWORD() {
        return TXT_PASSWORD;
    }

    public void setTXT_PASSWORD(By TXT_PASSWORD) {
        this.TXT_PASSWORD = TXT_PASSWORD;
    }

    public By getBTN_LOGIN() {
        return BTN_LOGIN;
    }

    public void setBTN_LOGIN(By BTN_LOGIN) {
        this.BTN_LOGIN = BTN_LOGIN;
    }
}
