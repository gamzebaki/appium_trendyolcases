package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class TrendyolinterviewFatihSolution_OneClass {

    AndroidDriver driver;
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:appPackage", "trendyol.com");
        desiredCapabilities.setCapability("appium:appActivity", "com.trendyol.common.splash.impl.ui.SplashActivity");
        desiredCapabilities.setCapability("appium:noReset", false);
        desiredCapabilities.setCapability("appium:skipUnlock", true);
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:autoGrantPermissions" , true);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void trendyolTest1() {
        WebElement turkeyBtn = driver.findElement(By.xpath("//*[@text='Turkey']"));
        turkeyBtn.click();
        List<WebElement> genderBtns = driver.findElements(By.className("android.widget.Button"));
        Random random = new Random();
        int index = random.nextInt(genderBtns.size());
        genderBtns.get(index).click();
        WebElement closeBtn = driver.findElement(By.id("trendyol.com:id/imageViewTooltipClose"));
        closeBtn.click();
        WebElement searchAreaInput = driver.findElement(By.id("trendyol.com:id/edittext_search_view"));
        searchAreaInput.click();
        searchAreaInput.sendKeys("Tshirt");
        WebElement tshirtText = driver.findElement(By.xpath("//*[@text='tshirt']"));
        tshirtText.click();
        WebElement filter = driver.findElement(By.id("trendyol.com:id/layout_search_filter"));
        filter.click();
        By kargoBedavaLocator = By.xpath("//*[@text='Kargo Bedava']/../android.widget.CheckBox");
        scrollToElementAndClick(kargoBedavaLocator);
        WebElement urunleriListeleBtn = driver.findElement(By.id("trendyol.com:id/btnApplyFilter"));
        urunleriListeleBtn.click();
        WebElement siralaBtn = driver.findElement(By.xpath("//*[@text='Sırala']"));
        siralaBtn.click();
        WebElement enCokDegerlindirBtn = driver.findElement(By.xpath("//*[@text='En Çok Değerlendirilen']"));
        enCokDegerlindirBtn.click();
        By ikinciUrun = By.xpath("(//*[@resource-id='trendyol.com:id/imageViewProduct'])[2]");
        driver.findElement(ikinciUrun).click();
        By productInfo = By.id("trendyol.com:id/textViewBrandName");
        scrollToElementManually(productInfo);
        String urunBilgisiStr = driver.findElement(productInfo).getText();
        System.out.println("urunBilgisiStr = " + urunBilgisiStr);
        driver.findElement(By.id("trendyol.com:id/primaryButton")).click();
        driver.findElement(By.xpath("//*[@text='M']")).click();
        driver.findElement(By.id("trendyol.com:id/buttonAddToBasketOrChooseVariant")).click();
        String sepettekiUrunAdi = driver.findElement(By.id("trendyol.com:id/textViewBrandName")).getText();
        System.out.println("sepettekiUrunAdi = " + sepettekiUrunAdi);
        WebElement deleteBtn = driver.findElement(By.id("trendyol.com:id/imageViewDeleteProduct"));
        deleteBtn.click();
        WebElement deleteCertain = driver.findElement(By.id("trendyol.com:id/textViewBasketRemoveAction"));
        deleteCertain.click();
        WebElement sepetBosYazisi = driver.findElement(By.id("trendyol.com:id/textViewMessage"));
        Assert.assertTrue(sepetBosYazisi.isDisplayed());
    }
    public void scrollDown() {
        int startX = driver.manage().window().getSize().getWidth() / 2;
        int startY = driver.manage().window().getSize().getHeight() / 2;
        int endx = driver.manage().window().getSize().getWidth() / 2;
        int endY = (int) (driver.manage().window().getSize().getHeight() * 0.2);
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence scroll = new Sequence(finger, 0);
        scroll.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        scroll.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        scroll.addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), endx, endY));
        scroll.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        ((RemoteWebDriver) driver).perform(List.of(scroll));
    }
    public void scrollToElementAndClick(By by){
        List<WebElement> elementList = driver.findElements(by);
        while (elementList.size()<=1){
            scrollDown();
            elementList = driver.findElements(by);
            if (elementList.size()==1){
                elementList.get(0).click();
                break;
            }
        }
    }
    public void scrollToElementManually(By by){
        List<WebElement> elementList = driver.findElements(by);
        while (elementList.size()<=1){
            scrollDown();
            elementList = driver.findElements(by);
            if (elementList.size()==1){
                break;
            }
        }
    }
}
