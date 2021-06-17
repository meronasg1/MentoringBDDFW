package com.pnt.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class AmazonHomePage {

    @FindBy(id="twotabsearchtextbox")
    private WebElement searchBox;

    public void typeOnSearchBox(String data){
        searchBox.sendKeys(data);
    }

    @FindBy(id ="nav-search-submit-button")
    private WebElement searchButton;

    public void clickOnSearchButton(){
        searchButton.click();
    }

    @FindBy(id="nav-logo-sprites")
    private WebElement amazonLogo;

    public void validateAmazonLogo(){
        Assert.assertTrue(amazonLogo.isDisplayed(), "amazon Logo is not displayed");
    }

    public void searchBoxIsDisplayed(){
        Assert.assertTrue(searchBox.isDisplayed(), "search box is not displayed");
    }

}
