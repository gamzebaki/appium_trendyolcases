package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class Trendyol_GenderPage {

    ElementHelper elementHelper;

    By selectKadın = By.id("trendyol.com:id/buttonSelectGenderWoman");
    By selectErkek = By.id("trendyol.com:id/buttonSelectGenderMan");
    By genders = By.className("android.widget.Button");

    public Trendyol_GenderPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkGenderPage() {
        elementHelper.checkElement(selectKadın);
        elementHelper.checkElement(selectErkek);
    }

    public void clickGender(String gender) {
        elementHelper.clickElementWithText(genders,gender);
    }
}
