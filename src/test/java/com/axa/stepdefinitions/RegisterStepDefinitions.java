package com.axa.stepdefinitions;

import com.axa.pages.demoblaze.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import java.util.UUID;

public class RegisterStepDefinitions {

    @Steps
    RegisterPage registerPage;

    private String username;
    private String password;

    @Given("I am on the Product Store registration page")
    public void i_am_on_the_product_store_registration_page() {
        registerPage.openUrl("https://www.demoblaze.com/index.html#");
        registerPage.clickSignUpLink();
    }

    @When("I enter a new username and password")
    public void i_enter_a_new_username_and_password() {
        username = "user_" + UUID.randomUUID().toString().substring(0, 8);
        password = "pass_" + UUID.randomUUID().toString().substring(0, 8);
        registerPage.enterUsername(username);
        registerPage.enterPassword(password);
    }

    @When("I click on the sign up button")
    public void i_click_on_the_sign_up_button() {
        registerPage.clickSignUpButton();
    }

    @Then("I should see a confirmation message")
    public void i_should_see_a_confirmation_message() {
        String alertText = registerPage.getAlertText();
        assertThat(alertText, containsString("Sign up successful"));
        registerPage.acceptAlert();
    }
}
