package imageCapture;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TakePhoto {
    private By cameraSwitch = By.id("com.phonescope.camera2:id/switch_video");
    private By videoRecord = By.xpath("//android.widget.ImageButton[@content-desc=\"Start recording video\"]");
    private By takePhoto = By.xpath("//android.widget.ImageButton[@content-desc=\"Take Photo\"]");
    private AppiumDriver driver;

    public TakePhoto(AppiumDriver driver) {
        this.driver = driver;
    }

    public void TakePhoto(){
        driver.findElement(takePhoto).click();
    }
    public void switchCamera(){
        driver.findElement(cameraSwitch).click();
    }
    public void SwitchToTakePhoto() {
        MobileElement takePhotoElement = (MobileElement) driver.findElement(videoRecord);
        if (takePhotoElement.isDisplayed()){
            switchCamera();
        }else{
            System.out.println("Good to go");
        }
    }
}
