package appPermissions;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class RecordAudio {
    private By recordAudioPermission = By.id("com.android.packageinstaller:id/permission_allow_button");
    private AppiumDriver driver;

    public RecordAudio(AppiumDriver driver) {
        this.driver = driver;
    }

    public void acceptRecordPhoneSkopePermission(){
        driver.findElement(recordAudioPermission).click();
    }
}
