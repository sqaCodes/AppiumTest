package allTests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

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

    @Test
    public void adas(){
        throw new SkipException("Skipping this TestCase as scope is already selected");
    }
}
