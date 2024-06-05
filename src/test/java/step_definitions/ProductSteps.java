package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.ProductPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ProductSteps {

    private final WebDriver driver = Hooks.driver;
    ProductPage productPage = new ProductPage(driver);

    @Then("On the product page verify tha saucelabs backpack is displayed")
    public void onTheProductPageVerifyThaSaucelabsBackpackIsDisplayed() {
        Assert.assertTrue(productPage.verifyTittleProductSauceLabsBackpack());
    }

    @And("Add to cart button saucelabs backpack is displayed")
    public void addToCartButtonSaucelabsBackpackIsDisplayed() {
        Assert.assertTrue(productPage.verifyAddToCartSauceLabsBackpack());
//        productPage.verifyAddToCartSauceLabsBackpack();
    }

    @And("Click add to cart saucelabs backpack")
    public void addToCartSaucelabsBackpack() {
        productPage.clickAddToCartSauceLabsBackpack();
    }

    @And("Remove button on the saucelabs backpack is displayed")
    public void removeButtonOnTheSaucelabsBackpackIsDisplayed() {
        Assert.assertTrue(productPage.verifyRemoveButtonDisplayedOnTheProductSauceLabsBackpack());
//        productPage.verifyRemoveButtonDisplayedOnTheProductSauceLabsBackpack();
    }


}
