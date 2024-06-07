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

    @FindBy(id = "first-name")
    private WebElement firstNameCheckout;
    @FindBy(id = "last-name")
    private WebElement lastNameCheckout;
    @FindBy(id = "postal-code")
    private WebElement postalCodeCheckout;
    @FindBy(id = "continue")
    private WebElement btnContinue;
    @FindBy (id = "finish")
    private WebElement btnFinish;
    @FindBy(xpath = "//h2[@data-test='complete-header']")
    private WebElement titleThankYouOrder;
    public void clickChartbutton(){
        waitForElementClickable(btnChart);
        click(btnChart);
    }
    public boolean verifyTittleProductSauceLabsBackpack(){
        return isDisplayed(titleProductSauceLabs);
    }
    public void inputFirstNameCheckout(String firstName){
        clear(firstNameCheckout);
        sendKeys(firstNameCheckout,firstName);
    }
    public void inputLastNameCheckout(String lastName){
        clear(lastNameCheckout);
        sendKeys(lastNameCheckout,lastName);
    }
    public void inputPostalCodeCheckout(String postalCode){
        clear(postalCodeCheckout);
        sendKeys(postalCodeCheckout,postalCode);
    }
    public void clickContinueCheckoutButton(){
        waitForElementClickable(btnContinue);
        click(btnContinue);
    }
    public void clickFinishCheckoutButton(){
        waitForElementClickable(btnFinish);
        click(btnFinish);
    }
    public String getTitleThankYouOrder() {
        return getText(titleThankYouOrder);
    }
}
