package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;
import utils.DriverManager;

public class TrendyolInterviewStepDef {

    Trendyol_GenderPage genderPage = new Trendyol_GenderPage(DriverManager.getDriver());
    Trendyol_HomePage homePage = new Trendyol_HomePage(DriverManager.getDriver());
    Trendyol_SearchPage searchPage = new Trendyol_SearchPage(DriverManager.getDriver());
    Trendyol_ResultPage resultPage = new Trendyol_ResultPage(DriverManager.getDriver());
    Trendyol_FilterPage filterPage = new Trendyol_FilterPage(DriverManager.getDriver());

    Trendyol_OrderPage orderPage = new Trendyol_OrderPage(DriverManager.getDriver());
    Trendyol_ProductPage productPage = new Trendyol_ProductPage(DriverManager.getDriver());
    Trendyol_BasketPage basketPage = new Trendyol_BasketPage(DriverManager.getDriver());

    @Given("user should see the Gender Page")
    public void userShouldSeeTheGenderPage() {
        genderPage.checkGenderPage();
    }

    @When("taps Gender {string} on Gender Page")
    public void tapsGenderOnGenderPage(String gender) {
        genderPage.clickGender(gender);
    }

    @Then("should Popup Close Button on Home Page")
    public void shouldPopupCloseButtonOnHomePage() {
        homePage.clickPopupCloseButton();
    }

    @Then("should see the Home Page")
    public void shouldSeeTheHomePage() {
        homePage.checkHomePage();
    }

    @When("taps Search Area on Home Page")
    public void tapsSearchAreaOnHomePage() {
        homePage.clickSearchArea();
    }

    @Then("should see the Search Page")
    public void shouldSeeTheSearchPage() {
        searchPage.checkSearchPage();
    }

    @When("sendkeys Search Area {string} on Search Page")
    public void sendkeysSearchAreaOnSearchPage(String text) {
        searchPage.sendkeysSearchAarea(text);
    }

    @Then("should see the Result Page")
    public void shouldSeeTheResultPage() {
        resultPage.checkResultPage();
    }

    @When("taps Filter on Result Page")
    public void tapsFilterOnResultPage() {
        resultPage.clickFilter();
    }

    @Then("should see the Filter Page")
    public void shouldSeeTheFilterPage() {
        filterPage.checkFilterPage();
    }

    @When("taps Filter {string} on Filter Page")
    public void tapsFilterOnFilterPage(String filterType) {
        filterPage.clickFilter(filterType);
    }

    @When("taps List Products {string} on Filter Page")
    public void tapsListProductsOnFilterPage(String filter) {
        filterPage.clickListProducts(filter);
    }

    @When("taps Order on Result Page")
    public void tapsOrderOnResultPage() {
        resultPage.clickOrder();
    }

    @Then("should see the Order Page")
    public void shouldSeeTheOrderPage() {
        orderPage.checkOrderPage();
    }

    @When("taps Option {string} on Order Page")
    public void tapsOptionOnOrderPage(String option) {
        orderPage.clickOption(option);
    }

    @When("taps second Product on Result Page")
    public void tapsSecondProductOnResultPage() {
        resultPage.clickSecondProduct();
    }

    @Then("should see the Product Page")
    public void shouldSeeTheProductPage() {
        productPage.checkProductPage();
    }

    @When("save Product Name on Product Page")
    public void saveProductNameOnProductPage() {
        productPage.saveProductName();
    }

    @And("taps Add To Basket {string} on Product Page")
    public void tapsAddToBasketOnProductPage(String option) {
        productPage.clickAddToBasket(option);
    }

    @And("taps Size {string} on Product Page")
    public void tapsSizeOnProductPage(String size) {
        productPage.clickSize(size);
    }

    @And("taps Size Add to Basket on Product Page")
    public void tapsSizeAddToBasketOnProductPage() {
        productPage.clickSizeAddToBasket();
    }

    @Then("should see the Basket Page")
    public void shouldSeeTheBasketPage() {
        basketPage.checkBasketPage();
    }

    @And("should see Same Product Name on Basket Page")
    public void shouldSeeSameProductNameOnBasketPage() {
        basketPage.checkSameProductName();
    }

    @When("taps Delete Button on Basket Page")
    public void tapsDeleteButtonOnBasketPage() {
        basketPage.clickDelete();
    }

    @And("taps Delete Popup on Basket Page")
    public void tapsDeletePopupOnBasketPage() {
        basketPage.clickDeletePopup();
    }

    @Then("should see Empty Message {string} on Basket Page")
    public void shouldSeeEmptyMessageOnBasketPage(String message) {
        basketPage.checkEmptyMessage(message);
    }
}
