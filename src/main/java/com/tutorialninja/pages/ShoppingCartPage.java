package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {

    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Shopping Cart']")
    WebElement shoppingCartHeader;

    @CacheLookup
    @FindBy(xpath = "//td[@class='text-left']//a")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//input[@name='quantity']")
    WebElement quantityField;

    @CacheLookup
    @FindBy(xpath = "//button[@data-original-title='Update']")
    WebElement updateButton;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement checkoutButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='cart-total']//strong")
    WebElement totalPrice;



    public String getShoppingCartHeaderText() {
        return shoppingCartHeader.getText();
    }

    public void clickOnCheckoutButton() {
        clickOnElement(checkoutButton);
        log.info("Clicking on checkout button : " + checkoutButton.toString());
    }
//    public void updateProductQuantity(String quantity) {
//        clearAndSendTextToElement(quantityField, quantity);
//        clickOnElement(updateButton);
//        log.info("Updated product quantity to " + quantity);
//    }



    public String getProductName() {
        return getTextFromElement(productName);
    }

    public String getTotalPrice() {
        return getTextFromElement(totalPrice);
    }
}
