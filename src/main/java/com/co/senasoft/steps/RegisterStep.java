package com.co.senasoft.steps;

import com.co.senasoft.pageobjects.RegisterPage;
import net.thucydides.core.annotations.Step;
import org.apache.bcel.generic.PUSH;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.util.regex.Matcher;

public class RegisterStep {

    RegisterPage registerPage = new RegisterPage();

    @Step
    public void openBrowser(){
        registerPage.open();
    }

    @Step
    public void enterName()
    {
        registerPage.getDriver().findElement(registerPage.getTXT_FIRST_NAME())
                .sendKeys("Julian");
    }

    @Step
    public void enterLastName()
    {
        registerPage.getDriver().findElement(registerPage.getTXT_LAST_NAME())
                .sendKeys("Carreño");
    }

    @Step
    public void enterUserName()
    {
        registerPage.getDriver().findElement(registerPage.getTXT_USER_NAME())
                .sendKeys("Jcarreño");
    }
    @Step
    public void enterPassword()
    {
        registerPage.getDriver().findElement(registerPage.getTXT_PASSWORD())
                .sendKeys("1234");
        registerPage.getDriver().findElement(registerPage.getBTN_REGISTER())
                .click();
    }

@Step
    public void validateName()
{
    Assert.assertThat(registerPage.getDriver()
            .findElement(registerPage.getLBL_NAME())
            .isDisplayed(), Matchers.is(true));
}
}
