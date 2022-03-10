package allTests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC_03_SelectBinocularScopeTest extends TC_02_AcceptPermissions{
    @Test
    public void AssertBinocularText(){
        String actualText = binocular.getBinocularScopeText();
        String expectedText = "SPOTTING SCOPE \n" +
                "BINOCULARS";

        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void SelectBinocularScope(){
        binocular.clickOnBinocularScope();
    }

    //Record Audio Permission
    @Test
    public void RecordAudioPermission(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        recordAudio.acceptRecordPhoneSkopePermission();
    }
}
