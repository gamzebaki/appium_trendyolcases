package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

import static org.testng.AssertJUnit.assertEquals;

public class Trendyol_HomePage {

    ElementHelper elementHelper;

    By popupCloseButton= By.id("trendyol.com:id/imageViewTooltipClose");
    By homeTab = By.id("trendyol.com:id/tab_home");

    By searchArea = By.id("trendyol.com:id/search_view_inner_container");

    public Trendyol_HomePage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public void clickPopupCloseButton() {
        elementHelper.click(popupCloseButton);
    }

    public void checkHomePage() {
        elementHelper.checkElement(homeTab);
        assertEquals(elementHelper.findElement(homeTab).getAttribute("selected"), "true");
    }

    public void clickSearchArea() {
        elementHelper.click(searchArea);
    }
}
