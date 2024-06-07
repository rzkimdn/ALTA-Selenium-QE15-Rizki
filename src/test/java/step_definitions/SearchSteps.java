package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.SearchPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SearchSteps {

    private final WebDriver driver = Hooks.driver;
    SearchPage searchSteps = new SearchPage(driver);

    @When("On the product page verify product already on the cart")
    public void onTheProductPaveVerifyProductAlreadyOnTheCart() {
        searchSteps.verifyProductOnTheCartIsAvailable();
    }

//    @Then("Click filter and set Z to A")
//    public void clickFilterAndSetZToA() {
//        searchSteps.clickFilterZtoA();
//    }

    @And("Verify that saucelabs onesie and all the things t-shirt red is displayed")
    public void verifyThatSaucelabsOnesieAndAllTheThingsTShirtRedIsDisplayed() {
        searchSteps.verifyProductAllTheThingsTShirtRed();
        searchSteps.verifyProductSauceLabsOneSie();
    }

    @And("Click add to cart saucelabs onesie and all the things t-shirt red")
    public void clickAddToCartSaucelabsOnesieAndAllTheThingsTShirtRed() {
        searchSteps.clickAddToCartSauceLabsOnesie();
        searchSteps.clickAddToCartAllTheThingsTShirtRed();
    }

    @And("Remove button on the saucelabs onesie and all the things t-shirt red is displayed")
    public void removeButtonOnTheSaucelabsOnesieAndAllTheThingsTShirtRedIsDisplayed() {
        searchSteps.verifyProductSauceLabsOneSie();
        searchSteps.verifyRemoveButtonAllTheThingsTShirtRed();
    }

    @Then("Verify the product saucelabs onesie and all the things t-shirt red is on the checkout page")
    public void verifyTheProductSaucelabsOnesieAndAllTheThingsTShirtRedIsOnTheCheckoutPage() {
        searchSteps.verifyProductSauceLabsOneSie();
        searchSteps.verifyProductAllTheThingsTShirtRed();
    }

    @And("Click remove button on the product all the things t-shirt red")
    public void clickRemoveButtonOnTheProductAllTheThingsTShirtRed() {
        searchSteps.clickRemoveButton();
    }

    @And("Verify product all the things t-shirt red is removed on the checkout page")
    public void verifyProductAllTheThingsTShirtRedIsRemovedOnTheCheckoutPage() {
        Assert.assertTrue(searchSteps.verifyRemoveProductAllTheThingsTShirtRed());
    }

    @Then("Click Continue Shopping")
    public void clickContinueShopping() {
        searchSteps.clickContinueShopping();
    }

    @Then("Click filter and set Z to A {string}")
    public void clickFilterAndSetZToA(String filterZtoA) {
        searchSteps.selectFilterZtoA(filterZtoA);
    }
}
