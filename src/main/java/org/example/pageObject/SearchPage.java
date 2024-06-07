package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage  {
    public SearchPage (WebDriver driver){
        super(driver);
    }
    @FindBy (className = "shopping_cart_badge")
    private WebElement checkCart;
    @FindBy (xpath = "//select[@class='product_sort_container']")
    private WebElement setFileterZtoA;
    @FindBy (id = "item_3_title_link")
    private WebElement tittleProductAllTheThingsTShirtRed;
    @FindBy (id = "item_2_title_link")
    private WebElement tittleProductSauceLabsOnesie;
    @FindBy (id="add-to-cart-test.allthethings()-t-shirt-(red)")
    private WebElement btnAddToCartAllTheThingsTShirtRed;
    @FindBy (id="add-to-cart-sauce-labs-onesie")
    private WebElement btnAddToCartSauceLabsOnesie;
    @FindBy (xpath = "//div[@id='shopping_cart_container']")
    private WebElement btnChart;
    @FindBy (id = "item_4_title_link")
    private WebElement titleProductSauceLabs;
    @FindBy (xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement btnRemoveAllTheThingsTShirtRed;
    @FindBy(id="remove-sauce-labs-onesie")
    private WebElement btnRemoveSauceLabsOnesie;
    @FindBy (id="continue-shopping")
    private WebElement btnContinueShopping;

    public boolean verifyProductOnTheCartIsAvailable(){
        return isDisplayed(checkCart);
    }
    public void selectFilterZtoA(String filter){
        selectByVisibleText(setFileterZtoA, filter);
    }
    public boolean verifyProductAllTheThingsTShirtRed(){
        return isDisplayed(tittleProductAllTheThingsTShirtRed);
    }
    public boolean verifyProductSauceLabsOneSie(){
        return isDisplayed(tittleProductSauceLabsOnesie);
    }
    public void clickAddToCartAllTheThingsTShirtRed(){
        scrollIntoView(btnAddToCartAllTheThingsTShirtRed);
        waitForElementClickable(btnAddToCartAllTheThingsTShirtRed);
        click(btnAddToCartAllTheThingsTShirtRed);
    }
    public void clickAddToCartSauceLabsOnesie(){
        scrollIntoView(btnAddToCartSauceLabsOnesie);
        waitForElementClickable(btnAddToCartSauceLabsOnesie);
        click(btnAddToCartSauceLabsOnesie);
    }
    public boolean verifyRemoveButtonAllTheThingsTShirtRed(){
        return isDisplayed(btnRemoveAllTheThingsTShirtRed);
    }
//    public boolean verifyRemoveButtonSauceLabsOnesia(){
//        return isDisplayed(btnRemoveSauceLabsOnesie);
//    }
//    public void clickChartbutton(){
//        scrollIntoView(btnChart);
//        waitForElementClickable(btnChart);
//        click(btnChart);
//    }
//    public boolean verifyTittleProductSauceLabsBackpack(){
//        return isDisplayed(titleProductSauceLabs);
//    }
    public void clickRemoveButton(){
        scrollIntoView(btnRemoveAllTheThingsTShirtRed);
        waitForElementClickable(btnRemoveAllTheThingsTShirtRed);
        click(btnRemoveAllTheThingsTShirtRed);
    }
    public boolean verifyRemoveProductAllTheThingsTShirtRed(){
        return isDisplayed(tittleProductAllTheThingsTShirtRed);
    }
    public void clickContinueShopping(){
        scrollIntoView(btnContinueShopping);
        waitForElementClickable(btnContinueShopping);
        click(btnContinueShopping);
    }
}
