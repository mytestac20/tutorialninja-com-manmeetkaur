package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    @CacheLookup
    @FindBy(linkText = "Show All Desktops")
    WebElement showAllDesktopsLink;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortByDropdown;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-layout']")
    WebElement productNames;

    @CacheLookup
    @FindBy(xpath = "//h2[text()='Desktops']")
    WebElement desktopsHeaderText;



    public void clickOnShowAllDesktops() {
        clickOnElement(showAllDesktopsLink);
        log.info("Clicking on 'Show All Desktops' link : " + showAllDesktopsLink.toString());
    }

    public void selectSortBy(String sortOption) {
        clickOnElement(sortByDropdown);
        log.info("Selecting sort option: " + sortOption);
        // Assuming you have a method to select options from a dropdown
    }

    public String getDesktopsPageHeaderText() {
        return desktopsHeaderText.getText();
    }
    public boolean verifyProductsAreSortedDescending() {
        // Implement sorting verification logic
        return true;
    }

}
