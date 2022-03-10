package allTests;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC_02_AcceptPermissions extends TC_01_SplashScreenTest {
    //Accepting the Record & Photo Capture Permission
    @Test
    public void capturePhotoAndVideoPermission(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try{
            appPermission.acceptPhotoRecordPermission();
        }catch (Exception e){
            e.getCause();
            e.getMessage();
            e.getStackTrace();
        }
    }

    //Accepting the Access Local Storage Media Permission
    @Test
    public void AccessLocalStorageMediaPermission(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try{
            accessMedia.getLocalMediaPermission();
        }catch (Exception e){
            e.getCause();
            e.getMessage();
            e.getStackTrace();
        }
    }


}
