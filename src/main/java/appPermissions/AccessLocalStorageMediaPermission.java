package appPermissions;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class AccessLocalStorageMediaPermission {
    private By localMediaPermission = By.id("com.android.packageinstaller:id/permission_allow_button");

    private AppiumDriver driver;

    public AccessLocalStorageMediaPermission(AppiumDriver driver) {
        this.driver = driver;
    }

    public void getLocalMediaPermission(){
        driver.findElement(localMediaPermission).click();
    }
}
