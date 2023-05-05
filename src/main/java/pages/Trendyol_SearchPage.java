package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.DriverManager;
import utils.ElementHelper;

public class Trendyol_SearchPage {

    ElementHelper elementHelper;

    By searchArea = By.id("trendyol.com:id/edittext_search_view");

    By searchHeaders = By.className("android.widget.TextView");

    By searchSuggestion = By.id("trendyol.com:id/textViewSearchSuggestionText");

    public Trendyol_SearchPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkSearchPage() {
        elementHelper.checkElementWithText(searchHeaders,"Popüler Aramalar");
    }

    public void sendkeysSearchAarea(String text) {
        elementHelper.sendKeys(searchArea,text);

        // appiumDriver.pressKey(new KeyEvent(AndroidKey.ENTER));  --- ENTER TIKLATMA !!!
       // ((AppiumDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
       elementHelper.click(searchSuggestion);

    }

}
