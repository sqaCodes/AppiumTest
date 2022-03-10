package switchPhotoAndVideoCamera;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class VideoAndPhotoCameraSwitch {
    private By cameraSwitch = By.id("com.phonescope.camera2:id/switch_video");
    private AppiumDriver driver;

    public VideoAndPhotoCameraSwitch(AppiumDriver driver) {
        this.driver = driver;
    }

    public void switchCamera(){
        driver.findElement(cameraSwitch).click();
    }


}
