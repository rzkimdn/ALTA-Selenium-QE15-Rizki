package org.example.pageObject;

import io.cucumber.java.zh_cn.假如;
import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver); //fungsi?
    }
    @FindBy(xpath = "//a[@id='item_4_title_link']")
    private WebElement titleProductSauceLabsBackpack; //bisa random namanya?
    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement btnRemoveSauceLabsBackpack;
    @FindBy (id = "add-to-cart-sauce-labs-backpack")
    private WebElement btnAddToChartSauceLabsBackpack;
    @FindBy(id = "shopping_cart_container")
    private WebElement cart;

    public boolean verifyTittleProductSauceLabsBackpack(){
        return isDisplayed(titleProductSauceLabsBackpack);
    }
    public boolean verifyRemoveButtonDisplayedOnTheProductSauceLabsBackpack(){
        return isDisplayed(btnRemoveSauceLabsBackpack);
    }
    public void clickRemoveProductSauceLabsBackpack(){
        scrollIntoView(btnRemoveSauceLabsBackpack);
        waitForElementClickable(btnRemoveSauceLabsBackpack);
        click(btnRemoveSauceLabsBackpack);
    }
    public boolean verifyAddToCartSauceLabsBackpack(){
        return isDisplayed(btnAddToChartSauceLabsBackpack);
    }
    public void clickAddToCartSauceLabsBackpack(){
        scrollIntoView(btnAddToChartSauceLabsBackpack);
        waitForElementClickable(btnAddToChartSauceLabsBackpack);
        click(btnAddToChartSauceLabsBackpack);
    }
    public void clickCart(){
        waitForElementClickable(cart);
        click(cart);
    }
}
