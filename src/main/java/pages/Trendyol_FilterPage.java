package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Trendyol_FilterPage {

    ElementHelper elementHelper;

    By filtrelemeHeader = By.id("trendyol.com:id/textLeftUp");

    By filterTypes = By.id("trendyol.com:id/filterName");

    By kargoBedavaCheckbox = By.id("trendyol.com:id/checkBoxSpecialFilter");

    By kargoBedavaCheck = By.xpath("//*[@text='Kargo Bedava']/../android.widget.CheckBox");

    By applyFilterButton = By.id("trendyol.com:id/btnApplyFilter");

    public Trendyol_FilterPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkFilterPage() {
        assertEquals(elementHelper.getText(filtrelemeHeader), "Filtreleme");
    }

    public void clickFilter(String filterType) {
        elementHelper.scrollDown();
        elementHelper.checkElementWithText(filterTypes,filterType);
        elementHelper.click(kargoBedavaCheckbox);
        // elementHelper.clickNearElementWithText(filterType);

    }

    public void clickListProducts(String filter) {
        assertTrue(elementHelper.getText(applyFilterButton).contains(filter));
        elementHelper.click(applyFilterButton);

    }
}
