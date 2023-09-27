package com.co.senasoft.stepsdefinitions;
import com.co.senasoft.steps.RegisterStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegisterStepDefinition {

    @Steps
    RegisterStep registerStep;

    @Given("he user is on the web page")
    public void heUserIsOnTheWebPage() {
        registerStep.openBrowser();

    }
    @When("He user enter the data for the register")
    public void heUserEnterTheDataForTheRegister() {
        registerStep.enterName();
        registerStep.enterLastName();
        registerStep.enterUserName();
        registerStep.enterPassword();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Then("he could see login")
    public void heCouldSeeLogin() {
        registerStep.validateName();
    }
}
