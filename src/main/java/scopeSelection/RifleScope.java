package scopeSelection;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RifleScope {
    private By rileScope = By.id("com.phonescope.camera2:id/img_rifle_scop");
    private By rileScopeText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.view.ViewGroup/android.widget.TextView");


    private AppiumDriver driver;

    public RifleScope(AppiumDriver driver) {
        this.driver = driver;
    }

    public WebElement clickOnRifleScope(){
        WebElement rifle = driver.findElement(rileScope);
        return rifle;
    }

    public String getRifleScopeText() {
       String rifleScopeText = driver.findElement(rileScopeText).getText();
       return rifleScopeText;
    }
}
