package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.CheckoutPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutSteps {
    private final WebDriver driver = Hooks.driver;
    CheckoutPage checkoutPage = new CheckoutPage(driver);

    @And("Click chart button")
    public void clickChartButton() {
        checkoutPage.clickChartbutton();
    }

    @Then("Verify the product saucelabs backpack is on the checkout page")
    public void verifyTheProductSaucelabsBackpackIsOnTheCheckoutPage() {
        Assert.assertTrue(checkoutPage.verifyTittleProductSauceLabsBackpack());
    }
}
