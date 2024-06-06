package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    public CheckoutPage (WebDriver driver){
        super(driver);
    }
    @FindBy (xpath = "//div[@id='shopping_cart_container']")
    private WebElement btnChart;
    @FindBy (id = "item_4_title_link")
    private WebElement titleProductSauceLabs;

    public void clickChartbutton(){
        scrollIntoView(btnChart);
        waitForElementClickable(btnChart);
        click(btnChart);
    }
    public boolean verifyTittleProductSauceLabsBackpack(){
        return isDisplayed(titleProductSauceLabs);
    }
}
