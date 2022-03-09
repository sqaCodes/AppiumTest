package allTests;

import appPermissions.PhotoAndRecordPermission;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class OpenAppTest extends SetCapabilitiesForTests {


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



}
