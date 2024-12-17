package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(linkText = "Register")
    private WebElement registerLink;

    @CacheLookup
    @FindBy(linkText = "Login")
    private WebElement loginLink;

    @CacheLookup
    @FindBy(id = "input-firstname")
    private WebElement firstNameInput;

    @CacheLookup
    @FindBy(id = "input-lastname")
    private WebElement lastNameInput;

    @CacheLookup
    @FindBy(id = "input-email")
    private WebElement emailInput;

    @CacheLookup
    @FindBy(id = "input-telephone")
    private WebElement telephoneInput;

    @CacheLookup
    @FindBy(id = "input-password")
    private WebElement passwordInput;

    @CacheLookup
    @FindBy(id = "input-confirm")
    private WebElement passwordConfirmInput;

    @CacheLookup
    @FindBy(name = "newsletter")
    private WebElement subscribeYesRadio;

    @CacheLookup
    @FindBy(name = "agree")
    private WebElement privacyPolicyCheckbox;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//h1")
    private WebElement headerText;

    @CacheLookup
    @FindBy(linkText = "Logout")
    private WebElement logoutLink;

    public void selectMyAccountOptions(String option) {
        if (option.equalsIgnoreCase("Register")) {
            registerLink.click();
        } else if (option.equalsIgnoreCase("Login")) {
            loginLink.click();
        }
    }

    public void enterFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void enterTelephone(String telephone) {
        telephoneInput.sendKeys(telephone);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void enterPasswordConfirm(String passwordConfirm) {
        passwordConfirmInput.sendKeys(passwordConfirm);
    }

    public void selectSubscribeYes() {
        subscribeYesRadio.click();
    }

    public void clickOnPrivacyPolicy() {
        privacyPolicyCheckbox.click();
    }

    public void clickOnContinue() {
        continueButton.click();
    }

    public String getHeaderText() {
        return headerText.getText();
    }

    public void selectLogout() {
        logoutLink.click();
    }
}

