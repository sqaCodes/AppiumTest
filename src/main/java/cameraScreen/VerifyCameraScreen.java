package cameraScreen;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class VerifyCameraScreen {
    private By cameraScreen = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.view.View[2]");

    private AppiumDriver driver;

    public VerifyCameraScreen(AppiumDriver driver) {
        this.driver = driver;
    }

    public boolean CheckCurrentScreen(){
        boolean thisElement = driver.findElement(cameraScreen).isDisplayed();

        return thisElement;
    }
}
