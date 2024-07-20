package com.axa.pages.demoblaze;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;

public class RegisterPage extends PageObject {

    private By signUpLink = By.id("signin2"); // Asumiendo que el link tiene el id "signin2"
    private By usernameField = By.id("sign-username");
    private By passwordField = By.id("sign-password");
    private By signUpButton = By.xpath("//button[text()='Sign up']");

    public void clickSignUpLink() {
        $(signUpLink).click();
    }

    public void enterUsername(String username) {
        $(usernameField).type(username);
    }

    public void enterPassword(String password) {
        $(passwordField).type(password);
    }

    public void clickSignUpButton() {
        $(signUpButton).click();
    }

    public String getAlertText() {
        try {
            return getDriver().switchTo().alert().getText();
        } catch (NoAlertPresentException e) {
            return null;
        }
    }

    public void acceptAlert() {
        try {
            getDriver().switchTo().alert().accept();
        } catch (NoAlertPresentException e) {
            // Handle case where alert is not present
        }
    }
}
