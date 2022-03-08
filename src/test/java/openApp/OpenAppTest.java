package openApp;

import appPermissions.PhotoAndRecordPermission;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class OpenAppTest {


    protected PhotoAndRecordPermission appPermission;
    private AppiumDriver<MobileElement> driver;
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
            driver = new AppiumDriver<MobileElement>(url, cap);
        }catch (Exception e){
            e.getCause();
            e.getMessage();
            e.getStackTrace();
        }
        appPermission = new PhotoAndRecordPermission(driver);
    }
    //Opening the app splash screen
    @Test
    public void SplashScreen(){
        try{
            System.out.println("Application Started");
        }catch (Exception e){
            e.getCause();
            e.getMessage();
            e.getStackTrace();
        }

    }
    //Accepting the Record & Photo Capture Permission
    @Test
    public void acceptThePermission(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try{
            appPermission.acceptPhotoRecordPermission();
        }catch (Exception e){
            e.getCause();
            e.getMessage();
            e.getStackTrace();
        }
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
