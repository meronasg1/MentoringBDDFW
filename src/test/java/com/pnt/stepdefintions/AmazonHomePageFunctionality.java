package com.pnt.stepdefintions;

import com.pnt.base.TestBase;
import com.pnt.page.AmazonHomePage;
import com.pnt.page.AmazonLandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class AmazonHomePageFunctionality {

    AmazonHomePage amazonHomePage;
    AmazonLandingPage amazonLandingPage;


    public void setUpPOM(){
        amazonHomePage= PageFactory.initElements(TestBase.driver, AmazonHomePage.class);
        amazonLandingPage= PageFactory.initElements(TestBase.driver, AmazonLandingPage.class);

    }

    @Given("^user opens the browser and navigates to amazon\\.com and set up the POM$")
    public void user_opens_the_browser_and_navigates_to_amazon_com_and_set_up_the_POM() {

        TestBase.setupDriver();
        TestBase.driver.get("https://www.amazon.com/");
    }

    @When("^user can see search bar$")
    public void user_can_see_search_bar() {
        setUpPOM();
        amazonHomePage.searchBoxIsDisplayed();
    }

    @Then("^User types Java books in search bar$")
    public void user_types_Java_books_in_search_bar() {
        setUpPOM();
        amazonHomePage.typeOnSearchBox("Java Books");
    }

    @Then("^User clicks on search button$")
    public void user_clicks_on_search_button() {
        setUpPOM();
        amazonHomePage.clickOnSearchButton();
    }


//    @Then("^User can see search result of Java books$")
//    public void user_can_see_search_result_of_Java_books() {
//
//    }
//
//    @Then("^user closes browser$")
//    public void user_closes_browser() {
//
//    }
//




}
