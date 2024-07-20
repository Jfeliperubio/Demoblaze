package com.axa.pages.demoblaze;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckoutPage extends PageObject {

    private By nameField = By.id("name");
    private By countryField = By.id("country");
    private By cityField = By.id("city");
    private By creditCardField = By.id("card");
    private By monthField = By.id("month");
    private By yearField = By.id("year");
    private By purchaseButton = By.xpath("//button[text()='Purchase']");
    private By confirmationMessage = By.xpath("//h2[contains(text(),'Thank you for your purchase!')]");
    private By okButton = By.xpath("//button[text()='OK']");

    public void enterPurchaseDetails(String name, String country, String city, String creditCard, String month, String year) {
        $(nameField).type(name);
        $(countryField).type(country);
        $(cityField).type(city);
        $(creditCardField).type(creditCard);
        $(monthField).type(month);
        $(yearField).type(year);
    }

    public void confirmPurchase() {
        $(purchaseButton).click();
    }

    public String getConfirmationMessage() {
        return $(confirmationMessage).getText();
    }

    public void clickOkButton() {
        $(okButton).click();
    }
}
