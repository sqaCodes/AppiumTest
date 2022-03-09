package allTests;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AcceptPermissions extends SetCapabilitiesForTests{
    //Accepting the Record & Photo Capture Permission
    @Test
    public void capturePhotoAndVideo(){
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
    public void AccessLocalStorageMedia(){
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
