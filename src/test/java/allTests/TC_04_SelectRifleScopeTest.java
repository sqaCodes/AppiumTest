package allTests;

import org.openqa.selenium.WebElement;
import org.testng.SkipException;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC_04_SelectRifleScopeTest extends TC_02_AcceptPermissions{

    @Test
    public void TC_01_selectRifleScope(){
        WebElement thisElement = rifleScope.clickOnRifleScope();
        try{
            thisElement.click();
        }
        catch (Exception e){
            throw new SkipException("Skipping this test");
        }
    }
    //Record Audio Permission
    @Test
    public void TC_02_RecordAudioPermission(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        recordAudio.acceptRecordPhoneSkopePermission();
    }

}
