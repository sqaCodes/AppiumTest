package openApp;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class OpenPhoneScopeApp {
    private By openApp = By.xpath("//android.widget.TextView[@content-desc=\"PhoneSkope\"]");

    private AppiumDriver driver;

    public OpenPhoneScopeApp(AppiumDriver driver) {
        this.driver = driver;
    }

    public void OpenPhoneSkopeApp() {
        driver.findElement(openApp).click();
    }
}
