package com.axa.pages.demoblaze;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends PageObject {

    private By addToCartButton = By.xpath("//a[text()='Add to cart']");

    public void addToCart() {
        $(addToCartButton).click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            getDriver().switchTo().alert().accept();
        } catch (NoAlertPresentException e) {
            // Handle case where alert is not present
        }
    }
}
