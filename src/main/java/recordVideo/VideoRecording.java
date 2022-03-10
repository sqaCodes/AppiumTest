package recordVideo;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class VideoRecording {
    private By cameraSwitch = By.id("com.phonescope.camera2:id/switch_video");
    private By videoRecord = By.xpath("//android.widget.ImageButton[@content-desc=\"Start recording video\"]");
    private By takePhoto = By.xpath("//android.widget.ImageButton[@content-desc=\"Take Photo\"]");
    private AppiumDriver driver;

    public VideoRecording(AppiumDriver driver) {
        this.driver = driver;
    }

    public void StartRecording(){
     driver.findElement(videoRecord).click();
    }
    public void switchCamera(){
        driver.findElement(cameraSwitch).click();
    }
    public void SwitchToTakeVideo() {
        MobileElement takePhotoElement = (MobileElement) driver.findElement(takePhoto);
        if (takePhotoElement.isDisplayed()){
            switchCamera();
        }else{
            System.out.println("Good to go");
        }
    }
}
