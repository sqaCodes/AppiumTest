package appPermissions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class PhotoAndRecordPermission {
    private AppiumDriver<MobileElement> driver;
    private By allowPermission = By.id("com.android.packageinstaller:id/permission_allow_button");

    public PhotoAndRecordPermission(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }
    public void acceptPhotoRecordPermission(){
        driver.findElement(allowPermission).click();
    }
}
