package com.axa.pages.demoblaze;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageObject {

	private By cartLink = By.id("cartur");

	public void selectCategory(String category) {
		$(By.linkText(category)).click();
	}

	public void selectProduct(String product) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText(product))).click();
	}

	public void goToCart() {
		$(cartLink).click();
	}
}
