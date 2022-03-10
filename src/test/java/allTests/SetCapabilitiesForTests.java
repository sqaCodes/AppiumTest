package allTests;

import appPermissions.AccessLocalStorageMediaPermission;
import appPermissions.PhotoAndRecordPermission;
import appPermissions.RecordAudio;
import cameraScreen.VerifyCameraScreen;
import imageCapture.TakePhoto;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import openApp.OpenPhoneScopeApp;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import recordVideo.VideoRecording;
import scopeSelection.RifleScope;
import scopeSelection.SpottingScopeBinoculars;
import switchPhotoAndVideoCamera.VideoAndPhotoCameraSwitch;

import java.net.URL;

public class SetCapabilitiesForTests {

    protected PhotoAndRecordPermission appPermission;
    protected AccessLocalStorageMediaPermission accessMedia;
    protected SpottingScopeBinoculars binocular ;
    protected RifleScope rifleScope;
    protected VerifyCameraScreen verifyCameraScreen;
    protected OpenPhoneScopeApp openApp;
    protected RecordAudio recordAudio;
    protected TakePhoto takePhoto;
    protected VideoRecording videoRecording;
    protected VideoAndPhotoCameraSwitch cameraSwitch;

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
        openApp = new OpenPhoneScopeApp(driver);
        recordAudio = new RecordAudio(driver);
        videoRecording = new VideoRecording(driver);
        takePhoto = new TakePhoto(driver);
        cameraSwitch = new VideoAndPhotoCameraSwitch(driver);
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
