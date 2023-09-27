package com.co.senasoft.steps;

import com.co.senasoft.pageobjects.LoginPage;
import com.co.senasoft.pageobjects.RegisterPage;
import net.thucydides.core.annotations.Step;

public class LoginStep {
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();

    @Step
    public void enterCredentials(){
        registerPage.getDriver().findElement(loginPage.getTXT_USER_NAME())
                .sendKeys("Jcarreño");
        registerPage.getDriver().findElement(loginPage.getTXT_PASSWORD())
                .sendKeys("1234");
        registerPage.getDriver().findElement(loginPage.getBTN_LOGIN())
                .click();
    }
}
