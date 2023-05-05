package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.DriverManager;
import utils.ElementHelper;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Trendyol_BasketPage {

    ElementHelper elementHelper;

    By sepetimHeader = By.id("trendyol.com:id/textLeftUp");

    By brandName = By.id("trendyol.com:id/textViewBrandName");

    By deleteButton = By.id("trendyol.com:id/imageViewDeleteProduct");

    By deletePopup = By.id("trendyol.com:id/textViewBasketRemoveAction");

    By emptyMessage = By.id("trendyol.com:id/textViewMessage");

    public Trendyol_BasketPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkBasketPage() {
        assertTrue(elementHelper.getText(sepetimHeader).contains("Sepetim"));
    }

    public void checkSameProductName() {
        assertEquals(elementHelper.getText(brandName) , Trendyol_ProductPage.productname);
    }

    public void clickDelete() {
        elementHelper.click(deleteButton);
    }

    public void clickDeletePopup() {
        elementHelper.click(deletePopup);
    }

    public void checkEmptyMessage(String message) {
        assertEquals(elementHelper.getText(emptyMessage), message);
    }
}
