package allTests;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC_06_CapturePhoto extends TC_04_SelectRifleScopeTest{
    @Test
    public void ImageCapture(){
        takePhoto.SwitchToTakePhoto();
        takePhoto.TakePhoto();
    }
}
