package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class Trendyol_ProductPage {

    ElementHelper elementHelper;

    By product = By.id("trendyol.com:id/mainFrameLayout");
    By productName = By.id("trendyol.com:id/textViewBrandName");

    By addToCartButton = By.id("trendyol.com:id/primaryButton");
    By sizes = By.id("trendyol.com:id/textViewValue");

    By sepeteEkleButton = By.id("trendyol.com:id/buttonAddToBasketOrChooseVariant");

    public static String productname;

    public Trendyol_ProductPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkProductPage() {
        elementHelper.checkElement(product);
    }

    public void saveProductName() {
        productname = elementHelper.getText(productName);
    }

    public void clickAddToBasket(String option) {
        elementHelper.clickElementWithText(addToCartButton,option);
    }

    public void clickSize(String size) {
        elementHelper.clickElementWithText(sizes,size);
    }

    public void clickSizeAddToBasket() {
        elementHelper.click(sepeteEkleButton);
    }
}
