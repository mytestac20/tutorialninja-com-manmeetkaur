package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/child::ul[1]/li/a")
    List<WebElement> topMenuList;

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopsTab;

    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopsAndNotebooksTab;

    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement componentsTab;

    @CacheLookup
    @FindBy(xpath = "//span[text()='My Account']")
    WebElement myAccountLink;




    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("Clicking on login link : " + loginLink.toString());
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("Clicking on register link : " + registerLink.toString());
    }
    public void hoverAndClickDesktops() {
        mouseHoverToElementAndClick(desktopsTab);
        log.info("Hovered and clicked on Desktops Tab.");
    }

    public void hoverAndClickLaptopsAndNotebooks() {
        mouseHoverToElementAndClick(laptopsAndNotebooksTab);
        log.info("Hovered and clicked on Laptops & Notebooks Tab.");
    }

    public void hoverAndClickComponents() {
        mouseHoverToElementAndClick(componentsTab);
        log.info("Hovered and clicked on Components Tab.");
    }

    public void clickMyAccountLink() {
        clickOnElement(myAccountLink);
        log.info("Clicked on My Account Link.");
    }

    public void selectMenuOption(String menuOption) {
        By menu = By.linkText(menuOption);
        clickOnElement(menu);
        log.info("Selected Menu Option: " + menuOption);
    }

    public void clickOnMenuTab(String tab) {
        for (WebElement menu : topMenuList) {
            if (menu.getText().contains(tab)) {
                clickOnElement(menu);
                log.info("Clicking on menu tab : " + tab);
                break;
            }
        }
    }
}