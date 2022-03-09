package scopeSelection;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class SpottingScopeBinoculars {
    private By binocular = By.id("com.phonescope.camera2:id/img_spotting_scop");
    private By binocularText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.view.ViewGroup/android.widget.TextView");

    private AppiumDriver driver;

    public SpottingScopeBinoculars(AppiumDriver driver) {
        this.driver = driver;
    }

    public void clickOnBinocularScope(){
        driver.findElement(binocular).click();
    }

    public String getBinocularScopeText() {
        String binocularScopeText = driver.findElement(binocularText).getText();
        return binocularScopeText;
    }
}
