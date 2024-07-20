package com.axa.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/register_new_user.feature",
        glue = "com.axa.stepdefinitions"
)
public class RegisterUserRunner {
}
