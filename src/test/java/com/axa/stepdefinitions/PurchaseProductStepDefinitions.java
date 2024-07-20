package com.axa.stepdefinitions;

import com.axa.pages.demoblaze.CartPage;
import com.axa.pages.demoblaze.CheckoutPage;
import com.axa.pages.demoblaze.HomePage;
import com.axa.pages.demoblaze.ProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.UUID;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class PurchaseProductStepDefinitions {

    @Steps
    HomePage homePage;
    @Steps
    ProductPage productPage;
    @Steps
    CartPage cartPage;
    @Steps
    CheckoutPage checkoutPage;

    @Given("I am on the Product Store home page")
    public void i_am_on_the_product_store_home_page() {
        homePage.openUrl("https://www.demoblaze.com/index.html");
    }

    @When("I navigate to the {string} category")
    public void i_navigate_to_the_category(String category) {
        homePage.selectCategory(category);
    }

    @When("I select the product {string}")
    public void i_select_the_product(String product) {
        homePage.selectProduct(product);
    }

    @When("I add the product to the cart")
    public void i_add_the_product_to_the_cart() {
        productPage.addToCart();
    }

    @When("I proceed to checkout")
    public void i_proceed_to_checkout() {
        homePage.goToCart();
        cartPage.proceedToCheckout();
    }

    @When("I enter my purchase details and confirm the purchase")
    public void i_enter_my_purchase_details_and_confirm_the_purchase() {
        String name = "User_" + UUID.randomUUID().toString().substring(0, 8);
        String country = "Country_" + UUID.randomUUID().toString().substring(0, 8);
        String city = "City_" + UUID.randomUUID().toString().substring(0, 8);
        String creditCard = UUID.randomUUID().toString().replace("-", "").substring(0, 16);
        String month = String.valueOf((int) (Math.random() * 12 + 1)); // Month between 1 and 12
        String year = String.valueOf(2024); // Year as current year or random year

        checkoutPage.enterPurchaseDetails(name, country, city, creditCard, month, year);
        checkoutPage.confirmPurchase();
    }

    @Then("I should see a confirmation message with the text {string}")
    public void i_should_see_a_confirmation_message_with_the_text(String confirmationMessage) {
        String actualMessage = checkoutPage.getConfirmationMessage();
        assertThat(actualMessage, containsString(confirmationMessage));
        checkoutPage.clickOkButton();
    }
}
