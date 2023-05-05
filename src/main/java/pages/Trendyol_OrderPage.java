package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

import static org.testng.Assert.assertEquals;

public class Trendyol_OrderPage {

    ElementHelper elementHelper;

    By sıralamaHeader = By.className("android.widget.TextView");

    By orderOptions = By.id("trendyol.com:id/radioButtonSortingTypeItem");

    public Trendyol_OrderPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkOrderPage() {
        assertEquals(elementHelper.getText(sıralamaHeader), "Sıralama");
    }

    public void clickOption(String option) {
        elementHelper.clickElementWithText(orderOptions,option);
    }
}
