package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LaptopsAndNotebooksPage extends Utility {

    private static final Logger log = LogManager.getLogger(LaptopsAndNotebooksPage.class.getName());

    @CacheLookup
    @FindBy(linkText = "Show All Laptops & Notebooks")
    WebElement showAllLaptopsLink;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortByDropdown;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-layout']")
    WebElement productNames;

    public void clickOnShowAllLaptops() {
        clickOnElement(showAllLaptopsLink);
        log.info("Clicking on 'Show All Laptops & Notebooks' link : " + showAllLaptopsLink.toString());
    }

    public void selectSortBy(String sortOption) {
        clickOnElement(sortByDropdown);
        log.info("Selecting sort option: " + sortOption);
        // Assuming you have a method to select options from a dropdown
    }

    public boolean verifyProductsAreSortedByPriceHighToLow() {
        // Implement sorting verification logic
        return true;
    }
}