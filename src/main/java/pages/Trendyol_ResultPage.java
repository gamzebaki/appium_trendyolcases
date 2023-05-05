package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverManager;
import utils.ElementHelper;

import java.util.List;

import static org.testng.Assert.assertFalse;

public class Trendyol_ResultPage {

    ElementHelper elementHelper;

    By productImage = By.id("trendyol.com:id/imageViewProduct");
    By filterButton=By.id("trendyol.com:id/textViewFilter");

    By orderButton = By.id("trendyol.com:id/layout_search_order");

    public Trendyol_ResultPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public void checkResultPage() {
        List <WebElement> productImages = elementHelper.findElements(productImage);
        assertFalse(productImages.isEmpty());
    }

    public void clickFilter() {
        elementHelper.click(filterButton);
    }

    public void clickOrder() {
        elementHelper.click(orderButton);
    }

    public void clickSecondProduct() {
        List <WebElement> productImages = elementHelper.findElements(productImage);
        productImages.get(1).click();

    }
}
