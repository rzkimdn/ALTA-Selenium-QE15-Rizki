package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.CartPage;
import org.example.pageObject.CheckoutPage;
import org.example.pageObject.ProductPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CoSteps {
    private final WebDriver driver = Hooks.driver;
    ProductPage productPage = new ProductPage(driver);
    CartPage cartPage = new CartPage(driver);
    CheckoutPage checkoutPage = new CheckoutPage(driver);

    @And("Click cart icon")
    public void clickCartIcon() {
        productPage.clickCart();
    }

    @And("Click checkout button")
    public void clickCheckoutButton() {
        cartPage.clickBtnCheckout();
    }

    @And("Input firs name {string} and last name {string} and postal code {string}")
    public void inputFirsNameAndLastNameAndPostalCode(String firstName, String lastName, String postalCode) {
        checkoutPage.inputFirstNameCheckout(firstName);
        checkoutPage.inputLastNameCheckout(lastName);
        checkoutPage.inputPostalCodeCheckout(postalCode);
    }

    @And("Click continue button")
    public void clickContinueButton() {
        checkoutPage.clickContinueCheckoutButton();
    }

    @And("Click finish button")
    public void clickFinishButton() {
        checkoutPage.clickFinishCheckoutButton();
    }

    @Then("Should be displayed checkout complete with title {string}")
    public void shouldBeDisplayedCheckoutCompleteWithTitle(String title) {
        String getTitle = checkoutPage.getTitleThankYouOrder();
        Assert.assertEquals(title, getTitle);
    }
}
