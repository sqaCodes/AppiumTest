package allTests;

import appPermissions.AccessLocalStorageMediaPermission;
import appPermissions.PhotoAndRecordPermission;
import cameraScreen.VerifyCameraScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import scopeSelection.RifleScope;
import scopeSelection.SpottingScopeBinoculars;

import java.net.URL;

public class SetCapabilitiesForTests {

    protected PhotoAndRecordPermission appPermission;
    protected AccessLocalStorageMediaPermission accessMedia;
    protected SpottingScopeBinoculars binocular ;
    protected RifleScope rifleScope;
    protected VerifyCameraScreen verifyCameraScreen;

    public AppiumDriver driver;
    DesiredCapabilities cap = new DesiredCapabilities();

    //Set the Capabilities before the test
    @BeforeClass
    public void setUp(){

        cap.setCapability("platformName","Android");
        // cap.setCapability("deviceName","HUAWEI INE-LX1");
        cap.setCapability("deviceName", "Android Emulator");
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("udid", "GVV7N18806004518");
        cap.setCapability("plateformVersion", "9");
        cap.setCapability("appPackage", "com.phonescope.camera2");
        //cap.setCapability("appPackage", "com.android.calculator2");
        //cap.setCapability("appActivity", "com.android.calculator2.Calculator");
        cap.setCapability("appActivity", "com.phonescope.camera2.UI.activities.SplashActivity");

        try{
            URL url = new URL("http://localhost:4723/wd/hub");
            driver = new AppiumDriver(url, cap);
        }catch (Exception e){
            e.getCause();
            e.getMessage();
            e.getStackTrace();
        }
        appPermission = new PhotoAndRecordPermission(driver);
        accessMedia = new AccessLocalStorageMediaPermission(driver);
        rifleScope = new RifleScope(driver);
        binocular = new SpottingScopeBinoculars(driver);
        verifyCameraScreen = new VerifyCameraScreen(driver);
    }

    @AfterClass
    public void quit() throws Exception{
//        if (driver != null){
//            driver.quit();
//        }
//        else{
//            System.out.println("driver is null");
//        }

    }
}
